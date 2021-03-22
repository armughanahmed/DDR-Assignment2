
public class ACircle extends AShape{
	private double radius;
	public ACircle() {
		ptX=0;
		ptY=0;
		this.radius=1;
	}

    ACircle(double ptX, double ptY, double radius) {
        this.ptX = ptX;
        this.ptY = ptY;
        this.radius=radius;
    }
	@Override
	public double Area() {
        return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double Perimeter() {
        return 2 * Math.PI * radius;
	}

	@Override
	public boolean holds(double ptX, double ptY) {
        return Math.sqrt(Math.pow(ptX - this.ptX, 2) + Math.pow(ptY - this.ptY, 2)) < radius;
	}
	
	public boolean holds(ACircle c) {
        return Math.sqrt(Math.pow(c.getPtX() - ptX, 2) + Math.pow(c.getPtY() - ptY, 2)) <= Math.abs(radius - c.getRadius());
    }

    public boolean covers(ACircle c) {
        return Math.sqrt(Math.pow(c.getPtX() - ptX, 2) + Math.pow(c.getPtY() - ptY, 2)) <= radius + c.getRadius();
    }

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
