/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.Servicios;

import guia7.Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author VALENTIN
 */
public class Operaciones {
    
    Scanner leer = new Scanner(System.in);
    Cuenta c2 = new Cuenta();
    
    public Cuenta crearCuenta(){
        System.out.println("ingrese el numero de cuenta");
        c2.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese su DNI");
        c2.setDni(leer.nextInt());
        System.out.println("ingrese su saldo actual");
        c2.setSaldoActual(leer.nextInt());
        return c2;
    }
    
    public void ingresaDinero(Cuenta c2){
        System.out.println("cantidad de dinero a ingresar");
        int ingresarDinero = leer.nextInt();
        c2.setSaldoActual(c2.getSaldoActual()+ingresarDinero);
        System.out.println("dinero acreditado");
    }
    
    public void retirarDinero(Cuenta c2) throws InterruptedException{
        System.out.println("cantidad de dinero a ingresar");
        int retirarDinero = leer.nextInt();
        while (retirarDinero > c2.getSaldoActual()) {            
            System.out.println("saldo insuficiente, pruebe nuevamente");
            retirarDinero = leer.nextInt();
        }
        c2.setSaldoActual(c2.getSaldoActual() - retirarDinero);
        System.out.println("dinero desacreditado");
    }
    
    public void extraccionRapida(Cuenta c2){
        System.out.println("se podra retirar solo el 20%");
        c2.setSaldoActual(c2.getSaldoActual() - ((c2.getSaldoActual()*20)/100));
        System.out.println("extraccion finalizada");
    }
    
    public void consultaSaldo(Cuenta c2){
        System.out.println("saldo actual " + c2.getSaldoActual());
    }
    
    public void consultaDatos(Cuenta c2){
        System.out.println("saldo actual " + c2.getSaldoActual());
        System.out.println("DNI " + c2.getDni());
        System.out.println("numero cuenta " + c2.getNumeroCuenta());
    }
}
