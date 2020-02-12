import java.util.Scanner;

public class Question6 {
    
    public static void printMatrix(int [][]temp){
        
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
    
	public static int [][]prod(int [][]a1, int [][]a2){
		int [][]temp=new int [a1.length][a2[0].length];
			
			for(int i=0;i<a1.length;i++){
				for(int j=0;j<a2[0].length;j++){
					for(int k=0;k<a1[0].length;k++){
						temp[i][j]+=(a1[i][k] * a2[k][j]);
					}
				}
			}	
			
			return temp;
	}
	
    public static int [][]add(int [][]a1, int [][]a2){
        
        int [][]temp=new int[a1.length][a1.length];
        for(int i=0;i<temp.length;i++){
               for(int j=0;j<temp[i].length;j++){
                   temp[i][j]=a1[i][j]+a2[i][j];
               }
        }
        
        return temp;
        
    }
    
    public static int [][]sub(int [][]a1, int [][]a2){
        
        int [][]temp=new int[a1.length][a1.length];
        for(int i=0;i<temp.length;i++){
               for(int j=0;j<temp[i].length;j++){
                   temp[i][j]=a1[i][j]-a2[i][j];
               }
        }
        
        return temp;
        
    }
    
    public static void main(String []args){
        int [][]mat1=new int[4][4];
        int [][]mat2=new int[4][4];
        
        for(int i=0;i<mat1.length;i++){
               for(int j=0;j<mat1[i].length;j++){
                   mat1[i][j]=(i*j)+2;
               }
        }
        
        for(int i=0;i<mat2.length;i++){
               for(int j=0;j<mat2[i].length;j++){
                   mat2[i][j]=(i*j)+1;
               }
        }
        
        System.out.println("\nMatrix-1:");
        printMatrix(mat1);
        System.out.println("\nMatrix-2:");
        printMatrix(mat2);
        
        
        int [][]sum=add(mat1,mat2);
        System.out.println("\nSum: ");
        printMatrix(sum);
        
		int [][]diff=sub(mat1,mat2);
        System.out.println("\nDifference: ");
        printMatrix(diff);
		
		int [][]Prod=prod(mat1,mat2);
        System.out.println("\nProduct: ");
        printMatrix(Prod);
    }
}
