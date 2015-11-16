package pk.ciit.builderpattern;

public abstract class Animal {
	String arm, body, head, leg, tail;

	public String getArm() {
	
		
		return arm+"Hello World";
	}

	public void setArm(String arm) {
		this.arm = arm;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getLeg() {
		return leg;
	}

	public void setLeg(String leg) {
		this.leg = leg;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	abstract void eat();

	abstract void showMe();
}
