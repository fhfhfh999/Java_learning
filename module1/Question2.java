public class Question2 {
    public static void main(String[] args) {
        System.out.println("1000���ڵ�����������");
        for (int i = 2; i <= 1000; i++) {
            int x = (int)Math.sqrt(i); // ƽ����
            int count = 1;
            for (int j = 2; j <= x; j++) {
                if (i % j == 0){
                    count += j;
                    count += i/j;
                }
                if (count > i){
                    break;
                }
            }
            if (x == Math.sqrt(i)){
                // ��һƽ��������������ôƽ����Ҳ������������ļ����������Σ���Ҫ��ȥ
                count -= x;
            }
            if (count == i){
                System.out.println(i);
            }
        }
    }
}
