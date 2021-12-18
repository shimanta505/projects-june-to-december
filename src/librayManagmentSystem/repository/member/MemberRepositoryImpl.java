package librayManagmentSystem.repository.member;

import librayManagmentSystem.controlers.MainController;
import librayManagmentSystem.model.Member;
import librayManagmentSystem.service.member.MemberService;
import librayManagmentSystem.service.member.MemberServiceImpl;

import java.util.List;

public class MemberRepositoryImpl implements MemberRepository{
    private static MemberService memberService = new MemberServiceImpl();

    @Override
    public boolean saveMember(Member member) {
        return memberService.saveMember(member);
    }

    @Override
    public List<Member> getMemberList() {
        return memberService.getMembersList();
    }

    @Override
    public boolean isMemberExists() {
        return memberService.isMemberExists();
    }

    @Override
    public Member getMembersByReg(int reg) {
        return memberService.getMembersByReg(reg);
    }
}
