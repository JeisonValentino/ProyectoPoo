package Vistas;

import javax.swing.*;
import java.awt.*;

public class Loading  extends JFrame {


    public JPanel panel1;
    public JProgressBar barraProgreso;
    public JLabel labelLoading;
    public JLabel labelLoadingNumber;
    FondoPanel fondo=new FondoPanel();

    public Loading(){
        setContentPane(fondo);
        add(panel1 );//agregar el panel a la clase vista al iniciar
        setSize(900,500);//para las dimenciones de la ventanta
        setLocationRelativeTo(null); //para centrar el panel
        setTitle("Sistema de citas medicas ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void createUIComponents() {
        panel1 =new FondoPanel();
    }
    public void carga (){
        try{
            for(int i =0 ; i<=100 ;i++){
                Thread.sleep(100);
            labelLoadingNumber.setText(i+"%");
                if(i==10){
       labelLoading.setText("Importando Base de datos");
                }
                if(i==20){
                    labelLoading.setText("Buscando al JR que borro la Base de datos ...");
                }
                if(i==30){
                    labelLoading.setText("Despidiendo al JR que borro la Base de datos ... ");
                }
                if(i==40){
                    labelLoading.setText("Volviendo a llenar los datos ...");
                }

                if(i==50){
                    labelLoading.setText("Developer programando a las 5:40 AM ...");
                }

                if(i==60){
                    labelLoading.setText("Ya falta poco para recibir el ajinomen ....");
                }

                if(i==70){
                    labelLoading.setText("Ya falta poco ....");
                }

                if(i==90){
                    labelLoading.setText("Ya falta muy poco ....");
                }



                barraProgreso.setValue(i);
                if(i==100){
                    labelLoading.setText("Completado");
                    Thread.sleep(100);
                }
            }


        }catch (Exception e){
            System.out.println(e);
        }
    }


}

class FondoPanel extends JPanel{
    private Image imagen;
    @Override
    public void paint (Graphics g ){



        imagen =new ImageIcon(getClass().getResource("/Imagenes/ImagenFondo.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);

    }
}
