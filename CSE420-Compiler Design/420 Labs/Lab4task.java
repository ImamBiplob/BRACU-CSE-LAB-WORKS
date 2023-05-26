import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Lab4task {
  public static void main(String[] args) {
    try{
      FileReader fr = new FileReader("input.txt");     
      Pattern p = Pattern.compile("(public)\\s+(static\\s)?((int)|(void))\\s((?!main)[a-z0-9])+[(].*[)]");
      BufferedReader obj = new BufferedReader(fr);
      String str;
      while((str=obj.readLine())!=null) {
        str = obj.readLine();
        Matcher m = p.matcher(str);
        System.out.println(m.find());
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}