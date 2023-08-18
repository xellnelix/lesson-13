package ru.otus.lesson13;

import ru.otus.lesson13.transport.Car;
import ru.otus.lesson13.transport.Bike;
import ru.otus.lesson13.transport.Horse;
import ru.otus.lesson13.transport.Offroadster;

public class Main {
	public static void main(String[] args) {
		Human human = new Human("TestName", 100);
		Car car = new Car(100);
		Bike bike = new Bike(human);
		Horse horse = new Horse(100);
		Offroadster offroadster = new Offroadster(200);

		human.chooseTransport(car);
		human.chooseTransport(car);
		human.leaveTransport(car);
		human.leaveTransport(car);
		System.out.println(human.move(50, TerrainType.PLAIN));
		human.chooseTransport(car);
		System.out.println(human.move(100, TerrainType.PLAIN));
		human.leaveTransport(car);
		human.chooseTransport(bike);
		System.out.println(human.move(10, TerrainType.SWAMP));
		System.out.println(human.move(10, TerrainType.FOREST));
		System.out.println(human.move(100, TerrainType.FOREST));
		human.leaveTransport(car);
		human.leaveTransport(bike);
		human.chooseTransport(horse);
		System.out.println(human.move(100, TerrainType.FOREST));
		System.out.println(human.move(10, TerrainType.PLAIN));
		human.leaveTransport(horse);
		human.chooseTransport(offroadster);
		System.out.println(human.move(150, TerrainType.SWAMP));

	}
}
