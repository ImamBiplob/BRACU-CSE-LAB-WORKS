// Name = Imam Hossain
// ID = 18301276
// Section = 09
import java.util.Stack;

public class Assignment {

    public static void main(String[] args) {
        Object a[] = {1, 2, 3, 5, 7, 9};
        Node head = new Node(a[0], null);
        Node x = head;
        for (int i = 1; i < a.length; i++) {
            Node n = new Node(a[i], null);
            x.next = n;
            x = x.next;
        }
        /*for(Node mn=head;mn!=null;mn=mn.next) {
      System.out.println(mn.elem);
    }*/
        ReversePrint(head);
    }

    public static void ReversePrint(Node m) {
        Stack s = new Stack();
        for (Node x = m; x != null; x = x.next) {

            s.push(x.elem);

        }
        while (s.isEmpty() != true) {

            System.out.println(s.pop());

        }
    }
}
