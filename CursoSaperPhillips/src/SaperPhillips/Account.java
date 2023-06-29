package SaperPhillips;

public class Account {
// ORIENTAÇÃO OBJETO
// Classes: Uma classe pode ter atribuições e metodos.
		
	private String name;
	
	private double saldo;
	
	//construtor:
	public Account(String nomeInicial, double saldoInicial) {
		name = nomeInicial;
			
		if (saldoInicial > 0){
			saldo = saldoInicial;
		}
		else {
			saldo = 0;
		}
	}
		
	public void setName (String name) {
		this.name = name;
			}
	public String getName () {
		return name;
	}
	public void saque(double valorSaque){
		if (valorSaque <= saldo){
			this.saldo = saldo - valorSaque;}
		else {
			System.out.print("Valor de saque excede o saldo da sua conta! Operação cancelda/n");
		}}
	
	public void deposito(double valorDeposito){
		if (valorDeposito > 0){
			saldo = saldo + valorDeposito;
		}}
	
		public double getSaldo() {
			return this.saldo;
}
}