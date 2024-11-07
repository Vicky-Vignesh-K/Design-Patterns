package com.ObserverPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Channel implements ISubject{

    private String channelName;
    private String title;
    private List<Subscriber> subs;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Subscriber> getSubs() {
        if(subs == null)
            subs = new ArrayList<>();
        return subs;
    }

    public void setSubs(List<Subscriber> subs) {
        this.subs = subs;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        getSubs().add(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has subscribed");
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        getSubs().remove(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has Unsubscribed");
    }

    @Override
    public void notifyAllSubscribers() {
        subs.forEach(subscriber ->subscriber.update());
    }

    @Override
    public void uploadVideo(String title) {
        this.title = title;
        notifyAllSubscribers();
    }
}
