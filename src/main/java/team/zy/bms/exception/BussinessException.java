package team.zy.bms.exception;

public class BussinessException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
		private String exceptionCode;
		private String exceptionMsg;
		
		public BussinessException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public BussinessException(String exceptionCode, String exceptionMsg) {
			super();
			this.exceptionCode = exceptionCode;
			this.exceptionMsg = exceptionMsg;
		}

		public String getExceptionCode() {
			return exceptionCode;
		}

		public void setExceptionCode(String exceptionCode) {
			this.exceptionCode = exceptionCode;
		}

		public String getExceptionMsg(){
			return exceptionMsg;
		}

		public void setExceptionMesg(String exceptionMsg) {
			this.exceptionMsg = exceptionMsg;
		}
		
		
}	
