package com.ObserverPattern;

public class Subscriber implements IObserver{

    private String subscriberName;
    private Channel channel;


    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void update() {
        System.out.println("Hey " + subscriberName + ", "+  channel.getChannelName()+ " uploaded a video on : " + channel.getTitle());
    }

    @Override
    public void subscribeChannel(Channel channel) {
        this.channel = channel;
        channel.subscribe(this);
    }

    @Override
    public void unSubscribeChannel(Channel channel){
        this.channel = null;
        channel.unSubscribe(this);
    }
}
