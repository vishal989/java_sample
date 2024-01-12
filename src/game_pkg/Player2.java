package game_pkg;

public class Player2 extends Player1{
    private int health;
    private boolean armor;

    public Player2(String name, String weapon, int health, boolean armor){
        super(name, weapon, health);
        this.health = health;
        this.armor = armor;
    }

    @Override
    public void getDamage(int damage){
        this.health -= damage;
        this.health += 10;
        if(this.armor){
            if(damage == 30)
                System.out.println(getName() + "health is reduced by 20");
            else
                System.out.println(getName() + "health is reduced by 40");
        }
        else{
            if(damage == 30)
                System.out.println(getName() + "health is reduced by 30");
            else
                System.out.println(getName() + "health is reduced by 50");
        }
        if(this.health <= 0){
            System.out.println(getName() + "is dead");
        }
        
    }
}
