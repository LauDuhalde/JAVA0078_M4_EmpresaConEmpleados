package com.clases;

/**
 * La clase Gerente representa a un empleado con rol de gerente,
 * que hereda de la clase Empleado y agrega un bono adicional.
 * 
 * <p>El salario total de un gerente se calcula considerando el salario base
 * y el bono asignado.</p>
 * 
 * @author Laura Duhalde
 */
public class Gerente extends Empleado {
    /** Bono adicional otorgado al gerente */
    private int bono;

    /**
     * Constructor para crear un nuevo gerente con los atributos especificados.
     * 
     * @param nombre       Nombre del empleado/gerente
     * @param id           Identificador único del empleado/gerente
     * @param salarioBase  Salario base del empleado/gerente
     * @param bono         Bono adicional del gerente
     */
    public Gerente(String nombre, String id, int salarioBase, int bono) {
        super(nombre, id, salarioBase);
        this.bono = bono;
    }

    /**
     * Obtiene el bono del gerente.
     * 
     * @return bono del gerente
     */
    public int getBono() {
        return bono;
    }

    /**
     * Modifica el bono del gerente.
     * 
     * @param bono nuevo bono del gerente
     */
    public void setBono(int bono) {
        this.bono = bono;
    }

    /**
     * Calcula el salario total del gerente.
     * 
     * <p>Este método sobrescribe el cálculo de Empleado.calculaSalarioTotal(),
     * agregando el bono correspondiente al salario ya calculado en la clase base.</p>
     * 
     * <p>La fórmula utilizada es:</p>
     * <pre>
     * salarioTotal = super.calculaSalarioTotal() + bono
     * </pre>
     * 
     * @return salario total calculado, incluyendo el salario base del empleado
     *         y el bono adicional del gerente
     */
    @Override
    public int calculaSalarioTotal() {
        return super.calculaSalarioTotal() + bono;
    }

    
    /**
     * Muestra en consola la información del gerente,
     * incluyendo los atributos heredados de Empleado
     * y el bono correspondiente.
     */
    public void mostrarInformacionGerente() {
        super.mostrarInformacionEmpleado();
        System.out.println("Bono: " + bono);
    }
}
