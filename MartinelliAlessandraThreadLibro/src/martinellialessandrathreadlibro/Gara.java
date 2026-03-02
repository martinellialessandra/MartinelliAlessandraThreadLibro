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
    private ArrayList<String> libriHorror;

    public Gara(ArrayList<String> libriHorror) {
        this.libriHorror = libriHorror;
        Collections.shuffle(libriHorror);
    }

    public ArrayList<String> getLibriHorror() {
        return libriHorror;
    }
    
    
}
