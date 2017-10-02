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
public class Katter extends Djur {
String matPortionKatt;    

    Katter(String namn, int vikt, String matportionkatt){
super(namn, vikt);
this.matportionkatt = matportionkatt;

}
 public String setMatportionKatt(){
     return matportionkatt;
     }
 
 public String getMatportionKatt(){
     return getVikt()/150;
     