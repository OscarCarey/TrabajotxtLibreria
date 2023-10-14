/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author 57313
 */
public class Lectura {
    
   public String lectura(String direction){
        StringBuilder contenido = new StringBuilder();
    try{

      BufferedReader reader = new BufferedReader (new FileReader(direction));
       String linea ;
         
       while((linea = reader.readLine()) != null){
         contenido.append(linea).append("\n");
       }
  
      reader.close();
     }catch(Exception e){
      e.printStackTrace();

   }
        return contenido.toString();
}
}