package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection conectar =null ;

    String usuario="root";
    String password="";
    String bd="PObjetos_Curso";
    String ip="localhost";
    String puerto="3306";
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;



    public Connection conectar(){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena,usuario,password);
            System.out.println("se logro conectar ");
        }catch (Exception ex){

            System.out.println("Error : " + ex.toString());
        }
        return conectar;


    }


}
