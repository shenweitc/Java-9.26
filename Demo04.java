package Demo;

import java.util.Random;
import java.util.Scanner;

//猜数字
public class Demo04 {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while(true){
            int guessNum=sc.nextInt();
            if(guessNum>num){
                System.out.println("猜大了");
            }else if(guessNum<num){
                System.out.println("猜小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }
    }
}
