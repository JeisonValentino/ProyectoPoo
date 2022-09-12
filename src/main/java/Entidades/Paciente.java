/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Paciente {
	private String nombre;
	private String apellidos;
	private String genero;
        private String NombreCompleto;
        private String Direccion;
        private String NumeroTelefono;
        private int edad;


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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        nombrecompleto();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
        nombrecompleto();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
        nombrecompleto();
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
        nombrecompleto();
    }

    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(String NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
        nombrecompleto();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        nombrecompleto();
    }
}
