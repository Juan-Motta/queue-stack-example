package com.example;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    /**
     * Implementacion de una cola
     */
    private Node<T> first;
    private Node<T> last;
    private Integer size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void queue(T element) {
        /**
         * Añade un elemento a la cola
         */
        Node<T> newElement = new Node<T>(element, null);
        Node<T> aux = this.first;
        if (aux == null) {
            this.first = newElement;
            this.last = newElement;
        } else {
            while (aux.getNextElement() != null) {
                aux = aux.getNextElement();
            }
            this.last = newElement;
            aux.setNextElement(newElement);
            this.size++;
        }
    }

    public T dequeue() {
        /**
         * Elimina el primer elemento de la cola
         */
        Node<T> aux = this.first;
        this.first = aux.getNextElement();
        return aux.getElement();
    }

    public T first() {
        /**
         * Devuelve el elemento al inicio de la cola
         */
        return (first == null) ? null : first.getElement();
    }

    public T last() {
        /**
         * Devuelve el elemento al inicio de la cola
         */
        return (last == null) ? null : last.getElement();
    }

    public Boolean search(T element) {
        /**
         * Metodo que devuelve un booleano indicando si el elemento se encuentra o no en
         * la cola. El metodo realiza una comparacion con la representacion a String del
         * objeto
         */
        Node<T> aux = this.first;

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
         * Metodo que devuelve un booleano indicando si la cola se encuentra vacio o no
         */
        return this.size == 0;
    }

    public Integer size() {
        /**
         * Metodo que devuelve el tamaño de la cola
         */
        return this.size;
    }

    @Override
    public String toString() {
        /**
         * Metodo que devuelve la representacion en string de la cola
         */
        String str = "";
        Node<T> aux = this.first;
        while (aux != null) {
            str += aux.getElement().toString() + " ";
            aux = aux.getNextElement();
        }
        return str;
    }

    public List<T> toList() {
        /**
         * Metodo que devuelve la representacion el lista de la cola
         */
        List<T> list = new ArrayList<>();
        Node<T> aux = this.first;
        while (aux != null) {
            list.add(aux.getElement());
            aux = aux.getNextElement();
        }
        return list;
    }

}
