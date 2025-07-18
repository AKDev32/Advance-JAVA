package OOP_Basic;

public class Complex {


    private int a,b;

    private Complex (int i, int j) {
        this.a = i;
        this.b = j;
    }

    private Complex (int i) {
        this(i, i);
    }

    private Complex () {
        this(0);
    }

    @Override
    public String toString () {
        return this.a + " + " + this.b;
    }

    public static void main(String[] args) {
        Complex c = new Complex(2, 4);
        System.out.println(c);

        Complex c1 = new Complex(2);
        System.out.println(c1);

        Complex c2 = new Complex();
        System.out.println(c2);
    }
}
