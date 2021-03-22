
public class ARectangle {
	
	private float ptX;
	private float ptY;
	private float wd;
	private float ht;
	public ARectangle() {
		ptX=0;
		ptY=0;
		wd=1;
		ht=1;
	}
	
	public ARectangle(float ptX,float ptY,float wd,float ht) {
		this.ptX=ptX;
		this.ptY=ptY;
		this.wd=wd;
		this.ht=ht;
	}


	public float Area() {
		return wd*ht;
	}
	
	
	public float Perimeter() {
		return 2*(wd+ht);
	}
	
	public boolean holds(float ptX, float ptY) {
        return Math.sqrt(Math.pow(this.ptY - ptY, 2)) <= ht / 2 && Math.sqrt(Math.pow(this.ptX - ptX, 2)) <= wd / 2;
    }
	
	public boolean holds(ARectangle rect) {
        return Math.sqrt(Math.pow(ptY - rect.getPtY(), 2))+ rect.getHt() / 2 <= ht / 2
                && Math.sqrt(Math.pow(ptX - rect.getPtX(), 2)) + rect.getWd() / 2 <= wd / 2 && ht / 2 + rect.getHt() / 2 <= ht
                && wd / 2 + rect.getWd() / 2 <= wd;
    }

    public boolean covers(ARectangle rect) {
        return !holds(rect) && ((ptX + wd / 2 > rect.getPtX() - rect.getWd()) || (ptY + ht / 2 > rect.getPtY() - rect.getHt()))
                && (Math.sqrt(Math.pow(ptY - rect.getPtY(), 2)) < ht / 2 + rect.getHt() / 2)
                && (Math.sqrt(Math.pow(ptX - rect.getPtX(), 2))< wd / 2 + rect.getWd() / 2);
    }
	
	public float getPtX() {
		return ptX;
	}

	public void setPtX(float ptX) {
		this.ptX = ptX;
	}

	public float getPtY() {
		return ptY;
	}

	public void setPtY(float ptY) {
		this.ptY = ptY;
	}

	public float getWd() {
		return wd;
	}

	public void setWd(float wd) {
		this.wd = wd;
	}

	public float getHt() {
		return ht;
	}

	public void setHt(float ht) {
		this.ht = ht;
	}


	public static void main(String[] args) {
		
	}
	
}
