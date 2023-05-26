import java.util.Scanner;
public class WRM2 {
  public static int id=0;
  String n,bg;
  int age;
  private ListQueue room;
  public WRM2(){
    room=new ListQueue();
  }
  Scanner sc=new Scanner(System.in);
  public void RegisterPatient() {
    id++;
    System.out.println("Enter Patient Name");
    n=sc.next();
    System.out.println("Enter Patient Age");
    age=sc.nextInt();
    System.out.println("Enter Patient Blood Group");
    bg=sc.next();
    Patient p=new Patient(n,age,bg,id);
    try{
       room.enqueue(p);
       System.out.println(p.name+" has been Added");
    }
    catch(QueueOverflowException e){
      System.err.println("Sorry! No Space Available to Add New Patient");
    }
  }
  public void ServePatient() {
    try{
       Patient p1 = (Patient)room.dequeue();
       System.out.println(p1.name+" has been Served");
    }
    catch(QueueUnderflowException e){
      System.err.println("No Patient Left to Serve");
    }
  }
  public void CancelAll() {
    if(room.size==0)
      System.out.println("Waiting Room is Empty, Doctor can Go for Lunch");
    else {
      for(int i=0;i<=room.size;i++) {
        try{
          room.dequeue();
        }
        catch(QueueUnderflowException e) {
          System.err.println("All Appointments has been Cancelled, Doctor can Go for Lunch Now");
        }
      }
      System.out.println("All Appointments has been Cancelled, Doctor can Go for Lunch Now");
    }
  }
  public boolean CanDoctorGoHome() {
    if(room.size==0){
      return true;
    }
    return false;
  }
  public void ShowAllPatient() {
    
    if(room.size==0)
      System.out.println("There is No Patient to Show");
    
    else {
      
      for(int i=room.size-1;i>0;i--){
        Node x=room.front;
        for(int j=0;j<i;j++) {
          Patient p1=(Patient)x.elem;
          Patient p2=(Patient)x.next.elem;
          if(p1.name.compareTo(p2.name)>0){
            Object swap=x.next.elem;
            x.next.elem=x.elem;
            x.elem=swap;
          }
          x=x.next;
        }
      
      }
      Node z=room.front;
      for(;z!=null;z=z.next) {
        Patient p1=(Patient)z.elem;
        System.out.println(p1.id+" "+p1.name+" "+p1.age+" "+p1.bg);
      }
      System.out.println("IDs of Remaining Patients Have Been Showed");
    }
  }
}