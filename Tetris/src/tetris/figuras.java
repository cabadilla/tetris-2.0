/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Carlos
 */
public abstract class figuras extends Thread implements KeyListener {
    
   Punto c1;
   Punto c2;
   Punto c3;
   Punto c4;
   boolean llego;
   
   Color color;
   
    tablero tablero;
   static final int FILAS=10;
   static final int COLUMNAS=20;

    public figuras(tablero tablero) {
        
        this.tablero=tablero;
        
       this.tablero.addKeyListener(this);
       this.llego=true;
    }
    
public void izquierda(){
    if(this.llego){
        if(this.c1.getY()-1>=0&&this.c2.getY()-1>=0&&this.c3.getY()-1>=0&&this.c4.getY()-1>=0){
        if(     this.tablero.matrizLogica[this.c1.getY()-1][c1.getX()]<=0&&
                this.tablero.matrizLogica[this.c2.getY()-1][c2.getX()]<=0&&
                this.tablero.matrizLogica[this.c3.getY()-1][c3.getX()]<=0&&
                this.tablero.matrizLogica[this.c4.getY()-1][c4.getX()]<=0){
        
        
        this.c1.setY(this.c1.getY()-1);
        this.c2.setY(this.c2.getY()-1);
        this.c3.setY(this.c3.getY()-1);
        this.c4.setY(this.c4.getY()-1);
        

         this.tablero.matrizLogica[this.c1.getY()+1][c1.getX()]=0;
        this.tablero.matrizLogica[this.c2.getY()+1][c2.getX()]=0;
        this.tablero.matrizLogica[this.c3.getY()+1][c3.getX()]=0;
        this.tablero.matrizLogica[this.c4.getY()+1][c4.getX()]=0;

        this.tablero.matrizBotones[this.c1.getY()+1][this.c1.getX()].setBackground(java.awt.Color.GRAY);
        this.tablero.matrizBotones[this.c2.getY()+1][this.c2.getX()].setBackground(java.awt.Color.GRAY);
        this.tablero.matrizBotones[this.c3.getY()+1][this.c3.getX()].setBackground(java.awt.Color.GRAY);
        this.tablero.matrizBotones[this.c4.getY()+1][this.c4.getX()].setBackground(java.awt.Color.GRAY);
    }
        }
    }
}

public boolean verDebajo(){
    
     if(this.c3.getX()==COLUMNAS-1  ||  this.c4.getX()==COLUMNAS-1 ||  this.c1.getX()==COLUMNAS-1 ||  this.c2.getX()==COLUMNAS-1){
         return false;
     }
        if(this.c1.getX()>=0&&this.c2.getX()>=0&&this.c3.getX()>=0&&this.c4.getX()>=0){
            if(this.tablero.matrizLogica[this.c1.getY()][this.c1.getX()+1]>0 ||
                this.tablero.matrizLogica[this.c2.getY()][this.c2.getX()+1]>0||
                this.tablero.matrizLogica[this.c3.getY()][this.c3.getX()+1]>0 ||
                this.tablero.matrizLogica[this.c4.getY()][this.c4.getX()+1]>0 )
            {
                return false;
        }
        }
        
        
        return true;
        
    }

public void derecha(){
    
    if(this.llego){
        if(this.c1.getY()+1<=FILAS-1&&this.c2.getY()+1<=FILAS-1&&this.c3.getY()+1<=FILAS-1&&this.c4.getY()+1<=FILAS-1){
        if(this.tablero.matrizLogica[this.c1.getY()+1][c1.getX()]<=0&&
       this.tablero.matrizLogica[this.c2.getY()+1][c2.getX()]<=0&&
       this.tablero.matrizLogica[this.c3.getY()+1][c3.getX()]<=0&&
       this.tablero.matrizLogica[this.c4.getY()+1][c4.getX()]<=0){
            
            this.c1.setY(this.c1.getY()+1);
            this.c2.setY(this.c2.getY()+1);
            this.c3.setY(this.c3.getY()+1);
            this.c4.setY(this.c4.getY()+1);

       this.tablero.matrizLogica[this.c1.getY()-1][c1.getX()]=0;
       this.tablero.matrizLogica[this.c2.getY()-1][c2.getX()]=0;
       this.tablero.matrizLogica[this.c3.getY()-1][c3.getX()]=0;
       this.tablero.matrizLogica[this.c4.getY()-1][c4.getX()]=0;

       this.tablero.matrizBotones[this.c1.getY()-1][this.c1.getX()].setBackground(java.awt.Color.GRAY);
       this.tablero.matrizBotones[this.c2.getY()-1][this.c2.getX()].setBackground(java.awt.Color.GRAY);
       this.tablero.matrizBotones[this.c3.getY()-1][this.c3.getX()].setBackground(java.awt.Color.GRAY);
       this.tablero.matrizBotones[this.c4.getY()-1][this.c4.getX()].setBackground(java.awt.Color.GRAY);
      
       
        }
    }
}
}
    


public void ponerCeros(){
     if(this.c1.getX()>=0){
        this.tablero.matrizLogica[this.c1.getY()][this.c1.getX()]=0;
        this.tablero.matrizBotones[this.c1.getY()][this.c1.getX()].setBackground(java.awt.Color.GRAY);
     }
        if(this.c2.getX()>=0){
            this.tablero.matrizLogica[this.c2.getY()][this.c2.getX()]=0;
            this.tablero.matrizBotones[this.c2.getY()][this.c2.getX()].setBackground(java.awt.Color.GRAY);
     }
        if(this.c3.getX()>=0){
            this.tablero.matrizLogica[this.c3.getY()][this.c3.getX()]=0;
            this.tablero.matrizBotones[this.c3.getY()][this.c3.getX()].setBackground(java.awt.Color.GRAY);
     }
        if(this.c4.getX()>=0){
            this.tablero.matrizLogica[this.c4.getY()][this.c4.getX()]=0;
            this.tablero.matrizBotones[this.c4.getY()][this.c4.getX()].setBackground(java.awt.Color.GRAY);
     }
    }
    
