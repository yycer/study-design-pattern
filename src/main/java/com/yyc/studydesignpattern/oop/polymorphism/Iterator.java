package com.yyc.studydesignpattern.oop.polymorphism;

/**
 * @author Frankie
 * @since 2022-03-13 3:55 PM
 */
public interface Iterator {
    boolean hasNext();
    String next();
    String remove();
}

class Array implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    @Override
    public String remove() {
        return null;
    }
}

class LinkedList implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    @Override
    public String remove() {
        return null;
    }
}
