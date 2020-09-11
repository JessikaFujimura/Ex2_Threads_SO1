package view;

import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {
		for (int idThread = 1; idThread < 6; idThread ++){
			Thread threadId = new ThreadId(idThread);
			threadId.start();
		}
	}
}
