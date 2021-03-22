
public class ARectangle {
	
	private double ptX;
	private double ptY;
	private double wd;
	private double ht;
	public ARectangle() {
		ptX=0;
		ptY=0;
		wd=1;
		ht=1;
	}
	
	public ARectangle(double ptX,double ptY,double wd,double ht) {
		this.ptX=ptX;
		this.ptY=ptY;
		this.wd=wd;
		this.ht=ht;
	}


	public double Area() {
		return wd*ht;
	}
	
	
	public double Perimeter() {
		return 2*(wd+ht);
	}
	
	public boolean holds(double ptX, double ptY) {
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
	
	public double getPtX() {
		return ptX;
	}

	public void setPtX(double ptX) {
		this.ptX = ptX;
	}

	public double getPtY() {
		return ptY;
	}

	public void setPtY(double ptY) {
		this.ptY = ptY;
	}

	public double getWd() {
		return wd;
	}

	public void setWd(double wd) {
		this.wd = wd;
	}

	public double getHt() {
		return ht;
	}

	public void setHt(double ht) {
		this.ht = ht;
	}
	
}
