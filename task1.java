import java.util.Random;
import java.util.Scanner;
class task1{
    public static void main(String[] args) {
    Random rand=new Random();
    Scanner sc=new Scanner(System.in);
    int score=0;
    int guesedNum,flag=0;
    int noofatt=0;
    char choice='\0';
    do{
        
        int random=rand.nextInt(100);
        do{
        
        noofatt=0;
        
        
        System.out.println("guess a number between 1 to 100 in 6 guess");
        guesedNum=sc.nextInt();
        if(guesedNum<random){
            System.out.println("your guess number is less than random number");
            flag=1;
        }
        if(guesedNum>random){
            System.out.println("your guess number is greater than random number");
            flag=1;
        }
        if(guesedNum==random){
            System.out.println("you guesed correct no ");
            flag=0;
            score+=1;
            System.out.println("if you want to continue the game enter yes ");
            choice=sc.next().charAt(0);
            
        }
        noofatt+=1;
        }while(flag==1 && noofatt<=6 );
    }while(choice=='y');
    System.out.println("your score : "+score);
    }
}
