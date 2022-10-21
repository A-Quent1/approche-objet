package fr.diginamic.operations;

public class Operations {
	
	public double a;
	public double b;
	public char operateur;

	public Operations(double a, double b, char operateur) {
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}
	
	public String operation() {
		
		if (operateur == '+') {
			double total = 0;
			total = a + b;
		return "Le total est de : "+total;	
		}
		
		else if (operateur == '-'){
			double total = 0;
			total = a - b;
			return "Le total est de : "+total;
		}
		
		else if (operateur == '*') {
			double total = 0;
			total = a * b;
			return "Le total est de : "+total;
			
		}
		
		else if (operateur == '/') {
			double total = 0;
			total = a / b;
			return "Le total est de : "+total;
			
		}
		return "L'opérateur n'est pas valide";
		
	}
	
	public String toString() {

        return " a vaut = "+a+" / b vaut = "+b+" / l'opérateur est : "+operateur;
    }
	
}
