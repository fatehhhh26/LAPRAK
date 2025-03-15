class Tank extends Entity {
    public Tank(String name) {
        super(name, 20, 5, 5);
    }
    public void taunt() {
        System.out.println(this.name + " : TAUNTT!!, defense bertambah 5");
        this.defense += 5;
    }
}