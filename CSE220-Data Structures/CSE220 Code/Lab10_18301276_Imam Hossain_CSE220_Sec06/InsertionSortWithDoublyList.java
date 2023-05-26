public class InsertionSortWithDoublyList {
  public static void main(String[] args) {
    int a[]={6,5,3,1,2};
    int c=a.length;
    Node head=new Node(a[0],null,null);
    Node x=head;
    for(int k=1;k<c;k++) {
      x.next=new Node(a[k],null,x);
      x=x.next;
    }
    ISList(head);
    for(x=head;x!=null;x=x.next) {
      System.out.println(x.elem);
    }
  }
  public static void ISList(Node n) {
    Node x=n.next;
    if(x==null) return;
    for(;x.prev!=null;x=x.prev) {
      if(x.elem<x.prev.elem) {
        int temp=x.elem;
        x.elem=x.prev.elem;
        x.prev.elem=temp;
      }
      else break;
    }
    ISList(n.next);
  }
}