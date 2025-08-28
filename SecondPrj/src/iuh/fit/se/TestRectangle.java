/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 27 thg 8, 2025
 */

package iuh.fit.se;

import java.util.Scanner;
/**
 * TestRectangle class
 */
public class TestRectangle {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		double length, width;
		System.out.print("Nhap vao chieu dai: ");
		length = sc.nextDouble();
		System.out.print("Nhap vao chieu rong: ");
		width = sc.nextDouble();
		Rectangle rec = new Rectangle(length, width);
		
		System.out.println(rec);		
		
		sc.close();
		
	}
}