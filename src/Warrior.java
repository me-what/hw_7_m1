public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setTypeOfSuperAbility("CRITICAL DAMAGE");
        System.out.println("The Warrior used the superpower " + getTypeOfSuperAbility());
    }
}