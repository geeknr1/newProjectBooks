package com.backend.newproject.observer2;

@Component
public class AllBooksSubject implements Subject {
    private List<Observer> observers;

    public AllBooksSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(NewBookRequest newBookRequest) {
        for (Observer observer : observers) {
            observer.update(newBookRequest);
        }
    }

    public void addNewBookRequest(NewBookRequest newBookRequest) {
        notifyObservers(newBookRequest);
    }


}
