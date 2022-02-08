import role.Master;
import role.Warrior;

import java.util.Scanner;

public class Test {
    //这里是测试类
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请选择您喜欢的职业(1-战士,2-法师):");
        int a=scanner.nextInt();
        System.out.print("请输入您的英雄姓名:");
        String b=scanner.next();
        switch (a){
            case 1:
                Warrior ww=new Warrior(b);
                add(ww);
                break;
            case 2:
                Master ww1=new Master(b);
                adds(ww1);
                break;
        }
    }
    public static void add(Warrior ww){
        System.out.println("进入战斗界面:1-平A,0-逃跑");
        Scanner scanner=new Scanner(System.in);
        for (;;) {
            int ss=scanner.nextInt();
            if( ss == 0) {
                break;
            }else {
                System.out.println("输出"+ww.hit()+"点伤害!");
            }
        }
    }
    public static void adds(Master ww){
        System.out.println("进入战斗界面:1-平A,0-逃跑");
        Scanner scanner=new Scanner(System.in);
        for (;;) {
            int ss=scanner.nextInt();
            if( ss == 0) {
                break;
            }else {
                System.out.println("输出"+ww.hit()+"点伤害!");
            }
        }
    }
}
