package patterns.adapter;

public class Ranger implements Enemy {

    @Override
    public void attack() {
        System.out.println("Вы атакованы противником Ranger!");
    }
}