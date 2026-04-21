class SockRunner{
	
	public static void main(String... args){
		
		Sock sock=new Sock();
		sock.wearSock();
		sock.removeSock();
		sock.washSock();
		sock.drySock();
		sock.foldSock();
		
		System.out.println("\n----------------------\n");
		
		Sock sock1=new Sock();
		sock1.wearSock();
		sock1.removeSock();
		sock1.washSock();
	}
}