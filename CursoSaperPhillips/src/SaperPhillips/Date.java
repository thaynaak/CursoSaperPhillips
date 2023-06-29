package SaperPhillips;

public class Date {

	private int dia;
	private int mes;
	private int ano;

	public void data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		}
	
	public int getDia() {
		return dia;
	}
	public void setDia (int novoDia) {
		dia = novoDia;
			}
	public int getMes() {
		return mes;
	}
	public void setMes (int novoMes) {
		mes = novoMes;
			}
	public void mostraData() {
		System.out.printf("Data %d/%d/%d%n", dia, mes, ano);	}
	}


