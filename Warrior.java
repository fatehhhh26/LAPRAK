class Warrior extends Entity {
    public Warrior(String name) {
        super(name, 15, 10, 3);
    }
    public void berserk() {
        System.out.println(this.name + " : BERSERKK!!, damage bertambah 5");
        this.damage += 5;
    }
}