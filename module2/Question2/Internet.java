public class Internet extends Combo implements InternetService{
    private int flow = 0;

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        System.out.println("������������ " + flow);
        this.flow = flow;
    }

    public void show(){
        System.out.println("�ײ���Ϣ��");
        System.out.println("���������� " + getFlow());
        System.out.println("ÿ���ʷѣ� " + getCost());
    }

    @Override
    public void service(int flow, PhoneCard card) {
        System.out.println("�����ײͷ���");
        card.show();
        System.out.println("ʹ�������� " + flow);
    }
}
