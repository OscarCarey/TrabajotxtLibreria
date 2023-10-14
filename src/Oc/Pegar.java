/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oc;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

/**
 *
 * @author 57313
 */
public class Pegar {
    

 public static String copiar(String origenPath, String destinoPath){
      Path Origen = Paths.get("");
      Path Destino = Paths.get("");
         try{


           Files.copy(Origen , Destino);
           System.out.println("copiado exitoso");
           return "copiado";


    }catch(IOException e){
     e.printStackTrace();
     System.err.println("error" + e.getMessage());
     return "error" + e.getMessage();
}
       
}
}