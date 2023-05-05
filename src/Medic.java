public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        setTypeOfSuperAbility("HEALING_ALL_ALLIES");
        System.out.println("The Medic used the superpower  " + getTypeOfSuperAbility() + "\n");
    }

    int healPoints = 20;
    public void increaseExperience(){
        System.out.println(healPoints = healPoints + (healPoints/10));
    }
}