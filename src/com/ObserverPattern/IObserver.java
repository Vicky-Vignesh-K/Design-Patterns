package com.ObserverPattern;

public interface IObserver {

    public void update();

    public void subscribeChannel(Channel channel);

    public void unSubscribeChannel(Channel channel);

}
