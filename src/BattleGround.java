import model.enemy.Enemy;
import model.enemy.LichKing;
import model.enemy.Zombie;
import model.heroes.Archer;
import model.heroes.Hero;
import model.heroes.Mage;
import model.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Enemy zombie = new Zombie(50);
        Enemy lichKing = new LichKing(150);

        Hero warrior = new Warrior("Воин", 100);
        Hero mage = new Mage("Маг", 70);
        Hero archer = new Archer("Лучник", 80);

        System.out.println("Битва 1: Воин против Зомби");
        fight(warrior, zombie);

        System.out.println("\nБитва 2: Маг против Лича");
        fight(mage, lichKing);

        System.out.println("\nБитва 3: Лучник против Зомби");
        fight(archer, zombie);
    }

    public static void fight(Hero hero, Enemy enemy) {
        while (hero.isAlive() && enemy.isAlive()) {
            hero.attackEnemy(enemy);
            if (enemy.isAlive()) {
                enemy.attackHero(hero);
            }
        }
        displayOutcome(hero, enemy);
    }

    public static void displayOutcome(Hero hero, Enemy enemy) {
        if (!hero.isAlive()) {
            System.out.println(hero.getName() + " пал в бою...");
        } else if (!enemy.isAlive()) {
            System.out.println(enemy.getClass().getSimpleName() + " побеждён!");
        }
    }
}