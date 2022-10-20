import Autentificacion.login;
import Entidades.Profesionales;
import Servicios.Servicio_Login;
import Vistas.Loading;
import Vistas.LoginVista.Presentacion;

import javax.swing.*;
import java.io.IOException;
import java.util.*;
public class principal {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) throws IOException, InterruptedException {
        Loading loading  = new Loading();

                loading.setVisible(true);


        loading.carga();
        loading.setVisible(false);
        Presentacion login=new Presentacion();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                login.setVisible(true);
            }
        });

        Servicio_Login servicio_login = new Servicio_Login();
        List<Profesionales> profesionalList = servicio_login.obtenerListaUsuarios();






        Boolean Session=true ,Session1= true,Session2=true , Session3=true;
        Scanner sc = new Scanner(System.in);

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        List<String> PalabrasExistentes = new ArrayList<>();
        String[] array = {"salir", "Cerrar session","Ingresar al sistema","Regresar anteriores opciones"};

        for (String lang : array) {

            PalabrasExistentes.add(lang);
        }


        while (Session) {
            System.out.println("Bienvenido programa de  citas medicas");
            System.out.println("Tenemos las siguientes opciones ");
            System.out.println("Solicitar cita");
            System.out.println("Ingresar al sistema");
            System.out.println("Cerrar session ");
            String session = sc.nextLine();


            if (!PalabrasExistentes.contains(session)) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println(ANSI_RED+"LA PALABRA NO EXISTE"+ANSI_RESET);
            }

            if (session.equals("Solicitar cita")) {
                Session2 = true;

                while(Session2){

                    System.out.println("Listar Areas medicas ");
                    System.out.println("regresar opciones anteriores");
                    System.out.println("salir");
                    session = sc.nextLine();

                    if(session.equals("Liastar Areas medicas ")){





                    }else if(session.equals("regresar opciones anteriores ")){

                        Session2=false;
                    }else if(session.equals("salir")){


                    }


                }













            } else if (session.equals("Ingresar al sistema")) {


                Session2 = true;
                while(Session2){

                    System.out.println("Ingresar login");
                    System.out.println("regresar opciones anteriores");
                    System.out.println("salir");
                    session = sc.nextLine();

                    if(session.equals("Ingresar login")){



                System.out.println("Escriba su usuario");
                String usuario=  sc.nextLine();
                System.out.println("Escriba su contraseña");
                String contraseña=  sc.nextLine();
                        Optional<login> loginEntity=servicio_login.loginVerificacion(usuario);

                if(!usuario.equals(loginEntity.get().getUsuario()) ){
                    System.out.println("Tus datos no existen , por favor verifica de nuevo tu identidad");
                }else

                if(!contraseña.equals(loginEntity.get().getContraseña())){

                    System.out.println("Tus contraseña no existe, por favor verifica de nuevo tu identidad");
                }else

                {

                    Session1 = true;

                    while (Session1) {


                        System.out.println("lista de usuarios :  \n" + "\t" + " id \t \t" + "Nombre de Usuario \t \t Dni \t \t Edad");
                        for (int i = 0; i < profesionalList.size(); i++) {

                            System.out.println("\t " + i + "\t  \t || " + profesionalList.get(i) + "\t \t \t \t ||  " + profesionalList.get(i) + "\t   || " + profesionalList.get(i));
                        }
                        System.out.println("Regresar anteriores opciones");
                        System.out.println("salir");
                        session = sc.nextLine();


                        if (session.equals("salir") || session.equals("Cerrar session")) {

                            Session = false;
                        } else if (session.equals("Regresar anteriores opciones")) {
                            Session1 = false;
                        }

                        if (session.equals(session)) {
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                            System.out.println(ANSI_RED + "LA PALABRA NO EXISTE" + ANSI_RESET);
                        }
                    }
                }
                    }else if(session.equals("Regresar anteriores opciones")){
                        Session2=false;
                    }
                }


            }


            if (session.equals("salir") || session.equals("Cerrar session")) {

                Session = false;
            }


        }

    }
}
