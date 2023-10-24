package patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static List<Enemy> enemies;

    public static void createEnemies() {
        enemies = new ArrayList<>();
        enemies.add(new Warrior());
        enemies.add(new Ranger());
//        enemies.add(new Wizard());
        enemies.add(new WizardAdapter());
    }

    public static void battle() {
        for (Enemy enemy : enemies) {
            enemy.attack();
        }
    }

    public static void main(String[] args) {
        createEnemies();
        battle();
    }
}