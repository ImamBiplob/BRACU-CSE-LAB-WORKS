import java.util.Scanner;
public class Tester {
  public static void main(String [] args) {
    
    Scanner sc=new Scanner(System.in);
    int m=0;
    System.out.println("How do you want to create the Wating Room Management??  Type "+1+" if Array based or Type any integer if List based");
    
    m=sc.nextInt();
    
    WRM w1=new WRM();//array based
    
    WRM2 w2=new WRM2();//list based
    
    
    String options="Choose Your Option from Below\nOptions are : \n 1. Add Patient\n 2. Serve Patient\n 3. Cancel All Patient\n 4. Can Doctor Go Home\n 5. ShowAll Appointments\n 6. To Exit\n";
    System.out.println(options);
    int n=0;
    int n2=0;
    
    if(m==1){
    try{
    while(n!=6){
      n=sc.nextInt();
      if(n==1){
        w1.RegisterPatient();
        System.out.println("Enter Any Option");
      }
      else if(n==2){
        w1.ServePatient();
        System.out.println("Enter Any Option");
      }
      else if(n==3){
        w1.CancelAll();
        System.out.println("Enter Any Option");
      }
      else if(n==4){
        boolean flag=w1.CanDoctorGoHome();
        if(flag)
          System.out.println("Doctor can Go Home");
        else
          System.out.println("Doctor can't Go Home");
        System.out.println("Enter Any Option");
      }
      else if(n==5){
        w1.ShowAllPatient();
        System.out.println("Enter Any Option");
      }
      else if(n==6)
        System.out.println("Program Exited\nThank You :)");
      else
        System.out.println("Type 1 to 6");
    }
    }
    catch(Exception e){
      System.err.println("Please, Run the Program Again and Type 1 to 6");
      sc.next();
    }
    }
    
    else
    {
      try{
    while(n2!=6){
      n2=sc.nextInt();
      if(n2==1){
        w2.RegisterPatient();
        System.out.println("Enter Any Option");
      }
      else if(n2==2){
        w2.ServePatient();
        System.out.println("Enter Any Option");
      }
      else if(n2==3){
        w2.CancelAll();
        System.out.println("Enter Any Option");
      }
      else if(n2==4){
        boolean flag=w2.CanDoctorGoHome();
        if(flag)
          System.out.println("Doctor can Go Home");
        else
          System.out.println("Doctor can't Go Home");
        System.out.println("Enter Any Option");
      }
      else if(n2==5){
        w2.ShowAllPatient();
        System.out.println("Enter Any Option");
      }
      else if(n2==6)
        System.out.println("Program Exited\nThank You :)");
      else
        System.out.println("Type 1 to 6");
    }
    }
      
    catch(Exception e){
      System.err.println("Please, Run the Program Again and Type 1 to 6");
      sc.next();
    }
    }
    
    sc.close();
  }
}
    