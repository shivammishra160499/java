import java.util.*;



public class linkedList {
    class node{
        int val;
        node next=null;
        public node(int val)
        {
            this.val=val;
        }
    
       };
       node head=null;
       
       public void pushFront(int x)
       {
        node temp=new node(x);
        if(head==null)
        head=temp;
        else
        temp.next=head;
        head=temp;
       }
       public void deletFront()
       {
        head=head.next;
       }

       public void printlist()
       {
        node temp=head;
        System.out.println("lest elements are");
        while(temp!=null)
        {  
            System.out.println(temp.val+"-> ");
            temp=temp.next;
        }
       }
    public static void main(String []args)
    {  linkedList ls= new linkedList();
         for(int i=0;i<10;i++)
          {
            ls.pushFront(i); 
          }
        ls.printlist();

        for(int i=0;i<5;i++)
        {
            ls.deletFront();
        }
        ls.printlist();


        
       
       
    }
}
