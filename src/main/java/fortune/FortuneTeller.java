package fortune;

public class FortuneTeller {
  private final long id;
  private final String requesterName;

  public FortuneTeller(long id, String requesterName){
    this.id = id;
    this.requesterName = requesterName;
  }

  public long getId(){
    return this.id;
  }

  public String getFortune(){
    return "You will have a very wonderful day today, " + this.requesterName + "!";
  }
}