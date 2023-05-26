import java.util.*; 

public class assignmentsectionnine 
{ 
    
 public static class Node 
    { 
        int elem; 
        Node next; 
    } 
    
 public static Node push( Node head, int i) 
    { 
        Node nd = new Node(); 
        nd.elem = i; 
        nd.next = (head); 
        (head) = nd; 
        return head; 
    } 
    
public static void printReverse(Node head) 
    { 
        
        Stack<Node > s = new Stack<Node>(); 
        Node n= head; 
        while (n != null) 
        { 
            s.push(n); 
            n = n.next; 
        } 
        
        
        while (s.size() > 0) 
        { 
            System.out.print( s.peek().elem + " "); 
            s.pop(); 
        } 

    } 
    
    
    public static void main(String args[]) 
    { 
        
        Node head = null; 
        
        head=push(head, 1);
        head=push(head, 8); 
        head=push(head, 3); 
        head=push(head, 0); 
        head=push(head, 1);
        head=push(head, 0);
        head=push(head, 4);
        head=push(head, 1); 
        
        printReverse(head); 
    } 
} 