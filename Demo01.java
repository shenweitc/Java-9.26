package Demo;
//给你一个整数X，如果是一个回文数，打印true
public class Demo01 {
    public static void main(String[] args) {
        int x= 121;
        int temp = x;
        int num = 0;
        while (x!=0){
            int ge = x % 10;
            x/=10;
            num = num * 10 + ge;
        }
        System.out.println(num==temp);
    }
}
