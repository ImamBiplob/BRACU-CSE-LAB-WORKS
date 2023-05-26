public class AddingElemOfList {
  public static void main(String[] args) {
    Node x=new Node(11,null);
    x.next=new Node(22,null);
    x.next.next=new Node(33,null);
    System.out.println(AddElem(x));
  }
  public static int AddElem(Node x) {
    if(x==null) return 0;
    return x.elem +AddElem(x.next);
  }
}