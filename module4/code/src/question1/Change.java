package question1;

public class Change extends Function {

    @Override
    public void work() {
        init();
        for (int i = 0; i < Students.size(); i++) {
            Student temp = Students.get(i);
            if (temp.getId() == student.getId()){
                if (temp.equals(student)){
                    System.out.println("信息未发生改变");
                    return;
                }else {
                    Students.remove(temp);
                    Students.add(student);
                    System.out.println("新信息已登入");
                    return;
                }
            }
        }
        System.out.println("该生不存在，请检查信息是否正确");
    }
}



