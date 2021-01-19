package Assignment2;

public class ComboLock {
	
	int secret1, secret2, secret3;
	int num1=0, num2=0, num3=0, key=0, point=0;

	public ComboLock(int secret1, int secret2, int secret3) { 
		
		this.secret1= secret1;
		this.secret2= secret2;
		this.secret3= secret3;
	}
	public void reset() { 
		
		this.point=0;	
	}
	public void turnLeft(int ticks) { 
					
			
			this.point-=ticks;
			num2= Math.abs(point);
			key++;
			System.out.println("Pointing at: "+ this.num2+ " towards the left");
		
	}
	public void turnRight(int ticks) { 
		
		if(key==0) {
			
			this.point+=ticks;
			num1= Math.abs(point);
			System.out.println("Pointing at: "+ this.num1 + " towards the right");
		}
		
		else if(key==1) {
			
			this.point+=ticks;
			num3= Math.abs(point);
			key=0;
			System.out.println("Pointing at: "+ this.num3+ " towards the right");
		}
		
	}
	public boolean open() { 
		
		if(num1==secret1 && num2==secret2 && num3==secret3) {
			System.out.println("Opened");
			return true;
		}
		else {
			System.out.println("Failed\nPointing at 0");			
			this.reset();
			return false;
		}
		
	}
}
