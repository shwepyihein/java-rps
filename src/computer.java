public class computer {
    private static int CHP=100;
    public int function(){
        return CHP;
    }
    public static int lose() {
        return CHP-=30;
    }
    public static int Draw() {
        return CHP+=10;
    }

    public int getCHP(){
        return this.CHP;
    }
}
