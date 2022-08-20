package com.medicine;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] array = new Medicine[3];		
		
		Medicine m1 = new Tablet();
		Medicine m2 = new Syrup();
		Medicine m3 = new Ointment();

		
		array[0]=m1;array[1]=m2;array[2]=m3;
		
		for(int i=0;i<array.length;i++)
			array[i].displayLabel();
	}

}
