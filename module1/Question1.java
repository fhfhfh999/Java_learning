import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份： ");
        int year = input.nextInt();
        System.out.print("请输入月份： ");
        int month = input.nextInt();
        System.out.print("请输入日期： ");
        int day = input.nextInt();
        input.close();
        boolean is_leap_year = false;
        if (year%4==0 && year%400==0){
            is_leap_year = true;
        }
        int count = 0;
        for (int i = 1; i < month; i++) {
            switch (i){
                case 2:
                    count += is_leap_year?29:28;
                    continue;
                case 4:
                case 6:
                case 9:
                case 12:
                    count += 30;
                    continue;
                default:
                    count += 31;
            }
        }
        count += day;
        System.out.println("这一天是" + year + "年的第" + count + "天");
    }
}
