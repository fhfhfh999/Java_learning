public class Poker implements Comparable{

    private Value value;

    public Poker(Value value) {
        setValue(value);
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.getName();
    }

    @Override
    public int compareTo(Object o) {
        Poker poker = (Poker) o;
//        return getValue().compareTo(poker.getValue());   // ��С�������
        return poker.getValue().compareTo(getValue());   // �Դ���С����
    }
}