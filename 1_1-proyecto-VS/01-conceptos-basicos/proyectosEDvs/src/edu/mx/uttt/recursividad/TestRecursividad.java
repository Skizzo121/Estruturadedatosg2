package edu.mx.uttt.recursividad;

import javax.swing.JOptionPane;

public class TestRecursividad {
    public static void main(String[] args) {
       ejecutar();
    }

    public static String menu(){
        String menu = "Menu principal \n" +
                "1) Método iterativo \n" +
                "2) Método Recursivo \n" +
                "3) Salir \n" +
                "Elige la opción";
            return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar(){
        boolean sentinel = true;
        String opcion = "";

        operacion op = new operacion();

        int n = 0;
        do{
    
        opcion = menu();

        switch (opcion) {
            case "1":
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor: "));
            op .setN(n);
            op.imprimir();
            break;

                case "2":
                n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor: "));
                op.setN(n);
                op.imprimir(op.getN());
                break;

                    case "3": //Salir
                    sentinel = false;
                    JOptionPane.showMessageDialog(null, "I´ll be back");
                    break;
        
            default:
                JOptionPane.showMessageDialog(null, "Menu no valido");
        } //Cierra switch

            }while(sentinel); //Cierra 
    }
}
