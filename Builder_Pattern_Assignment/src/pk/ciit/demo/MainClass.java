package pk.ciit.demo;

import pk.ciit.builderpattern.Animal;
import pk.ciit.builderpattern.AnimalBuilder;
import pk.ciit.builderpattern.MonkeyBuilder;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalBuilder aAnimal = new MonkeyBuilder();
		Animal monkey = aAnimal.monkeyBuilder();
		System.out.println("Git Version 2");
	

	}

}
