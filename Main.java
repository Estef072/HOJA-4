
import java.util.Scanner;
import java.util.*;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefania Elvra
 * @author Walter Cruz
 */

public class Main {
    
    public static void main(String[] args) throws IOException{
		
		//Primero se llaman a todas las clases que tienen los métodos necesarios
        InfixToPostFix fx  = new  InfixToPostFix();
        ReadFile  rf= new ReadFile();
		
		//Luego se llama al documento para obtener los datos
		//String ruta="C:\Users\walte\Desktop\HOJA-4-main\HOJA-4-main";
        String nombre = "./datos.txt";
        String input = rf.read(nombre);
        
		//Se creo dato para hacer pruebas de la conversión
        String dato = "(1+2)*9";
		
		//Se llama los métodos y se hace la conversión 
        System.out.println("Infix Expression: " + rf.read(dato));
        System.out.println("Postfix Expression: " + fx.infixToPostFix(rf.read(dato)));
		
		
		
    }
}
  
