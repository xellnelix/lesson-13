package ru.otus.lesson13.transport;

import ru.otus.lesson13.Human;
import ru.otus.lesson13.TerrainType;

import java.util.List;

public class Bike implements Transport {
	private Human driver;
	private static final List<TerrainType> IMPASSABLE_TERRAIN_TYPES = List.of(TerrainType.SWAMP);

	public Bike(Human driver) {
		this.driver = driver;
	}

	private boolean checkTerrain(TerrainType type) {
		return IMPASSABLE_TERRAIN_TYPES.contains(type);
	}

	@Override
	public boolean move(int distance, TerrainType type) {
		if (checkTerrain(type)) {
			System.out.println("Велосипед не может перемещаться по болоту");
			return false;
		}
		if (driver.getStamina() - distance < 0) {
			System.out.println("Велосипедист устал");
			return false;
		}
		driver.decreaseStamina(distance);
		System.out.println("Пройденная дистанция: " + distance + " м. Выносливость велосипедиста: " + driver.getStamina());
		return true;
	}

	@Override
	public String toString() {
		return "Велосипед";
	}
}
