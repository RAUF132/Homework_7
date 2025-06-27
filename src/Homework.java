public class Homework {
        public static void main(String[] args) {
            Hero[] heroes = {
                    new Warrior(300, 50, "CRITICAL DAMAGE"),
                    new Magic(250, 40, "FIREBALL"),
                    new Medic(200, 20, "HEAL", 100)
            };

            for (Hero hero : heroes) {
                hero.applySuperAbility();


                if (hero instanceof Medic) {
                    Medic medic = (Medic) hero;
                    medic.increaseExperience();
                }
            }
        }
    }

