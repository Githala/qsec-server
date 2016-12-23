package pendzal.redbrotherhood;

import pendzal.redbrotherhood.Model.BloodType;
import pendzal.redbrotherhood.Model.Faction;
import pendzal.redbrotherhood.Model.Person;

import java.util.Collection;
import java.util.HashMap;

public class People {

  //TODO: hardcoded for now, need to build a database connection

  static HashMap<Integer, Person> people = new HashMap<>();

  static {
    people.put(0, new Person(0, "Zethvlak", "Blavik", "Seth", null, null, null, null, Faction.PENDZAL, "Economy", "Team Lead", BloodType.OPLUS, new String[] {"Bossy", "Strong build", "Officer"}));
    people.put(1, new Person(1, "Viktor", "Lantsov", "Vlan", null, null, null, null, Faction.PENDZAL, "Self Taught IT", "IT specialist", BloodType.APLUS, new String[] {"Focussed on IT (in the zone)", "Tall", "Slender"}));
    people.put(2, new Person(2, "John", "Doe", "jd", null, null, null, null, Faction.NONE, null,null, BloodType.UNKNOWN, null));
    people.put(3, new Person(3, "Jane", "Doe", "jd", null, null, null, null, Faction.NONE, null,null, BloodType.UNKNOWN, null));
  };


  /* Members
   * @return: a list of all the team members.
   */
  public static Collection<Person> getPeople()
  {
    return people.values();
  }

  public static Person getPeople(int id) {
    if (people.containsKey(id))
      return people.get(id);

    return null;
  }
}

