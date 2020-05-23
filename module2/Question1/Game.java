import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.toHexString;

public class Game {
    private int size = 17;
    private String[][] arr = new String[size][size];

    public Game() {
        System.out.println("----------------------------��������Ϸ��ʼ-----------------------------");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0){
                    if (j == 0){
                        arr[i][j] = " ";
                    }else {
                        arr[i][j] = toHexString(j - 1);
                    }
                } else if (j == 0){
                    arr[i][j] = toHexString(i - 1);
                }else{
                    arr[i][j] = "+";
                }
            }
        }
    }

    private void draw(){
//        System.out.println("�������̣�");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean choosePoint(int x, int y, ChessColor color){
        if (x >= 1 && x <= 16 && y >= 1 && y <= 16 && arr[x][y].equals("+")){
            arr[x][y] = color.toString();
            return true;
        }else{
            System.out.println("������������!");
            return false;
        }
    }

    private boolean judge(int x, int y){
        String color = arr[x][y];
        int count = 0;
        // �����ж�
        for (int i = x - 4; i < x + 5; i++) {
            if (i >= 1 && i <= 16){
                if (arr[i][y].equals(color)){
                    count++;
                    if (count == 5){
                        return true;
                    }
                }else{
                    count = 0;
                }
            }
        }
        // �����ж�
        for (int i = y - 4; i < y + 5; i++) {
            if (i >= 1 && i <= 16){
                if (arr[x][i].equals(color)){
                    count++;
                    if (count == 5){
                        return true;
                    }
                }else{
                    count = 0;
                }
            }
        }
        // ����б������
        int i = x - 4;
        int j = y - 4;
        while((i < x + 5) && (j < y + 5)){
            if (i >= 1 && i <= 16 && j >= 1 && j <= 16){
                if (arr[i][j].equals(color)){
                    count++;
                    if (count == 5){
                        return true;
                    }
                }else{
                    count = 0;
                }
            }
            i++;
            j++;
        }
        // ����б������
        i = x - 4;
        j = y + 4;
        while((i < x + 5) && (j > y - 5)){
            if (i >= 1 && i <= 16 && j >= 1 && j <= 16){
                if (arr[i][j].equals(color)){
                    count++;
                    if (count == 5){
                        return true;
                    }
                }else{
                    count = 0;
                }
            }
            i++;
            j--;
        }

        return false;
    }

    private ChessColor opposite(ChessColor color){
        if (color == ChessColor.B){
            return ChessColor.W;
        }else{
            return ChessColor.B;
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.draw();
        Scanner input = new Scanner(System.in);
        System.out.println("�ֺ�����");
        boolean endGame = false;
        int x;
        int y;
        ChessColor color = ChessColor.B;
        while (!endGame){
            System.out.println(color.getColor() + "������ ");
            x = input.nextInt() + 1;
            System.out.println(color.getColor() + "�᷽�� ");
            y = input.nextInt() + 1;
            if(!game.choosePoint(x, y, color)){
                continue;
            }
            game.draw();
            color = game.opposite(color); // ������ɫ
            endGame = game.judge(x, y);   // �ж���Ӯ
        }
        System.out.println("��Ϸ��������ʤ���� " + game.opposite(color).getColor());
    }
}

