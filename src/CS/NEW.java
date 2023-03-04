package CS;

import javafx.scene.layout.BorderStrokeStyle;

import java.util.Scanner;
public class NEW {
    //一个java文件中可以定义多个class
    //只能定义一个public class 并且类名必须和文件名相同！！！
    //Java 中无char String代表字符串类型
    //属性的定义 (类中相同的特征)
    int StuNumber;
    String name;
    int age =20;
    //方法的定义
   public void study(){
        System.out.println("我在学习！");
    }
    void eat(String food){
        System.out.println("我在吃"+food);

    }

    public static void main(String[] args) {
        //创建对象 (类的具体表现)
        NEW student=new NEW();
        //使用属性
        student.name="张三";
        student.age=66;
        student.StuNumber=201114;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.StuNumber);
        student.study();
        student.eat("666");

    }
}


   /*
        int[] array=new int[]{7,5,9,10,5,2,1,6,3,4};//数组的定义
        //冒泡   小->大
        for(int i=0;i<array.length;i++){//共比较多少次
            for(int j=0;j<array.length-1-i;j++){//每次比较-1次
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        //快速排序 第一次 第一个位置和每一个位置比较 小的放在第一个 以此类推
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }


}
*/
      /* int[] scores=new int[5];
       int sum=0;
       Scanner input =new Scanner(System.in);
       System.out.println("请输入五位成员的成绩");
       for(int i=0;i<scores.length;i++){
           scores[i]=input.nextInt();
           sum=sum+scores[i];
       }
       System.out.println("平均分是："+(double)sum/scores.length);
*/



/*
        for (int i = 1; i <= 10; i++) {
            System.out.print(getNumber(i) + "\t");
        }
    }

   public static int getNumber(int number){
        if(number==1||number==2){
            return 1;
        }else{
            return getNumber(number-1)+getNumber(number-2);
        }

 */


        /*
        for(int i=0;i<20;i++){
            for(int j=0;j<34;j++){
                for(int k=0;k<300;k++)
                    if((i+j+k)==100 &&((5*i+3*j+k/3)==100)&&(k%3==0)){
                        System.out.println("公鸡："+i+"\t母鸡："+j+"\t小鸡："+k);
                    }
            }
        }
        */


        //斐波那契
        /*Scanner sc=new Scanner(System.in);
        System.out.println("请输入要打印的斐波那契个数");
        int count=sc.nextInt();
        int x=1;
        int y=1;
        int z=0;
        for(int i=1;i<=count;i++){
            if(i==1||i==2){
                System.out.print(1+"\t");
            }else{
                z=x+y;
                x=y;
                y=z;//三个变量整体往后移动一个
                System.out.print(z+"\t");


            }

        }
        */
/*
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
      /*  int time=(int)(Math.random()*40);
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
*/

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
