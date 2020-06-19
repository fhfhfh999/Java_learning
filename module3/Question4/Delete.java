import java.util.List;

public class Delete extends Function {

    @Override
    public boolean work() {
        init();
        boolean b = Students.remove(student);
        if (b){
            System.out.println("已删除学生：" + student);
        }else {
            System.out.println("该生不存在");
        }
        return b;
    }
}