import java.util.Scanner;

public class MereTwoSortedLL {
    public static LinkedList<Integer> takeInput() {
        LinkedList<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1) {
            LinkedList<Integer> newNode = new LinkedList<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    private static void print(LinkedList<Integer> head) {
        LinkedList<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    private static LinkedList<Integer> merge(LinkedList<Integer> head1, LinkedList<Integer> head2) {
        if(head1==null||head1.next==null){
            return head2;
        }
        if(head2==null||head2.next==null){
            return head1;
        }
        if(head2==null&&head1==null){
            return null;
        }
        LinkedList<Integer> temp1= head1;
        LinkedList<Integer> temp2= head2;
        LinkedList<Integer> finalHead=null;
             if (temp1.data <= temp2.data) {
                      finalHead = temp1;
                      temp1 = temp1.next;
                  } else {
                      finalHead = temp2;
                      temp2 = temp2.next;
                  }
        LinkedList<Integer> finalTail=finalHead;
          while(temp1!=null &&temp2!=null){
              if(temp1.data<=temp2.data) {
                  finalTail.next=temp1;
                  temp1=temp1.next;
                  finalTail=finalTail.next;
              }else{
                  finalTail.next=temp2;
                  temp2=temp2.next;
                  finalTail=finalTail.next;
              }
          }
          if(temp1!=null){
              finalTail.next=temp1;
          }
          if(temp2!=null){

              finalTail.next=temp2;
          }
      return finalHead;
    }
    public static void main(String[] args) {
        System.out.println("Enter -1 to stop");
        System.out.println("Please enter the first sorted linked list");
        LinkedList<Integer> head1 = takeInput();
        System.out.println("Please enter the second sorted Linked list");
        LinkedList<Integer> head2 = takeInput();

       LinkedList<Integer>newHead= merge(head1,head2);
       print(newHead);
    }


}
