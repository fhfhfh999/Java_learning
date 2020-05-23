public enum ChessColor {
    B("ºÚ×Ó"), W("°××Ó");

    private final String color;

    private ChessColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
