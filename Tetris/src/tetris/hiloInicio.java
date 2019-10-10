/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class hiloInicio extends Thread {
    
    figuras[] cola=new figuras[3];
    tablero tablero;
    
    
public int ran(){
    int numero = (int) (Math.random() * 7) + 1;
    return numero;
}
    
    
    public hiloInicio(tablero tablero){
        this.tablero=tablero;
        
        for(int i=0;i<=2;i++){
            cola[i]=this.generarFiguras(this.ran());
    
}
        
    }
    
    public figuras generarFiguras(int x){
        
        figuras fig;
        
        switch(x){
            
            case 1: fig= new Figura1(this.tablero);break;
            case 2: fig= new Figura2(this.tablero);break;
            case 3: fig= new Figura3(this.tablero);break;
            case 4: fig= new Figura4(this.tablero);break;
            case 5: fig= new Figura5(this.tablero);break;
            case 6: fig= new Figura6(this.tablero);break;
            case 7: fig= new Figura7(this.tablero);break;
                    
             
            default: fig=null;
        }
        
        return fig;
    }
    
    
    
    public figuras pop(){
        figuras fig=this.cola[0];
        
        for(int i=0;i<2;i++){
            cola[i]=cola[i+1];
        }
        cola[2]=this.generarFiguras(this.ran());
        
        return fig;
    }
    
    @Override
    public void run(){
        
       while(this.tablero.isFin()){     
             
               try {
                   
                   this.pop().start();
                   sleep(this.tablero.espera);
               } catch (InterruptedException ex) {
                   Logger.getLogger(hiloInicio.class.getName()).log(Level.SEVERE, null, ex);
               
           }
           
            
        }
        
    }
    
    
}
