/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package martinellialessandrathreadlibro;
import java.awt.Color;
import javax.swing.ImageIcon;
/**
 *
 * @author martinelli.alessandr
 */
public class Libro {
 private String titolo;
 private Color colore;
 private ImageIcon icona;

    public Libro(String titolo, Color colore, ImageIcon icona) {
        this.titolo = titolo;
        this.colore = colore;
        this.icona = icona;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Color getColore() {
        return colore;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public ImageIcon getIcona() {
        return icona;
    }

    public void setIcona(ImageIcon icona) {
        this.icona = icona;
    }

    @Override
    public String toString() {
        return titolo;
    }

  
 
 
}
