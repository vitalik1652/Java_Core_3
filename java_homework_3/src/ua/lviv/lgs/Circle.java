package ua.lviv.lgs;

import java.util.Scanner;

class Circle {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.print("������ �����: ");

		double radius = sc.nextDouble();

		double area = Math.PI * (radius * radius);
		System.out.println("����� ����: " + area);

		double circumference = Math.PI * 2 * radius;
		System.out.println("������� ����: " + circumference);
	}
}
