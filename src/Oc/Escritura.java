/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oc;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;


/**
 *
 * @author 57313
 */
public class Escritura {
   public String escritura(String text ,String direccion){
 try{

BufferedWriter writer = new BufferedWriter(new FileWriter(direccion , true));
writer.write(text);
writer.newLine();
writer.close();







    }catch(Exception e){


        }
        return null;
    }
}
