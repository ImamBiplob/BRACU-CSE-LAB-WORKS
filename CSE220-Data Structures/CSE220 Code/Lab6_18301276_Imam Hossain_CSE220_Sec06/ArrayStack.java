public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }
    public int size() {
      return size;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
      if(size==0)
        return true;
      else
        return false;
    }
    public void push(Object e) throws StackOverflowException{
      if(size==data.length) throw new StackOverflowException();
      else {
      data[size]=e;
      size++;
      }
    }
    public Object pop() throws StackUnderflowException {
      if(isEmpty()) throw new StackUnderflowException();
      else{
      Object p=data[size-1];
      data[size-1]=null;
      size--;
      return p;
      }
    }
    public Object peek() throws StackUnderflowException {
      if(isEmpty()) throw new StackUnderflowException();
      else
      return data[size-1];
    }
    public String toString() {
      if(size==0)
        return "Empty Stack";
      String s="";
      for(int i=size-1;i>=0;i--) {
        s=s+" "+data[i];
      }
      return s;
    }
    public Object[] toArray() {
      Object a[]=new Object[size];
      int c=0;
      for(int i=a.length-1;i>=0;i--) {
        a[c]=data[i];
        c++;
      }
      return a;
    }
    public int search(Object e) {
      int c=-1;
      for(int i=size-1;i>=0;i--) {
        c++;
        if(data[i]==e) {
          return c;
        }
      }
      return c;
    }
}