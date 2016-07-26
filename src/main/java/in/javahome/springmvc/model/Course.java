package in.javahome.springmvc.model;

public class Course {
	private String name;
	private Double cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", cost=" + cost + "]";
	}
	
	
	
}
