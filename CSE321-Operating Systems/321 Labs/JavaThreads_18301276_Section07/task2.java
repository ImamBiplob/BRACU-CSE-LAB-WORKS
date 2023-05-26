public class task2 {
    public static void main(String[] args){

        MyThreads2 mt1 = new MyThreads2();
        MyThreads2 mt2 = new MyThreads2();
        MyThreads2 mt3 = new MyThreads2();
        MyThreads2 mt4 = new MyThreads2();
        MyThreads2 mt5 = new MyThreads2();
        MyThreads2 mt6 = new MyThreads2();
        MyThreads2 mt7 = new MyThreads2();
        MyThreads2 mt8 = new MyThreads2();
        MyThreads2 mt9 = new MyThreads2();
        MyThreads2 mt10 = new MyThreads2();

        mt1.start=1;
        mt1.end=10000;
        mt2.start=10001;
        mt2.end=20000;
        mt3.start=20001;
        mt3.end=30000;
        mt4.start=30001;
        mt4.end=40000;
        mt5.start=40001;
        mt5.end=50000;
        mt6.start=50001;
        mt6.end=60000;
        mt7.start=60001;
        mt7.end=70000;
        mt8.start=70001;
        mt8.end=80000;
        mt9.start=80001;
        mt9.end=90000;
        mt10.start=90001;
        mt10.end=100000;

        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
        mt6.start();
        mt7.start();
        mt8.start();
        mt9.start();
        mt10.start();


        try {
            mt1.join();
            mt2.join();
            mt3.join();
            mt4.join();
            mt5.join();
            mt6.join();
            mt7.join();
            mt8.join();
            mt9.join();
            mt10.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int a[] = {mt1.numberOfDivisors,mt2.numberOfDivisors,mt3.numberOfDivisors,mt4.numberOfDivisors,mt5.numberOfDivisors,mt6.numberOfDivisors,mt7.numberOfDivisors,mt8.numberOfDivisors,mt9.numberOfDivisors,mt10.numberOfDivisors};

        int max=0,index=0;

        for(int i=0;i<a.length;i++) {
            if(a[i]>max){
                max=a[i];
                index=i;
            }
        }

        if(index==0){
            System.out.println("The integer is "+mt1.inthashighestdivisors+" and number of divisors is "+mt1.numberOfDivisors);
        }
        if(index==1){
            System.out.println("The integer is "+mt2.inthashighestdivisors+" and number of divisors is "+mt2.numberOfDivisors);
        }
        if(index==2){
            System.out.println("The integer is "+mt3.inthashighestdivisors+" and number of divisors is "+mt3.numberOfDivisors);
        }
        if(index==3){
            System.out.println("The integer is "+mt4.inthashighestdivisors+" and number of divisors is "+mt4.numberOfDivisors);
        }
        if(index==4){
            System.out.println("The integer is "+mt5.inthashighestdivisors+" and number of divisors is "+mt5.numberOfDivisors);
        }
        if(index==5){
            System.out.println("The integer is "+mt6.inthashighestdivisors+" and number of divisors is "+mt6.numberOfDivisors);
        }
        if(index==6){
            System.out.println("The integer is "+mt7.inthashighestdivisors+" and number of divisors is "+mt7.numberOfDivisors);
        }
        if(index==7){
            System.out.println("The integer is "+mt8.inthashighestdivisors+" and number of divisors is "+mt8.numberOfDivisors);
        }
        if(index==8){
            System.out.println("The integer is "+mt9.inthashighestdivisors+" and number of divisors is "+mt9.numberOfDivisors);
        }
        if(index==9){
            System.out.println("The integer is "+mt10.inthashighestdivisors+" and number of divisors is "+mt10.numberOfDivisors);
        }
        System.out.println("Execution Time: "+System.currentTimeMillis());

    }
}
class MyThreads2 extends Thread {
    int start=0,end=0,inthashighestdivisors=0,numberOfDivisors=0;
    public void run() {
        for(int i=start;i<=end;i++){
            int c = 0;
            for(int j=1;j<=i;j++) {

                if (i%j== 0) {
                    c++;
                }
            }
            if(c>numberOfDivisors){
                inthashighestdivisors=i;
                numberOfDivisors=c;
            }
        }

    }
}