package CS;

import java.util.Scanner;

public class NEW {

   public static  void main(String[] args){

      //Scanner in=new Scanner(System.in);
     // System.out.println("who is your name");
      //String name=in.nextLine();
      //System.out.println("how are u");
      //int age =in.nextInt();
      //System.out.println("you name:"+name+"  you age:"+age);
      int sum=0;
      int i=1;
      while(i<=100){
         if(i%2==0){
            sum+=i;
         }
         i++;
      }
   System.out.println("100以内的偶数是："+sum);
   }

}
