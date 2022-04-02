package testeBanco;

public interface AcessoInterno {
	
	/**
	 * 
	 * @param usuario => pode-se informar o nome de um usuario valido
	 * @param senha => pode-se informar uma senha com até 255 caracteres
	 * @return true quando a senha estiver correta
	 */
	
	public boolean autenticarSistema(String usuario, String senha);

}
