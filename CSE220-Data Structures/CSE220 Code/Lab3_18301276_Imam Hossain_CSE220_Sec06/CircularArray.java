public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    //TO DO
        start = st;
        size = sz;
        cir = new Object[lin.length];

        for (int i = 0; i < size; i++) {

            cir[st] = lin[i];

            st = (st + 1) % cir.length;
        }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
     for (int i = 0; i < cir.length; i++) {

            System.out.print(cir[i] + " ");
        }

        System.out.println();
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    //To DO
    for(int i=start;i<size+start;i++) {
      System.out.print(cir[i%cir.length]+" ");
    }
    System.out.println();
  }
  public void printBackward(){
   //TO DO
    for(int i=size+start-1;i>=start;i--) {
      System.out.print(cir[i%cir.length]+" ");
    }
    System.out.println();
  }
  
  // With no null cells
  public void linearize(){
    //TO DO
     Object[] temp = new Object[size];

        for (int i = 0; i < size; i++) {

            temp[i] = cir[(i + start) % cir.length];
        }

        cir = temp;

        start = 0;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    //TO DO
    Object temp[]=new Object[newcapacity];
    for(int i=start;i<size+start;i++) {
      temp[i%temp.length]=cir[i%cir.length];
    }
    cir=temp;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    //TO DO
    Object[] temp = new Object[newcapacity];

        for (int i = 0; i < size; i++) {

            temp[i] = cir[(i + start) % cir.length];
        }

        start = 0;
        cir = temp;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    //TO DO
    if (size == cir.length) {
            resizeStartUnchanged(size + 3);
        }
    
     for (int i = cir.length - 1; i > pos+start; i--) {

            cir[i] = cir[i - 1];
        }
     cir[(pos+start)%cir.length] = elem;
     size++;
  }
  
  public void insertByLeftShift(Object elem, int pos){
    //TO DO
    
        if (size == cir.length) {

            resizeStartUnchanged(cir.length + 3);
        }

        for (int i = 0; i < start + pos; i++) {

            cir[i] = cir[i + 1];
        }

        cir[(start + pos) % cir.length] = elem;
        start--;
        size++;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    //TO DO
    for(int i=start+pos;i<start+pos+size-start;i++) {
      cir[i%cir.length]=cir[(i+1)%cir.length];
    }
    size--;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    //TO DO
    for(int i=(start+pos);i>=start;i--) {
      cir[i%cir.length]=cir[(i-1)%cir.length];
    }

        size--;
        start++;
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
    //TO DO
      boolean result = true;

        for (int i = 0; i < size / 2; i++) {

            if (cir[(start + i) % cir.length] != cir[(start + size - 1 - i) % cir.length]) {

                result = false;
                break;
            }
        }

        if (result) {

            System.out.println("This is a palindrome.");
        } else {

            System.out.println("This is not a palindrome.");
        }
  }
  
  
  //This method will sort the values by keeping the start unchanged
  public void sort(){
    //TO DO
    /*Object temp;
    for(int i=start;i<start+size;i++) {
      
      for(int j=start;j<start+size-1;j++) {
        
        if((int)cir[j%cir.length]>(int)cir[(j+1)%cir.length]) {
          temp=cir[(j+1)%cir.length];
          cir[(j+1)%cir.length]=cir[j%cir.length];
          cir[j%cir.length]=temp;
        }
      }
    }*/      
   
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
    //TO DO
    if (size != k.size) {

            return false;
        }

        for (int i = 0; i < size; i++) {

            if (cir[(i + start) % cir.length] != k.cir[(i + k.start) % k.cir.length]) {

                return false;
            }
        }

        return true;
     // Remove this line
  }
}