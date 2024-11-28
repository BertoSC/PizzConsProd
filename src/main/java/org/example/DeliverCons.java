package org.example;

import java.util.Random;

public class DeliverCons implements Runnable{
    Tray tray;

    public DeliverCons(Tray tray){
        this.tray=tray;
    }

    @Override
    public void run() {
        while(tray.getTotal()<100) {
            Random rm = new Random();
            // 1000 and 2000ms
            try {
                Thread.sleep(rm.nextInt(1000, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Pizza p = tray.takePizza();
            System.out.println("El repartidor ha cogido la pizza" + p.getId() + " con precio " + p.getPrice());
        }

    }
}
