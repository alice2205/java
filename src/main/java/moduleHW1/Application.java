package moduleHW1;
import moduleHW1.model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(6, "Мурзик", 5, "Мяу", 100);
        System.out.println("Меня зовут " + kotik1.getName() + " и мой вес всего лишь " + kotik1.getWeight() + " кг");
        kotik1.liveAnotherDay();

        Kotik kotik2 = new Kotik();
        kotik2.setKotik(4, "Леопольд", 3, "Мяу", 100);
        System.out.println("Меня зовут " + kotik2.getName() + " и мой вес всего лишь " + kotik2.getWeight() + " кг");
        kotik2.liveAnotherDay();

        String meowComparison = (kotik1.getMeow().equals(kotik2.getMeow())) ? "Котики одинаково мяукают": "Котики мяукают неодинаково";
        System.out.println(meowComparison);

        System.out.println("Количество котиков: " + Kotik.getKotikCount());
    }
}
