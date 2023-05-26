/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author imamb
 */
import java.util.*;
import java.io.*;

public class lab1 {
  static String[] keywords = {"if", "else", "for", "int", "double", "float", "String", "break", "case", "new", "Scanner"};
  static String[] mathOps = {"+", "-", "*", "/", "++", "--", "=", "%"};
  static String[] logicalOps = {"==", "!=", ">", ">=", "<", "<="};
  static String[] splitA;
  static String[] splitB;
  static String[] splitC;
  static String[] tempSplit;
  static String[] temp2;
  static ArrayList<String> a = new ArrayList<String>();
  static ArrayList<String> b = new ArrayList<String>();
  static ArrayList<String> c = new ArrayList<String>();
  
  public static void main(String[] args) {
    try {
      Set<String> keys = new HashSet<String>();
      Set<String> identifiers = new HashSet<String>();
      Set<String> numericalValues = new HashSet<String>();
      Set<String> math_Ops = new HashSet<String>();
      Set<String> logical_Ops = new HashSet<String>();
      Set<String> others = new HashSet<String>();
      String address = "C:\\Users\\imamb\\Desktop\\input.txt";
      Scanner sc = new Scanner(new File(address));
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        splitA = line.split("\\s+");
        splitB = line.split("\\W");
        splitC = line.split("\\w+");
      
        for (String splitA_element : splitA) {
          tempSplit = splitA_element.split(";");
          temp2 = tempSplit[0].split(",");
          a.add(temp2[0]);
        }
        for (String splitB_element : splitB) {
          if (!splitB_element.equals("")) {
            b.add(splitB_element);
          }
        }
        for (String splitC_element : splitC) {
          c.add(splitC_element);
        }
      }
      ListIterator<String> itr = a.listIterator();
      while(itr.hasNext()) {
        String temp = itr.next();
        if(isNumeric(temp)){
          numericalValues.add(temp);
        }
      }
      ListIterator<String> itr2 = b.listIterator();
      while (itr2.hasNext()) {
        String temp = itr2.next();
        if(match(temp, keywords)){
          keys.add(temp);
        }
        else if(!isNumeric(temp)) {
          identifiers.add(temp);
        }
      }
      ListIterator<String> itr3 = c.listIterator();
      while (itr3.hasNext()) {
        String temp = itr3.next().trim();
        if(match(temp, mathOps)) {
          math_Ops.add(temp);
        }
        else if(match(temp, logicalOps)) {
          logical_Ops.add(temp);
        }
        else if((!temp.equals("")) && (!temp.equals(" ")) && (!temp.equals("."))) {
          others.add(temp);
        }
      }
      System.out.println("Keywords: " +keys);
      System.out.println("Identifiers: " +identifiers);
      System.out.println("Math Operators: " +math_Ops);
      
      System.out.println("Logical Operators: " +logical_Ops);
      System.out.println("Numerical Values: "+numericalValues);
      System.out.println("Others: " +others);
      
    }catch (Exception e) {
      System.out.println(e);
    }
  }
  public static boolean match(String key, String[] arr) {
    for (String x : arr) {
      if(x.equals(key)) {
        return true;
      }
    }
    return false;
  }
  public static boolean isNumeric(String str) {
    try {
      double d = Double.parseDouble(str);
    }
    catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }
}


      
      