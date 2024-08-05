package moduleHW1;

import moduleHW1.model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(6, "Мурзик", 5, "Мяв", 100);
        kotik1.liveAnotherDay();

        Kotik kotik2 = new Kotik();
        kotik2.liveAnotherDay();

        String meowComparison = (kotik1.getMeow().equals(kotik2.getMeow())) ? "Котики одинаково мяукают": "Котики мяукают неодинаково";
        System.out.println(meowComparison);

        System.out.println("Количество котиков: " + Kotik.getKotikCount());
    }
}
