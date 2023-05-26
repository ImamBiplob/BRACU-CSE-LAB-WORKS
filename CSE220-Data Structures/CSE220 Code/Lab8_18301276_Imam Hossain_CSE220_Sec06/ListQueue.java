public class ListQueue {
  int size;
  Node front,rear;
  public ListQueue() {
    size=0;
    rear=null;
    front=null;
  }
  public int size() {
    return size;
  }
  
  public boolean isEmpty() {
    if(size==0) return true;
    return false;
  }
  
  public void enqueue(Object o) throws QueueOverflowException {
    if(size==6){
      throw new QueueOverflowException();
    }
    else if(size==0) {
      Node x=new Node(o,null);
      front=x;
      rear=front.next;
      size++;
    }
    else{
      Node x=new Node(o,null);
      rear=x;
      rear=rear.next;
      size++;
    }
  }
  
  public Object dequeue() throws QueueUnderflowException {
    if(isEmpty()) throw new QueueUnderflowException();
    Object temp=front.elem;
    front.elem=null;
    front=front.next;
    size--;
    return temp;
  }
  
  public Object peek() throws QueueUnderflowException {
    if(isEmpty()) throw new QueueUnderflowException();
    return front.elem;
  }
  
  public String toString() {
    if(isEmpty()) return "Empty Queue";
    Node x=front;
    String s="[ ";
    for(;x!=null;x=x.next) {
      s=s+x.elem;
    }
    s=s+" ]";
    return s;
  }
  
  public Object[] toArray() {
    Object[] a=new Object[size];
    Node x=front;
    int i=0;
    for(;x!=null;x=x.next) {
      a[i]=x.elem;
      i++;
    }
    return a;
  }
  
  public int search(Object o) {
    int c=0;
    for(Node x=front;x!=null;x=x.next) {
      if(x.elem==o) return c;
      c++;
    }
    return -1;
  }
}