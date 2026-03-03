/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package martinellialessandrathreadlibro;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
/**
 *
 * @author Alessandra Martinell
 */
public class GestisciGara {
    private static Gara gara;
    
    public static void nuovaGaraHorror(JProgressBar pgb1, JProgressBar pgb2, JProgressBar pgb3){
        ArrayList<Libro> libriHorror = new ArrayList<>();
        libriHorror.add(new Libro ("Coraline", java.awt.Color.ORANGE, new ImageIcon(GestisciGara.class.getResource("/img/Horror/libro1.png"))));
        libriHorror.add(new Libro ("Piccoli brividi", java.awt.Color.BLACK, new ImageIcon(GestisciGara.class.getResource("/img/Horror/libro2.png"))));
        libriHorror.add(new Libro ("Teddy", java.awt.Color.GRAY, new ImageIcon(GestisciGara.class.getResource("/img/Horror/libro3.png"))));
        libriHorror.add(new Libro ("Frankestein", java.awt.Color.BLUE, new ImageIcon(GestisciGara.class.getResource("/img/Horror/libro4.png"))));
        libriHorror.add(new Libro ("IT", java.awt.Color.WHITE, new ImageIcon(GestisciGara.class.getResource("/img/Horror/libro5.png"))));
        gara = new Gara(libriHorror, new ProgressBar(pgb1), new ProgressBar(pgb2), new ProgressBar(pgb3));
    }
    
    public static void nuovaGaraFantasy(JProgressBar pgb1, JProgressBar pgb2, JProgressBar pgb3){
        ArrayList<Libro> libriFantasy = new ArrayList<>();
        libriFantasy.add(new Libro ("Harry Potter", java.awt.Color.YELLOW, new ImageIcon(GestisciGara.class.getResource("/img/Fantasy/libro11.png"))));
        libriFantasy.add(new Libro ("Il signore degli anelli", java.awt.Color.GRAY, new ImageIcon(GestisciGara.class.getResource("/img/Fantasy/libro12.png"))));
        libriFantasy.add(new Libro ("Narnia", java.awt.Color.ORANGE, new ImageIcon(GestisciGara.class.getResource("/img/Fantasy/libro13.png"))));
        libriFantasy.add(new Libro ("La fabbrica di cioccolato", java.awt.Color.ORANGE, new ImageIcon(GestisciGara.class.getResource("/img/Fantasy/libro14.png"))));
        libriFantasy.add(new Libro ("Percy Jackson", java.awt.Color.BLUE, new ImageIcon(GestisciGara.class.getResource("/img/Fantasy/libro15.png"))));
        gara = new Gara(libriFantasy, new ProgressBar(pgb1), new ProgressBar(pgb2), new ProgressBar(pgb3));
    }
    
    public static void nuovaGaraDarkRomance(JProgressBar pgb1, JProgressBar pgb2, JProgressBar pgb3){
        ArrayList<Libro> libriDarkRomance = new ArrayList<>();
        libriDarkRomance.add(new Libro ("Better", java.awt.Color.BLUE, new ImageIcon(GestisciGara.class.getResource("/img/DarkRomance/libro21.png"))));
        libriDarkRomance.add(new Libro ("Twisted Lies", java.awt.Color.GREEN, new ImageIcon(GestisciGara.class.getResource("/img/DarkRomance/libro22.png"))));
        libriDarkRomance.add(new Libro ("Corrupt", java.awt.Color.GRAY, new ImageIcon(GestisciGara.class.getResource("/img/DarkRomance/libro23.png"))));
        libriDarkRomance.add(new Libro ("Euphoria", java.awt.Color.MAGENTA, new ImageIcon(GestisciGara.class.getResource("/img/DarkRomance/libro24.png"))));
        libriDarkRomance.add(new Libro ("Limitless", java.awt.Color.darkGray, new ImageIcon(GestisciGara.class.getResource("/img/DarkRomance/libro25.png"))));
        gara = new Gara(libriDarkRomance, new ProgressBar(pgb1), new ProgressBar(pgb2), new ProgressBar(pgb3));
    }

    public static Gara getGara() {
        return gara;
    }
    
    
}
