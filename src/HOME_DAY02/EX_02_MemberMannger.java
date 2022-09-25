package HOME_DAY02;

import java.util.ArrayList;
import java.util.Scanner;

public class EX_02_MemberMannger {

	ArrayList<EX_01_MemberInfo> MemberArrayList = new ArrayList<>();

	EX_01_MemberInfo info = null;
	Scanner sc = new Scanner(System.in);

	public int showMenu() {

		System.out.println("[1]. 등록 | [2].리스트 | [3].종료 ");
		System.out.println("메뉴선택>>");
		return (sc.nextInt());

	}

	public void InsertMember() {

		info = new EX_01_MemberInfo();

		System.out.println("등록");

		System.out.println("사용자 이름을 등록해주세요");
		info.setMemberName(sc.next());

		System.out.println("사용자 나이를 등록해주세요");
		info.setMemberAge(sc.nextInt());

		System.out.println("사용자 전화번호를 등록해주세요");
		info.setMemberPhoneNum(sc.next());

		if (info.getMemberName().equals(null) && info.getMemberAge() == 0 && info.getMemberPhoneNum().equals(null)) {
			System.out.println("입력이 옳바르지 못합니다.");

		} else {
			System.out.println("정상적으로 처리되었습니다.");
			MemberArrayList.add(info);
		}

	}

	public void MemberALL() {

		System.out.println("모든 회원목록을 출력합니다.");

		
		System.out.println("=====================================");
		System.out.println("이름\t나이\t전화번호");
		
		for (int i = 0; i < MemberArrayList.size(); i++) {
			System.out.print(MemberArrayList.get(i).getMemberName());
			System.out.print("\t" + MemberArrayList.get(i).getMemberAge() + "세");
			System.out.println("\t" + MemberArrayList.get(i).getMemberPhoneNum());

		}
	}

}
