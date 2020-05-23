public class Communicate extends Combo implements CommunicateService{

    private int time = 0;
    private int number_of_messages = 0;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        System.out.println("����ͨ��ʱ�� " + time);
        this.time = time;
    }

    public int getNumber_of_message() {
        return number_of_messages;
    }

    public void setNumber_of_messages(int number_of_messages) {
        System.out.println("���ö�������Ϊ�� " + number_of_messages);
        this.number_of_messages = number_of_messages;
    }


    @Override
    public void show(){
        System.out.println("�ײ���Ϣ��");
        System.out.println("ͨ��ʱ���� " + getTime());
        System.out.println("���������� " + getNumber_of_message());
        System.out.println("ÿ���ʷѣ� " + getCost());
    }

    @Override
    public void service(int time, PhoneCard card) {
        System.out.println("ͨ���ײͷ���");
        card.show();
        System.out.println("ͨ��ʱ�䣺 " + time);
    }
}

