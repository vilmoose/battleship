/*
 *Vilmos Feher
 *01/04/2019
 *Read any file and display it
 */

package textfilereader;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author vifeh1685
 */
public class TextFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String output;
        boolean noError = true;
        
        String input = JOptionPane.showInputDialog("Enter the name of the file:");
      while(noError == true){
        
          try{
            BufferedReader readFile = new BufferedReader(
        new FileReader(input));
            for(int i = 0; i<2; i++){
            output = readFile.readLine();
            System.out.println(output);
            noError = false;
            }
        } catch(FileNotFoundException a){
            System.out.println("Not found/invalid name");
            noError= false;
        }
            
       }
    } 
}
