public class Robot2 {
    int jogKoro(int prothom,int ditio){
        return prothom+ditio;
    }
    int tintaJogKoro(int a, int b, int c){
        int angshik=jogKoro(a,b);
        //angshik += c;
        angshik = jogKoro(c,angshik);
        return angshik;
    }
    void onnoJog(){
        int[] collection = {11,22,33};
        int pailam = koreDao420(collection);
        System.out.println(pailam);
        System.out.println("first="+collection[0]);
    }
    int koreDao(int[] y) {
        int c,fol=0;
        for(c=0 ; c<y.length ; ++c){
            fol += y[c];
        }
        return fol;
    }
    int koreDao420(int[] y) {
        int c,fol=0;
        for(c=0 ; c<y.length ; ++c){
            fol += y[c];
            y[c] += 10;
        }
        return fol;
    }
}