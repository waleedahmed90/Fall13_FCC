import java.util.Scanner;

public class Question2 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter the size of the array:");
        int n=scan.nextInt();
        
        int []arr=new int[n];
        
        System.out.println("Enter the elements of the array seperated by a space:");
        
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        
        //with the useage of arithematic divide operation
        
        System.out.println("The mid element of the array is: "+arr[n/2]);
        
        //without using the arithematic divide operator
        
        int i=0;
        int j=n-1;
        
		if(n%2!=0){
                    j=n-1;
		}
		else{
                    j=n;
		}
        
        while(true){
            if(i==j){
                System.out.println("The mid element of the array is: "+arr[i]);
                break;
            }
            else{
                i++;
                j--;
            }
        }
        
    }
}
