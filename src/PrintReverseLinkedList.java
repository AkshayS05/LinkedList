import java.util.Scanner;

public class PrintReverseLinkedList {
    public static LinkedList<Integer> takeInput(){
        LinkedList<Integer> head=null,tail=null;
        Scanner s= new Scanner(System.in);
        int data= s.nextInt();

        while(data!=-1){
            LinkedList<Integer> newNode= new LinkedList<>(data);
            if(head==null){
                head=newNode;
                tail= newNode;
            }else{
                tail.next=newNode;
                tail=tail.next;
            }
            data=s.nextInt();
        }
        return head;
    }

    private static void print(LinkedList<Integer> head) {
        LinkedList<Integer> temp= head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
    public static void printReverse(LinkedList<Integer> root) {
        if(root.next==null){
            System.out.print(root.data);
            return;
        }
        printReverse(root.next);
        System.out.print(root.data);
    }

    public static void main(String[] args) {
        System.out.println("Enter -1 to stop");
        LinkedList<Integer> head = takeInput();
        printReverse(head);

    }
    }
