package CS;

import java.util.Scanner;

public class Admin {
    String loginName="admin";
    String passWord="123";
    //方法中的public可以省略
    public void introduce(){//包含一个方法  介绍自己
        System.out.println(loginName);
        System.out.println(passWord);
    }
    public static void main(String[] args){
        Admin admin=new Admin();
       //System.out.println(admin.loginName);
       // System.out.println(admin.passWord);
        //或者调用包含
        admin.introduce();//
        //从控制台读取对象
        Scanner sc=new Scanner(System.in);
        System.out.println("正在修改密码");
        while(true){
            System.out.println("输入用户名：");
            String name=sc.nextLine();
            System.out.println("请输入密码：");
            String pwd=sc.nextLine();
            //判断时 必须用equals 而不用==
            if(name.equals(admin.loginName)&&pwd.equals(admin.passWord)){
                System.out.println("输入新用户名：");
                admin.loginName=sc.nextLine();
                System.out.println("输入新密码：");
                admin.passWord=sc.nextLine();
                System.out.println("修改成功！");
                break;
            }else{
                System.out.println("输入错误，从新输入！");
            }
        }

        admin.introduce();
    }
}
