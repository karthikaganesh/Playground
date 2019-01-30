import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
          int n=in.nextInt();
      int sum=0;
      int m=1;
      for(m=1;m<=n;m++)
      {
        sum=sum+m;
      }
      System.out.println(sum);
	}
  
}