/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package martinellialessandrathreadlibro;
import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author martinelli.alessandr
 */
/**
 * Definisco una classe che si chiama ProgressBar che estende Thread 
 * "ProgressBar" si riferisce alla barra grafica
 * "Pausa" indica che un thread è fermo
 * "Finito" indica che un thread ha terminato l'esecuzione
 * "Stop" il thread deve fermasi definitivamente
 * "Ritardo" simula la velocità di ogni thread
 * @author martinelli.alessandr
 */
public class ProgressBar extends Thread {
       private JProgressBar barra;
    private volatile boolean Pausa;
    private volatile boolean Finito;
    private volatile boolean Stop;
    private int Ritardo;
    
    /**
     * Nel costruttore con JProgressBar ogni oggetto è collegato ad una bar differente
     * Pausa, Finito e Stop non sono attivi
     * il Random serve per dare un tempo diverso ad ogni thread
     * @param barra 
     */
    public ProgressBar(JProgressBar barra){
        Random r = new Random();
        this.barra = barra;
        Pausa = false;
        Finito = false;
        Stop = false;
        Ritardo = r.nextInt(10, 101);
    }
        /**
     * Metodo get
     * @return stato del thread, se e' finito o no
     */
    public boolean getFinito(){
        return Finito;
    }
    /**
     * Metodo che avvia i thread
     */
    /**
     * Fa avanzare la barra
     * Si ferma se "Stop" è true e si mette in pausa se "Pausa" è true
     * ha una velocità casuale
     * Alla fine segnala se ha finito
     */
    public void run(){
        for(int i = 0; i < 100; i++){
            if(Stop)return;
            barra.setValue(i + 1);
            while(Pausa){
                try{
                    Thread.sleep(10);
                }catch(InterruptedException ie){
                    System.out.println("Thread interrotto");
                }
            }
            try{
                Thread.sleep(Ritardo);
            }catch(InterruptedException ie){
                System.out.println("Thread interrotto");
            }
        }
        Finito = true;
    }
    /**
     * Metodo che mette in pausa il thread
     */
    public void pausa(){
        Pausa = true;
    }
    /**
     * Metodo che riavvia il thread
     */
    public void riprendi(){
        Pausa = false;
    }
    /**
     * Metodo che ferma completamente il thread
     */
    /**
     * ferma il thread
     * azzera la barra
     */
    public void ferma(){
        Stop = false;
        this.interrupt();
        barra.setValue(0);
    }
}
