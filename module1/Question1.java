import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("��������ݣ� ");
        int year = input.nextInt();
        System.out.print("�������·ݣ� ");
        int month = input.nextInt();
        System.out.print("���������ڣ� ");
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
        System.out.println("��һ����" + year + "��ĵ�" + count + "��");
    }
}
