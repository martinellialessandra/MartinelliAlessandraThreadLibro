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
    private Libro libro1;
    private Libro libro2;
    private Libro libro3;
    private ProgressBar b1;
    private ProgressBar b2;
    private ProgressBar b3;
    private Libro vincitore;
    private boolean finito;
    private boolean pausa;

    public Gara(ArrayList<Libro> libri, ProgressBar b1, ProgressBar b2, ProgressBar b3) {
        this.libri = libri;
        Collections.shuffle(libri);
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        libro1 = libri.get(0);
        libro2 = libri.get(1);
        libro3 = libri.get(2);
    }
    
        public void avvia(){
        //avvio thread dei concorrenti
        b1.start();
        b2.start();
        b3.start();
        //creazione nuovo thread che controllera' chi finisce prima
        Thread t = new Thread(() -> {
            while (vincitore == null) {
                //controllo per vedere se il primo thread ha finito
                if (!b1.isAlive() && vincitore == null) {
                    vincitore = libro1;
                    b2.ferma();
                    b3.ferma();
                }
                //controllo per vedere se il secondo thread ha finito
                if (!b2.isAlive() && vincitore == null) {
                    vincitore = libro2;
                    b1.ferma();
                    b3.ferma();
                }
                if (!b3.isAlive() && vincitore == null) {
                    vincitore = libro3;
                    b1.ferma();
                    b2.ferma();
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
            finito = true;
             
        });
        //avvio thread
        t.start();
    }
        public Libro getVincitore(){
        if(finito)return vincitore;
        else return null;
    }

    /**
     * Metodo get
     * @return primo concorrente 
     */
    public Libro getLibro1() {
        return libro1;
    }

    /**
     * Metodo get
     * @return secondo concorrente
     */
    public Libro getLibro2() {
        return libro2;
    }

    public Libro getLibro3() {
        return libro3;
    }
    
    
    /**
     * Metodo get
     * @return thread del primo concorrente 
     */
    public ProgressBar getB1() {
        return b1;
    }

    /**
     * Metodo get
     * @return thread del secondo concorrente
     */
    public ProgressBar getB2() {
        return b2;
    }

    public ProgressBar getB3() {
        return b3;
    }

    
    /**
     * Metodo get
     * @return stato del round, finito o no
     */
    public boolean isFinito() {
        return finito;
    }

    /**
     * Metodo get
     * @return stato del round, in pausa o no
     */
    public boolean isPausa() {
        return pausa;
    }
    
    
    /**
     * Metodo che mette in pausa il round
     */
    public void pausaRound(){
        b1.pausa();
        b2.pausa();
        b3.pausa();
        pausa = true;
    }
    
    /**
     * Metodo che riprende il round
     */
    public void riprendiRound(){
        b1.riprendi();
        b2.riprendi();
        b3.riprendi();
        pausa = false;
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }
    
    
}
