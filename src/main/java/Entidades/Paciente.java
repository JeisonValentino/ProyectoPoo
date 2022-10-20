/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import lombok.Data;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
@Data
public class Paciente {
    private String id;
	private String nombre;
	private String apellidos;
	private String genero;
        private String NombreCompleto;
        private String Direccion;
        private String NumeroTelefono;
        private int edad;

    public Paciente(String id, String nombre, String apellidos, String genero, String nombreCompleto, String direccion, String numeroTelefono, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        NombreCompleto = nombreCompleto;
        Direccion = direccion;
        NumeroTelefono = numeroTelefono;
        this.edad = edad;
    }

    public Paciente (){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        apellidos = JOptionPane.showInputDialog("Ingrese el apellido paterno");
        genero = JOptionPane.showInputDialog("Ingrese (M) Masculino (F) Femenino");
        Direccion = JOptionPane.showInputDialog("Ingrese la direccion del paciente");
        NumeroTelefono = JOptionPane.showInputDialog("Ingrese el numero telefono");
        NombreCompleto = apellidos+ ", "+nombre;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente"));
        }
        public void nombrecompleto(){
        NombreCompleto = apellidos+ ", "+nombre;
    }
    public String info(){
        String cadena;
        nombrecompleto();
        cadena ="Informacion Personal";
        cadena = cadena+"\nNombre: "+NombreCompleto;
        cadena = cadena+"\nEdad: "+edad;
        cadena = cadena+"\nSexo: "+genero;
        cadena = cadena+"\nDireccion: "+Direccion;
        cadena = cadena+"\nNumeroTelefono: "+NumeroTelefono;
        return cadena;
    }


}
