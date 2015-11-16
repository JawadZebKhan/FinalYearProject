package pk.ciit.builderpattern;

public abstract class AnimalBuilder {
	Animal aAnimal;

	abstract void buildAnimalArm();

	abstract void buildAnimalBody();

	abstract void buildAnimalHeader();

	abstract void buildAnimalLeg();

	abstract void buildAnimalTail();

	public abstract Monkey monkeyBuilder();

	public abstract Kitten kittenBuilder();

}
