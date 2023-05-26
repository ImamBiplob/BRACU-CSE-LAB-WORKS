//design / blue print
public class MyMatrix {
    private int[] a;
    MyMatrix(int[] a) {
        this.a = a;
    }
    MyMatrix add(MyMatrix other) {
        if (a.length != other.getQuantity()) {
            System.out.println("parina: quantity does not match");
            int[] dummy = new int[0];
            return new MyMatrix(dummy);
        } else {
            int[] result = new int[a.length];
            for(int i=0;i<a.length;++i){
                result[i]=a[i]+other.getElement(i);
            }
            return new MyMatrix(result);
        }
    }
    int getQuantity() {
        return a.length;
    }
    int getElement(int index) {
        return a[index];
    }
    public String toString() {
        String uttor="[ ";
        for(int i=0;i<a.length;++i){
                uttor+=a[i] + " ";
        }
        uttor += "]";
        return uttor;
    }

}