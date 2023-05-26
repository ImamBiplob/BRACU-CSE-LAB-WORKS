public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node n=new Node(a[i],null);
      tail.next=n;
      tail=n;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    int c=0;
    Node tail=head;
    for(;tail.next!=null;tail=tail.next) {
      c++;
    }
    c++;
    return c; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO
    Node start=head;
    /*while(start!=null){
      System.out.println(start.element);
      start=start.next;
    }*/
    for(start=head;start!=null;start=start.next){
      if(start.next!=null)
        System.out.print(start.element+",");
      else 
        System.out.println(start.element+".");
    }
  
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    int c=0;
    for(Node x=head;x!=null;x=x.next) {
      if(c==idx){
        return x;
      }
      c++;
    }
    return null; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
     int c=0;
    for(Node x=head;x!=null;x=x.next) {
      if(c==idx){
        return x.element;
      }
      c++;
    }
    return null;
     // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
    Object n;
    int c=0;
    for(Node x=head;x!=null;x=x.next) {
      if(c==idx){
        n=x.element;
        x.element=elem;
        return n;
      }
      c++;
    }
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
    int c=0;
    for(Node x=head;x!=null;x=x.next) {
      if(x.element==elem){
        return c;
      }
      c++;
    }
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
    for(Node x=head;x!=null;x=x.next) {
      if(x.element==elem){
        return true;
      }
    }
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
    Node x=head;
    return x; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
    Node h=null;
    for (Node n=head;n!=null;n=n.next){
    Node newnode=new Node(n.element,h);
    h=newnode;
    }
    return h;
   // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
    Node newnode=new Node(elem,null);
    if(idx==0){
    newnode.next=head;
    head=newnode;
    }else{
    Node p=nodeAt(idx-1);
    newnode.next=p.next;
    p.next=newnode;
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
     Node remove=null;
    if (index==0){
    remove=head;
    head=head.next;
    }else{
    Node p=nodeAt(index-1);
    remove=p.next;
    p.next=remove.next;
    }
    return remove.element;
    // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
     Node oldhead=head;
    head=head.next;
    Node tail=head;
    while(tail.next!=null){
    tail=tail.next;
    }
    tail.next=oldhead;
    oldhead.next=null;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
    Node p=null;
    Node tail=head;
    while (tail.next!=null){
    p=tail;
      tail=tail.next;
    
    }
    tail.next=head;
    head=tail;
    p.next=null;
  }
}
  