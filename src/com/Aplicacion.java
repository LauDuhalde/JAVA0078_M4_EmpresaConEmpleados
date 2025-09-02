package com;

import com.clases.Director;
import com.clases.Empleado;
import com.clases.Gerente;

/**
 * Clase principal que permite ejecutar la aplicación de ejemplo
 * para demostrar la jerarquía de empleados dentro de una empresa.
 * 
 * <p>Se crean instancias de Empleado, Gerente y Director,
 * y se muestra la información de cada uno junto con el cálculo de su salario total.</p>
 * 
 * @author Laura Duhalde
 */
public class Aplicacion {
    
    /**
     * Método principal de la aplicación.
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ana Aravena", "AA0001", 20000);
        Gerente gerente = new Gerente("Bastian Barrientos", "BB0002", 50000, 600000);
        Director director = new Director("Camila Castillo", "CC0003", 70000, 800000, 1000000);
        
        // Información del empleado
        empleado.mostrarInformacionEmpleado();
        System.out.println("Salario total: " + empleado.calculaSalarioTotal());
        System.out.println("--------------");
        
        // Información del gerente
        gerente.mostrarInformacionGerente();
        System.out.println("Salario total: " + gerente.calculaSalarioTotal());
        System.out.println("--------------");
        
        // Información del director
        director.mostrarInformacionDirector();
        System.out.println("Salario total: " + director.calculaSalarioTotal());
    }   
}
