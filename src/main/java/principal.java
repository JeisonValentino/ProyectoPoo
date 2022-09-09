import Autentificacion.login;
import Conexion.consultas.consultaDatabase;
import Entidades.Usuario;
import Servicios.Servicio_Login;

import java.sql.ResultSet;
import java.util.*;

public class principal {


    public static void main(String[] args) {

        Servicio_Login servicio_login = new Servicio_Login();
        List<Usuario> usuarioList = servicio_login.obtenerListaUsuarios();
        Boolean Session = true;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < usuarioList.size(); i++) {

            System.out.println(usuarioList.get(i).getUsuNom());
        }


        List<String> PalabrasExistentes = new ArrayList<>();
        String[] array = {"salir", "Cerrar session"};

        for (String lang : array) {

            PalabrasExistentes.add(lang);
        }


        while (Session) {


            System.out.println("Cerrar session ");
            String session = sc.nextLine();
            if (!PalabrasExistentes.contains(session)) {
                System.out.println("La palabra no existe ");
            }


            if (session.equals("salire") || session.equals("Cerrar session")) {

                Session = false;
            }


        }

    }
}
