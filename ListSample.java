package Collections;

import java.util.*;

public class ListSample {
    public static void List(){
        List<String> shopList=new ArrayList<>();
        shopList.add("Ekmek");
        shopList.add("Süt");
        shopList.add("Domates");
        shopList.add("Yoğurt");
        System.out.println("Alışveriş Listesi");
        for (String product:shopList){
            System.out.println(product);
        }
        System.out.println("Toplam ürünler: "+shopList.size());

        shopList.remove("Süt");  
        for (String productNew:shopList){
            System.out.println(productNew);
        }

    }

public static void LinkedList(){
    List<String> sira=new LinkedList<>();
    sira.add("1.Müşteri");
    sira.add("2.Müşteri");
    sira.add("3.Müşteri");
    sira.add("4.Müşteri");
    System.out.println(sira);
    for (String queue:sira){
        System.out.println(queue);
    }
    System.out.println("Müşteri sayısı: \n"+sira.size());
    }
    public static void Vector(){
        List<String> mesaj=new Vector<>();
        mesaj.add("Bugün hava çok güzel");
        mesaj.add("Saat 17:30");
        mesaj.add("Aylardan haziran");
        mesaj.add("Hava 32 derece\n");
        System.out.println(mesaj);
        for (String message:mesaj){
            System.out.println(message);
        }
        System.out.println("Toplam mesaj adedi: \n"+mesaj.size());

        System.out.println("İlk mesaj: "+mesaj.get(0));

    }


    public static void main(String[] args) {
        List();
        LinkedList();
        Vector();
    }
}
