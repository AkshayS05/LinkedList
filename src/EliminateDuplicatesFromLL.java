

import java.util.Scanner;

public class EliminateDuplicatesFromLL {
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
    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        LinkedList<Integer> temp = head;
        while (temp.next != null) {
            if (temp.data.equals(temp.next.data)) {
                temp.next = temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
        public static void main (String[]args){
            System.out.println("Enter -1 to stop");
            LinkedList<Integer> head = takeInput();
         LinkedList<Integer>newHead= removeDuplicates(head);
            print(newHead);
        }
    }
