
import java.util.Scanner;

public class Main {
;
    static boolean lp = true;


    public static void main(String[] args) {


        int xod = 0 ;
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);


        while ( lp == true ) {
            lp = person.life;
            System.out.println( " ===    game menu     === " );
            System.out.println( " character information - 1" );
            System.out.println( " battle                - 2" );
            System.out.println( " boil the medicine     - 3" );
            System.out.println( " exit                  - 4" );
            System.out.println( "__________________________" );
            xod = scanner.nextInt();


            switch (xod) {

                case (1): // о персонаже
                    System.out.println( "____________________________________" );
                    System.out.println( " Person " + person.name );
                    System.out.println( " hp " + person.hp + "/" + person.polhp );
                    System.out.println( " force " + person.force );
                    System.out.println( " dexterity " + person.dexterity );
                    System.out.println( " level " + person.level);
                    System.out.println( "____________________________________" );
                    break;

                case (2): // бой
                    switch (person.level) {

                        case (0):

                            Big_fly big_fly = new Big_fly();
                            battle_2 battle_2 = new battle_2();
                            battle_2.battle(person, big_fly);

                            break;

                        case (1):

                            Zombie zombie = new Zombie();
                            battle battle = new battle();
                            battle.battle(person, zombie);

                            break;
                            case (2):

                            Rooster rooster = new Rooster();
                            battle_3 battle_3 = new battle_3();
                            battle_3.battle(person, rooster);

                            break;
                            case (3):

                                person.life = false;
                                System.out.println( "congrats you beat all the monsters bay ");

                            break;
                    }
                    break;


                case (3):

                    if (person.coint >= 20){
                    person.coint = person.coint - 20;
                    person.hp = person.hp + 15;}
                    else { System.out.println(" мало манет, нужно 20 у вас " + person.coint + "____" + person.hp + "__" + person.polhp);}
                    if ( person.hp > person.polhp ) {
                        person.polhp = person.hp;
                    }
                    System.out.println(" hp " + person.hp + "/" + person.polhp);
                    break;

                case (4):
                    person.life = false;
                    System.out.println( " bay ");
                    break;


            }
        }

    }
}


