import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PlayGame {

    public static void main(String[] args) {

        Pokers pokers = Pokers.getInstance();
        List<Poker> group = pokers.getPokers();
        System.out.println("54����Ϊ�� " + group);
        System.out.println("ϴ�ƺ�����Ϊ��");
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
        System.out.println("��һ���������Ϊ��" + player1);
        System.out.println("�ڶ����������Ϊ��" + player2);
        System.out.println("�������������Ϊ��" + player3);
        System.out.println("����Ϊ�� " + group.subList(j, group.size()));
    }
}