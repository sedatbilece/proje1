

package proje1;


public class Queue {
    // list head and tail
    Node head;
    Node tail;
    
    
    public Queue(){
        head=null;
        tail=null;
    }
    
    
    public boolean is_Empty(){// list empty controller
        
        return head!=null;
    }
    
    public void EnQueue(String bölumadi,String adsoyad,String tc,String yas,String sikayet){// node adding in the list tail
        
        Node node=new Node( bölumadi, adsoyad, tc, yas, sikayet);
        
        
        if(is_Empty()){
            tail.next=node;
            tail=node;
        }
        else{
            head=node;
            tail=node;
        }
    }
    
    
    public void DeQueue(){//node removing in the list heading
        if(is_Empty()){
            if(head==tail){
                head=null;
                tail=null;
            }
            else{
                head=head.next;
            }
            
        }
    }
    
    // burası olmayabilir
    public void Show(){// printing the list
       int cnt=0;
        Node ptr=head;
        
        
        while(ptr!=null){
            
            System.out.println(ptr.bölumadi+" "+ptr.adsoyad+" "+ptr.tc+" "+ptr.yas+" "+ptr.sikayet);
           
            ptr=ptr.next;
        }
    }
    
    
}
