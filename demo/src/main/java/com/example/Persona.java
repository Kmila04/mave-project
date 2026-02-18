package com.example;

public class Persona {

    int Cedula;
    String Nombre;
    String Correo;
    public Persona(int cedula, String nombre, String correo) {
        System.out.println("Se ejecuto el constructor con todos los parametros");
        Cedula = cedula;
        Nombre = nombre;
        Correo = correo;
    }
    public Persona(int cedula) {
        System.out.println( "Se ejecuto el constructor con la cedula");
        Cedula = cedula;
    }
    public Persona() {
        System.out.println( "Aqui se ejecuto el constructor vacio");
    }

    public String hablar(String Saludo) {
        System.out.println("El metodo habalr se ejecuto");
        return Saludo + " : " + this.Nombre;
    }
    
}
