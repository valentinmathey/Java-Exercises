/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.Entidades;

/**
 *
 * @author VALENTIN
 */
public class Numero {
    
    private Double num1;
    private Double num2;
    private Double suma;
    private Double resta;
    private Double multiplicar;
    private Double dividir;

    public Numero() {
    }

    public Numero(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getSuma() {
        return suma;
    }

    public void setSuma(Double suma) {
        this.suma = suma;
    }

    public Double getResta() {
        return resta;
    }

    public void setResta(Double resta) {
        this.resta = resta;
    }

    public Double getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(Double multiplicar) {
        this.multiplicar = multiplicar;
    }

    public Double getDividir() {
        return dividir;
    }

    public void setDividir(Double dividir) {
        this.dividir = dividir;
    }

    @Override
    public String toString() {
        return "Numero{" + "num1=" + num1 + ", num2=" + num2 + ", suma=" + suma + ", resta=" + resta + ", multiplicar=" + multiplicar + ", dividir=" + dividir + '}';
    }

    
    
}
