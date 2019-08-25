/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import InternalFrame.iFpelicula;
import Modelo.Pelicula;
import Modelo.PeliculaDAO;

/**
 *
 * @author vanes
 */
public class ControllerPelicula {
    
   private iFpelicula vista;
   private PeliculaDAO modelo;

    public ControllerPelicula(iFpelicula vista, PeliculaDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
   
   
    
    
    
}
