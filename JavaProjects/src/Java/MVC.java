package Java;

import java.util.ArrayList;
import java.util.List;

public class MVC implements Model{
    private int a;
    private List<Observer> observers = new ArrayList<>();

    public void update (int a) {
        this.a=a;
        notifyObservers(a);
    }

    public MVC (int a) {
        this.a=a;
        }

    public void view () {
        System.out.println("Current value is "+a);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(int a) {
        for (Observer o : observers)
            o.update(a);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public static void main (String args[]) {
        MVC mvc = new MVC(1);
        //mvc.view();
        Obs1 o = new Obs1();
        Obs1 o1 = new Obs1();
        mvc.addObserver(o);
        mvc.addObserver(o1);
        mvc.update(2);
        mvc.update(3);
    }
}

class Obs1 implements Observer {
    private int a=0;
    public void update(int a) {
        System.out.println("Number updated to " +a);
        this.a=a;
    }
    public void view() {
        System.out.println("The value is currently "+a);
    }
}

interface Model {
    public void addObserver(Observer o);
    public void notifyObservers(int a);
    public void removeObserver(Observer o);
}

interface Observer {
    public void update(int a);
}