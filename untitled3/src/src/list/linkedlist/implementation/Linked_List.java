package list.linkedlist.implementation;

import javax.xml.soap.Node;

public class Linked_List {
    private Node head ; //First Node
    private Node tail ; //Last Node
    private int size=0; //Size of Node

    private class Node{
        private Object data; //data를 담는 변수
        private Node next;   //다음 Node를 가르키는 변수.

        public Node (Object input){
            this.data = input;
            this.next = null;
        }

        public boolean add_first (Object o){

          Node new_node = new Node(o);
          new_node.next= head;
          head = new_node;
          size++;

          if(head.next ==null) tail = head;
          return true;
        }

        public boolean add_last(Object o){
            Node new_node = new Node(o);
            if(size ==0) add_first(o);
            else{
                tail.next = new_node;
                tail = new_node;
                size++;
                }
            return true;
        }

        //탐색을 위한 메소드.
        protected  Node node (int idx){
            Node n =head;
            for(int i=0;i<idx; i++)
                n=n.next;
            return n;
        }

        public boolean add(int idx, Object o){

            if(idx ==0)
                add_first(o); //첫번째에 넣는것.
            else{             //중간에 넣는것.
                Node temp= node(idx-1);
                Node temp_next = node(idx);
                Node new_node = new Node(o);
                temp.next = new_node;
                new_node.next = temp_next;
                size++;
                if(new_node ==null)
                    tail = new_node;
            }
            return true;
        }

        @Override
        public  String toString() {
            if(head ==null)
                return "[]";
            else {
                Node temp =head;
                String str = "[";
                while (temp.next !=null) {
                    str += temp.data + ",";
                    temp = temp.next;
                    if (temp == tail)
                        str += temp.data;
                    }
                return str + "]";
                }
        }

        public  boolean remove_first() {
            Node temp = head;
            head = head.next;
            temp = null;
            size--;

            return true;

        }

        public  boolean remove (int idx){
            if(idx ==0)
                return remove_first();
            else{
                Node temp = node(idx-1);
                Node del = temp.next;
                temp.next = temp.next.next;
                if(del == tail)
                    tail=temp;
                del = null;
                size--;
                }
                return true;

        }



     //마지막을 제거하는 것은 마지막 위치를 제거해주면 됩니다. 부터 시작!
    }






    public void addFirst (Object input){
        Node newNode = new Node(input);
        newNode.next = head; //새로운 노드의 다음 노드로 해드를 지정합니다.
        head = newNode;
        size++;

        if(head.next ==null){
            tail = head;
        }
    }

    public void addLast (Object input){
        Node newNode = new Node(input);

        if(size==0){
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }

}
