package ru.otus.lesson13;

import ru.otus.lesson13.transport.Transport;

public class Human {
	private String name;
	private Transport currentTransport;
	private int stamina;

	public Human(String name, int stamina) {
		this.name = name;
		currentTransport = null;
		this.stamina = stamina;
	}

	public int getStamina() {
		return stamina;
	}

	public void decreaseStamina(int value) {
		stamina -= value;
	}

	public void chooseTransport(Transport transport) {
		if (currentTransport == null) {
			System.out.println("Выбран транспорт: " + transport);
			currentTransport = transport;
			return;
		}
		if (currentTransport == transport) {
			System.out.println("Нельзя выбрать используемый транспорт");
			return;
		}
		System.out.println("Сначала необходимо покинуть транспорт");
	}

	public void leaveTransport() {
		if (currentTransport == null) {
			System.out.println("Транспорт уже покинут");
			return;
		}
		System.out.println("Покинут транспорт: " + currentTransport);
		currentTransport = null;
	}

	public boolean move(int distance, TerrainType type) {
		if (currentTransport == null) {
			System.out.println("Транспорт не выбран, попытка пройти пешком " + distance + " м.");
			return true;
		}
		return currentTransport.move(distance, type);
	}
}
