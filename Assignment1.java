/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                try {
            FileWriter writer = new FileWriter("source.txt", true);
            writer.write("abc def ghi\r\n" + "123 456\r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
                
         try {
            FileReader reader = new FileReader("source.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
         BufferedReader br = null;
         BufferedWriter bw = null;

try {
    br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("source.txt"))));
    bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("output.bin"))));
    
    bw.write("modified text\r\n");
      
    int i;
    do {
        i = br.read();
        if (i != -1) {
            bw.write(i);
        }
    } while (i != -1);
    
  

} catch (IOException e) {
    System.err.println("error during copying: "+ e.getMessage());
} finally {
    try {
        if (br != null) br.close();
        if (bw != null) bw.close();
    } catch (IOException e) {
        System.err.println("error during closing: "+ e.getMessage());
    }
}
    }
              
        
}
       
    
