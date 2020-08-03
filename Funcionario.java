public class Funcionario {
	private int funcional;
	private String nome, cargo;
	private double salario;
	public Funcionario(int funcional, String nome, String cargo, double salario) {
		this.funcional = funcional;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public int getFuncional() {
		return funcional;
	}
	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double calcularImposto() {
		double imposto;
		if (this.salario <= 1000.0) {
			imposto = 0.0;
		}
		else if (this.salario <= 2000.0) {
			imposto = salario * 15 / 100;
		}
		else if (this.salario <= 4500.0) {
			imposto = salario * 25 / 100;
		}
		else {
			imposto = 2150.0;
		}
		return imposto;
	}
}