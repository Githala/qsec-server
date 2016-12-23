package pendzal.redbrotherhood.Model;

public class User {
  public final String username;
  public final String passkey;
  public final Person person;



  public User(String username, String passkey, Person person) {
    this.person = person;
    this.username = username;
    this.passkey = passkey;
  }
}
