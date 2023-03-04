package CS;

/*
* 构造方法：
*   创建对象的时候默认会调用构造方法来创建对象，可以完成成员变量的某些初始化操作
*   构造方法的语法：
*       方法名称：
*       访问修饰符：
*       形参：
*       方法体：
*       返回值：
*       注意***：
*       1.创建完类之后，如果没有手动条用构造方法，会有一个默认的无参的构造方法供调用
*       2.同一个类中可以包含多个同名的方法
*
*       重载：
*       在一个类中可以包含多个重名的方法，但是参数列表必须不同
*       若要存在多个时->>参数的个数必须不同、参数的类型不同、参数的顺序不同
* */
public class Teacher {
    String name;
    int age;

    public Teacher(){

    }
    //构造方法
    public Teacher(String name,int age){
        //使用this指针
        this.name=name;
        this.age=age;
        System.out.println("赋值成功！");
    }

    public static  void main(String[] args){
        Teacher teach=new Teacher( );
        teach.name="张三";
        teach.age=20;
        System.out.println(teach.age);
        System.out.println(teach.name);
        Teacher teach2=new Teacher("Lias",20);
        System.out.println(teach2.age);
        System.out.println(teach2.name);

    }












}


