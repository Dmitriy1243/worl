abstract class Monster  {
    static String name ;
    static int hp ;
    static int force ;
    static int dexterity ;
    boolean life = true;

    public Monster(String name, int hp, int force, int dexterity) {

        //System.out.println(" Person " + name + " hp " + hp + " force " + force + " dexterity " + dexterity);
    }

     Monster(String name) {
        this.name = name;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            life = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        }
        return false;
    }

    public boolean isDestroyed(){
        return life;
    }

// System.out.println("Monster  was created");
}