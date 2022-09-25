package HOME_DAY02;



public class EX_03_MemberMain {
	public static void main(String[] args) {

		
		
		EX_02_MemberMannger mem = new EX_02_MemberMannger();
		
		
		
		boolean run = true;
	
		
		while(run) {
			
			switch (mem.showMenu()) {
			case 1:
				mem.InsertMember();
				break;
				
			case 2:
				mem.MemberALL();
				break;
				
			case 3:
				System.out.println("종료선택");
				System.out.println("종료되었습니다.");
				run= false;
				break;
				
			
			default:
				break;
			}
			
		}
		
		
		
		
	}

}
