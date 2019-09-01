package SoliderGameProblem;

public class SoliderSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Soldier swordMan =new Soldier("swordMan",null,null);
		System.out.println(swordMan.getSoldierType());
		swordMan.attack();
		swordMan.gather();
		
		System.out.println();
		Soldier robot=new Soldier("robot",new TimeBasedRefile(),new ExternalRepair());
		System.out.println(robot.getSoldierType());
		robot.attack();
		robot.gather();
		robot.refile();
		robot.repair();
		
		System.out.println();
		Soldier ironman=new Soldier("ironman",new WeaponBasedRefile(),new InternalRepair());
		System.out.println(ironman.getSoldierType());
		ironman.attack();
		ironman.gather();
		ironman.refile();
		ironman.repair();
	}

}
