package ru.otus.lesson13.transport;

import ru.otus.lesson13.TerrainType;

import java.util.List;

public class Horse implements Transport {
	private int stamina;
	private static final List<TerrainType> IMPASSABLE_TERRAIN_TYPES = List.of(TerrainType.SWAMP);
	public Horse(int stamina) {
		this.stamina = stamina;
	}

	private boolean checkTerrain(TerrainType type) {
		return IMPASSABLE_TERRAIN_TYPES.contains(type);
	}

	@Override
	public boolean move(int distance, TerrainType type) {
		if (checkTerrain(type)) {
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
