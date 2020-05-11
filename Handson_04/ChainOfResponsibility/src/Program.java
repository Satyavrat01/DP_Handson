
public class Program {

	public static void main(String[] args) {
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setEmployeeName("Abhishek Misha");
		leaveRequest.setLeaveDays(8);
		ILeaveRequestHandler supervisor=new Supervisor();
		supervisor.HandleRequest(leaveRequest);

	}

}
