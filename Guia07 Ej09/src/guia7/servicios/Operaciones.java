/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.servicios;

import guia7.entidades.Matematica;

/**
 *
 * @author VALENTIN
 */
public class Operaciones {
    
    public void craerObjeto(Matematica m1){
        m1.setNum1(Math.random()*100);
        m1.setNum2(Math.random()*100);
    }
    
    public void devolverMayor(Matematica m1){
        if (m1.getNum1() > m1.getNum2()) {
            System.out.println("el numero mas grande es " + m1.getNum1());
        } else {
            System.out.println("el numero mas grande es " + m1.getNum2());
        }
    }
    
    public void calcularPotencia(Matematica m1){
        int aux1 = (int)Math.floor(m1.getNum1());
        int aux2 = (int)Math.floor(m1.getNum2());
        if (m1.getNum1() > m1.getNum2()) {
            System.out.println("el numero 1 elevado al numero 2 es " + Math.pow(aux1, aux2) );
        } else {
            System.out.println("el numero 1 elevado al numero 2 es " + Math.pow(aux2, aux1) );
        }
    }
    
    public void calcularRaiz(Matematica m1){
        int aux3 = (int)Math.abs(m1.getNum1());
        int aux4 = (int)Math.abs(m1.getNum2());
        if (m1.getNum1() > m1.getNum2()) {
            System.out.println("la raiz cuadrada del numero 2 es " + Math.sqrt(aux4));
        } else {
            System.out.println("la raiz cuadrada del numero 1 es " + Math.sqrt(aux3));
        }
    }

}
