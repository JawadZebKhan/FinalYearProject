package pk.ciit.builderpattern;

public class KittenBuilder extends AnimalBuilder {

	@Override
	void buildAnimalArm() {
		System.out.println("Building Kitten Arm");
	}

	@Override
	void buildAnimalBody() {
		System.out.println("Building Kitten Body");
	}

	@Override
	void buildAnimalHeader() {
		System.out.println("Building Kitten Header");
	}

	@Override
	void buildAnimalLeg() {
		System.out.println("Building Kitten Leg");
	}

	@Override
	void buildAnimalTail() {
		System.out.println("Building Kitten Tail");
	}

	public Kitten kittenBuilder() {
		Kitten k = new Kitten();
		k.setArm("Kitten Arm.");
		k.setBody("Kitten Body.");
		k.setHead("Kitten Header.");
		k.setLeg("Kitten Legs.");
		k.setTail("Kitten Tail.");
		aAnimal = k;
		return k;
	}

	@Override
	public Monkey monkeyBuilder() {
		// TODO Auto-generated method stub
		return null;
	}
}
