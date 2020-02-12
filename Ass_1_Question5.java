import java.util.Scanner;

public class Question5 {
    //print array
	public static void PrintArray(int []arr){
		System.out.print("{ ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("}");
	}
	

	
	//intersection
	
	public static int[] inter(int []A1, int s1, int []A2, int s2){
		
		
		int []INT;
		
		if(s1>=s2){
			INT=new int[s2]; 
		
			for(int i=0; i<s1; i++){
				for(int j=0;j<s2;j++){
					if(A1[i]==A2[j]){
						INT[i]=A1[i];
					}
				}
			}
		}
		else{
			INT=new int[s1];
			for(int i=0; i<s2; i++){
				for(int j=0;j<s1;j++){
					if(A2[i]==A1[j]){
						INT[i]=A2[i];
					}
				}
			}
		}
		
		
		//PrintArray(INT);
		
		for(int i=0;i<INT.length;i++){
			if(INT[i]==0){
				INT[i]=-12345;
			}
		}
		
		for(int i=0;i<INT.length-1;i++){
			for(int j=i+1;j<INT.length;j++){
				if((INT[i]==INT[j])&&(INT[i]!=-12345)){	
					INT[j]=-12345;
				}
			}
		}
		
		int count_rep=0;
		for(int i=0;i<INT.length;i++){
			if(INT[i]!=-12345){
				count_rep++;
			}
		}
		
		int []ARRAY=new int[count_rep];
		
		int j=0;
		for(int i=0;i<INT.length;i++){
			if(INT[i]!=-12345){
				ARRAY[j]=INT[i];
				j++;
			}
		}		
		
		return ARRAY;
		
	}
	//difference
	
	
	public static int []Diff(int []A1, int s1, int []A2, int s2){
		int []intersection=inter(A1,s1,A2,s2);
			
			int []diff=new int[s1-intersection.length];
			
			for(int i=0;i<s1;i++){
				for(int j=0;j<intersection.length;j++){
					if(A1[i]==intersection[j]){
						A1[i]=-12345;
					}
				}
			}
			
			int j=0;
			for(int i=0;i<A1.length;i++){
				if(A1[i]!=-12345){
					diff[j]=A1[i];
					j++;
				}
			}
			
			return diff;
		
	}
	
	
	
	//union
	
    public static int []Union(int []A1, int s1, int []A2, int s2){
        
		int [] union=new int[s1+s2];
		
		for(int i=0;i<s1;i++){
			union[i]=A1[i];
		}
		
		for(int j=0;j<s2;j++){
			union[s1+j]=A2[j];
		}
		int count_rep=0;
		for(int i=0;i<union.length-1;i++){
			for(int j=i+1;j<union.length;j++){
				if((union[i] == union[j]) && (union[i]!=-12345)){
					union[j]=-12345;
					count_rep++;
				}
			}
		}
		
		int []C=new int[((s1+s2)-count_rep)];
			int j=0;
		for(int i=0;i<union.length;i++){
			if(union[i]!=-12345){
				C[j]=union[i];
				j++;
			}
		}		
		
		return C;
		
    }
    
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter the size of the set-1:");
        int n1=scan.nextInt();
        
        int []arr1=new int[n1];
        
        System.out.println("Enter the elements of the set-1 seperated by a space:");
        
        for(int i=0;i<n1;i++){
            arr1[i]=scan.nextInt();
        }
        
        System.out.print("Enter the size of the set-2:");
        int n2=scan.nextInt();
        
        int []arr2=new int[n2];
        
        System.out.println("Enter the elements of the set-2 seperated by a space:");
        
        for(int i=0;i<n2;i++){
            arr2[i]=scan.nextInt();
        }
        
		
		int []UNION=Union(arr1,n1,arr2,n2);
        System.out.print("A U B: ");
		PrintArray(UNION);
		
		int []INTER=inter(arr1,n1,arr2,n2);
        System.out.print("A n B: ");
		PrintArray(INTER);
        
		int []DIFF=Diff(arr1,n1,arr2,n2);
		System.out.print("A - B: ");
		PrintArray(DIFF);
    }
}
