import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("����ԭʼ���������� ");
        int size = input.nextInt();
        System.out.println("������Ҫ�����������ֵ������-1�������룺");
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
                System.out.println("���ݣ�ԭ��������" + size + "�� ������Ϊ" + (int)(1.5*size));
                size = (int)(1.5*size);
                int[] temp_array = new int[size];
                System.arraycopy(array, 0, temp_array, 0, curr);
                array = temp_array;
            }
        }
        System.out.println("������飺 " + Arrays.toString(array));
        System.out.println("����Ϊ�� " + size);
    }
}
