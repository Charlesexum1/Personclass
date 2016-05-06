public class Person {
		
	private String name;
	private int age;
	
	public Person() {
		name = "No name yet.";
		age = 0;
		}
	public Person(int newAge, String newName) {
		name = newName;
		age = newAge;
		}
	public Person(int newAge) {
		age = newAge;
		}	
	public Person(String newName) {
		name = newName;
		}	
	
	public static Person createAdult() {
		return new Person(21, "Otis Clear-Britches");		
		}
	public static Person createToddler() {
		return new Person(2, "wee baby!");
		}
	public static Person createPreschooler(){
		return new Person(4, "Henry Oxenhorn");
		}
	public static Person createAdolescent() {
		return new Person(12, "Mira Rugburner");
		}
	public static Person createTeen() {
		return new Person (16, "Alexander Bucks-A-Plenty");
		}					
			
	
	public void setInfo(String newName, int newAge) { // mutator method
		name = newName;
		age = newAge;
		}
	public void setFullName(String firstandlast) {
		name = firstandlast;
		}
	public void setName(String first, String last){
		name = first + " " + last;
		}	
	public void setAge(int newAge) {
		age = newAge;
		}	
	public int getAge() { // accessor method
		return age;
		}
	public String getName() { // "" ""
		return name;
		}
	public boolean comparePeople(Person otherPerson){
		return (this.name.equals(otherPerson.name)) &&
			   (this.age == otherPerson.age);
		}	
	public boolean compareNames(Person otherPerson){
		return (this.name.equals(otherPerson.name));
		}
	public boolean compareAge(Person otherPerson){
		return (this.age == otherPerson.age);
		}
	public boolean isOlder(Person otherPerson){
		return (this.age > otherPerson.age);
		}
	public boolean isYounger(Person otherPerson){
		return (this.age < otherPerson.age);
		}							
		
	
	public static void main (String args[]) {
		Person Graf = new Person();
		Graf.setInfo("Charles DeGrapharee Exum", 26);
		System.out.println(Graf.getAge() + " " + Graf.getName());
		Person alsoGraf = new Person();
		alsoGraf.setInfo("Graf", 26);
		System.out.println(alsoGraf.comparePeople(Graf));
		System.out.println(alsoGraf.compareNames(Graf));
		System.out.println(alsoGraf.compareAge(Graf));
		System.out.println(alsoGraf.isOlder(Graf));
		System.out.println(alsoGraf.isYounger(Graf));
		Person adult = Person.createAdult();
		System.out.println(adult.getName());
		
		
	}
}
