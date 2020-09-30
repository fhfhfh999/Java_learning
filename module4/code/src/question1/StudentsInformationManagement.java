package question1;

import java.util.Scanner;

public class StudentsInformationManagement {

    public static void main(String[] args) {

        Function function;
        System.out.println("================学生信息管理================");
        Save.load();  // 读取文件信息
        Scanner input = new Scanner(System.in);
        boolean system_on = true;
        while(system_on){
            System.out.println("请选择功能：");
            System.out.println("1.增加学生信息\n2.删除学生信息\n3.修改学生信息\n4.查找学生信息\n5.查看当前学生\n6.退出当前系统");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    function = new Add();
                    function.work();
                    break;
                case 2:
                    function = new Delete();
                    function.work();
                    break;
                case 3:
                    function = new Change();
                    function.work();
                    break;
                case 4:
                    function = new Find();
                    function.work();
                    break;
                case 5:
                    for (Student s :
                            Function.Students) {
                        System.out.println(s);
                    }
                    break;
                case 6:
                    system_on = false;
                    break;
                default:
                    System.out.println("不存在的选项");
            }
        }
        input.close();
        Save.save(); // 保存文件信息
        System.out.println("系统关闭，谢谢使用");
    }
}
