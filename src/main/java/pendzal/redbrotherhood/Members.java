package pendzal.redbrotherhood;

import pendzal.redbrotherhood.Model.BloodType;
import pendzal.redbrotherhood.Model.Faction;
import pendzal.redbrotherhood.Model.Person;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Members {

  //TODO: hardcoded for now, need to build a database connection

  static HashMap<Integer, Person> members = new HashMap<>();

  static {
    members.put(0, new Person(0, "Zethvlak", "Blavik", "Seth", null, null, null, null, Faction.PENDZAL, "Economy", "Team Lead", BloodType.OPLUS, new String[] {"Bossy", "Strong build", "Officer"}));
    members.put(1, new Person(1, "Viktor", "Lantsov", "Vlan", null, null, null, null, Faction.PENDZAL, "Self Taught IT", "IT specialist", BloodType.APLUS, new String[] {"Focussed on IT (in the zone)", "Tall", "Slender"}));
  };


  /* Members
   * @return: a list of all the team members.
   */
  public static HashMap<Integer, Person> getMembers()
  {
    return members;
  }

  public static Person getMember(int id) {
    if (members.containsKey(id))
      return members.get(id);

    return null;
  }
}
