package CS;

import java.util.Scanner;
public class NEW{
    public static void main(String[] args){

       /* System.out.println("欢迎使用系统");
        System.out.println("添加用户信息");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户号码");
        String number=sc.nextLine();//标准输入
        System.out.println("请输入会员生日");
        String birthday =sc.nextLine();
        System.out.println("请输入会员积分");
        String score=sc.nextLine();
        if(number.length()==4){
            System.out.println("会员信息如下：");
            System.out.println(number+"\t"+birthday+"\t"+score);

        }else{
            System.out.println("会员号码输入错误");
        }
        */
        int time=(int)(Math.random()*40);
        if(time<20){
            System.out.println("恭喜进入决赛");
            String sex=((int)(Math.random()*2))==0?"nv":"nan";
            if(sex=="nv"){
                System.out.println("欢迎进入女子组！");
            }else{
                System.out.println("欢迎进入男子组！");
            }

        }else{
            System.out.println("很遗憾！");

        }




    }


}






/*
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
   /*int sum=1;
   int a=0;
   for(int i=1;i<11;i++) {
          sum*=i;
          a=a+sum;
             }
         System.out.println("和："+sum);

            */
      /* int r=3;
       double PI=3.14;
       double area=PI*r*r;
       double length=2*PI*r;
       if(area>=length)
           System.out.println("面积大于周长");
       else
           System.out.println("面积小于周长");
       */
       //scanner
        //创建文件扫描器对象 system.in是标准输入（装饰者模式）
      // Scanner sc=new Scanner(System.in);
      // System.out.println("请输入数据");
      // String str=sc.nextLine();
      // System.out.println(str);



/*
      }
   }
*/
