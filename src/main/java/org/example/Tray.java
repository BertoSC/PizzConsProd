package org.example;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Tray {
    LinkedList<Pizza> tray;
    private final static int CAPACIDAD_MAX = 5;
    private int total = 0;
    private final static int OBJETIVO = 100;


    public int getTotal() {
        return total;
    }

    public Tray() {
        this.tray = new LinkedList<Pizza>();
    }

    public synchronized Pizza cook() {
        while (tray.size() == CAPACIDAD_MAX) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        total++;
        Pizza piz = new Pizza(total);
        piz.setPrice();
        tray.add(piz);
        notifyAll();
        return piz;
    }

    public synchronized Pizza takePizza() {
        while (tray.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Pizza pizRet= tray.poll();
        notifyAll();
        return pizRet;
    }
}


// LinkedList
//add > añade al final
//poll > pilla el primero y lo quita de la lista

