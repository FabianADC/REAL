/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class modelo_temperatura {
    
    public double n;
    public int menu;

    public modelo_temperatura(double n, int menu) {
        this.n = n;
        this.menu = menu;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }
    
    
     public double calculo(){
     
    
     double resul=0;
     
       
       
             // menu de selecion de opciones 1 igual a centigrados a farenmgier   
             // menu de selecion de opciones 2 igual a farengeir a centigrados   
             
       
       switch (menu){
           
           
           case 0:
               
               resul=(n*9/5)+32;
               
               
               
               break;
               
           case 1:
 
               resul=(n-32)*5/9;
               
               
               break;
               
               
               
               
               
       }
       
       return resul;
       
       
   }
    
}
