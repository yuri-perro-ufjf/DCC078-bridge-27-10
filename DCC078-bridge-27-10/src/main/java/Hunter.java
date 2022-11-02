public class Hunter extends PlayerClass {

    public Hunter(int damage){
        super(damage);
    }

    @Override
    public float calcDamage() {
        return this.damageBase;
    }
}
