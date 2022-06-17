/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Servicio.EstudianteServicio;
import java.util.List;

/**
 *
 * @author paulp
 */
public class EstudianteControl {
    
    private final EstudianteServicio estudianteServicio = new EstudianteServicio();
    
    public Estudiante crear(String [] params){
        var estudiante = new Estudiante(Integer.valueOf(params[0]),params[1],Integer.valueOf(params[2]),params[3]); 
        this.estudianteServicio.crear(estudiante);
        return estudiante;
    }
   
    public List<Estudiante> listar()
    {
        return this.estudianteServicio.listar();
    } 
}
