/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.Servicios;

import guia7.Entidades.Numero;
import java.util.Scanner;

/**
 *
 * @author VALENTIN
 */
public class Operaciones {
    
    Scanner leer = new Scanner(System.in);
    Numero op2 = new Numero();
    
    public Numero crearOperacion(){
        System.out.println("escriba el primer numero");
        op2.setNum1(leer.nextDouble());
        System.out.println("escriba el primer numero");
        op2.setNum2(leer.nextDouble());
        return op2;
    }
    
    public void sumar(Numero op2){
        op2.setSuma(op2.getNum1()+op2.getNum2());
    } 
    
    public void restar(Numero op2){
        op2.setResta(op2.getNum1()-op2.getNum2());
    }
    
    public void multiplicar(Numero op2){
        if ((op2.getNum1() == 0) || (op2.getNum2() == 0)) {
            System.out.println("erorr, uno de los numeros es igual a 0 y no se pueden multiplicar");
            op2.setMultiplicar(0.0);
        } else {
            op2.setMultiplicar(op2.getNum1() * op2.getNum2());
        }
    }
    
    public void dividir(Numero op2){
        if ((op2.getNum1() == 0) || (op2.getNum2() == 0)) {
            System.out.println("erorr, uno de los numeros es igual a 0 y no se pueden dividir");
            op2.setDividir(0.0);
        } else {
            op2.setDividir(op2.getNum1() / op2.getNum2());
        } 
    }
}
