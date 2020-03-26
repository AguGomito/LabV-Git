package com.company;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.LinkedList;
import java.util.List;

public class Stack<E> {

    private List<E> element;

    public Stack() {
        this.element = new LinkedList<>();
    }

    public boolean push (E element) {
        return this.element.add(element);
    }

    public <E>Object pop () {
        if (!element.isEmpty()) {
            return this.element.remove(this.element.size() - 1);
        }
        return null;
    }

    public Integer size () {
        return this.element.size();
    }

    public void showMe () {
        for (E st : this.element) {
            System.out.printf("%s ", st);
        }
    }
}
