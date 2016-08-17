class Programa {
	
	public static void main(String[] args) {
		int idadeVisitante = 79;
		boolean amigoDoDono = true;


		if (idadeVisitante > 60) {
			System.out.println("Aproveite a melhor idade!");			
		}
		else if (idadeVisitante >= 18 && amigoDoDono) {

			System.out.println("Entre na festa!");
		} else {
			System.out.println("Volte para casa!");
		}
	}


}