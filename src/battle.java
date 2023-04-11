public class battle {
<<<<<<< HEAD
    static int zhp;
    static int zf;
    static int zd;
    static boolean zl;
    static int php;
    static int pf;
    static int pd;
    static boolean pl;
=======

>>>>>>> ff96108 (Initial commit)
    static int damagez;
    static int damagep;


    public void battle(Person person, Zombie zombie) {
<<<<<<< HEAD
        zhp = zombie.hp;
        zf = zombie.force;
        zd = zombie.dexterity;
        zl = zombie.life;
        php = person.hp;
        pf = person.force;
        pd = person.dexterity;
        pl = person.life;
        damagez = zf * zd;
        damagep = pf * pd;





        for( ; zhp >= 0 && php >= 0 ; zhp = zhp - damagep, php = php -damagez )
=======

        damagez = zombie.force * zombie.dexterity;
        damagep = person.force * person.dexterity;

        for( ; zombie.hp >= 0 && person.hp >= 0 ; zombie.hp = zombie.hp - damagep, person.hp = person.hp -damagez )
>>>>>>> ff96108 (Initial commit)

    {
        System.out.println("bym");
        System.out.println("bam");
    }
<<<<<<< HEAD
        if ( zhp <= 0 ){
            System.out.println(" Person Win ");
            person.xp = person.xp + 15;
            person.hp = php;
=======
        if ( zombie.hp <= 0 ){
            System.out.println(" Person Win ");
            person.xp = person.xp + 15;

>>>>>>> ff96108 (Initial commit)
            person.coint = person.coint + 5;
        } else  {
            System.out.println( " Zombie win ");
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