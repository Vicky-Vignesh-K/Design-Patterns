package com.BuilderPattern;

public class Shop {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).getPhone();
//        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).setBattery(5000).setScreenSize(6).getPhone();
        Phone phone2 = new PhoneBuilder().getPhone();
        System.out.println(phone);
        System.out.println(phone2);
    }

}
