public abstract class PlayerClass {
    protected Guild guild;
    protected int damageBase;

    public PlayerClass(int damageBase){
        this.damageBase = damageBase;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public void setDamageBase(int damageBase) {
        this.damageBase = damageBase;
    }

    public abstract float calcDamage();
}
