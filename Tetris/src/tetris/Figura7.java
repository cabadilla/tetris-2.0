/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

/**
 *
 * @author Carlos
 */
public class Figura7 extends figuras {
    
     public Figura7(tablero tablero) {
        super(tablero);
        this.c1=new Punto(-2,4);
        this.c2=new Punto(-1,4);
        this.c3=new Punto(-1,3);
        this.c4=new Punto(-1,5);
        this.color=java.awt.Color.yellow;
       
    }
    
  

    @Override
    public void rotar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    




    @Override
    public boolean ifCeros() {
        if(this.c3.getX()!=COLUMNAS-1  && this.c4.getX()!=COLUMNAS-1 && this.c1.getX()!=COLUMNAS-1 && this.c2.getX()!=COLUMNAS-1  ){
                if(this.tablero.matrizLogica[this.c3.getY()][this.c3.getX()+1]==0 &&
                    this.tablero.matrizLogica[this.c4.getY()][this.c4.getX()+1]==0 ){
                    return true;
                }
               
                }
          return false;
    }
    
}
