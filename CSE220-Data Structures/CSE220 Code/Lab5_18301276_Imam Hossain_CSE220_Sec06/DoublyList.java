import java.util.*;

public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
      int c=0;
      Node tail=head.next;
      for(;tail!=head;tail=tail.next) {
        c++;
      }
        
        return c; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO   
      Node tail=head.next;
      for(;tail!=head;tail=tail.next) {
        System.out.print(tail.element+"|");
      }
      System.out.println();                    
    }
    
    public void backwardprint(){
        // TO DO     
      Node x=head.prev;
      for(;x!=head;x=x.prev) {
        System.out.print(x.element+"|");
      }
      System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
      int n=0;
      Node x=head.next;
      for(;x!=head;x=x.next) {
        if(n==idx) {
          return x;
        }
        n++;
      }
        return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
      int n=0;
      Node x=head.next;
      for(;x!=head;x=x.next) {
        if(x.element==elem) {
          return n;
        }
        n++;
      }
        
        
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
      /*Node a=nodeAt(idx);//a=after
      Node b=a.prev;//b=before
      Node mn=new Node(elem,null,null);
      b.next=mn;
      mn.prev=b;
      a.prev=mn;
      mn.next=a;*/
      
        if(idx==0) {
          Node newnode=new Node(elem,null,null);
          newnode.prev=head;
          newnode.next=head.next;
          newnode.next.prev=newnode;
          head.next=newnode;
        }
        else {
          Node mn=new Node(elem,null,null);
          Node b=nodeAt(idx-1);
          Node a=b.next;
          b.next=mn;
          mn.prev=b;
          a.prev=mn;
          mn.next=a;
        }
   
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
      Node n=nodeAt(index);
      Node b=n.prev;
      Node a=b.next.next;
      b.next=a;
      a.prev=b;
        
        
        return n.element; // please remove this line!
    }
    
    
    
}