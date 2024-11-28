package org.example;

import java.util.Random;

public class CookProd implements Runnable{
    Tray tray;

    public CookProd(Tray tr){
        this.tray=tr;
    }

    @Override
    public void run() {
        while (tray.getTotal()<100) {
            Random rm = new Random();
            try {
                Thread.sleep(rm.nextInt(500, 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            Pizza p = tray.cook();
            System.out.println("El cocinero ha cocinado la pizza" + p.getId() + " con precio " + p.getPrice());
        }

    }
}
