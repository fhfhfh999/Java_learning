import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入原始数组容量： ");
        int size = input.nextInt();
        System.out.println("请输入要加入输入的数值，输入-1结束输入：");
        int[] array = new int[size];
        int curr = 0;
        while(true){
            int in = input.nextInt();
            if (in == -1){
                break;
            }
            curr ++;
            array[curr] = in;
            if (curr == (int)(0.8*size)){
                System.out.println("扩容，原数组容量" + size + "， 现扩容为" + (int)(1.5*size));
                size = (int)(1.5*size);
                int[] temp_array = new int[size];
                System.arraycopy(array, 0, temp_array, 0, curr);
                array = temp_array;
            }
        }
        System.out.println("输出数组： " + Arrays.toString(array));
        System.out.println("容量为： " + size);
    }
}
