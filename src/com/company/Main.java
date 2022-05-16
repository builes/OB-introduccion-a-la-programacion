package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumaNumeros(1,2,3));

        //Aca creamos un objeto de la clase coche
        Coche coche1 = new Coche();

        //Llamamos el metodo incrementar puerta que aumenta la cantidad de puertas del carro
        coche1.incrementarPuertas();
        System.out.println(coche1.getNumeroPuertas());

        //----------------------------------------//------------------------------
        // Ejercicios tema4


        //Esto siempre lo ponemos que vamos a pedir datos por teclado con la clase Scanner
//        Scanner sc = new Scanner(System.in);
//
//        //Asi pedimos por teclado un numero
//        int n1 = sc.nextInt();
//
//        if(n1 > 0){
//            System.out.println("positivo");
//        }else if(n1 < 0){
//            System.out.println("negativo");
//        }else{
//            System.out.println("cero");
//        }
//
//        String season = "Winter";
//
//        switch (season){
//            case("Summer"):
//                System.out.printf("We are on summer");
//                break;
//            case("Autumn"):
//                System.out.printf("We are on autumn");
//                break;
//            case("Winter"):
//                System.out.printf("We are on winter");
//                break;
//            case("Spring"):
//                System.out.printf("We are on spring");
//                break;
//        }



        //Creamos un objeto de la clase Persona que es donde esta el codigo del tema 8
//        System.out.println("\nEjercicio tema 8");
//        Persona persona = new Persona();
//        persona.setEdad(29);
//        persona.setNombre("Mauricio Builes");
//        persona.setTelefono("3013201103");
//
//        System.out.println(persona.getNombre());
//        System.out.println(persona.getEdad());
//        System.out.println(persona.getTelefono());



        //Creamos un objeto de la clase cliente la cual hereda de Persona
        Cliente cliente1 = new Cliente(32, "Mauricio", "3013201103", 3205468);
        System.out.println(cliente1.toString());



    }

    public static int sumaNumeros(int a, int b, int c){
        return a +b +c;
    }

}



