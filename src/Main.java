public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] havingSuperAbilities = {new Magic(), new Warrior(), new Medic()};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility();
            if (havingSuperAbilities[i] instanceof Medic){
                Medic medic = ((Medic)havingSuperAbilities[i]);
                medic.increaseExperience();
            }
        }
    }
}