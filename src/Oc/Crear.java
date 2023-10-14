/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oc;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author 57313
 */
public class Crear {
     public String crear(String rute , String nuevofile){
          Path archivo = FileSystems.getDefault().getPath(rute , nuevofile);
    try{
Files.createFile(archivo);
System.out.println("creado 100%");
}catch(Exception e){
e.printStackTrace();

   }
          return null;
    
      }
}


