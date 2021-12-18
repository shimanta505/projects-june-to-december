package librayManagmentSystem.controlers.member;

import librayManagmentSystem.model.Member;

import java.util.List;

public interface MemberController {

     boolean saveMember(Member member);

     List<Member> getMemberList();

     boolean isMemberExists();

     Member getMembersByReg(int reg);

}
