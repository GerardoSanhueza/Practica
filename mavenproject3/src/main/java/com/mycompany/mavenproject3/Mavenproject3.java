/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author zurit
 */
public class Mavenproject3 {

    public static void main(String[] args) {
      
	
		String str = "Gerardo";
		System.out.println(str);
		StringBuilder dest = new StringBuilder();
		for (int i = (str.length() - 1); i >= 0; i--){
			dest.append(str.charAt(i));
		}
		System.out.println(dest);
	}
}

