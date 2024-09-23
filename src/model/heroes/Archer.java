package model.heroes;

import model.enemy.Enemy;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 15;
        System.out.println(getName() + " атакует врага луком, нанося " + damage + " урона!");
        enemy.takeDamage(damage);
    }
}