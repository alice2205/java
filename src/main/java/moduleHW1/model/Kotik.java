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
    }

    public Kotik() {
    }

    public void setKotik(int satiety, String name, int weight, String meow, int prettiness) {
        this.satiety = satiety;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.prettiness = prettiness;
    }

    {
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
        for(int i = 0; i<24; i++) {
            int randomBehavior = (int) (Math.random() * 5) + 1;
            boolean isFull = true;
            switch (randomBehavior) {
                case 1:
                    isFull = play();
                    break;
                case 2:
                    isFull = sleep();
                    break;
                case 3:
                    isFull = wash();
                    break;
                case 4:
                    isFull = tygydykat();
                    break;
                case 5:
                    isFull = chaseMouse();
                    break;
            }
            if (!isFull && satiety <=0) {
               eat();
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
        satiety += satietyUnits;
    }

    public boolean sleep() {
        if(satiety <=0) {
            System.out.println(meow + ", я голоден, покорми меня");
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
            return false;
        } else {
            System.out.println("Играл");
            satiety--;
            return true;
        }
    }

    public boolean wash() {
        if(satiety <=0) {
            System.out.println(meow + ", я голоден, покорми меня");
            return false;
        } else {
            System.out.println("Умывался");
            satiety--;
            return true;
        }
    }

    public boolean tygydykat() {
        if(satiety <=0) {
            System.out.println(meow + ", я голоден, покорми меня");
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
            return false;
        } else {
            System.out.println("Ловил мышь");
            satiety--;
            return true;
        }
    }
}