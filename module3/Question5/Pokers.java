import java.util.ArrayList;
import java.util.List;

public class Pokers {
    List<Poker> pokers = new ArrayList<>(54);
    private static Pokers instance = new Pokers();

    public List<Poker> getPokers() {
        return pokers;
    }

    private Pokers() {
        Value value;
        value = Value.LargeKing;
        pokers.add(new Poker(value));
        value = Value.LittleKing;
        pokers.add(new Poker(value));
        value = Value.Three;
        addFortimes(value);
        value = Value.Four;
        addFortimes(value);
        value = Value.Five;
        addFortimes(value);
        value = Value.Six;
        addFortimes(value);
        value = Value.Seven;
        addFortimes(value);
        value = Value.Eight;
        addFortimes(value);
        value = Value.Night;
        addFortimes(value);
        value = Value.Ten;
        addFortimes(value);
        value = Value.J;
        addFortimes(value);
        value = Value.Q;
        addFortimes(value);
        value = Value.K;
        addFortimes(value);
        value = Value.A;
        addFortimes(value);
        value = Value.Two;
        addFortimes(value);
    }

    private void addFortimes(Value value){
        for (int i = 0; i < 4; i++) {
            pokers.add(new Poker(value));
        }
    }

    public static Pokers getInstance(){
        return instance;
    }
}
