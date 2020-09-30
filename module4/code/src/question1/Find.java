package question1;

import java.util.Scanner;

public class Find extends Function{
    int id;

    @Override
    void init() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生学号： ");
        this.id = input.nextInt();
    }

    @Override
    public void work() {
        init();
        for (int i = 0; i < Students.size(); i++) {
            Student s = Students.get(i);
            if (s.getId() == id){
                System.out.println(s);
                return;
            }
        }
        System.out.println("该学号不存在");
    }
}