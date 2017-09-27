package fortune;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneTellerController {
  private final AtomicLong requestCount = new AtomicLong();

  @RequestMapping("/fortune")
  /* This method is going to give us back a FortuneTeller that is basically
  serialized back into a JSON response. The name parameter in the request is
  bound to name */
  public FortuneTeller fortuneTeller(@RequestParam(value = "name", defaultValue = "Foo!") String name) {
    return new FortuneTeller(requestCount.incrementAndGet(), name);
  }

}