package edu.mx.uttt.iterativos;

import javax.swing.JOptionPane;

public class PruebaSerie {
    public static void main(String[] args) {

        //Creación del primer objeto
        Serie serie1 = new Serie();
        serie1.setN(5);
        JOptionPane.showMessageDialog(null, serie1.calcularSerie());
        JOptionPane.showMessageDialog(null, serie1);
    }


}
