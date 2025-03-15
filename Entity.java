public abstract class Entity {
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;

    public Entity(String name, int health, int damage, int defense) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
    }
    public void attack(Entity target) {
        int damageDealt = this.damage - target.defense;
        if (damageDealt < 0) {
            damageDealt = 0;
        }

        target.health -= damageDealt;

        System.out.println(this.name + " : Berhasil menyerang " + target.name +
                ", sisa health " + target.name + " = " + target.health);

        if (target.health <= 0) {
            System.out.println("Target (" + target.name + ") sudah mati");
        }
    }

    public void heal() {
        int healAmount = 5;
        this.health += healAmount;
        System.out.println(this.name + " : Berhasil melakukan heal, nyawanya sekarang " + this.health);
    }

    public void displayInfo() {
        System.out.println("Nama = " + this.name);
        System.out.println("Class = " + this.getClass().getSimpleName());
        System.out.println("Health = " + this.health);
        System.out.println("Damage = " + this.damage);
        System.out.println("Defense = " + this.defense);
        System.out.println("=======================");
    }
}
