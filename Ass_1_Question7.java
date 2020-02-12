import java.util.Scanner;

public class Question7 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
		
		int sec_num=50;
		
		int count_tries=0;
		
		int guess;
		int prev_guess=-1;
		while(true){
			
			System.out.print("Enter your guess: ");
			guess=scan.nextInt();
			
			if(!(guess==prev_guess) ){
				count_tries++;
			}
			prev_guess=guess;
			if((guess-sec_num==0)){
				System.out.println("You have guessed the number in "+count_tries+" tries.");
				break;
			}
			else if((guess-sec_num)>0){
				System.out.println("The number you've guessed is too large.");
			}
			else{
				System.out.println("The number you've guessed is too small.");		
			}

		}

    }
}
