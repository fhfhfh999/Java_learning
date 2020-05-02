public class Question2 {
    public static void main(String[] args) {
        System.out.println("1000以内的完数包括：");
        for (int i = 2; i <= 1000; i++) {
            int x = (int)Math.sqrt(i); // 平方根
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
                // 万一平方根是整数，那么平方根也是因数，上面的计算会计算两次，需要减去
                count -= x;
            }
            if (count == i){
                System.out.println(i);
            }
        }
    }
}
