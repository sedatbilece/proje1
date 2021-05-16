/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proje1;

public class Node {
    //proporties
    String bölumadi;
    String adsoyad;
    String tc;
    String yas;
    String sikayet;
    
    Node next;// keep the next Node
    
    
    public Node(String bölumadi,String adsoyad,String tc,String yas,String sikayet){//Constructor
        this.bölumadi=bölumadi;
        this.adsoyad=adsoyad;
        this.tc=tc;
        this.yas=yas;
        this.sikayet=sikayet;
        
    }
    
}