import java.util.List;

public class Change extends Function {

    @Override
    public boolean work() {
        init();
        for (int i = 0; i < Students.size(); i++) {
            Student temp = Students.get(i);
            if (temp.getId() == student.getId()){
                if (temp.equals(student)){
                    System.out.println("��Ϣδ�����ı�");
                    return false;
                }else {
                    Students.remove(temp);
                    Students.add(student);
                    System.out.println("����Ϣ�ѵ���");
                    return true;
                }
            }
        }
        System.out.println("���������ڣ�������Ϣ�Ƿ���ȷ");
        return false;
    }
}

