package neo.tuf.dsa;

import java.util.Arrays;

public class maximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] input={1,1,0,1,1,1,0,1,1};
        int j=-1;
        for(int i=0;i<input.length;i++){
            if(input[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<input.length;i++) {
            if (input[i]!= 0) {
                swap(input, i, j); j++;
            }
        }
        System.out.println(Arrays.toString(input));
    }
    public static void swap(int []input,int i,int j){
        int temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }
}
