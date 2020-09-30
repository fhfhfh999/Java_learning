package tasks;

public class task20 {



    public static void main(String[] args) {
        // 使用数据类型.class的方式可以获取对应类型的Class对象
        Class c1 = String.class;

        System.out.println("c1 = " + c1);
        c1 = int.class;
        System.out.println("c1 = " + c1);
        c1 = void.class;
        System.out.println("c1 = " + c1);

        // 使用.getClass() 方法
        Integer i = 20;// 自动装箱
        System.out.println(i.getClass());

        //使用外包装类.TYPE的方式获取对应基本数据类型对象
        c1 = Integer.TYPE;
        System.out.println("c1 = " + c1);
        //调用Class类中的forName方法
        try {
            c1 = Class.forName("java.lang.String");
            System.out.println("c1 = " + c1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //使用类加载器
        ClassLoader classLoader = task20.class.getClassLoader();// 获取当前类的类加载器
        try {
            c1 = classLoader.loadClass("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
