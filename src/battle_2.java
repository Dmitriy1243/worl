public class battle_2 {

    static boolean pl;
    static int damageb;
    static int damagep;

    public void battle(Person person, Big_fly big_fly) {

        pl = person.life;
        damageb = big_fly.force * big_fly.dexterity;
        damagep = person.force * person.dexterity;

        for (; big_fly.hp >= 0 && person.hp >= 0; big_fly.hp = big_fly.hp - damagep, person.hp = person.hp - damageb) {
            System.out.println("bym");
            System.out.println("bam");
        }
            if (big_fly.hp <= 0) {
                System.out.println(" Person Win ");
                person.xp = person.xp + 10;
                person.coint = person.coint + 10;
            } else {
                System.out.println(" fly win ");
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
