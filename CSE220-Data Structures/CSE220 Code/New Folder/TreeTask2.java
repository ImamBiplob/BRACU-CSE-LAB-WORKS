public class TreeTask2{
  public static void main(String[]args){
    Object[] arr = {null,10,5,15,2,8,null,20,null,4,6,null,null,null,18};
    Node root = treeBuilder(arr,1);
    System.out.println("Level of the tree: "+level(root.right.right.left));
  }
  
  public static Node treeBuilder(Object[]a, int i){ 
    if(i<0 || i>=a.length || a[i]==null) return null; 
    else{ 
      Node root = new Node (a[i],null,null,null); 
      Node myLeft = treeBuilder(a,2*i); 
      Node myRight = treeBuilder(a,2*i+1); 
      root.left=myLeft; 
      root.right=myRight; 
      if(myLeft!=null) myLeft.parent=root; 
      if(myRight!=null) myRight.parent=root; 
      return root; 
    } 
  }
  
  public static  int level(Node r){
    if(r==null){
      return -1;
    }
    if(r.parent == null){
      return 0;
    }
    return 1+level(r.parent);
  }
}