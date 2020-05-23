public class Test {
    public static void main(String[] args) {
        PhoneCard card1 = new PhoneCard();
        card1.setType(Type.large);
        card1.setNumber(123456);
        card1.setName("Çî¹âµ°");
        card1.setPassword("password");
        card1.setBalance(0);
        card1.setTime(100);
        card1.setFlow(10);
        System.out.println("------------------------------------------");
        card1.show();
        System.out.println("------------------------------------------");
        Combo combo;
        System.out.println("Í¨»°Ì×²Í");
        combo = new Communicate();
        combo.setCost(5);
        combo.show();
        ((Communicate)combo).setTime(100);
        ((Communicate)combo).setNumber_of_messages((10));
        combo.show();
        System.out.println("ÍøÂçÌ×²Í");
        combo = new Internet();
        combo.setCost(8);
        combo.show();
        ((Internet)combo).setFlow(40);
        combo.show();

    }
}

