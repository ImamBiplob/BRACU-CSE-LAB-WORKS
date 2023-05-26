//Try using Jeliot with this file
public class LearningSort{ // sorting in descending order
    public static void main(String[] args){
        int[] a = new int[] {10, 30, 50, 40, 20};                                     
                           // 0   1   2   3   4
        int index, max, maxLocation, temp, iteration;
        iteration=0;
        while(iteration <= a.length-2) {
            max = a[iteration];//a[0]=10
            maxLocation = iteration;//note location of max used in the line above
            index = maxLocation+1;//start searching from next position
            while(index < a.length){ //  <5
                if(a[index] > max){ // 30>10
                    max = a[index]; //30
                    maxLocation = index;
                }
                ++index;
            }
            temp = a[iteration];
            a[iteration] = max; //bring found max to its proper place
            a[maxLocation] = temp;
            
            ++iteration;
        }
        index = 0;
        while(index < a.length) { 
            System.out.print(a[index]+" ");
            ++index;
        }
    }
}