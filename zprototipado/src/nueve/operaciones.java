package nueve;

public class operaciones {
	
	String mensaje;
	public double calcularPromedio(double primer,double segundo,double tercero) {
		
		
		
		double notaFinal=(primer+segundo+tercero)/3;
		if (primer>=0&&segundo>=0&&tercero>=0) {
			return notaFinal;

		}else {
			return 0;
		}
		
		
	}
	
	public String resultadoTxt(double notaFinal) {
		
			if (notaFinal>=5) {
				
				mensaje="APROBADO";
				
			}else {
				mensaje="SUSPENSO";
			}
		return mensaje;
	}
}
