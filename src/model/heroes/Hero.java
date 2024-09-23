package model.heroes;

import model.enemy.Enemy;

public abstract class Hero {
    private final String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " получил " + damage + " урона, осталось здоровья: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackEnemy(Enemy enemy);
}