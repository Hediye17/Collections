package Collections;
import java.util.*;

public class MapSample {
    public static void HashMap(){
        Map<String,Integer> studentNote=new HashMap<>();
        // Öğrenci notları ekleme
        studentNote.put("Zehra",90);
        studentNote.put("Yunus",60);
        studentNote.put("Bilal",75);
        studentNote.put("Gökçe",100);
        System.out.println("\nÖğrenci Notları\n");

        for (Map.Entry<String,Integer>entry : studentNote.entrySet()){
            System.out.println(entry.getKey()+"-"+ entry.getValue());
        }
        System.out.println("Zehranın Notu: "+studentNote.get("Zehra"));//istediğimiz kişinin notu için.
    }


    public static void LinkedHashMap(){
        Map<String,String> ziyaretci_girisi=new LinkedHashMap<>();
        // Ziyaretçileri ekleme sırasına göre ekleme
        ziyaretci_girisi.put("15:10","Ali");
        ziyaretci_girisi.put("14:35","Eylül");
        ziyaretci_girisi.put("15:30","Mehmet");
        ziyaretci_girisi.put("15:45","Seher");
        ziyaretci_girisi.put("16:00","Umut");
        System.out.println("\nZiyaret saatleri-Ziayretçi\n");
        for (Map.Entry<String,String>entry:ziyaretci_girisi.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
        System.out.println("15.45'deki ziyaretçi "+ziyaretci_girisi.get("15:45"));


    }

    public static void TreeMap(){
        Map<String,String> bookName=new TreeMap<>();
        bookName.put("Z ","Zaman Makinesi");
        bookName.put("A ","Ağrı Dağı Efsanesi");
        bookName.put("H ","Homosapien");
        bookName.put("H ","Hayvan Çiftliği");
        bookName.put("B ","Bin Muhteşem Güneş");
        bookName.put("1 ","1984");
        System.out.println("\nKitap Listesi\n");//Listeyi alfabetik sıralayacak,
        // her harften yanlızca birtanesini yazdırır.
        //rakamları harften önce yazdıracak
        for (Map.Entry<String,String>entry: bookName.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
    public static void HashTable(){
        Map<String,String> hesapBilgisi=new Hashtable<>();
        hesapBilgisi.put("Hediye ","159764");
        hesapBilgisi.put("Yılmaz ","djyt178");
        hesapBilgisi.put("Zeynep ","Zeynep14589");
        hesapBilgisi.put("Kerim ","rtyuj4291");
        System.out.println("\nKullanıcı adı-Şifre\n");
        for (Map.Entry<String,String>entry:hesapBilgisi.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }


    }
    public static void main(String[] args) {
        HashMap();
        LinkedHashMap();
        TreeMap();
        HashTable();
    }
}
