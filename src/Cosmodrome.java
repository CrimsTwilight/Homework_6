public class Cosmodrome {
    private Rocket rocket;

    public Cosmodrome(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public void start() {
        if (rocket.check()) {
            System.out.println("Проверка систем прошла успешна.");
            for (int i = 9; i >= 0; i--) {
                System.out.println(i);
            }
            rocket.start();
        } else {
            System.out.println("Проверка систем провалилась.");
        }

    }
}
