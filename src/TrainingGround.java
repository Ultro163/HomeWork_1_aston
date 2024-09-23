import model.enemy.Enemy;
import model.enemy.Zombie;
import model.heroes.Archer;
import model.heroes.Hero;
import model.heroes.Mage;
import model.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Zombie(50);

        Hero warrior = new Warrior("Воин", 80);
        Hero mage = new Mage("Маг", 35);
        Hero archer = new Archer("Лучник",45);

        warrior.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        archer.attackEnemy(enemy);
    }
}