import java.util.Scanner;

public class Question4 {
    
    public static void PrintArray(int []arr3){
        
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        
    }
    
    
    public static int []bubble(int []arr){
        
        int temp=0;
        
		for(int i=0;i<arr.length;i++){
            for(int j=0;j<(arr.length-i-1);j++){
                
				if( arr[j]>arr[j+1]){
                    
					temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                
				}
				
            }
        }
        
        return arr;
        
    }
    
    
    
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
       
        System.out.print("Enter the size of the array:");
        int n=scan.nextInt();
        
        int []arr=new int[n];
        
        System.out.println("Enter the elements of the array seperated by a space:");
        
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        System.out.println("Unsorted/Original Array:");
        PrintArray(arr);
        
        //calling the sorting function
        int[] arr2=bubble(arr);
        
        System.out.println("Array after sorting [Ascending Order]:");
        PrintArray(arr2);
        
        
    }
}
