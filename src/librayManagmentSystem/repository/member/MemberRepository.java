package librayManagmentSystem.repository.member;

import librayManagmentSystem.model.Member;

import java.util.List;

public interface MemberRepository {
    boolean saveMember(Member member);

    List<Member> getMemberList();
    boolean isMemberExists();
    Member getMembersByReg(int reg);
}