    public void aparecer(){
        if(this.c1.getX()>=0){
            this.tablero.matrizLogica[this.c1.getY()][this.c1.getX()]=-1;
            this.tablero.matrizBotones[this.c1.getY()][this.c1.getX()].setBackground(this.color);
    }
        if(this.c2.getX()>=0){
            this.tablero.matrizLogica[this.c2.getY()][this.c2.getX()]=-1;
            this.tablero.matrizBotones[this.c2.getY()][this.c2.getX()].setBackground(this.color);
    }
        
        if(this.c3.getX()>=0){
            this.tablero.matrizLogica[this.c3.getY()][this.c3.getX()]=-1;
            this.tablero.matrizBotones[this.c3.getY()][this.c3.getX()].setBackground(this.color);
    }
        
        if(this.c4.getX()>=0){
            this.tablero.matrizLogica[this.c4.getY()][this.c4.getX()]=-1;
            this.tablero.matrizBotones[this.c4.getY()][this.c4.getX()].setBackground(this.color);
        }

         
         
    }
    
    
    
    
    
    public abstract void rotar();
    public abstract boolean ifCeros();
    

    @Override
    public void keyReleased(KeyEvent e){
        
    }

    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT: this.izquierda();break;
            case KeyEvent.VK_RIGHT: this.derecha();break;
            
        }
    }

    @Override
    public void keyTyped(KeyEvent e){
        
    }
    
    public void run(){
        
        while(this.verDebajo()){   
           
            this.aparecer();
            
           try {
                    sleep((long) (this.tablero.velocidad));
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
           
           if(this.c1.getX()>=0 &&this.c2.getX()>=0 &&this.c3.getX()>=0 &&this.c4.getX()>=0 ){
                if(this.c3.getX()<COLUMNAS-1  &&  this.c4.getX()<COLUMNAS-1 &&  this.c1.getX()<COLUMNAS-1 &&  this.c2.getX()<COLUMNAS-1){
                 if(this.tablero.matrizLogica[this.c1.getY()][this.c1.getX()+1]<=0 &&
                     this.tablero.matrizLogica[this.c2.getY()][this.c2.getX()+1]<=0&&
                     this.tablero.matrizLogica[this.c3.getY()][this.c3.getX()+1]<=0 &&
                     this.tablero.matrizLogica[this.c4.getY()][this.c4.getX()+1]<=0 )
                 {
                
                 this.ponerCeros();
           }
           }
           }else{
               this.ponerCeros();
               
           }
          this.c1.setX(this.c1.getX()+1);
           this.c2.setX(this.c2.getX()+1);
           this.c3.setX(this.c3.getX()+1);
           this.c4.setX(this.c4.getX()+1);
            
           
           
           
        }
        
        
        this.tablero.setFin(true);
        this.llego=false;

        this.aparecer();
        
        this.tablero.matrizLogica[this.c1.getY()][this.c1.getX()]=1;
        this.tablero.matrizLogica[this.c2.getY()][this.c2.getX()]=1;
        this.tablero.matrizLogica[this.c3.getY()][this.c3.getX()]=1;
        this.tablero.matrizLogica[this.c4.getY()][this.c4.getX()]=1;
        
        }
}




