public class Mage extends PlayerClass {

    public Mage(int damage){
        super(damage);
    }

    @Override
    public float calcDamage() {
        return this.damageBase + ((this.guild.damageIncrementPercent() / 100) * this.damageBase);
    }
}
