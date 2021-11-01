package com.example;

public class Node<T> {
    private T element;
    private Node<T> nextElement;

    public Node(T element, Node<T> nextElement) {
        this.element = element;
        this.nextElement = nextElement;
    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNextElement() {
        return this.nextElement;
    }

    public void setNextElement(Node<T> nextElement) {
        this.nextElement = nextElement;
    }

    @Override
    public String toString() {
        return this.element.toString();
    }

}
