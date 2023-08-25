package ru.otus.lesson13.transport;

import ru.otus.lesson13.TerrainType;

public interface Transport {
	boolean move(int distance, TerrainType type);
}
