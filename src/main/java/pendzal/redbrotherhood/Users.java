package pendzal.redbrotherhood;

import pendzal.redbrotherhood.Model.BloodType;
import pendzal.redbrotherhood.Model.Faction;
import pendzal.redbrotherhood.Model.Person;
import pendzal.redbrotherhood.Model.User;
import pendzal.redbrotherhood.People;

import java.util.Collection;
import java.util.HashMap;

public class Users {

  //TODO: hardcoded for now, need to build a database connection

  /* Users
   * @return: a list of all the team members.
   */
  static HashMap<String, User> users = new HashMap<>();

  static {
    users.put("vlan", new User("vlan", "lskjflkaj", People.getPeople(1)));
    users.put("seth", new User("seth", "adsfaasdf", People.getPeople(0)));
  };
  public static User getUser(String username)
  {
    if (users.containsKey(username))
      return users.get(username);

    return null;
  }

  public static Collection<User> getUsers() {
    return users.values();
  }
}

