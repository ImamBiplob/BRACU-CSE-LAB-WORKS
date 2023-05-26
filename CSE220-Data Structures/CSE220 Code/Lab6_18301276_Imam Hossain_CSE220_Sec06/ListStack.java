public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
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
    public void push(Object e) throws StackOverflowException {
      if(size==6) throw new StackOverflowException();
      else{
      Node x=new Node(e,top);
      top=x;
      size++;
      }
    }
    public Object pop() throws StackUnderflowException {
      if(size==0) throw new StackUnderflowException();
      else {
      Object p=top.val;
      top=top.next;
      size--;
      return p;
      }
    }
    public Object peek() throws StackUnderflowException {
      if(size==0) throw new StackUnderflowException();
      else
      return top.val;
    }
    public String toString() {
      
      if(size==0)
        return "Empty Stack";
      Node x=top;
      String s="";
      for(;x!=null;x=x.next) {
        s=s+" "+x.val;
      }
      return s;
    }
    public Object[] toArray() {
      Object []a=new Object[size];
      int c=0;
      for(Node x=top;x!=null;x=x.next) {
        a[c]=x.val;
        c++;
      }
      return a;
    }
    public int search(Object e) {
      int c=-1;
      for(Node x=top;x!=null;x=x.next) {
        c++;
        if(x.val==e) {
          return c;
        }
      }
      return c;
    }

}