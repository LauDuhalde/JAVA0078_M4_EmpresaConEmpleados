package com.clases;

/**
 * La clase Empleado representa a un empleado con nombre, identificador y salario base.
 * Permite calcular el salario total y mostrar la información básica del empleado.
 * 
 * @author Laura Duhalde
 */
public class Empleado {
    /** Nombre del empleado */
    private String nombre;
    
    /** Identificador único del empleado */
    private String id;
    
    /** Salario base del empleado */
    private int salarioBase;
    
    /**
     * Constructor para crear un nuevo empleado con los atributos especificados.
     * 
     * @param nombre       Nombre del empleado
     * @param id           Identificador único del empleado
     * @param salarioBase  Salario base del empleado (por hora)
     */
    public Empleado(String nombre, String id, int salarioBase) {
        super();
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }
    
    /**
     * Obtiene el nombre del empleado.
     * 
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del empleado.
     * 
     * @param nombre nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador del empleado.
     * 
     * @return identificador único del empleado
     */
    public String getId() {
        return id;
    }

    /**
     * Modifica el identificador del empleado.
     * 
     * @param id nuevo identificador del empleado
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el salario base del empleado.
     * 
     * @return salario base
     */
    public int getSalarioBase() {
        return salarioBase;
    }

    /**
     * Modifica el salario base del empleado.
     * 
     * @param salarioBase nuevo salario base
     */
    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula el salario total mensual del empleado.
     * 
     * <p>La fórmula utilizada es:</p>
     * <pre>
     * salarioTotal = salarioBase * 160
     * </pre>
     * 
     * @return salario total calculado
     */
    public int calculaSalarioTotal() {
        return salarioBase * 160;
    }
    
    /**
     * Muestra en consola la información del empleado:
     * <ul>
     *   <li>Nombre</li>
     *   <li>Identificador</li>
     *   <li>Salario base</li>
     * </ul>
     */
    public void mostrarInformacionEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificador: " + id);
        System.out.println("Salario Base: " + salarioBase);
    }
}
