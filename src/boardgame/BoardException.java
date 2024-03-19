package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	//Constructor que recebe a mensagem e passa para superclasse RuntimeException
	public BoardException(String msg) {
		super(msg);
	}

}
