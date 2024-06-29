import java.util.Random;

class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;
    private Random random;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Player opponent) {
        int attackRoll = random.nextInt(6) + 1;
        int attackDamage = attack * attackRoll;
        System.out.println(name + " attacks with a roll of " + attackRoll + " resulting in " + attackDamage + " damage");
        opponent.defend(attackDamage);
    }

    public void defend(int attackDamage) {
        int defendRoll = random.nextInt(6) + 1;
        int defendPower = strength * defendRoll;
        System.out.println(name + " defends with a roll of " + defendRoll + " resulting in " + defendPower + " defense power");
        int damageTaken = Math.max(0, attackDamage - defendPower);
        health -= damageTaken;
        System.out.println(name + " takes " + damageTaken + " damage and is now at " + health + " health");
    }

	public Object getStrength() {
		return strength;
	}

	public Object getAttack() {
		return attack;
	}
}
