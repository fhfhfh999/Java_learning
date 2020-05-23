public class PhoneCard {

    private Type type;
    private int number;
    private String name;
    private String password;
    private int balance;
    private int time;
    private int flow;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
        System.out.println("����������Ϊ" + type.getName());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        System.out.println("��������Ϊ�� " + number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("�û�������Ϊ�� " + name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("��������Ϊ�� " + password);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("�������Ϊ�� " + balance);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time < 0){
            System.out.println("ͨ��ʱ�����ô���");
        }else{
            this.time = time;
            System.out.println("ͨ��ʱ������Ϊ�� " + time);
        }

    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {

        if (flow < 0){
            System.out.println("�������ô���");
        }else{
            this.flow = flow;
            System.out.println("��������Ϊ�� " + flow);
        }
    }

    public void show(){
        System.out.println("�ֻ�����Ϊ��" + getNumber());
        System.out.println("�û��� " + getName());
        System.out.println("��ǰ�� " + getBalance());
    }
}

