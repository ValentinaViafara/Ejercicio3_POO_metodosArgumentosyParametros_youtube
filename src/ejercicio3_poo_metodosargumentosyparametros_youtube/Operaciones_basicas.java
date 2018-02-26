/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_poo_metodosargumentosyparametros_youtube;

/**
 *
 * @author danie
 */
public class Operaciones_basicas {
    //ATRIBUTOS
    //variables globales
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //METODOS CON PARAMETROS
    //Parametros son variables locales
    public void sumar(int num1, int num2){
        suma=num1+num2;
    }
    
    public void restar(int num1, int num2){
        resta=num1-num2;
    }
    
    public void multiplicar(int num1, int num2){
        multiplicacion=num1*num2;
    }
    
    public void dividir(int num1, int num2){
        division=num1/num2;
    }
    
    public void mostrarResultado(){
        System.out.println("La suma de los números es= "+suma);
        System.out.println("La resta de los números es= "+resta);
        System.out.println("La multiplicacion de los números es= "+multiplicacion);
        System.out.println("la division de los números es= "+division);
    }
    
    
}
