class Archer extends Entity {
    public Archer(String name) {
        super(name, 10, 15, 1);
    }

    public void doubleShot(Entity target) {
        System.out.println(this.name + " : RASAKAN DOUBLE SHOT KU");
        this.attack(target);
        if (target.health > 0) {
            this.attack(target);
        }
    }
}