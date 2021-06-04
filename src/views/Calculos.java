package views;

public class Calculos {

	public static void main(String[] args) {
		int horas = 180;
		double valor = 30;
		
		double bruto = calcularBruto(horas, valor);
		double fgts = calcularFGTS(bruto);
		double inss = calcularINSS(bruto);
		double ir = calcularIR(bruto);
		double liquido = calcularLiquido(bruto, inss, ir);
		
		System.out.println("Bruto: " + bruto);
		System.out.println("FGTS: " + fgts);
		System.out.println("INSS: " + inss);
		System.out.println("IR: " + ir);
		System.out.println("Líquido: " + liquido);

	}
	
	public static double calcularBruto(int horas, double valor) {
		return horas * valor;
	}
	
	public static double calcularFGTS(double bruto) {
		return bruto * 0.08;
	}
	
	public static double calcularINSS(double bruto) {
		if(bruto <= 1693.72)
			return bruto * .08;
		if(bruto <= 2822.90)
			return bruto * .09;
		if(bruto <= 5645.80)
			return bruto * .11;
		else
			return 621.03;
	}
	
	public static double calcularIR(double bruto) {
		if(bruto <= 1903.98)
			return 0;
		if(bruto <= 2826.65)
			return (bruto * .075) - 142.8;
		if(bruto <= 3751.05)
			return (bruto * .15) - 354.8;
		if(bruto <= 4664.68)
			return (bruto * .225) - 636.13;
		else
			return (bruto * .275) - 869.36;
	}
	
	public static double calcularLiquido(double bruto, double inss, double ir) {
		return bruto - ir - inss;
	}

}
