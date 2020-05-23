public enum Type {
    large("´ó¿¨"), small("Ð¡¿¨"), little("Î¢ÐÍ¿¨");
    private final String name;

    private Type(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

