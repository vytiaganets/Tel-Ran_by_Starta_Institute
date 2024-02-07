package de.telran.lesson20240119summary.phone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Iphone iphone12 = new Iphone("12",
                "Black",
                128,
                48,
                2,
                "17");
        AndroidPhone sumsungS23 = new AndroidPhone("s23",
                "white",
                256,
                76,
                3,
                "5");
        Iphone iphone15 = new Iphone("15",
                "Black",
                128,
                48,
                2,
                "17");
        Phone[] phones = new Phone[]{iphone15, iphone12, sumsungS23};
        Phone[] multiSimPhones;
        multiSimPhones = getPhonesWithMoreThaneTwoSim(phones);
        System.out.println(Arrays.toString(multiSimPhones));//[AndroidPhone{androidVersion='5', model='s23', color='white', memory=256, megaPx=76, simCount=3}]


    }
    static Phone[] getPhonesWithMoreThaneTwoSim(Phone[] phones) {
        Phone[] filteredPhones = new Phone[phones.length];
        int count = 0;
        for(Phone phone : phones){
            if(phone.simCount > 2){
                filteredPhones[count++] = phone;
            }
        }
        return Arrays.copyOf(filteredPhones, count);

    }
}

//public class Main {
//    public static void main(String[] args) {
//        Iphone iphone12 = new Iphone("12", "Black", 128, 48, 2, "17");
//        AndroidPhone samsungS23 = new AndroidPhone("12", "white", 256, 7, "5");
//        AndroidPhone samsungS21 = new AndroidPhone("12", "white", 256, 7, "5");
//        Iphone iphone15 = new Iphone("15", "Black", 128, 48, 2, "17");
//        Phone[] phones = new Phone[] {iphone15, iphone12, samsungS21, samsungS23};
//        Phone multiSimPhones = getPhoneWithMoreThaneTwoSim(phones);\
//        System.out.println(Arrays.toString(multiSimPhones));
//    }
//    static Phone[] getPhoneWithMoreThaneTwoSim(Phone[] phones){
//        Phone[] filteredPhones = new Phone[phones.length];
//        int count =0;
//        for(Phone phone:phones){
//            if(phone.simCount >2){
//                filteredPhones[count++] = phone;
//            }
//        }
////return Arrays.copyOf(filteredPhones, count);
//        return filteredPhones;
//    }
//}
