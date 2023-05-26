
public class OnlyFun{
  public static void main(String args[]){
     Box MyBox1 = new Box();
     Box MyBox2 = new Box();
     
     MyBox1.length= 10;
     MyBox1.width= 20;
     MyBox1.height = 30;
 
     System.out.println("Mybox1: " +MyBox1.vol());
     MyBox1.SurfaceArea();
     
     MyBox2.length= 5;
     MyBox2.width= 2;
     MyBox2.height = 3;
 
     System.out.println("Mybox2: " +MyBox2.vol());
     MyBox2.SurfaceArea();
     
     
  }
}

class Box{
  double length;
  double width;
  double height;
  
  double vol(){
    return (length*width*height);
  }
  void SurfaceArea(){
    System.out.println("Top: " + (length*width));
    System.out.println("Side1: " + (height*width));
    System.out.println("Side2: " + (length*height));
  }
  
}
