package Carpeta2;

import java.util.Scanner;

public class Menu {

    private Robot robot;
    private int opcion = 0;
    private Scanner leer;

    public Menu() {
        robot = new Robot("Hammer");
        leer = new Scanner(System.in);
    }

    public void desplegarMenu() {
        do {
            robot.status();
            System.out.println("1. Cargar");
            System.out.println("2.- Golpear");
            System.out.println("3.- Reparar");
            System.out.println("4.- Salir");
            System.out.println("OP:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    robot.cargar();
                    break;
                case 2:
                    robot.golpear();
                    break;
                case 3:
                    robot.reparar();
                    break;

                case 4:
                    break;
            }

        } while (opcion != 4);

    }

}
