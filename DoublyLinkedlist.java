package baris;

import java.util.Scanner;

public class DoublyLinkedlist {
               node head;
               static class node{
            	   int data;
            	   node next,prev;
            	   node(int d){
            		   data=d;
            		   next=null;
            		   prev=null;
            	   }
               }
               public static void main(String args[]){
            	   DoublyLinkedlist obj=new DoublyLinkedlist();
            	   Scanner in=new Scanner(System.in);
            	   System.out.println("enter no. of nodes u want to insert");
            	   int a=in.nextInt();
            	   System.out.println("enter nodes");
            	   while(a>0){
            		   int f=in.nextInt();
            		   obj.push(f);
            		   a--;
            	   }
            	   System.out.println("***********operations************");
            	   System.out.println("1.Insert a node at the front");
            	   System.out.println("2.Insert a node at the end");
            	   System.out.println("3.Insert a node before a given node");
            	   System.out.println("4.Insert a node after a given node");
            	   System.out.println("5.Delete a node from the front");
            	   System.out.println("6.Delete a node from the end");
            	   System.out.println("7.delete a node from any position");
            	   System.out.println("8.print");
            	   int y;
            	   do{
            	   System.out.println("enter ur choice");
            	   int ch=in.nextInt();
            	   switch(ch){
            	   case 1:System.out.println("enter node");
            	           int k=in.nextInt();
            		      obj.ins_beg(k);
            		      break;
            	   case 2:System.out.println("enter node");
            	          int l=in.nextInt();
            	          obj.ins_end(l);
            	          break;
            	   case 3:System.out.println("enter node");
     	                  int bef=in.nextInt();
     	                  System.out.println("enter node u want to insert");
     	                  int p=in.nextInt();
     	                  obj.ins_bef(p,bef);
     	                  break;
            	   case 4:System.out.println("enter node");
     	                  int aft=in.nextInt();
     	                 System.out.println("enter node u want to insert");
    	                  int j=in.nextInt();
     	                   obj.ins_aft(j,aft);
     	                   break;
            	   case 5:obj.del_beg();
            	           break;
            	   case 6:obj.del_end();
            	           break;
            	   case 7:System.out.println("enter node");
     	                  int h=in.nextInt();
     	                  obj.delete(h);
     	                   break;
            	   case 8:obj.print();
            	          break;
            	   default:System.out.println("wrong choice");
            	   } 
            	System.out.println("enter 1 if u want to continue");	   
            		  y=in.nextInt();  
            	 }while(y==1);
            System.out.println("termination");
     }
               public void push(int new_data){
            	   node new_node=new node(new_data);
            	   new_node.next=head;
            	   new_node.prev=null;
            	             	 
            	   if(head!=null)
            		   head.prev=new_node;
            	   
            	   head=new_node;
               }
               public void ins_beg(int new_data1){
            	   node new_node1=new node(new_data1);
            	   new_node1.next=head;
            	   head.prev=new_node1;
            	   head=new_node1;
               }
               public void ins_end(int new_data2){
            	   node new_node2=new node(new_data2);
            	   node temp11=head;
            	   while(temp11.next!=null){
            		   temp11=temp11.next;
            	   }
            	   temp11.next=new_node2;
            	   new_node2.prev=temp11;
            	   new_node2.next=null;
               }
               public void ins_bef(int new_data3,int NODE){
            	   node new_node3=new node(new_data3);
            	   node ptr=head;
            	   node preptr=ptr;
            	   while(ptr.data!=NODE){
            		   preptr=ptr;
            		   ptr=ptr.next;
            	   }
            	   ptr.prev=new_node3;
            	   preptr.next=new_node3;
            	   new_node3.prev=preptr;
            	   new_node3.next=ptr;
               }
               public void ins_aft(int new_data4,int NODE2){
            	   node new_node4=new node(new_data4);
            	   node ptr=head;
            	   node preptr=ptr;
            	   while(preptr.data!=NODE2){
            		   preptr=ptr;
            		   ptr=ptr.next;
            	   }
            	   ptr.prev=new_node4;
            	   preptr.next=new_node4;
            	   new_node4.prev=preptr;
            	   new_node4.next=ptr;
               }
               public void del_beg(){
            	   node temp=null;
            	   temp=head;
            	   head=head.next;
            	   head.prev=null;
               }
               public void del_end(){
            	   node temp=head;
            	   while(temp!=null){
            		   temp=temp.next;
            	   }
            	   temp.prev.next=null;
               }
               public void delete(int new_data6){
            	   node temp7=head;
            	   while(temp7.data!=new_data6){
            		   temp7=temp7.next;
            	   }
            		   temp7.prev.next=temp7.next;
            	   }
               public void print(){
            	   node temp9=head;
            	   while(temp9!=null){
            		   System.out.println(+temp9.data);
            		   temp9=temp9.next;
            	   }
               }
               }

               






















