package moduleHW1.model;

public class Kotik {
    private static int kotikCount = 0;
    private int satiety;
    private String name;
    private int weight;
    private String meow;
    private int prettiness;

    public Kotik(int satiety, String name, int weight, String meow, int prettiness) {
        this.satiety = satiety;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.prettiness = prettiness;
        kotikCount++;
    }

    public Kotik() {
        this.satiety = 4;
        this.name = "Леопольд";
        this.weight = 4;
        this.meow = "Мяу";
        this.prettiness = 100;
        kotikCount++;
    }

    public int getSatiety() {
        return satiety;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public String getMeow() {
        return meow;
    }
    public int getPrettiness() {
        return prettiness;
    }
    public static int getKotikCount() {
        return kotikCount;
    }


    public void liveAnotherDay() {
        System.out.println("Меня зовут " + name + " и мой вес всего лишь " + weight + " кг");
        for(int i = 0; i<24; i++) {
            int randomBehavior = (int) (Math.random() * 5) + 1;
            switch (randomBehavior) {
                case 1:
                    play();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    eat();
                    break;
                case 4:
                    tygydykat();
                    break;
                case 5:
                    chaseMouse();
                    break;
            }
        }
    }

    public void eat() {
        eat(3, " рыбу");
    };
    public void eat(int satietyUnits) {
        satiety += satietyUnits;
    }
    public void eat(int satietyUnits, String food) {
        System.out.println("Я поел" + food );
        satiety += satietyUnits;
    }

    public boolean sleep() {
        if(satiety <=0) {
            System.out.println(meow + ", я голоден, покорми меня");
            eat();
            return false;
        } else {
            System.out.println("Спал");
            satiety--;
            return true;
        }
    }

    public boolean play() {
        if(satiety <=0) {
            System.out.println(meow + ", я голоден, покорми меня");
            eat();
            return false;
        } else {
            System.out.println("Играл");
            satiety--;
            return true;
        }
    }

    public boolean tygydykat() {
        if(satiety <=0) {
            System.out.println(meow + ", я голоден, покорми меня");
            eat();
            return false;
        } else {
            System.out.println("Тыгыдыкал");
            satiety--;
            return true;
        }
    }

    public boolean chaseMouse() {
        if(satiety <=0) {
            System.out.println(meow + ", я голоден, покорми меня");
            eat();
            return false;
        } else {
            System.out.println("Ловил мышь");
            satiety--;
            return true;
        }
    }
}
