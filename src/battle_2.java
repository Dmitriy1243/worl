public class battle_2 {
<<<<<<< HEAD
    static int bhp;
    static int bf;
    static int bd;
    static boolean bl;
    static int php;
    static int pf;
    static int pd;
    static boolean pl;
=======

>>>>>>> ff96108 (Initial commit)
    static int damageb;
    static int damagep;

    public void battle(Person person, Big_fly big_fly) {
<<<<<<< HEAD
        bhp = big_fly.hp;
        bf = big_fly.force;
        bd = big_fly.dexterity;
        bl = big_fly.life;
        php = person.hp;
        pf = person.force;
        pd = person.dexterity;
        pl = person.life;
        damageb = bf * bd;
        damagep = pf * pd;

        for(; bhp >= 0 && php >= 0; bhp = bhp - damagep, php = php - damageb)
=======

        damageb = big_fly.force * big_fly.dexterity;
        damagep = person.force * person.dexterity;

        for(; big_fly.hp >= 0 && person.hp >= 0; big_fly.hp = big_fly.hp - damagep, person.hp = person.hp - damageb)
>>>>>>> ff96108 (Initial commit)

    {
        System.out.println("bym");
        System.out.println("bam");
    }
<<<<<<< HEAD
        if ( bhp <= 0 ){
            System.out.println(" Person Win ");
            person.xp = person.xp + 10;
            person.hp = php;
=======
        if ( big_fly.hp <= 0 ){
            System.out.println(" Person Win ");
            person.xp = person.xp + 10;

>>>>>>> ff96108 (Initial commit)
            person.coint = person.coint + 10;
        } else  {
            System.out.println( " fly win ");
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