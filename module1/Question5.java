import java.util.Arrays;
import static java.lang.Integer.toHexString;

public class Question5 {
    public static void main(String[] args) {
        int size = 17;
        String[][] arr = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0){
                    if (j == 0){
                        arr[i][j] = " ";
                    }else {
                        arr[i][j] = toHexString(j - 1);
                    }
                } else if (j == 0){
                    arr[i][j] = toHexString(i - 1);
                }else{
                    arr[i][j] = "+";
                }
            }
        }
        System.out.println("打印数组：");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("绘制棋盘：");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
