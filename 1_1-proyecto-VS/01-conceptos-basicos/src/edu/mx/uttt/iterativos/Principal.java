package edu.mx.uttt.iterativos;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
    double  resultado = gestionarOperaciones(menu());
    
    if (resultado == 0.0) {
        JOptionPane.showMessageDialog(null, "Opción no valida");
    } else {
        JOptionPane.showMessageDialog(null, resultado);
    }

}

public static String menu(){
    String menu = "Menu principal \n " +
                    "1)Serie1 \n" +
                    "2)Serie2 \n" +
                    "3)Factorial \n" +
                    "4)Potencia \n" +
                    "5)Serie3 \n" +
                    "Elige un operación: ";

    return JOptionPane.showInputDialog(menu);
}

public static double gestionarOperaciones(String opcion){
        double resultado = 0.0;
        int valor = 0;

        switch (opcion) {
            case "1":
            Serie serie = new Serie();
            resultado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de n"));
            serie.setN(valor);
            resultado = serie.calcularSerie();
            break;

            case "2":
            break;
            case "3":
            break;
            case "4":
            break;
            case "5":
            break;
            case "6":
            break;
        
            default:
                System.out.println("Opción no valida.");
        }
        return resultado;
    }
}
