import java.util.Arrays;
import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[7];
        for (int i = 0; i < 6; i++) {
            // ºìÇò
            number[i] = random.nextInt(32) + 1;
        }
        // À¶Çò
        number[6] = random.nextInt(15) + 1;
        System.out.print("ÖÐ½±ºÅÂë ºìÇò: ");
        for (int i = 0; i < 7; i++) {
            if (i == 6){
                System.out.print("À¶Çò: ");
            }
            System.out.print(number[i] + " ");
        }
    }
}
