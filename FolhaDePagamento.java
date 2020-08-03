public class FolhaDePagamento {

	public static void main(String[] args) {
		Funcionario lista[];
		lista = new Funcionario[10];
		
		lista[0] = new Funcionario(001,"Anderson","Analista",2500);
		lista[1] = new Funcionario(002,"Isidro","Prof",3557);
		lista[2] = new Funcionario(003,"Regina","Profa",1950);
		
		for (int pos = 0; pos < 3; pos++) {
		System.out.println("Funcional: "+lista[pos].getFuncional()+" Nome: "+lista[pos].getNome()+" Cargo: "+lista[pos].getCargo()+" Salario: R$ "+lista[pos].getSalario()+" Imposto: R$ "+lista[pos].calcularImposto());
		}
	}
}