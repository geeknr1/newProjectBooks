package com.backend.newproject.observer2;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(NewBookRequest newBookRequest);
}
