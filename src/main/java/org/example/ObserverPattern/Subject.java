package org.example.ObserverPattern;

public interface Subject {
    void subscribe(Observer ob);
    void unsubscribe(Observer ob);
    void newVedioUploaded();
}
