class Turma {
	Aluno[] alunos;

	void imprimeNotas() {

		for(int i = 0; i < this.alunos.length; i++) {

			Aluno aluno = this.alunos[i];

			if(aluno == null) continue;

			System.out.println(aluno.nota);
		}
	}
}
class Aluno {
	String nome;
	int nota;
}
class TesteDaTurma {

	public static void main(String[] args) {

		Turma fj11 = new Turma();
		fj11.aluno = new Aluno[10];

		fj11.aluno[0] = new Aluno();
		fj11.aluno[0].nome = "Nikolai";
		fj11.aluno[0].nota = 9;

		fj11.aluno[0] = new Aluno();
		fj11.aluno[1].nome = "Sarah";
		fj11.aluno[1].nota = 5;
		



		fj11.imprimeNotas();

	}
}