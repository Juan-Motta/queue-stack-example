package com.example;

public class App {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println("Tamaño del stack: " + stack.size());
        System.out.println("Elementos del stack: " + stack.toString());

        stack.push("Primero");
        stack.push("Segundo");
        stack.push("Tercero");
        stack.pop();

        System.out.println("El ultimo elemento es: " + stack.peek());
        System.out.println("Tamaño del stack: " + stack.size());
        System.out.println("Elementos del stack: " + stack.toString());
        System.out.println("Elementos del stack: " + stack.toList());
        System.out.println("Existe elemento Primero: " + stack.search("Cuarto"));

        Queue<String> cola = new Queue<>();

        System.out.println("Tamaño de la cola: " + cola.size());

        cola.queue("Primero");
        cola.queue("Segundo");
        cola.queue("Tercero");

        System.out.println("Elementos de la cola: " + cola.toString());
        System.out.println("Primero: " + cola.first());
        System.out.println("Ultimo: " + cola.last());

        cola.dequeue();

        System.out.println("Elementos de la cola: " + cola.toString());

        System.out.println("Existe el elemento: " + cola.search("Cuarto"));
        System.out.println("Primero: " + cola.first());
        System.out.println("Ultimo: " + cola.last());

        System.out.println("Tamaño de la cola: " + cola.size());

    }

}
