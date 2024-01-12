package game_pkg;

public class Player1 {
    protected String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health){
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public String getName(){
        return this.name;
    }

    public String getWeapon(){
        return this.weapon;
    }

    public int getHealth(){
        return this.health;
    }

    public void getDamage(int damage){
        this.health -= damage;
        if(damage == 30){
            System.out.println(this.name + "health is reduced by 30");
        }
        else if(damage == 50){
            System.out.println(this.name + "health is reduced by 50");
        }
        if(this.health <= 0){
            System.out.println(this.name + "is dead");
        }
        
    }
}
