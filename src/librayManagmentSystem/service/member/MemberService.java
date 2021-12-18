package librayManagmentSystem.service.member;

import librayManagmentSystem.model.Member;

import java.util.List;

public interface MemberService {

    boolean saveMember(Member member);

    List<Member> getMembersList();

     boolean isMemberExists();

     Member getMembersByReg(int reg);

}
