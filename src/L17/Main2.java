package L17;

public class Main2 {

    String lang;

//    Constructor Overloading

    Main2 () {
        lang = "Java";
    }

    Main2 (String language) {
        lang = language;
    }

    public void getName () {
        System.out.println("Language is " + lang);
    }
}
