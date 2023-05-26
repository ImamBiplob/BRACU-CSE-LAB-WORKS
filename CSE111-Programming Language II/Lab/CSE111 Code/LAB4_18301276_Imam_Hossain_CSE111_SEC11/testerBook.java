public class testerBook {
  public static void main(String[] args) {
    Book b=new Book("java", "unknown", 0.0);
    b.setTitle("Developing Java Software");
    b.setAuthor("Russel Winderand");
    b.setPrice(79.75);
    System.out.println(b.getTitle());
    System.out.println(b.getAuthor());
    System.out.println(b);
  }
}
    