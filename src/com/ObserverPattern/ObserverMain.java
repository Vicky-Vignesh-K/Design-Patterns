package com.ObserverPattern;

public class ObserverMain {

    public static void main(String[] args) {
        Channel cr7 = new Channel();
        cr7.setChannelName("Ronaldo");

        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        Subscriber subscriber3 = new Subscriber();
        Subscriber subscriber4 = new Subscriber();
        Subscriber subscriber5 = new Subscriber();
//        Subscriber subscriber6 = new Subscriber();
//        Subscriber subscriber7 = new Subscriber();
//        Subscriber subscriber8 = new Subscriber();

        subscriber1.setSubscriberName("Arun");
        subscriber2.setSubscriberName("Tharun");
        subscriber3.setSubscriberName("Varun");
        subscriber4.setSubscriberName("Swetha");
        subscriber5.setSubscriberName("Priya");


        subscriber1.subscribeChannel(cr7);
        subscriber2.subscribeChannel(cr7);
        subscriber3.subscribeChannel(cr7);
        subscriber4.subscribeChannel(cr7);
        subscriber5.subscribeChannel(cr7);

        System.out.println();
        subscriber3.unSubscribeChannel(cr7);

        System.out.println();
        cr7.uploadVideo("Foot Ball Practice");

    }

}
