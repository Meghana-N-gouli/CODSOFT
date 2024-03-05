import java.util.Scanner;

class Task2
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char Grade='\0';
	System.out.println("Enter number of subjects");
	int n=sc.nextInt();
	float[] marks=new float[n];
	float sum=0;
	int s;
	System.out.println("Enter the marks of  subject");
	for(int i=0;i<n;i++){
	    s=i+1;
		System.out.println("Enter marks of "+s+" subject");
		marks[i]=sc.nextFloat();
	}
	for(int i=0;i<n;i++){
	   
	  sum=sum+marks[i];
	}
	float average=sum/n;
	if(average>=85.0){
	    Grade='A';
	}
	if(average<85.0 && average>=70.0){
	    Grade='B';
	}
	if(average<70.0 && average>=50){
	    Grade='C';
	}
	if(average<50.0 && average>=35.0){
	    Grade='D';
	}
	if(average<35.0){
	    
	    Grade='E';
	}

	System.out.println("--------------------------------------------------------------------");
	
	for(int i=0;i<n;i++){
	    System.out.println("Marks of subject "+i+" = "+marks[i]);
	}
	System.out.println();
	System.out.println("Result :");
	
	System.out.println("Total Marks = "+sum);
	System.out.println("Average Percentage = "+average);
	if(Grade=='E'){
	System.out.println("Grade = "+Grade);
	System.out.println("Better luck next time");
	}
	else{
	    System.out.println("Grade = "+Grade);
	}
}
}
