package question1;

import java.util.ArrayList;
import java.util.List;

public class testSave {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        try {
            list.add(new Student(1,"zhangfei",1));
            list.add(new Student(2,"libai",2));

            Save.save();
            Save.load();
            System.out.println(Function.Students);
        } catch (StudentsAgeException | StudentsIdException e) {
            e.printStackTrace();
        }
    }
}
