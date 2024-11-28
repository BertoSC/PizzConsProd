package org.example;

public class LauncherMain {
    public static void main(String[] args) {
        Tray tray = new Tray();

        CookProd cocinero = new CookProd(tray);
        DeliverCons repartidor = new DeliverCons(tray);

        Thread tc = new Thread(cocinero);
        Thread td = new Thread(repartidor);

        tc.start();
        td.start();

        try {
            tc.join();
            td.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}