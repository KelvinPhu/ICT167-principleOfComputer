package class_practice;


public class L5rectangleTest {
	public static void main(String[] args) {
		L5Rectangle[] rects = new L5Rectangle[5];
		getSample(rects);
		printArray(rects);
		printLargest(rects);
		// check if there are duplicate rectangles
		boolean duplicate = false;
		for(int curr=0; curr<rects.length; curr++) {
			L5Rectangle currRect = rects[curr];
			for(int next = curr + 1; next < rects.length; next++) {
				L5Rectangle nextRect = rects[next];
				if(currRect.equals(nextRect)) {
					duplicate = true;
					break;
				}
			}
		}
		if(duplicate) {
			System.out.println("Duplicate rectangle exist");
		}else {
			System.out.println("no duplicate");
		}
	}
	
	public static void printArray(L5Rectangle[] rects) {
		for(int i =0; i < rects.length; i++) {
			System.out.println(rects[i]);
		}
	}
	
	public static void printLargest(L5Rectangle[] rects) {
		double largest = rects[0].getArea();
		for(int curr=0; curr<rects.length; curr++) {
			if(rects[curr].getArea() > largest) {
				largest = rects[curr].getArea();
			}
		}
		System.out.println("largest area is: "+largest);
	}
	
	public static void getSample(L5Rectangle[] rects) {
		rects[0] = new L5Rectangle(50, 10);
		rects[1] = new L5Rectangle(40, 15);
		rects[2] = new L5Rectangle(30, 25);
		rects[3] = new L5Rectangle(45, 50);
		rects[4] = new L5Rectangle(37, 29);
	}
}
