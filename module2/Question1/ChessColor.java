public enum ChessColor {
    B("����"), W("����");

    private final String color;

    private ChessColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
