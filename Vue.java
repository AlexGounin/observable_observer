package observable_observer;

import java.util.Observable;
import java.util.Observer;

public class Vue implements Observer {
    Control ct;

    public Vue(Control c) {
        ct = c;
        ct.setObserver(this);
    }

    public void update(Observable arg0, Object arg1) {
        if (arg1 instanceof String[]) {
            String[] labels = (String[]) arg1;
            int nbLabel = Integer.valueOf(labels[0]);
            switch (nbLabel) {
                case 1: System.out.println("Label : " + labels[1]); break;
                default: System.out.println("Erreur d'affichage");
            }
        } else {
            System.out.println("Erreur d'affichage");
        }
    }

    public void actionVue() {
        ct.actionVue();
    }
}
