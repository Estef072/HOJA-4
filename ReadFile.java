/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefania
 * @author Walter Cruz
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;// Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/**
 * Lee el archivo
 * @author Sayra Estefania
 * @author Walter Cruz
 *
 */
public  class ReadFile{
	
	/**
	 * Lee el archivo
	 * @param filename el nombre del archivo
	 * @return el contenido
	 */
	 
	 //En este caso el método read recibe y lee el documento y regresa solamente el texto
	public String read(String filename) {
		try {
		      File myObj = new File(filename);
		      Scanner myReader = new Scanner(myObj);  
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return filename; 
	}
}

