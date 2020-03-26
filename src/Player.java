public class Player {
    private String name;
    private static int HP=100;

    public Player(String name) {
        this.name = name;
    }

    public static int getHP() {
        return HP;
    }

    public String getName() {
        return name;
    }

    public static int lose() {
       return HP -= 30;
    }
    public static int Draw() {
        return HP +=10;
    }
}
    