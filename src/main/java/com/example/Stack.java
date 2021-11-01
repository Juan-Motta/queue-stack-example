package com.example;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    /**
     * Implementacion de un stack
     */
    private Node<T> top;
    private Integer size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public T pop() {
        /**
         * Elimina el ultimo elemento del stack y lo devuelve
         */
        Node<T> aux = this.top;
        this.top = aux.getNextElement();
        this.size--;
        return aux.getElement();
    }

    public void push(T element) {
        /**
         * Añade un elemento al stack
         */
        Node<T> aux = new Node<>(element, this.top);
        this.top = aux;
        this.size++;
    }

    public T peek() {
        /**
         * Devuelve el elemento en la cima del stack
         */
        return this.top.getElement();

    }

    public Boolean search(T element) {
        /**
         * Metodo que devuelve un booleano indicando si el elemento se encuentra o no en
         * el stack. El metodo realiza una comparacion con la representacion a String
         * del objeto
         */
        Node<T> aux = this.top;

        while (aux != null) {
            if (aux.getElement() == element.toString()) {
                return true;
            } else {
                aux = aux.getNextElement();
            }
        }
        return false;
    }

    public Boolean isEmpity() {
        /**
         * Metodo que devuelve un booleano indicando si el stack se encuentra vacio o no
         */
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public Integer size() {
        /**
         * Metodo que devuelve el tamaño del stack
         */
        return this.size;

    }

    @Override
    public String toString() {
        /**
         * Metodo que devuelve la representacion en string del stack
         */
        String str = "";
        Node<T> aux = this.top;
        while (aux != null) {
            str += aux.getElement().toString() + " ";
            aux = aux.getNextElement();
        }
        return str;
    }

    public List<T> toList() {
        /**
         * Metodo que devuelve la representacion el lista del stack
         */
        List<T> list = new ArrayList<>();
        Node<T> aux = this.top;
        while (aux != null) {
            list.add(aux.getElement());
            aux = aux.getNextElement();
        }
        return list;
    }

}
