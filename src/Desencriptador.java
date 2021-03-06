
public class Desencriptador {
	private String mensajeCodificado;
	private String mensaje;
	private int saltos;
	
	public Desencriptador(String mensajeCodificado){
		this.mensajeCodificado =mensajeCodificado;
		saltos = 4;
		desencriptandoConSubstrings();
	}
	
	public String getMensaje() {
		return mensaje;
	}

	private void desencriptandoConSubstrings(){
		String temporal = mensajeCodificado;
		
		for(int i=0;i<=saltos;i++){
			char parteInicial = temporal.charAt(temporal.length()-1);
			String parteFinal = temporal.substring(0, temporal.length()-1);
			temporal = parteInicial + parteFinal;
		}
		mensaje = temporal;
	}
}
