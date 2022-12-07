package horaPooTeste;

import java.util.*;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Horario hr = new Horario();

		System.out.print("Informe as horas: ");
		hr.setHora(input.nextInt());

		System.out.print("Informe os minutos: ");
		hr.setMinuto(input.nextInt());

		System.out.print("Informe os Segundos: ");
		hr.setSegundo(input.nextInt());

		hr.exibe();

		input.close();
	}
}
