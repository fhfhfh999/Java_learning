public class Communicate extends Combo implements CommunicateService{

    private int time = 0;
    private int number_of_messages = 0;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        System.out.println("设置通话时长 " + time);
        this.time = time;
    }

    public int getNumber_of_message() {
        return number_of_messages;
    }

    public void setNumber_of_messages(int number_of_messages) {
        System.out.println("设置短信条数为： " + number_of_messages);
        this.number_of_messages = number_of_messages;
    }


    @Override
    public void show(){
        System.out.println("套餐信息：");
        System.out.println("通话时长： " + getTime());
        System.out.println("短信条数： " + getNumber_of_message());
        System.out.println("每月资费： " + getCost());
    }

    @Override
    public void service(int time, PhoneCard card) {
        System.out.println("通话套餐服务");
        card.show();
        System.out.println("通话时间： " + time);
    }
}

