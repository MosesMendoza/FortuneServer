package fortune;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FortuneTellerTest { 
  @Test
  public void shouldTellYourFortune() {
    FortuneTeller teller = new FortuneTeller(0, "moses");
    assertEquals("You will have a very wonderful day today, moses!", teller.getFortune());
  }

  @Test
  public void shouldReturnId(){
    FortuneTeller teller = new FortuneTeller(22, "foobar");
    assertEquals(22, teller.getId());
  }
}