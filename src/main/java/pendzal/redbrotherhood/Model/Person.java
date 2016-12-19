package pendzal.redbrotherhood.Model;


public class Person {
  public final int id;
  public final String firstname;
  public final String lastname;

  public final String alias;

  public final Address placeOfBirth;
  public final FrontierDate  dateOfBirth;

  public final Person father;
  public final Person mother;

  public final Faction faction;

  public final String education;
  public final String job;

  public final BloodType bloodType;

  public final String[] characteristics;

  public Person(int id, String firstname, String lastname, String alias, Address placeOfBirth, FrontierDate dateOfBirth, Person father, Person mother, Faction faction, String education, String job, BloodType bloodType, String[] characteristics) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.alias = alias;
    this.placeOfBirth = placeOfBirth;
    this.dateOfBirth = dateOfBirth;
    this.father = father;
    this.mother = mother;
    this.faction = faction;
    this.education = education;
    this.job = job;
    this.bloodType = bloodType;
    this.characteristics = characteristics;
  }
}
