public abstract class Combo {
    private int cost = 0;

    public abstract void show();

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
        System.out.println("设置本月资费为： " + cost);
    }
}

