package boletin.pkg12;

import javax.swing.JOptionPane;

public class Boletin12 {

    public static void main(String[] args) {
        garaxe coche1 = new garaxe();
        coche1.numerodecoches();
        JOptionPane.showMessageDialog(null, "Tienes el coche1");

        garaxe coche2 = new garaxe();
        coche2.numerodecoches();
        JOptionPane.showMessageDialog(null, "Tienes el tiket coche2");

        garaxe coche3 = new garaxe();
        coche3.numerodecoches();
        JOptionPane.showMessageDialog(null, "Tienes el tiket coche3");

        garaxe coche4 = new garaxe();
        coche4.numerodecoches();
        JOptionPane.showMessageDialog(null, "Tienes el tiket coche4");

        garaxe coche5 = new garaxe();
        coche5.numerodecoches();
        JOptionPane.showMessageDialog(null, "Tienes el tiket coche5");

        garaxe coche6 = new garaxe();
        JOptionPane.showMessageDialog(null, "No hay mas plazas esta completo");

        String car = JOptionPane.showInputDialog("Que coche tienes? escriba coche y el numero seguido ej coche1 ");

        if (!car.equals("coche1")) {
            coche1.contadoreuros();
        } else if (!car.equals("coche2")) {
            coche2.contadoreuros();
        } else if (!car.equals("coche3")) {
            coche3.contadoreuros();
        } else if (!car.equals("coche4")) {
            coche4.contadoreuros();
        } else if (!car.equals("coche5")) {
            coche5.contadoreuros();
        } else {
            JOptionPane.showMessageDialog(null, "No hay ese coche");
        }
    }
}
