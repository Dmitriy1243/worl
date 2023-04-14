public class battle {

    static boolean pl;

    static int damagez;
    static int damagep;


    public void battle(Person person, Zombie zombie) {

        pl = person.life;

            damagez = zombie.force * zombie.dexterity;
            damagep = person.force * person.dexterity;

        for (; zombie.hp >= 0 && person.hp >= 0; zombie.hp = zombie.hp - damagep, person.hp = person.hp - damagez) {
            System.out.println("bym");
            System.out.println("bam");
        }

            if (zombie.hp <= 0) {
                System.out.println(" Person Win ");
                person.xp = person.xp + 15;
                person.coint = person.coint + 5;
            } else {
                System.out.println(" Zombie win ");
                person.life = false;
            }
            if (person.xp >= 50) {
                person.xp = person.xp - 50;
                person.level++;
                person.force++;
                person.dexterity++;
                person.hp = person.polhp;
            }

    }
}