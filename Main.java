package observable_observer;

public class Main {
    public static void main(String[] args) {
        Vue vue = new Vue(new Control());
        vue.actionVue();
    }
}
