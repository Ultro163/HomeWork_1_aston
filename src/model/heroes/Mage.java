package model.heroes;

import model.enemy.Enemy;

public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 45;
        System.out.println(getName() + " атакует врага магией, нанося " + damage + " урона!");
        enemy.takeDamage(damage);
    }
}