class Car{
  String name, color;
  Car(){
    this("Toyota","Black"); //must be the first line in a constructor
    System.out.println("You didn't specify NAME and COLOR, assumed Toyota and Black");
  }
  Car(String ektaNaam){
    this(ektaNaam,"Green");//must be the first line in a constructor
    System.out.println("You didn't specify color, assumed GREEN");
    
  }
  Car(String ektaNaam, String konColor){
    name=ektaNaam; // ei line is same as this.name=ektaNaam
    color=konColor; // ei line is same as this.color=konColor
  }
  /* Another way to write the 3rd constructor above is as follows. Both works exactly the same.
   Car(String name, String color){
   System.out.println("Thank you for specifying both.");
   this.name=name; // "this.name" is the class's name, only "name" is the 
   // FIRST parameter/argument name from the signature in line 16 
   
   this.color=color; // "this.color" is the class's color, only "color" is the 
   // SECOND parameter/argument name from the signature in line 16 
   }*/
  
  public String toString(){
    return "I was made by "+name+" and was given the color "+color+". In your computer's RAM, I am stored at the location (in Hexadecimal) "+Integer.toHexString(this.hashCode())+" which is same as "+this.hashCode()+" in Decimal. If you didn't write this toString method, the toString inherited from my parent class \"Object\" would have printed my location as \"Car@"+Integer.toHexString(this.hashCode())+"\"";
  }
}
