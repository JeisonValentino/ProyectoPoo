package Repositorio;


import Conexion.Conexion;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Conexion.consultas.consultaDatabase;
import Entidades.Usuario;

public class Usuario_repositorio {
    consultaDatabase d=new consultaDatabase();

     public List<Usuario> obtenerListaUsuario(){
        ResultSet re= d.consultarTablaTodo("usuario");

        List<Usuario> userEntityList = new ArrayList<>();
        try {
            while (re.next()) {
                Usuario userEntity=new  Usuario();
                userEntity.setUsuCod(re.getInt("UsuCod"));
                userEntity.setUsuNom(re.getString("UsuNom"));
                userEntity.setUsuUser(re.getString("UsuUser"));
                userEntity.setUsuPass(re.getString("UsuPass"));
                userEntity.setUsuAct(re.getString("UsuAct"));
                userEntity.setUsuEdad(re.getInt("UsuEdad"));
                userEntity.setUsuDni(re.getString("UsuDni"));
                userEntity.setPaicod(re.getInt("Paicod"));
                userEntityList.add(userEntity);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }


        return userEntityList;
    };
}
