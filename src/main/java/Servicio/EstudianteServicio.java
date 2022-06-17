/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulp
 */
public class EstudianteServicio implements IEstudianteServicio{

    private static List<Estudiante> estudianteList = new ArrayList<>();
    
    @Override
    public Estudiante crear(Estudiante estudiante) {
        this.estudianteList.add(estudiante);
        return estudiante;
    }

    @Override
    public List<Estudiante> listar() {
        return this.estudianteList;
    }
    
    
}
