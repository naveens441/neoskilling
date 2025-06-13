package neo.tuf.dsa;
import java.util.Arrays;

public class rotateElement {

    public static void main(String[] args) {
        int [] input={3,4,2,1,5,6,7};
        int k=2;
        //System.out.println(Arrays.toString(rotate(input, k)));
        //System.out.println(Arrays.toString(rotateNtimes(input, k)));
        System.out.println(Arrays.toString(rotateUsingReversal(input,k)));

    }
    static int[] rotateUsingReversal(int[] input, int k ){
        reverse(input, 0, k-1);
        reverse(input, k, input.length-1);
        reverse(input, 0, input.length-1);
    return input;
    }
    static void reverse(int[] temp, int start, int end){
        while(start<end){
            int i=temp[start];
            temp[start]=temp[end];
            temp[end]=i;
            start++;
            end--;
        }
    }

    static int[] rotateNtimes(int [] input, int k){
        for(int i=0;i<k;i++){
            int first=input[0];
            for(int j=1;j<input.length;j++){
                input[j-1]=input[j];
            }
            input[input.length-1]=first;
        }
        return input;
    }



    static int[] rotate(int[] input,int k){
        int [] temp=new int[k];
        int i=0;
        int m=k;
        while(m>0){
            temp[i]=input[i];
            i++;m--;
        }
        int x=0;
        for(int j=k;j<input.length;j++){
            input[x++]=input[j];

        }
        int p=0;
        for(int l=input.length-k;l<input.length;l++){
            input[l]=temp[p++];
        }
        return input;
    }
}
