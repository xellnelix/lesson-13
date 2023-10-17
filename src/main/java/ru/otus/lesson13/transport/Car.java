package ru.otus.lesson13.transport;

import ru.otus.lesson13.TerrainType;

import java.util.List;

public class Car implements Transport {
	private int fuel;
	private static final List<TerrainType> IMPASSABLE_TERRAIN_TYPES = List.of(TerrainType.SWAMP, TerrainType.FOREST);

	public Car(int fuel) {
		this.fuel = fuel;
	}

	private boolean checkTerrain(TerrainType type) {
		return IMPASSABLE_TERRAIN_TYPES.contains(type);
	}

	@Override
	public boolean move(int distance, TerrainType type) {
		if (checkTerrain(type)) {
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
