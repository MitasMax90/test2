public class MashineTest {

    public static void main(String[] args) {
        Machine machine = new Machine(100, "T1000");

        machine.start();
        machine.makeDetails(50);
        machine.makeDetails(100);
        machine.refuel(50);
        machine.makeDetails(120);
    }

}
