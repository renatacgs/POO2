package p1;

public class Revistas extends Biblioteca {
	private String editora;
	private int volume, numero;
	
	public Revistas(String titulo, int ano, String editora, int volume, int numero) {
		setTitulo(titulo);
		setAno(ano);
		
		setOrganizacao(editora);
		setVolume(volume);
		setNumero(numero);
	}

	public String geteditora() {
		return editora;
	}
	
	public void setOrganizacao(String editora) {
		this.editora = editora;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void add(Revistas R) {
		revistasList.add(R);
		Integer[] array = {2, revistasList.size()-1};
		Revistas.indiceMap.put(getID(), array);
	}
	
}
