public class battle_3 {
    static int rhp;
    static int rf;
    static int rd;
    static boolean rl;
    static int php;
    static int pf;
    static int pd;
    static boolean pl;
    static int damager;
    static int damagep;

    public void battle(Person person, Rooster rooster) {
        rhp = rooster.hp;
        rf = rooster.force;
        rd = rooster.dexterity;
        rl = rooster.life;
        php = person.hp;
        pf = person.force;
        pd = person.dexterity;
        pl = person.life;
        damager = rf * rd;
        damagep = pf * pd;

        for(; rhp >= 0 && php >= 0; rhp = rhp - damagep, php = php - damager)

        {
            System.out.println("bym");
            System.out.println("bam");
        }
        if ( rhp <= 0 ){
            System.out.println(" Person Win ");
            person.xp = person.xp + 10;
            person.hp = php;
            person.coint = person.coint + 10;
        } else  {
            System.out.println( " rooster win ");
            person.life = false ;
        }

        if (person.xp >= 50){
            person.xp = person.xp - 50;
            person.level ++;
            person.force ++;
            person.dexterity ++;
            person.hp = person.polhp;
        }

    }


}
