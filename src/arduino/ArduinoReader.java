package arduino;

import com.fazecast.jSerialComm.SerialPort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArduinoReader {

    private volatile double ph;
    private volatile double temperatura;
    private volatile double tds;

    public void iniciarLectura() {
        Thread hilo = new Thread(() -> {
            SerialPort puerto = SerialPort.getCommPort("COM5");
            puerto.setBaudRate(9600);
            // Clave: bloquear hasta que haya al menos 1 byte
            puerto.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);

            if (!puerto.openPort()) {
                System.out.println("No se pudo conectar");
                return;
            }
            System.out.println("Conectado a Arduino");

            try { Thread.sleep(2000); } catch (InterruptedException ignored) {}

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(puerto.getInputStream()))) {

                String linea;
                while ((linea = br.readLine()) != null) {
                    linea = linea.trim();
                    String[] datos = linea.split(",");
                    if (datos.length != 3) {
                        System.out.println("Línea incompleta: " + linea);
                        continue;
                    }
                    try {
                        ph          = Double.parseDouble(datos[0]);
                        temperatura = Double.parseDouble(datos[1]);
                        tds         = Double.parseDouble(datos[2]);
                    } catch (NumberFormatException e) {
                        System.out.println("Dato inválido: " + linea);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                puerto.closePort();
            }
        });
        hilo.setDaemon(true); // para que no mantenga viva la app al cerrarla
        hilo.start();
    }

    public double getPh() {
        return ph;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getTds() {
        return tds;
    }
}