package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
	
public static void main(String[] args) {
		
		Operations operations1 = new Operations (3, 2, '-' );
		Operations operations2 = new Operations (2, 2, '+' );
		Operations operations3 = new Operations (5, 2, '*' );
		Operations operations4 = new Operations (10, 2, '/' );
		
		System.out.println(operations1.toString());
		System.out.println(operations2.toString());
		System.out.println(operations3.toString());
		System.out.println(operations4.toString());
		
		System.out.println(operations1.operation());
		System.out.println(operations2.operation());
		System.out.println(operations3.operation());
		System.out.println(operations4.operation());
		
	}

}
