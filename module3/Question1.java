public class Question1 {

    public static void main(String[] args) {
        String s = "ABCD123!@#$%ab";
//        String reg = "^[A-Z]$";

        // 大写字符
        StringBuilder s_capital = new StringBuilder();
        int count_capital = 0;
        // 小写字符
        StringBuilder s_lowercase = new StringBuilder();
        int lowercase = 0;
        // 数字
        StringBuilder number = new StringBuilder();
        int count = 0;
        // 其他字符
        StringBuilder s_symbol = new StringBuilder();
        int symbol = 0;
        // 遍历
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

        System.out.println("大写字母有" + count_capital + "个， 是： " + s_capital);
        System.out.println("小写字母有" + lowercase + "个， 是： " + s_lowercase);
        System.out.println("数字有" + count + "个， 是： " + number);
        System.out.println("其他字符有" + symbol + "个， 是： " + s_symbol);

    }
}
