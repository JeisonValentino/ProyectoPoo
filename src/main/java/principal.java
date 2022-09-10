import Autentificacion.login;
import Conexion.consultas.consultaDatabase;
import Entidades.Usuario;
import Servicios.Servicio_Login;

import java.io.Console;
import java.io.IOException;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.*;

public class principal {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";





    public static void main(String[] args) throws IOException, InterruptedException {

        Servicio_Login servicio_login = new Servicio_Login();
        List<Usuario> usuarioList = servicio_login.obtenerListaUsuarios();
        Boolean Session=true ,Session1= true;
        Scanner sc = new Scanner(System.in);

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        List<String> PalabrasExistentes = new ArrayList<>();
        String[] array = {"salir", "Cerrar session","Ingresar al sistema"};

        for (String lang : array) {

            PalabrasExistentes.add(lang);
        }


        while (Session) {
            System.out.println("Bienvenido al cita de citas medicas");
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


            } else if (session.equals("Ingresar al sistema")) {

                Session1=true;
                while (Session1) {
                    System.out.println("lista de usuarios :  \n" + "\t" + " id \t \t" + "Nombre de Usuario \t \t Dni \t \t Edad");
                    for (int i = 0; i < usuarioList.size(); i++) {

                        System.out.println("\t " + i + "\t  \t || " + usuarioList.get(i).getUsuNom() + "\t \t \t \t ||  " + usuarioList.get(i).getUsuDni() + "\t   || " + usuarioList.get(i).getUsuEdad());
                    }
                    System.out.println("Regresar anteriores opciones");
                    System.out.println("salir");
                    session = sc.nextLine();


                    if (session.equals("salir") || session.equals("Cerrar session")) {

                        Session = false;
                    }else if(session.equals("Regresar anteriores opciones")){
                        Session1=false;
                    }

                    if (session.equals(session)) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        System.out.println(ANSI_RED+"LA PALABRA NO EXISTE"+ANSI_RESET);
                    }
                }

            }


            if (session.equals("salir") || session.equals("Cerrar session")) {

                Session = false;
            }


        }

    }
}
