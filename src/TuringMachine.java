import java.util.Set;

public class TuringMachine {
	
	
	private Set<String> conjuntosDeEstados;
	private String estadoInicial;
	private String simboloFita;
	private int numEstados;
	private String estadoAtual;
	

	public String verificaEstado() {
		
		return this.estadoAtual;
		
	}
	
	public void transicao() {
		
		String lerEstado;
		char lerSimbolo;
		
	}
	
	
	

	public Set<String> getConjuntosDeEstados() {
		return conjuntosDeEstados;
	}



	public void setConjuntosDeEstados(Set<String> conjuntosDeEstados) {
		this.conjuntosDeEstados = conjuntosDeEstados;
	}


	public String getEstadoInicial() {
		return estadoInicial;
	}



	public void setEstadoInicial(String estadoInicial) {
		this.estadoInicial = estadoInicial;
	}

	public String getSimboloFita() {
		return simboloFita;
	}



	public void setSimboloFita(String simboloFita) {
		this.simboloFita = simboloFita;
	}



	public int getNumEstados() {
		return numEstados;
	}



	public void setNumEstados(int numEstados) {
		this.numEstados = numEstados;
	}



	public String getEstadoAtual() {
		return estadoAtual;
	}



	public void setEstadoAtual(String estadoAtual) {
		this.estadoAtual = estadoAtual;
	}


}
