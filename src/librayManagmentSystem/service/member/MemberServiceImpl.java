package librayManagmentSystem.service.member;

import librayManagmentSystem.dataSource.Library;
import librayManagmentSystem.model.Member;

import java.util.List;

public class MemberServiceImpl implements MemberService{

    @Override
    public boolean saveMember(Member member) {
        return Library.addMember(member);
    }

    @Override
    public List<Member> getMembersList() {
        return Library.getMembers();
    }

    @Override
    public boolean isMemberExists() {
        return Library.isMemberExists();
    }

    @Override
    public Member getMembersByReg(int reg) {
        return Library.getMembersByReg(reg);
    }
}
