package assignment4java.sol;

public class CapitalCity {
	private String ccname;
	private long population;
	private String brief;

	public CapitalCity(String ccname, long population, String brief) {
		super();
		this.ccname = ccname;
		this.population = population;
		this.brief = brief;
	}

	public String getCcname() {
		return ccname;
	}

	public void setCcname(String ccname) {
		this.ccname = ccname;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	@Override
	public String toString() {
		return "CapitalCity [ccname=" + ccname + ", population=" + population + ", brief=" + brief + "]";
	}
}
