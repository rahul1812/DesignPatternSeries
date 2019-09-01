package SoliderGameProblem;

public class Soldier {

	private String soldierType;
	private Refile refile;
	private Repair repair;
	
	public Soldier(){}
	public Soldier(String soldierType, Refile refile, Repair repair) {
		super();
		this.soldierType = soldierType;
		this.refile = refile;
		this.repair = repair;
	}
	
	public void attack(){
		System.out.println("attack");
	}
	public void gather(){
		System.out.println("gather");
	}
	
	public void refile(){
		refile.refile();
	}
	public void repair(){
	  repair.repair();
	}
	public String getSoldierType() {
		return soldierType;
	}
	
}
