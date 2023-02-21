package CS;

import java.util.Scanner;

public class NEW {

   public static void main(String[] args) {

      /*Scanner in=new Scanner(System.in);
      System.out.println("who is your name");
      String name=in.nextLine();
      System.out.println("how are u");
      int age =in.nextInt();
      System.out.println("you name:"+name+"  you age:"+age);*/
      /*while语句100偶数和 */
     /* int sum=0;
      int i=1;
      while(i<=100){
         if(i%2==0){
            sum+=i;
         }
         i++;
      }
         System.out.println("100以内的偶数是："+sum);
      */
      /*do while 循环语句*/
     /* int i=1;
      int sum=0;
      do{
         if(i%2==0){
            sum+=i;
         }
          i++;
      }while(i<=100);
      System.out.println("100偶数和："+sum);
   }*/
    /*  int sum = 0;
      for (int i = 1; i < 101; i++) {
         if (i % 2 == 0) {
            sum += i;
         }
      }
      System.out.println("100以内的偶数是：" + sum);
     */
      //定义scanner对象
     /* Scanner sc=new Scanner(System.in);
      int ageUp=0;   //30上
      int ageDown=0;//30下
      for (int i=0;i<10;i++){
         System.out.println("请输入第"+i+"位顾客的年龄：");
         int age=(int)sc.nextInt();//标准输入语句
         if(age>30){
            ageUp++;
         }else{
            ageDown++;
         }
      }
      System.out.println("超过30岁的人的比率是："+(ageUp/10.0*100)+"%");
      System.out.println("小于30岁的比率是："+(ageDown/10.0*100)+"%");
   */
      //10进制->2进制
      /*Scanner sc=new Scanner(System.in);
      System.out.println("请输入一个十进制数:");
      int number=sc.nextInt();
      String str="";
      while(number!=0) {
         int i = number % 2;
         str =i+str; //反向赋值
         number = number / 2;

      }
         System.out.println(str);
   }*/
   //求1！-10！
   int sum=1;
   int a=0;
   for(int i=1;i<11;i++) {
          sum*=i;
          a=a+sum;
             }
         System.out.println("和："+sum);
      }
   }

