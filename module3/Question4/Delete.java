import java.util.List;

public class Delete extends Function {

    @Override
    public boolean work() {
        init();
        boolean b = Students.remove(student);
        if (b){
            System.out.println("��ɾ��ѧ����" + student);
        }else {
            System.out.println("����������");
        }
        return b;
    }
}