import java.util.List;
import java.util.Scanner;

public class Find extends Function{
    int id;

    @Override
    void init() {
        Scanner input = new Scanner(System.in);
        System.out.println("������ѧ��ѧ�ţ� ");
        this.id = input.nextInt();
    }

    @Override
    public boolean work() {
        init();
        for (int i = 0; i < Students.size(); i++) {
            Student s = Students.get(i);
            if (s.getId() == id){
                System.out.println(s);
                return true;
            }
        }
        System.out.println("��ѧ�Ų�����");
        return false;
    }
}