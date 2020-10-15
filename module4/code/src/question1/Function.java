package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Function {
    static List<Student> Students = new ArrayList<>();
    Student student;

    boolean init() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生学号： ");
        int id = input.nextInt();
        System.out.println("请输入学生姓名： ");
        String name = input.next();
        System.out.println("请输入学生年龄： ");
        int age = input.nextInt();
        try {
            this.student = new Student(id, name, age);
            return true;
        } catch (StudentsAgeException | StudentsIdException e) {
            e.printStackTrace();
            return false;
        }
    }

    public abstract void work();
}
