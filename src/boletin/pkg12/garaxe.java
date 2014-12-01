package boletin.pkg12;

import javax.swing.JOptionPane;

public class garaxe {

    public garaxe() {
    }
    private long matricula;
    private long tiemposalida;
    double tiempoeuros;

    public void numerodecoches() {
        JOptionPane.showInputDialog("Dime la matricula del coche");
        matricula = System.currentTimeMillis();
    }

    public void contadoreuros() {
        JOptionPane.showMessageDialog(null, "Introduce el tikect");
        tiemposalida = System.currentTimeMillis();
        long resultado = (tiemposalida - matricula);

        tiempoeuros = (((resultado / 3) - 1) * 0.2) + 0.4;
        JOptionPane.showMessageDialog(null, "Usted ha tardado " + (resultado / 1000) + " segundos en retirar su coche \n Debe pagar " + tiempoeuros / 1000 + " euros");
    }
}
