/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myfirstproject;

import java.util.Scanner;

/**
 *
 * @author Jivan
 */
public class Program1
{
   public static void main(String arhs[])
   {
       System.out.println("Hello Jivan, From NetBeans 12.0 LTS");
       
       Scanner sc = new Scanner(System.in);
       int num;
       System.out.println("Enter the number : ");
       num = sc.nextInt();
       System.out.println("You entered = " + num);
   }
}
