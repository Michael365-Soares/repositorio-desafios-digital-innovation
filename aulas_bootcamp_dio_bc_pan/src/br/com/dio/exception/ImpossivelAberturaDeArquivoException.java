package br.com.dio.exception;

public class ImpossivelAberturaDeArquivoException extends Exception {
	private static final long serialVersionUID = 1L;
	private String nomeArquivo;
	private String diretorio;
	
	public ImpossivelAberturaDeArquivoException(String nomeArquivo, String diretorio) {
		super("O arquivo "+nomeArquivo+" não foi encontrado no diretório "+diretorio+"...");
		this.nomeArquivo = nomeArquivo;
		this.diretorio = diretorio;
	}

	@Override
	public String toString() {
		return "ImpossivelAberturaDeArquivoException nomeArquivo="
	     + nomeArquivo + ", diretorio=" + diretorio + "...";
	}
	
}
