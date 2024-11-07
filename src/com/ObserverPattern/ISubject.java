package com.ObserverPattern;

public interface ISubject {

    public void subscribe(Subscriber subscriber);

    public void unSubscribe(Subscriber subscriber);

    public void notifyAllSubscribers();

    public void uploadVideo(String title);
}
