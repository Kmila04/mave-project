package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Persona persona1 = new Persona(123, "Camila", "email@email.com");

        persona1.hablar("Hola como estas");

        String obtenersSaludo = persona1.hablar("Hola como estas?");

        System.out.println(obtenersSaludo);
        System.out.println("Termino!");

    }
}