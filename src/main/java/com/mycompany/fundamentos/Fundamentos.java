/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fundamentos;

/**
 *
 * @author ALUMNO
 */
import java.util.Scanner 
    
public class Fundamentos {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
         System.out.println("ingrese partidos ganados");
         int pg = sc.nextInt();
         
         System.out.println("ingrese partidos empatados");
         int pe = sc.nextInt();
         
         System.out.println("ingrese partidos perdidos");
         int pp = sc.nextInt();
         
         int pf = (pg*3)+(pe*1);
         
         System.out.println("el pf del equipo es:"+pf);
        
    }
}
