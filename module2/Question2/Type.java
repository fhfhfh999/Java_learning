public enum Type {
    large("��"), small("С��"), little("΢�Ϳ�");
    private final String name;

    private Type(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

