package it.server.model;


public class Message {

	 String testo;
		String user;
		
		public Message(String testo, String user) {
			super();
			this.testo = testo;
			this.user = user;
		}
		public String getTesto() {
			return testo;
		}
		public void setTesto(String testo) {
			this.testo = testo;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
}
