/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgift1;

/**
 *
 * @author Solveig Magnusson
 */
public abstract class Djur {

    private String namn;
    private int vikt;
    private Coachnamn personnamn;
    
    public Djur (String namn, int vikt){
        this.namn = namn;
        this.vikt = vikt;
              
    }// K-tor
    
    public String setNamn(){
    return namn;
    
    }
    
    public String getNamn(){
        return namn;
    }
    
    public int setVikt(){
        return vikt;
    }
    
    public int getVikt(){
        return vikt * 1000;
    }
    
    
    
     public setCoachnamn(){
      return personnamn;
  } 
  public getCoachnamn(){
      return personnamn;
  }


 abstract public void printMe();

}
