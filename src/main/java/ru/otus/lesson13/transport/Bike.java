package ru.otus.lesson13.transport;

import ru.otus.lesson13.Human;
import ru.otus.lesson13.TerrainType;

public class Bike implements Transport {
	private Human driver;

	public Bike(Human driver) {
		this.driver = driver;
	}

	@Override
	public boolean move(int distance, TerrainType type) {
		if (type == TerrainType.SWAMP) {
			System.out.println("Велосипед не может перемещаться по болоту");
			return false;
		}
		if (driver.getStamina() - distance < 0) {
			System.out.println("Велосипедист устал");
			return false;
		}
		driver.setStamina(driver.getStamina() - distance);
		System.out.println("Пройденная дистанция: " + distance + " м. Выносливость велосипедиста: " + driver.getStamina());
		return true;
	}

	@Override
	public String toString() {
		return "Велосипед";
	}
}
