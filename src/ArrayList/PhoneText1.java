package ArrayList;

import java.util.ArrayList;

public class PhoneText1 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Iphone 12", 1000));
        phones.add(new Phone("Samsung S22", 1200));
        phones.add(new Phone("Xiaomi 12", 800));
        ArrayList<Phone> expensivePhones = expensivePhones(phones);
        for (int i = 0; i < expensivePhones.size(); i++) {
            Phone phone = expensivePhones.get(i);
            System.out.println(phone.getBrand()+" "+phone.getPrice());
        }
    }
    public static ArrayList<Phone>expensivePhones(ArrayList<Phone> phones){
        ArrayList<Phone> expensivePhones = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            Phone phone = phones.get(i);
            if(phone.getPrice() > 1000){
                expensivePhones.add(phone);
            }

        }
        return expensivePhones;


    }
}
