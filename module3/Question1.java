public class Question1 {

    public static void main(String[] args) {
        String s = "ABCD123!@#$%ab";
//        String reg = "^[A-Z]$";

        // ��д�ַ�
        StringBuilder s_capital = new StringBuilder();
        int count_capital = 0;
        // Сд�ַ�
        StringBuilder s_lowercase = new StringBuilder();
        int lowercase = 0;
        // ����
        StringBuilder number = new StringBuilder();
        int count = 0;
        // �����ַ�
        StringBuilder s_symbol = new StringBuilder();
        int symbol = 0;
        // ����
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            if (temp.matches("^[A-Z]$")){
                count_capital++;
                s_capital.append(temp);
            }else if (temp.matches("^[a-z]$")){
                lowercase++;
                s_lowercase.append(temp);
            }else if (temp.matches("^[0-9]$")){
                count ++;
                number.append(temp);
            } else{
                symbol++;
                s_symbol.append(temp);
            }
        }

        System.out.println("��д��ĸ��" + count_capital + "���� �ǣ� " + s_capital);
        System.out.println("Сд��ĸ��" + lowercase + "���� �ǣ� " + s_lowercase);
        System.out.println("������" + count + "���� �ǣ� " + number);
        System.out.println("�����ַ���" + symbol + "���� �ǣ� " + s_symbol);

    }
}
