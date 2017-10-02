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
public class Hundar extends Djur implements Printable {
    Private String matPortionHund;

Hundar(String namn, int vikt, String matportionhund){
super(namn, vikt);
this.matportionhund = matportionhund;

}
 public String setMatportionHund(){
     return matportionhund;
     }
 
 public String getMatportionHund(){
     return getVikt()/100;
     
     public void printMe();
     System.out.println("Hunden " + getNamn()+ "skall få hundfoder i " + getMatprotionHund() "gram " );
 }
}
