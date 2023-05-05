public class Magic extends Hero {
    @Override
    public void applySuperAbility() {
        setTypeOfSuperAbility("INVISIBILITY");
        System.out.println("The Magic used the superpower " + getTypeOfSuperAbility());
    }
}