import java.util.Scanner;

public class StudentsInformationManagement {

    public static void main(String[] args) {

        Function function;
        System.out.println("================ѧ����Ϣ����================");
        Scanner input = new Scanner(System.in);
        boolean system_on = true;
        while(system_on){
            System.out.println("��ѡ���ܣ�");
            System.out.println("1.����ѧ����Ϣ\n2.ɾ��ѧ����Ϣ\n3.�޸�ѧ����Ϣ\n4.����ѧ����Ϣ\n5.�鿴��ǰѧ��\n6.�˳���ǰϵͳ");
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
                    System.out.println("�����ڵ�ѡ��");
            }
        }
        input.close();
        System.out.println("ϵͳ�رգ�ллʹ��");
    }
}
