package lgs.lviv.a;

public class homework_1 {
	public static void main(String[] args) {

//  1. �������� �� ���� ����� ������� ���� ���������� ���� �����:

//-----------------------------------------------------------------------
		
//		1) ��� ����� int / byte / long / short
//		
//    	 int   i = 4 + 5;
//       byte  b = -128 + 127;
//       short s = 22223 + 1;
//       long  l = 334+11232143;
//       System.out.println (i);
//       System.out.println (b);
//       System.out.println (s);
//       System.out.println (l);
		
//-----------------------------------------------------------------------
		
//		2) ��� ����� char / int

//		char a = 85;
//		int b = (int) a;
//		System.out.println("a corresponds with " + b);
		
//-----------------------------------------------------------------------

//		3) ��� ����� String, �� � ���������� ��� � ������))

//		String s1 = "I have ";
//		String s2 = " apples ";
//		int num = 3;
//		String s = s1 + num + s2;
//		System.out.println(s);
		
//-----------------------------------------------------------------------

//		4) ��� ����� boolean

//		boolean user = false;
//        
//		if(user == true) {
//		     System.out.println("true");
//		}
//		else {
//		     System.out.println("false");
//		}
		
//-----------------------------------------------------------------------
		
//		5) ��� ����� double / float
		
//		double b1 = 3.62;
//		double b2 = 4.12 + b1;
//	
//		float pi = 3.14f;
//		float pipi = (float) 3.14; // ����� ��� ������ ������ ����� �� ������
//		double d = 27;
//		double c = pi * d;
//		System.out.println(b2);
//		System.out.println(c);
		
//-----------------------------------------------------------------------

//  2. ������� �� ������� �������� �� ����������� �������� ���� �����:
		
//		Integer a = 3;
//		Byte b = 12;
//		
//		System.out.println("̳������� �������� = "+a);
//		System.out.println("����������� �������� = "+b);

//-----------------------------------------------------------------------		
	
//  3. �������� �����, ��������� ���� 10�� ��������� ���� int, 
//	   ������ �������� �� ����������� �������� � �����:
		

		int numbers[] = { 13, 24, 53, -16, 5, 8, 32, 2, 71, 10 };
		int min, max;
		min = max = numbers[0];

		for (int i = 1; i < 10; i++) {
			if (numbers[i] < min)
				min = numbers[i];
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("̳������� �������� � ������: " + min);
		System.out.println("����������� �������� � ������: " + max);
	}
}
