package SaperPhillips;

public class Aula02 {

	public static void main(String[] args) {
	//percurso 1260 metros em 4 min
	double Distancia = 1260.0;
	double TempoMinutos = 4;
	double TempoSegundos = TempoMinutos*60;
	double Velocidade = Distancia/TempoSegundos;
	
	System.out.println(Velocidade);
	
	System.out.printf("A velocidade média em metros por segundo é: %.2f%n", 1260.0/(4*60));
	System.out.printf("A velocidade média em km/h é: %.2f%n", (1260.0/1000)/(4.0/60));
	
	}

}
