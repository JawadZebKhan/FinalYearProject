package pk.ciit.builderpattern;

public class Kid {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal makeAnimal(AnimalBuilder animalBuilder) {
		if (!name.isEmpty()) {
			System.out.println("My Name Is : " + name);
		}
		
		Monkey monkeyBuilder = animalBuilder.monkeyBuilder();
		monkeyBuilder.eat();
		
		return null;

	}
}
