public enum Value {
    Three("3"), Four("4"), Five("5"), Six("6"), Seven("7"),
    Eight("8"), Night("9"), Ten("10"), J("J"), Q("Q"),
    K("K"), A("A"), Two("2"), LittleKing("小王"), LargeKing("大王");

    private String name;

    private Value(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}