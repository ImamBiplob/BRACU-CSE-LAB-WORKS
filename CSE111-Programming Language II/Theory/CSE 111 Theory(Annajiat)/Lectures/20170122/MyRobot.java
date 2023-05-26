public class MyRobot {
    /*int jogKoro(int prothom,int ditio){
//        int folafol;
//        folafol = prothom+ditio;
//        return folafol;
        //return 5;
        return prothom+ditio;
    }
     int jogKoro(int prothom,int ditio,int tritio){
        return prothom+ditio+tritio;
    }*/
    //varargs:var.len.arg.list
    int jogKoro(int... a){
        int folafol=0;
        for(int count=0;
            count<a.length;
            ++count){
                folafol+=a[count];
            }
            return folafol;
            
    }
}