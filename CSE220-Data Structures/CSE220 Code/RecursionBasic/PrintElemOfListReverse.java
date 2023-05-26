public class PrintElemOfListReverse {
  public static void main (String[] args) {
    Node x=new Node(11,null);
    x.next=new Node(22,null);
    x.next.next=new Node(33,null);
    x.next.next.next=new Node(44,null);
    PR(x);
  }
  public static void PR(Node n) {
    if(n.next==null){
      System.out.println(n.elem);
      return;
    }
    Node x=n;
    for(;x!=null;x=x.next) {
      if(x.next.next==null){
        System.out.println(x.next.elem);
        x.next=null;
      }
    }
    PR(n);
  }
}