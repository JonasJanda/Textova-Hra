
public class NPC {
	private String jmenoNPC;
	private boolean isItDead;
	private boolean pohlavy; //muz = true, zena = false
	
	public NPC(String jmenoNPC, boolean isItDead, boolean pohlavy) {
		super();
		this.jmenoNPC = jmenoNPC;
		this.isItDead = isItDead;
		this.pohlavy = pohlavy;
	}

	public boolean isItDead() {
		return isItDead;
	}

	public void setIsItDead(boolean isItDead) {
		this.isItDead = isItDead;
	}

	public boolean isPohlavy() {
		return pohlavy;
	}

	public void setPohlavy(boolean pohlavy) {
		this.pohlavy = pohlavy;
	}

	@Override
	public String toString() {
		if(isItDead = false) {
			return "Pred tebou stoji "+jmenoNPC+".";
		}else if(pohlavy = true){
			return "Pred tebou lezi mrtvy "+jmenoNPC+".";
		}else {
			return "Pred tebou lezi mrtva" +jmenoNPC+".";
		}
	}
}
