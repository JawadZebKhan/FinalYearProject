package pk.ciit.builderpattern;

public class MonkeyBuilder extends AnimalBuilder {

	@Override
	void buildAnimalArm() {
		System.out.println("Building Monkey Arm");
	}

	@Override
	void buildAnimalBody() {
		System.out.println("Building Monkey Body");
	}

	@Override
	void buildAnimalHeader() {
		System.out.println("Building Monkey Header");
	}

	@Override
	void buildAnimalLeg() {
		System.out.println("Building Monkey Leg");
	}

	@Override
	void buildAnimalTail() {
		System.out.println("Building Monkey Tail");
	}

	public Monkey monkeyBuilder() {
		Monkey m = new Monkey();
		m.setArm("Monkey Arm.");
		m.setBody("Monkey Body.");
		m.setHead("Monkey Header.");
		m.setLeg("Monkey Legs.");
		m.setTail("Monkey Tail.");
		aAnimal = m;
		return m;
	}

	@Override
	public Kitten kittenBuilder() {
		// TODO Auto-generated method stub
		return null;
	}
}
