package controller;

//extends Thread
//Parâmetros por construtor
//método run

public class ThreadId extends Thread{
	
	private int idThread;
	
	public ThreadId(int idThread){
		this.idThread =idThread;
		
	}

	@Override
	public void run() {
		//só se executa o que está aqui dentro
		System.out.println(idThread);
	}

	
	
}
