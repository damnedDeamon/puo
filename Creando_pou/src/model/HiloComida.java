package model;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class HiloComida extends Thread{
    JProgressBar comida;
    
    private static int descuento = 10;

    public HiloComida(JProgressBar comida) {
        this.comida = comida;
    }
    
    public void run(){
        int max = comida.getMaximum();
        int min = comida.getMinimum();
        
        Runnable ejecutor = new Runnable() {
            @Override
            public void run() {
                int valorActual = comida.getValue();
                comida.setValue(valorActual);
            }
        };
        
        for (int i = min; i < max; i++) {
            
            try {
                EventQueue.invokeAndWait(ejecutor);
                Thread.sleep(descuento);
            } catch (InterruptedException ex) {
            } catch (InvocationTargetException ex) {
                
            }
        }
    }
}
