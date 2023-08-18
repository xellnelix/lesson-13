package ru.otus.lesson13.transport;

import ru.otus.lesson13.TerrainType;

public class Car implements Transport {
	private int fuel;

	public Car(int fuel) {
		this.fuel = fuel;
	}

	@Override
	public boolean move(int distance, TerrainType type) {
		if (type == TerrainType.FOREST || type == TerrainType.SWAMP) {
			System.out.println("Машина может перемещаться только по равнине");
			return false;
		}
		if (fuel - distance < 0) {
			System.out.println("Не хватает топлива");
			return false;
		}
		fuel -= distance;
		System.out.println("Пройденная дистанция: " + distance + " м. Запас топлива: " + fuel);
		return true;
	}

	@Override
	public String toString() {
		return "Машина";
	}
}
