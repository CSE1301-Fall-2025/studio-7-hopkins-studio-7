public class Die {
    private int sides;

    public Die(int initSides) {
        sides = initSides;
    }

    public int dieRoll() {
        int roll = (int)(Math.random() * this.sides + 1);
        return roll;
    }

    public void print() {
        System.out.println(this.dieRoll());
    }

    public static void main (String[] args) {
        Die d1 = new Die(6);
        Die d2 = new Die(100);
        Die d3 = new Die(10);
        d1.print();
        d2.print();
        d3.print();
    }
}