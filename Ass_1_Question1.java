import java.util.Scanner;

public class Question1 {
    
    public static void PrintArray(char []arr3, int size){
        
        for(int i=0;i<size;i++){
            System.out.print(arr3[i]);
        }
        System.out.println();
        
    }
    
    public static void ArrayReverse(char []arr2){
        int i=0;
        int j=arr2.length-1;
        char temp;
        
        for(i=0;i<(arr2.length/2);i++){
            temp=arr2[i];
            arr2[i]=arr2[j];
            arr2[j]=temp;
            j--;
        }
        
        System.out.println("The Reversed Array:");
        PrintArray(arr2,arr2.length);
    }
    
    public static void main(String []args){
        char []arr={'W','A','L','E','E','D'};
        
        System.out.println("The real array:");
        PrintArray(arr,arr.length);
        ArrayReverse(arr);
    }
}
