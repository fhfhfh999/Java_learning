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
        System.out.println("卡类型设置为" + type.getName());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        System.out.println("卡号设置为： " + number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("用户名设置为： " + name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("密码设置为： " + password);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("余额设置为： " + balance);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time < 0){
            System.out.println("通话时长设置错误！");
        }else{
            this.time = time;
            System.out.println("通话时长设置为： " + time);
        }

    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {

        if (flow < 0){
            System.out.println("流量设置错误！");
        }else{
            this.flow = flow;
            System.out.println("流量设置为： " + flow);
        }
    }

    public void show(){
        System.out.println("手机卡号为：" + getNumber());
        System.out.println("用户： " + getName());
        System.out.println("当前余额： " + getBalance());
    }
}

