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
        Scanner sc.newScanner(System.in);
        
        System.out.println("ingrese partidos ganados");
        int ganados = sc.nextlnt();
        
        System.out.println("ingrese partidos empatados");
        int empatados = sc.nextlnt();
        
        System.out.println("ingrese partidos perdidos");
        int perdidos = sc.nextlnt();

        int puntaje total = ((ganados*3)+(empatados*1)+(perdidos*0));
        sc.close();
        
    }
}
