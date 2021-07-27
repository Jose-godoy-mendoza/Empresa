/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joseg
 */
public class Empleado extends Persona{
    private String puesto;
    private String codigo;

    public Empleado() {
    }

    public Empleado(String puesto, String codigo, String nombre, String apellido, String direccion, String telefono, String fecha_nacimiento) {
        super(nombre, apellido, direccion, telefono, fecha_nacimiento);
        this.puesto = puesto;
        this.codigo = codigo;
    }

    

    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public void agregar()
    {
        System.out.println("Nombres: " + getNombre());
        System.out.println("Apellidos: "+ getApellido());
        System.out.println("Direccion: "+ getDireccion());
        System.out.println("Telefono: "+ getTelefono());
        System.out.println("Fecha de nacimiento: "+ getFecha_nacimiento());
        System.out.println("Codigo empleado: "+getCodigo());
        System.out.println("Puesto: "+getPuesto());
    }
    
    @Override
    public void modificar()
    {
        System.out.println("--------Metodo modificar----------");
        System.out.println("Nombres: " + getNombre());
        System.out.println("Apellidos: "+ getApellido());
        System.out.println("Direccion: "+ getDireccion());
        System.out.println("Telefono: "+ getTelefono());
        System.out.println("Fecha de nacimiento: "+ getFecha_nacimiento());
        System.out.println("Codigo empleado: "+getCodigo());
        System.out.println("Puesto: "+getPuesto());
        System.out.println("----------------------------------");
        
        
    }
}
