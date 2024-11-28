package org.example;

import java.util.Random;

public class DeliverCons implements Runnable{
    Tray tray;
    int counter;

    public DeliverCons(Tray tray){
        this.tray=tray;
        this.counter=0;
    }


    public synchronized void setCounter() {
        counter++;
    }

    @Override
    public void run() {
        while(counter<100) {
            Random rm = new Random();
            try {
                Thread.sleep(rm.nextInt(1000, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Pizza p = tray.takePizza();
            System.out.println("El repartidor ha cogido la pizza" + p.getId() + " con precio " + p.getPrice());
            setCounter();
        }

    }
}
