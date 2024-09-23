package model.heroes;

import model.enemy.Enemy;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 10;
        System.out.println(getName() + " атакует врага мечом, нанося " + damage + " урона!");
        enemy.takeDamage(damage);
    }
}