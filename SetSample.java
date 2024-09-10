package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample {
    public static void HashSet(){
        Set<String> days=new HashSet<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Saturday");
        days.add("Monday");
        days.add("monday");
        days.add("Wednesday");
        for (String day:days){
            System.out.println(day);
        }

        System.out.println("Toplam gün sayısı: "+days.size());
    }

    public static void LinkedHashSet(){
        Set<String> members=new LinkedHashSet<>();
        members.add("Murat");
        members.add("Berk");
        members.add("Elif");
        members.add("Berk");
        members.add("berk");
        members.add("Canan");
        System.out.println(" Üye Listesi\n");

        for (String member:members){
            System.out.println(member);
        }
        System.out.println("Üye sayısı: "+members.size());
    }
    public static void Treeset(){
        Set<String> cityName=new TreeSet<>();
        cityName.add("Barcelona");
        cityName.add("Venice");
        cityName.add("Roma");
        cityName.add("Paris");
        cityName.add("Venice");
        cityName.add("Canakkale");
       
        for (String city:cityName){
            System.out.println(city);}
        System.out.println("Şehir sayısı:"+cityName.size());

    }
    public static void main(String[] args) {
        HashSet();
        LinkedHashSet();
        Treeset();
    }
}
