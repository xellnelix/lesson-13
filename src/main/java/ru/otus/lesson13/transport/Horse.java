package ru.otus.lesson13.transport;

import ru.otus.lesson13.TerrainType;

public class Horse implements Transport {
	private int stamina;

	public Horse(int stamina) {
		this.stamina = stamina;
	}

	@Override
	public boolean move(int distance, TerrainType type) {
		if (type == TerrainType.SWAMP) {
			System.out.println("Лошадь не может перемещаться по болоту");
			return false;
		}
		if (stamina - distance < 0) {
			System.out.println("Лошадь устала");
			return false;
		}
		stamina -= distance;
		System.out.println("Пройденная дистанция: " + distance + " м. Запас вынослвивости: " + stamina);
		return true;
	}

	@Override
	public String toString() {
		return "Лошадь";
	}
}