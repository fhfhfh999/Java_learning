import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Function {
    static List<Student> Students = new ArrayList<>();
    Student student;

    void init() {
        Scanner input = new Scanner(System.in);
        System.out.println("������ѧ��ѧ�ţ� ");
        int id = input.nextInt();
        System.out.println("������ѧ�������� ");
        String name = input.next();
        System.out.println("������ѧ�����䣺 ");
        int age = input.nextInt();
        this.student = new Student(id, name, age);
    }

    public abstract boolean work();
}
