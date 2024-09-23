package model.enemy;

import model.heroes.Hero;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (!isAlive() && Math.random() < 0.5) {
            setHealth(10);
            System.out.println("Зомби воскрес!");
        }
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 5;
        System.out.println("Zombie" + " атакует " + hero.getName() + ", нанося " + damage + " урона!");
        hero.takeDamage(damage);
    }
}