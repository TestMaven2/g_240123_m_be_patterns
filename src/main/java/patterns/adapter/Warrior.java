package patterns.adapter;

public class Warrior implements Enemy {

    @Override
    public void attack() {
        System.out.println("Вы атакованы противником Warrior!");
    }
}