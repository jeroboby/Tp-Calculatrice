package com.occalcul.beans;

public class Operation {

	private String operande1, operande2, resultat;
	private String operateur;

	public String getOperande1() {
		return operande1;
	}

	public void setOperande1(String operande1) {
		this.operande1 = operande1;
	}

	public String getOperande2() {
		return operande2;
	}

	public void setOperande2(String operande2) {
		this.operande2 = operande2;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public String getOperateur() {
		return operateur;
	}

	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}

	public Operation() {
	}

	public Operation(String operande1, String operateur, String operande2) {
		this.operande1 = operande1;
		this.operateur = operateur;
		this.operande2 = operande2;
		try {
			int op1 = Integer.parseInt(this.operande1);
			int op2 = Integer.parseInt(this.operande2);
			int resultat;

			if (this.operateur.equals("+")) {
				resultat = op1 + op2;
			} else if (this.operateur.equals("-")) {
				resultat = op1 - op2;
			} else if (this.operateur.equals("x")) {
				resultat = op1 * op2;
			} else
				resultat = op1 % op2;

			this.resultat = Integer.toString(resultat);
		} catch (NumberFormatException e) {
			System.out.println("pas de nombre rentré !");
		}

	}
}