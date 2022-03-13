package com.yyc.studydesignpattern.oop.polymorphism;

/**
 * @author Frankie
 * @since 2022-03-13 3:49 PM
 */
public class SortedDynamicArray extends DynamicArray {

    @Override
    public void add(Integer e) {
        ensureCapacity();
        int i;
        for (i = size - 1; i >= 0; --i) {
            if (elements[i] > e) {
                elements[i + 1] = elements[i];
            } else {
                break;
            }
        }
        elements[i + 1] = e;
        ++size;
    }
}
