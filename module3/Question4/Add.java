import java.util.List;

public class Add extends Function {

    @Override
    public boolean work() {
        init();
        return Students.add(student);
    }
}
