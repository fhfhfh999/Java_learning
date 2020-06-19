import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PlayGame {

    public static void main(String[] args) {

        Pokers pokers = Pokers.getInstance();
        List<Poker> group = pokers.getPokers();
        System.out.println("54张牌为： " + group);
        System.out.println("洗牌后牌组为：");
        Collections.shuffle(group);
        System.out.println(group);

        List player1 = new LinkedList();
        List player2 = new LinkedList();
        List player3 = new LinkedList();
        int j = 0;
        for (int i = 0; i < 17; i++) {
            player1.add(group.get(j));
            j++;
            player2.add(group.get(j));
            j++;
            player3.add(group.get(j));
            j++;
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        System.out.println("第一个玩家手牌为：" + player1);
        System.out.println("第二个玩家手牌为：" + player2);
        System.out.println("第三个玩家手牌为：" + player3);
        System.out.println("底牌为： " + group.subList(j, group.size()));
    }
}