import static org.junit.Assert.*;

import org.junit.Test;

public class DequeueImpTestCases {

	@Test
	public void testing1() {
		
		Dequeue d=new Dequeue(0);
		assertEquals(0, d.capacity);
	}
	
	@Test
	public void testing2() {
		
		Dequeue d=new Dequeue(2);
		assertEquals(2, d.capacity);
	}
	
	@Test
	public void testing3() {
		
		int n=50;
		Dequeue d=new Dequeue(n);
		assertEquals(n, d.capacity);
	}
	
	@Test
	public void addLeft1() {
	
		Dequeue d=new Dequeue(1);
		d.addLeft(1);
		assertEquals(1, d.capacity);
	}
	
	@Test
	public void addLeft2() {
	
		Dequeue d=new Dequeue(2);
		d.addLeft(1);
		d.addLeft(2);
		assertEquals(2, d.capacity);
	}

	@Test
	public void addLeft3() {
	
		int n=5;
		Dequeue d=new Dequeue(n);
		for(int i=0;i<5;i++) {
			d.addLeft(i);
		}
		
		assertEquals(n, d.capacity);
	}
	
	@Test
	public void addLeft4() {
	
		int n=50;
		Dequeue d=new Dequeue(n);
		int i=0;
		for(i=0;i<50;i++) {
			d.addLeft(i);
		}
		d.addLeft(i+1);
		assertEquals(n, d.capacity);
	}
	
	@Test
	public void addRight1() {
	
		Dequeue d=new Dequeue(1);
		d.addRight(1);
		assertEquals(1, d.capacity);
	}
	
	@Test
	public void addRight2() {
	
		Dequeue d=new Dequeue(2);
		d.addLeft(1);
		d.addLeft(2);
		assertEquals(2, d.capacity);
	}

	@Test
	public void addRight3() {
	
		int n=5;
		Dequeue d=new Dequeue(n);
		for(int i=0;i<5;i++) {
			d.addRight(i);
		}
		
		assertEquals(n, d.capacity);
	}
	
	@Test
	public void addRight4() {
	
		int n=50;
		Dequeue d=new Dequeue(n);
		int i=0;
		for(i=0;i<50;i++) {
			d.addRight(i);
		}
		d.addLeft(i+1);
		assertEquals(n, d.capacity);
	}

}
