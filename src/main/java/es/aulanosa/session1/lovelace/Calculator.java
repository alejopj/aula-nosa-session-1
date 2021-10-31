package es.aulanosa.session1.lovelace;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	public Double add(Double a, Double b) {
		
		Double safeA = getSafeOperand(a);
		Double safeB = getSafeOperand(b);
		
		return safeA + safeB;
	}
	
	public Double subtract(Double a, Double b) {
		
		Double safeA = getSafeOperand(a);
		Double safeB = getSafeOperand(b);
		
		return safeA - safeB;
	}
	
	public Double multiply(Double a, Double b) {
		
		Double safeA = getSafeOperand(a);
		Double safeB = getSafeOperand(b);
		
		return safeA * safeB;
	}
	
	public Double divide(Double a, Double b) {
		
		Double safeA = getSafeOperand(a);
		Double safeB = getSafeOperand(b);
		
		if (safeA.equals(0.0) && safeB.equals(0.0)) {
			return null;
		} else if (safeB.equals(0.0)) {
			return Double.MAX_VALUE;
		}
		
		return safeA / safeB;
	}
	
	public List<Double> add(List<Double> a, List<Double> b) {
		
		List<Double> c = new ArrayList<>();
		
		for (int i = 0; i < a.size(); i++) {
			
			c.add(add(a.get(i), b.get(i)));
		}
		
		return c;
	}
	
	public List<Double> subtract(List<Double> a, List<Double> b) {
		
		List<Double> c = new ArrayList<>();
		
		for (int i = 0; i < a.size(); i++) {
			
			c.add(subtract(a.get(i), b.get(i)));
		}
		
		return c;
	}
	
	public List<Double> multiply(List<Double> a, List<Double> b) {
		
		List<Double> c = new ArrayList<>();
		
		for (int i = 0; i < a.size(); i++) {
			
			c.add(multiply(a.get(i), b.get(i)));
		}
		
		return c;
	}
	
	public List<Double> divide(List<Double> a, List<Double> b) {
		
		List<Double> c = new ArrayList<>();
		
		for (int i = 0; i < a.size(); i++) {
			
			c.add(divide(a.get(i), b.get(i)));
		}
		
		return c;
	}
	
	private Double getSafeOperand(Double operand) {
		
		return operand != null ? operand : 0.0;
	}
	
}
