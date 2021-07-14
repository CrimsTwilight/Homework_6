public class Main {
    public static void main(String[] args) {
        Rocket rocket = new Rocket("Starship", 100);
        Cosmodrome cosmodrome = new Cosmodrome(rocket);

        cosmodrome.start();
    }
}
