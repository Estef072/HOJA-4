
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefania Elvira
 * @author Walter Cruz
 */
public class Prueba {
    public String read (){
		
		//Se lee el archivo y se devuelve el contenido
         File archivo = new File ("C:\\archivo.txt");
        FileReader fr = new FileReader(archivo);
         BufferedReader br = new BufferedReader(fr);
         
        String linea = br.readLine();
      return linea; 
    }
    
}
