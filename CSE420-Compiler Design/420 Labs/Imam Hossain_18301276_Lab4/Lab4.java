import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Lab4 {
  public static void main(String [] args) {
  String accessSpecifier = "public";
  String staticword = "static";
  String[] datatype = {"void", "int", "double", "char","long", "String"};
  String excludingMethod = "main";
    try {
      File f = new File("input.txt");
      Scanner sc = new Scanner(f);
      System.out.print("Methods:");
      while(sc.hasNextLine()) {
        String currentLine = sc.nextLine(); 
        String [] currentLineArray = currentLine.split(" ",1000);
        for(int i=0;i<currentLineArray.length;i++) {
          currentLineArray[i] = currentLineArray[i].trim();
        }
        
        if((currentLineArray[0]).contains(accessSpecifier)) {
          String print = "";
          if((currentLineArray[1]).contains(staticword)) {
            if(Arrays.asList(datatype).contains(currentLineArray[2])) {
              if(!(currentLineArray[3].contains(excludingMethod))){
                for(int i=3;i<currentLineArray.length;i++) {
                  print+=currentLineArray[i]+" "; 
                }
                print = print.trim();
                print+= ", return type: "+currentLineArray[2];   
              }
            }
          }
          else if(Arrays.asList(datatype).contains(currentLineArray[1])) {
            for(int i=2;i<currentLineArray.length;i++) {
              print+= currentLineArray[i]+" ";
            }
            print = print.trim();
            print = print+", return type: "+currentLineArray[1]; 
          }
          System.out.println(print);
        }
      }
      sc.close(); 
    }  
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}