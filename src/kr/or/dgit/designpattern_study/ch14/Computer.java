package kr.or.dgit.designpattern_study.ch14;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice {
	private List<ComputerDevice> components = new ArrayList<>();
	
	public void addComponent(ComputerDevice component) {
		components.add(component);
	}
	
	public void removeComponent(ComputerDevice component) {
		components.remove(component);
	}
		
	@Override
	public int getPrice() {
		int price = 0;
		for(ComputerDevice cd : components) {
			price += cd.getPrice();
		}
		
		return price;
	}

	@Override
	public int getPower() {
		int power = 0;
		for(ComputerDevice cd : components) {
			power += cd.getPower();
		}
		
		return power;
	}

}
