package Demo;

import java.util.Scanner;

//键盘录入一个大于等于2的数，计算并返回X的平方根
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        for (int i = 1;i<=num;i++){
            if(i*i==num){
                System.out.println(i+"是"+num+"的平方根");
                break;
            }else if(i*i>num){
                System.out.println(i-1+"是"+num+"的平方根的整数部分");
                break;
            }
        }
    }
}
