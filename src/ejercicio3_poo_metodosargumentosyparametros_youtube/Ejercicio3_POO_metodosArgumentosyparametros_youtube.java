/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_poo_metodosargumentosyparametros_youtube;

//Libreria para recibir datos
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Ejercicio3_POO_metodosArgumentosyparametros_youtube {

    /**
     * @param args the command line arguments
     */
    
    //Variables, llamado de datos
    
    int numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1= "));
    int numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2= "));
    
    
    
    public static void main(String[] args) {
            //Variables, llamado de datos
    
    int numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1= "));
    int numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2= "));
        
    
    //CREACION OBJETO
    
    Operaciones_basicas op1= new Operaciones_basicas();
    
    //METODOS LLAMAMIENTO
    //Argumentos
    op1.sumar(numero1, numero2);
    op1.restar(numero1, numero2);
    op1.multiplicar(numero1, numero2);
    op1.dividir(numero1, numero2);
    op1.mostrarResultado();
    
    }
    
}
