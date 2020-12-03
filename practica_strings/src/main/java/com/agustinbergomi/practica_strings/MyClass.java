package com.agustinbergomi.practica_strings;

public class MyClass {
    public static void main(String[] args) {
        String s1 = "This is a String!";
//        Tambien podemos inicializar un String creando un nuevo objeto de tipo String usando new
        String s2 = new String("This is a String!");

        System.out.println(s1.toString());
        System.out.println(s1);
        System.out.println(s1.toCharArray());

//        Creo array de caracteres y le ingreso un el s1 transofrmado a array de caracteres
        char[] caracteres = s1.toCharArray();
        System.out.println(caracteres);
    }
}