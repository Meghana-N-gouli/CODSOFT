import java.util.Scanner;
interface Machine{
    double withdraw(double amount);
    double deposit(double amount);
    double checkBalance();
}
class Atm{
    double bal=0;
   // Atm(double bal){
     //   this.bal=bal;
    //}
    double withdraw(double amount){
        if(amount<=this.bal){
        System.out.println("Amount withdrawed is "+amount);
        this.bal=this.bal-amount;
        return this.bal;
        }
        else{
            return -1;
        }
    }
    double deposit(double amount){
        System.out.println("Amount doposited is "+amount);
        System.out.println("Transaction successfull ");
        
        this.bal=this.bal+amount;
        return this.bal;
    }
    double checkBalance(){
        return this.bal;
    }
}
class Task3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Atm atm=new Atm();
        int ch;
        double bal;
        double amount;
        int i=10;
        do{
          System.out.println("Enter your choice\n1-deposite\n2-withdraw\n3-check balance\n4-exit");  
          ch=sc.nextInt();
        if(ch==1){
            System.out.println("enter the amount you want to deposite");
            amount=sc.nextDouble();
            bal= atm.deposit(amount);
        }
        else
        if(ch==2){
            System.out.println("enter the amount you want to draw");
            amount=sc.nextDouble();
            bal=atm.withdraw(amount);
            if(bal<0){
                System.out.println("you have insufficient balance ");
            }
        }
        else
        if(ch==3){
            bal=atm.checkBalance();
            if(bal<0){
                System.out.println("you have insufficient balance ");
                System.out.println("Transaction Failure");
            }
            else{
                System.out.println("Your Account Balance : "+bal);
            }
        }
        else
        if(ch==4){
            return ;
        }
        
        }while(i==10);
        
    }
}
