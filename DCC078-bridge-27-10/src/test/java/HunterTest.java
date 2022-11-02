import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HunterTest {

    @Test
    void shouldBeReturnHunterDamageWithNorthGuild(){
        NorthGuild northGuild = new NorthGuild();
        Hunter hunter = new Hunter(100);
        hunter.setGuild(northGuild);

        assertEquals(100.0f, hunter.calcDamage());
    }

    @Test
    void shouldBeReturnHunterDamageWithSouthGuild(){
        SouthGuild south = new SouthGuild();
        Hunter hunter = new Hunter(110);
        hunter.setGuild(south);

        assertEquals(110.0f, hunter.calcDamage());
    }
}