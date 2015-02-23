package observable_observer;

public class Control {
    EntiteObserver ev = new EntiteObserver();

    public void setObserver(Vue vue) {
        ev.addObserver(vue);
    }

    public void actionVue() {
        ev.ecritureHello();
    }
}
