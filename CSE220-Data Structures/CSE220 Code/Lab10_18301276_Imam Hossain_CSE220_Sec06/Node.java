public class Node {
  int elem;
  Node next,prev;
  Node(int elem,Node next) {
    this.elem=elem;
    this.next=next;
  }
  Node(int elem,Node next,Node prev) {
    this.elem=elem;
    this.next=next;
    this.prev=prev;
  }
}