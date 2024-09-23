package model.enemy;

import model.heroes.Hero;

public class LichKing extends Enemy {

    public LichKing(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (!isAlive() && Math.random() < 0.5) {
            setHealth(10000000);
            System.out.println("Король умер, да здравствует король!");
        }
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 20;
        System.out.println("LichKing" + " атакует " + hero.getName() + ", нанося " + damage + " урона!");
        hero.takeDamage(damage);
    }
}