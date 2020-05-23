public class Internet extends Combo implements InternetService{
    private int flow = 0;

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        System.out.println("设置上网流量 " + flow);
        this.flow = flow;
    }

    public void show(){
        System.out.println("套餐信息：");
        System.out.println("上网流量： " + getFlow());
        System.out.println("每月资费： " + getCost());
    }

    @Override
    public void service(int flow, PhoneCard card) {
        System.out.println("上网套餐服务");
        card.show();
        System.out.println("使用流量： " + flow);
    }
}
