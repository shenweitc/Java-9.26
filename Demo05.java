package Demo;
//定义一个数组，遍历求和
public class Demo05 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            System.out.println(array[i]);
        }
        System.out.println("sum="+sum);
    }
}
