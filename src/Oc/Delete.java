/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oc;

import java.io.File;

/**
 *
 * @author 57313
 */
public class Delete {
    public boolean delete(String FilePath){
    try{
     
    File archive = new File(FilePath);
    if(archive.exists()){ // se verifica si el archivo existe 
    if(archive.delete()){ // ya verificado se elimina
    
    System.out.println("borrado 100%");
    return true;
       }else{
        System.out.println("no borrado");
        return false;
    }

     }

         }catch(Exception e){
         
         }
        return false;
    
   }
 } 



