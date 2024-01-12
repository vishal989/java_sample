package game_pkg;

public class Game {
    public static void main(String[] args){
        Player1 p1 = new Player1("Roahn", "shotgun", 100);
        p1.getDamage(30);
        p1.getDamage(50);
        p1.getDamage(50);
        System.out.println(p1.getHealth());
        Player2 p2 = new Player2("chi", "machinegun", 100, true);
        p2.getDamage(50);
        System.out.println(p2.getHealth());
    }
}

