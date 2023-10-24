package patterns.adapter;

public class WizardAdapter implements Enemy {

    private Wizard wizard = new Wizard();

    @Override
    public void attack() {
        wizard.castSpell();
    }
}