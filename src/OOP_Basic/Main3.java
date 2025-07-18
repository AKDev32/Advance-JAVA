package OOP_Basic;

public class Main3 {

    int var;
    Main3 (int var) {
        this.var = var;
//        System.out.println("This reference = " + this);
    }

    public static void main(String[] args) {
        Main3 obj = new Main3(8);
        System.out.println(obj.var);
    }

}
