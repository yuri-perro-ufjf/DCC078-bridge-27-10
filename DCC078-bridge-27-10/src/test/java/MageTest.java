import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    void shouldBeReturnMageDamageWithNorthGuild(){
        NorthGuild northGuild = new NorthGuild();
        Mage mage = new Mage(100);
        mage.setGuild(northGuild);

        assertEquals(110.5f, mage.calcDamage());
    }

    @Test
    void shouldBeReturnMageDamageWithSouthGuild(){
        SouthGuild southGuild = new SouthGuild();
        Mage mage = new Mage(100);
        mage.setGuild(southGuild);

        assertEquals(150.0f, mage.calcDamage());
    }
}