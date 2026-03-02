/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package martinellialessandrathreadlibro;
import java.util.*;
/**
 *
 * @author Alessandra Martinell
 */
public class Gara {
    private ArrayList<Libro> libri;

    public Gara(ArrayList<Libro> libri) {
        this.libri = libri;
        Collections.shuffle(libri);
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }
    
    
}
