package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {

    private JPanel mainPanel;
    private JLabel title;
    private JLabel intro;


    public Principal() {
        //Fondo e imágenes
        mainPanel = new Background.imgMainPanel("/images/river.jpg");
        mainPanel.setLayout(new BorderLayout());
        JPanel prototipoImg = new Background.imgMainPanel("/images/prototipo2.jpg");
        JPanel riverImg = new Background.imgMainPanel("/images/rioManzanaresc.jpg");

        //Título
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        title.setOpaque(true);
        title.setBackground(new Color(0, 0, 0, 128));
        title.setText("BPSR-V1");

        //Intro panel
        JPanel introPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
        introPanel.setOpaque(false);

        intro.setHorizontalAlignment(SwingConstants.CENTER);
        intro.setForeground(Color.WHITE);
        intro.setOpaque(true);
        intro.setBackground(new Color(0, 0, 0, 128));
        intro.setPreferredSize(new Dimension(800, 500));
        intro.setText("""
            <html>
            <div style='width:500px'>
            <b>Conoce el estado de nuestros cuerpos hídricos en tiempo real.</b><br><br>
            Nuestra boya inteligente recopila datos sobre la calidad del agua mediante sensores
            especializados. La información obtenida se presenta de forma visual e interactiva,
            permitiendo comprender mejor las condiciones del ecosistema y promover acciones para
            su protección y conservación.
            </div>
            </html>
            """);

        prototipoImg.setPreferredSize(new Dimension(439, 365));

        introPanel.add(intro);
        introPanel.add(prototipoImg);

        //Rio panel
        JPanel riverPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
        riverPanel.setOpaque(false);

        JLabel river = new JLabel();

        river.setHorizontalAlignment(SwingConstants.CENTER);
        river.setOpaque(true);
        river.setForeground(Color.WHITE);
        river.setBackground(new Color(0, 0, 0, 128));
        river.setPreferredSize(new Dimension(800, 500));
        river.setText("""
                <html>
                <div style='width:500px'>
                <b>Río Manzanares.</b><br><br>
                Es un río que nace en la sierra Nevada a 2300 metros sobre el nivel del mar y desemboca en el mar
                caribe, con una longitud estimada por diversas fuentes de entre 18 a 24 km. Este
                atraviesa Santa Marta y es uno de sus principales abastecimiento de agua dulce
                </div>
                </html>
                """
        );
        river.setFont(new Font("Arial", Font.PLAIN, 28));
        riverImg.setPreferredSize(new Dimension(440, 450));
        riverPanel.add(riverImg);
        riverPanel.add(river);

        //Explicacion PH
        JLabel introPh = new JLabel();
        introPh.setForeground(Color.WHITE);
        introPh.setHorizontalAlignment(SwingConstants.CENTER);
        introPh.setAlignmentX(Component.CENTER_ALIGNMENT);
        introPh.setOpaque(true);
        introPh.setBackground(new Color(0, 0, 0, 128));
        introPh.setText("""
            <html>
            <div style='width:1100px; text-align:center;'>
                <b>Nivel de pH</b><br><br>
            </div>
            </html>
            """);
        introPh.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel explicationPh = new JLabel();
        explicationPh.setForeground(Color.WHITE);
        explicationPh.setHorizontalAlignment(SwingConstants.CENTER);
        explicationPh.setAlignmentX(Component.CENTER_ALIGNMENT);
        explicationPh.setOpaque(true);
        explicationPh.setBackground(new Color(0, 0, 0, 128));
        explicationPh.setText("""
                <html>
                <div style='width:500px'>
                <b>¿Qué mide?</b><br><br>
                Indica si el agua es más ácida o más alcalina.<br><br>
                <b>¿Por qué es importante?</b><br><br>
                Si el pH es demasiado alto o demasiado bajo, las plantas y
                los animales acuáticos pueden verse afectados. Un pH fuera de
                los valores adecuados dificulta la vida en el río y puede alterar
                el equilibrio del ecosistema.
                </div>
                </html>
                """);
        explicationPh.setFont(new Font("Arial", Font.PLAIN, 28));


        //Cuadro PH
        JPanel mainPhPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
        mainPhPanel.setOpaque(false);

        double phNumber = 7;
        JPanel phPanel = new JPanel();
        phPanel.setOpaque(true);
        phPanel.setPreferredSize(new Dimension(400, 400));

        JLabel ph = new JLabel();
        ph.setHorizontalAlignment(SwingConstants.CENTER);
        ph.setOpaque(true);
        ph.setForeground(Color.WHITE);
        ph.setBackground(new Color(0, 0, 0, 128));
        ph.setPreferredSize(new Dimension(400, 100));
        ph.setText(phNumber + "");
        ph.setFont(new Font("Arial", Font.PLAIN, 28));

        if(phNumber >= 7.82 && phNumber <= 7.9) {
            phPanel.setBackground(Color.GREEN);
        } else if ((phNumber >= 7.7 && phNumber < 7.82)||(phNumber > 7.9 && phNumber <= 8)) {
            phPanel.setBackground(Color.YELLOW);
        } else{
            phPanel.setBackground(Color.RED);
        }

        mainPhPanel.add(phPanel);
        mainPhPanel.add(ph);

        //Explicacion TEMPERATURA
        JLabel introTemp = new JLabel();
        introTemp.setForeground(Color.WHITE);
        introTemp.setHorizontalAlignment(SwingConstants.CENTER);
        introTemp.setAlignmentX(Component.CENTER_ALIGNMENT);
        introTemp.setOpaque(true);
        introTemp.setBackground(new Color(0, 0, 0, 128));
        introTemp.setText("""
            <html>
            <div style='width:1100px; text-align:center;'>
                <b>Temperatura</b><br><br>
            </div>
            </html>
            """);
        introTemp.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel explicationTemp = new JLabel();
        explicationTemp.setForeground(Color.WHITE);
        explicationTemp.setHorizontalAlignment(SwingConstants.CENTER);
        explicationTemp.setAlignmentX(Component.CENTER_ALIGNMENT);
        explicationTemp.setOpaque(true);
        explicationTemp.setBackground(new Color(0, 0, 0, 128));
        explicationTemp.setText("""
                <html>
                <div style='width:500px'>
                <b>¿Qué mide?</b><br><br>
                Mide la temperatura del agua del río.<br><br>
                <b>¿Por qué es importante?</b><br><br>
                A temperaturas altas, el oxigeno en el agua disminuye más rápido debido
                a la evaporización del agua,
                mientras que en temperaturas bajas, el metabolismo de los seres vivos se ralentiza,
                afectando su desarrollo.
                </div>
                </html>
                """);
        explicationTemp.setFont(new Font("Arial", Font.PLAIN, 28));



        //Temperatura panel

        JPanel mainTempPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
        mainTempPanel.setOpaque(false);

        double tempNumber = 20;
        JPanel tempPanel = new JPanel();
        tempPanel.setOpaque(true);
        tempPanel.setPreferredSize(new Dimension(400, 400));

        JLabel temp = new JLabel();
        temp.setHorizontalAlignment(SwingConstants.CENTER);
        temp.setOpaque(true);
        temp.setForeground(Color.WHITE);
        temp.setBackground(new Color(0, 0, 0, 128));
        temp.setPreferredSize(new Dimension(400, 100));
        temp.setText(tempNumber + "");
        temp.setFont(new Font("Arial", Font.PLAIN, 28));

        if(tempNumber >= 22 && tempNumber <= 26) {
            tempPanel.setBackground(Color.GREEN);
        } else if ((tempNumber < 22)) {
            tempPanel.setBackground(Color.BLUE);
        } else{
            tempPanel.setBackground(Color.RED);
        }

        mainTempPanel.add(tempPanel);
        mainTempPanel.add(temp);

        //Explicacion TDS
        JLabel introTDS = new JLabel();
        introTDS.setForeground(Color.WHITE);
        introTDS.setHorizontalAlignment(SwingConstants.CENTER);
        introTDS.setAlignmentX(Component.CENTER_ALIGNMENT);
        introTDS.setOpaque(true);
        introTDS.setBackground(new Color(0, 0, 0, 128));
        introTDS.setText("""
            <html>
            <div style='width:1100px; text-align:center;'>
                <b>TDS (Total de Sólidos Disueltos)</b><br><br>
            </div>
            </html>
            """);
        introTDS.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel explicationTDS = new JLabel();
        explicationTDS.setForeground(Color.WHITE);
        explicationTDS.setHorizontalAlignment(SwingConstants.CENTER);
        explicationTDS.setAlignmentX(Component.CENTER_ALIGNMENT);
        explicationTDS.setOpaque(true);
        explicationTDS.setBackground(new Color(0, 0, 0, 128));
        explicationTDS.setText("""
                <html>
                <div style='width:500px'>
                <b>¿Qué mide?</b><br><br>
                La cantidad de sales, minerales y otros sólidos disueltos en el agua.<br><br>
                <b>¿Por qué es importante?</b><br><br>
                Niveles adecuados favorecen la salud del ecosistema acuático,
                mientras que concentraciones excesivas pueden afectar a peces y plantas.
                </div>
                </html>
                """);
        explicationTDS.setFont(new Font("Arial", Font.PLAIN, 28));



        //Temperatura panel

        JPanel mainTDSPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
        mainTDSPanel.setOpaque(false);

        double tdsNumber = 20;
        JPanel tdsPanel = new JPanel();
        tdsPanel.setOpaque(true);
        tdsPanel.setPreferredSize(new Dimension(400, 400));

        JLabel tds = new JLabel();
        tds.setHorizontalAlignment(SwingConstants.CENTER);
        tds.setOpaque(true);
        tds.setForeground(Color.WHITE);
        tds.setBackground(new Color(0, 0, 0, 128));
        tds.setPreferredSize(new Dimension(400, 100));
        tds.setText(tdsNumber + "");
        tds.setFont(new Font("Arial", Font.PLAIN, 28));

        if(tdsNumber < 50) {
            tdsPanel.setBackground(Color.GREEN);
        } else if ((tempNumber < 60)) {
            tdsPanel.setBackground(Color.BLUE);
        } else{
            tdsPanel.setBackground(Color.RED);
        }

        mainTDSPanel.add(tdsPanel);
        mainTDSPanel.add(tds);



        //Integrantes panel
        JLabel project = new JLabel();
        project.setForeground(Color.WHITE);
        project.setHorizontalAlignment(SwingConstants.CENTER);
        project.setAlignmentX(Component.CENTER_ALIGNMENT);
        project.setOpaque(true);
        project.setBackground(new Color(0, 0, 0, 128));
        project.setText("""
                        <html>
                        <div style='width:1100px'>
                        <b>PROYECTO UNIVERSIDAD NACIONAL DE COLOMBIA SEDE BOGOTÁ.</b><br>
                        Jairo Andres Rubiano Triana, Maarja Jianella Veru Regino,
                        Mahia Alejandra Vanegas Parrado, Catalina Lara Montero, Emmanuel David Saez Doncel
                        </div>
                        </html>
                        """);
        project.setFont(new Font("Arial", Font.PLAIN, 22));



        //Panel de contenido
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setOpaque(false);

        contentPanel.add(Box.createVerticalStrut(20));
        contentPanel.add(introPanel);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(riverPanel);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(introPh);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(explicationPh);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(mainPhPanel);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(introTemp);
        contentPanel.add(explicationTemp);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(mainTempPanel);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(introTDS);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(explicationTDS);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(mainTDSPanel);
        contentPanel.add(Box.createVerticalStrut(30));
        contentPanel.add(project);
        contentPanel.add(Box.createVerticalStrut(50));

        //Scroll
        JScrollPane scroll = new JScrollPane(
                contentPanel,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );

        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(scroll, BorderLayout.CENTER);

    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}

