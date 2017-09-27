package fortune;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FortuneTellerTest { 
  @Test
  public void shouldTellYourFortune() {
    FortuneTeller teller = new FortuneTeller(0, "moses");
    assertEquals("You will have an opportunity to prove yourself soon, moses", teller.tellFortune());
  }

  @Test
  public void shouldReturnId(){
    FortuneTeller teller = new FortuneTeller(22, "foobar");
    assertEquals(22, teller.getId());
  }
}