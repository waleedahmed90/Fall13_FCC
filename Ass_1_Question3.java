import java.util.Scanner;

public class Question3 {

	public static int Scnd_Max(int []arr){
		int max,scndM;
		max=-123; scndM=-124;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=max){
				scndM=max;
				max=arr[i];
			}
			else if(arr[i]>=scndM){
				scndM=arr[i];
			}
		}
		
		
		return scndM;
	}
	
	
	public static int Scnd_Min(int []arr){
		int min,scndMin;
		min=12345678; scndMin=12345677;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=min){
				scndMin=min;
				min=arr[i];
			}
			else if(arr[i]<=scndMin){
				scndMin=arr[i];
			}
		}
		
		
		return scndMin;
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
		
		System.out.println("Second Maximum number is: "+Scnd_Max(arr));
		System.out.println("Second Minimum number is: "+Scnd_Min(arr));
		
	}
}
