public class Machine {
    private int oil;
    private boolean isOff;
    private String name1;

    void makeDetails(int amount) {
        if (oil >= amount) {
            oil -= amount;
            System.out.println(name1 + ": Work is done!");
        } else if (oil < amount) {
            System.out.println(name1 + ": We are need more oil");
            isOff = true;
        }
    }

    void refuel(int refOil) {
        oil += refOil;
        System.out.println(name1 + ": Is ready to work!");
        isOff = false;
    }

    void start() {
        this.isOff = false;
    }

    public Machine(int oil, String name) {
        this.oil = oil;
        this.name1 = name;
    }
}
