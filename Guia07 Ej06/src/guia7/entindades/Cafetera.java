/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.entindades;

/**
 *
 * @author VALENTIN
 */
public class Cafetera {
    
    private Double capacidadMaxima;
    private Double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(Double capacidadMaxima, Double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
