package com.clases;

/**
 * La clase Director representa a un director dentro de la empresa.
 * Extiende la clase Gerente, heredando sus atributos y comportamientos,
 * y añade un nuevo beneficio basado en acciones.
 * 
 * <p>El salario total de un director se calcula considerando el salario base,
 * el bono y el valor de sus acciones.</p>
 * 
 * @author Laura Duhalde
 */
public class Director extends Gerente {
    /** Cantidad de acciones asignadas al director */
    private int acciones;

    /**
     * Constructor para crear un nuevo director con los atributos especificados.
     * 
     * @param nombre       Nombre del empleado/director
     * @param id           Identificador único del empleado/director
     * @param salarioBase  Salario base del empleado/director
     * @param bono         Bono adicional del gerente/director
     * @param acciones     Acciones otorgadas al director
     */
    public Director(String nombre, String id, int salarioBase, int bono, int acciones) {
        super(nombre, id, salarioBase, bono);
        this.acciones = acciones;
    }

    /**
     * Obtiene las acciones del director.
     * 
     * @return número de acciones del director
     */
    public int getAcciones() {
        return acciones;
    }

    /**
     * Modifica el número de acciones del director.
     * 
     * @param acciones nuevas acciones del director
     */
    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }
    
    /**
     * Calcula el salario total del director.
     * 
     * <p>Este método sobrescribe el cálculo de Gerente.calculaSalarioTotal(),
     * agregando las acciones correspondientes al salario ya calculado en la clase base.</p>
     * 
     * <p>La fórmula utilizada es:</p>
     * <pre>
     * salarioTotal = super.calculaSalarioTotal() + acciones
     * </pre>
     * 
     * @return salario total calculado, incluyendo el salario base del empleado,
     *         el bono del gerente y las acciones del director
     */
    @Override
    public int calculaSalarioTotal() {
        return super.calculaSalarioTotal() + acciones;
    }

    
    /**
     * Muestra en consola la información completa del director,
     * incluyendo la información del empleado y gerente, así como las acciones.
     */
    public void mostrarInformacionDirector() {
        super.mostrarInformacionGerente();
        System.out.println("Acciones: " + acciones);
    }
}
