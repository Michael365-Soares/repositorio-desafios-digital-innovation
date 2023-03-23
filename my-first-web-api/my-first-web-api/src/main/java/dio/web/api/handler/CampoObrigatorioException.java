package dio.web.api.handler;

public class CampoObrigatorioException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public CampoObrigatorioException(String mensagem) {
		super("O campo %s é origatório...",mensagem);
	}
   
	
	
}
