package SaperPhillips;

public class Employee {
	
	private String primeiro;
	private String ultimo;
	private double salario;
	
	public Employee(String primeiroNome, String ultimoNome, double salarioMensal) {
		primeiro = primeiroNome;
		ultimo = ultimoNome;
		
		if (salarioMensal > 0) {
			salario = salarioMensal;
		} else {
			salario = 0;
		}
	}
	
	public void setPrimeiro (String primeiro) {
		this.primeiro = primeiro;
	}
	public String getPrimeiro() {
		return primeiro;
	}
	public void setUltimo (String ultimo) {
		this.ultimo = ultimo;
	}
	public String getUltimo() {
		return ultimo;
	}
	public double getSalario() {
		return this.salario;	

}}
