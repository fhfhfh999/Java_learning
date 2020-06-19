import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        input.close();

//        String s1 = "asdafghjka";
//        String s2 = "aaasdfg";

        int[][] dp = new int[s1.length()][s2.length()];
        int maxLength = 0;
        int lastindex = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)){
                    if (i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }

                    if (dp[i][j] > maxLength){
                        maxLength = dp[i][j];
                        lastindex = i;
                    }
                }
            }
        }
//        System.out.println(lastindex);
//        System.out.println(maxLength);
        System.out.println("最大相同子串是： " + s1.substring(lastindex + 1 - maxLength, lastindex + 1) + "长度为： " + maxLength);
    }
}
