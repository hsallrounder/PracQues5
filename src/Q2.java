import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list;
        int t=sc.nextInt();
        while(t-->0) {
            list=new SinglyLinkedList();
            int data = sc.nextInt();
            while (data != -1) {
                list.add(data);
                data = sc.nextInt();
            }
            System.out.println(list.getSize());
        }
        sc.close();
    }
}
