package notBattleship;

public class AircraftCarrier extends Boat implements Attacker {
	private boolean hasPlanes;
	private double successRate = 1;
	
	public AircraftCarrier(int team, Coordinates location, int direction) {
		super(team, location, direction, 5, 1, 1);
		this.hasPlanes = true;
	}
	
	public String getID() {
		return "A" + this.getTeam();
	}
	
	public String getActions() {
		String ret1 = "Choose any of the following actions for the Aircraft Carrier:\n";
		String ret2 = "1. Move\n";
		String ret3 = "2. Turn left\n";
		String ret4 = "3. Turn right\n";
		String ret5 = "4. Launch planes\n";
		return ret1 + ret2 + ret3 + ret4 + ret5;
	}
	
	public String act(int[] choices, World w) {
		String result = "";
		int left = -1;
		int right = 1;
		int choice = choices[0];
		
		if (choice == 1) result += this.move(w);
		if (choice == 2) result += this.turn(left);
		if (choice == 3) result += this.turn(right);
		if (choice == 4) result += this.attack(w);
		
		return result;
	}
	
	public String attack(World w) {
		String result = "";

		int strength = this.getStrength();
		Boat opp;

		if (hasPlanes) {
			for (int i = 0; i < 8; i++) {
				if (w.getAdjacentLocation(getLocation(), i) != null) {
					opp = w.getOccupant(w.getAdjacentLocation(getLocation(), i));
					if (opp != null && opp.getTeam() != this.getTeam()) {
						if (successRate == 1) {
							result += "Air raid!\n";
							result += opp.takeHit(strength, w) + "\n";
						}
						successRate *= 0.8;
						
						if (Math.random() > successRate) {
							hasPlanes = false;
							result += "The planes have been destroyed. \n";
							break;
						}
						else {
							result += "Air raid!\n";
							result += opp.takeHit(strength, w) + "\n";
						}
					}
				}
			}
		} 
		else {
			result += this.getID() + " has no planes remaining. \n";
		}
		
		if (result.equals("")) {
			result = this.getID() + ": There are no boats in range currently. \n";
		}
		return result;
	}

	
//	public String attack(World w) {
//		String result = "";
//		
//		int strength = this.getStrength();
//		Boat opp;
//		
//		if (hasPlanes) {
//			for (int i = 0; i < 8; i++) {
////				Boat opp;
//				
//				if (w.getAdjacentLocation(getLocation(), i) != null) opp = w.getOccupant(w.getAdjacentLocation(getLocation(), i));
////				if (w.getOccupant(w.getAdjacentLocation(getLocation(), i)) != null) opp = w.getOccupant(w.getAdjacentLocation(getLocation(), i));
//				else opp = null;
//				
//				if (opp != null) {
//					if (opp.getTeam() != this.getTeam()) {
//						if (successRate == 1) {
//							result += "Air raid!\n";
//						}
//						result += opp.takeHit(strength, w) + "\n";
//						successRate *= 0.8;
//						
//						if (Math.random() > successRate) {
//							hasPlanes = false;
//							result += "The planes have been destroyed. \n";
//							break;
//						}
//					}
//				}
//				else result = this.getID() + ": There are no boats in range currently. \n";
//			}
//		}
//		if (!hasPlanes) {
//			result += this.getID() + " has no planes remaining. \n";
//		}
//		return result;
//	}
}