package horaPooTeste;

public class Horario {
	private int hora, minuto, segundo;

	public Horario() {
		hora = minuto = segundo = 0;
	}

	public int getHora() {
		return (hora);
	}

	public void setHora(int hh) {
		if (hh >= 0 && hh < 24)
			hora = hh;
		else
			hora = 0;
	}

	public int getMinuto() {
		return (minuto);
	}

	public void setMinuto(int mm) {
		if (mm >= 0 && mm < 60)
			minuto = mm;
		else
			minuto = 0;
	}

	public int getSegundo() {
		return (segundo);
	}

	public void setSegundo(int ss) {
		if (ss >= 0 && ss < 60)
			segundo = ss;
		else
			segundo = 0;
	}

	public void exibe() {
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}
}
