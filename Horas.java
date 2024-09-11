package POOAula2;

public class Horas extends Funcionario {
	public Horas() {
    }

	public Horas(long id, String nome, String telefone, int matricula, String endereco) {
        super(id, nome, telefone, matricula, endereco);
    }  

    @Override
    public double calcularSalario(double valorHora, double quantHoras) {
        return  valorHora * quantHoras;
    }
}
