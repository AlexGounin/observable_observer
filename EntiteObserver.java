package observable_observer;

import java.util.Observable;

public class EntiteObserver extends Observable {
    private String[] labels = new String[2];

    public void ecritureHello() {
        setChanged();
        labels[0] = "1";
        labels[1] = "Hello World !";
        notifyObservers(labels);
    }
}
