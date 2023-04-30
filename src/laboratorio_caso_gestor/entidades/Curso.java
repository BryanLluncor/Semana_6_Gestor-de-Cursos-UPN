/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_caso_gestor.entidades;

import java.util.ArrayList;

/**
 *
 * @author brall
 */
public class Curso {
    private String codigo;
    private Integer creditos;
    private String nombre;
    private Estudiante[] estudiante;
    private Profesor[] profesor;

    public Curso() {
    }

  
    
    

    public Curso(String codigo, Integer creditos, String nombre) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.nombre = nombre;
        estudiante=new Estudiante[30];
        profesor=new Profesor[2];
    }    
   
    public void agregarProfesor(Profesor profesor)
    {
        
     
      
    }
    
    public void agregarEstudiante (Estudiante estudiante)
    {
        
    }
    
    

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the creditos
     */
    public Integer getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the estudiante
     */
    public Estudiante[] getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * @return the profesor
     */
    public Profesor[] getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor[] profesor) {
        this.profesor = profesor;
    }
    
     
}
