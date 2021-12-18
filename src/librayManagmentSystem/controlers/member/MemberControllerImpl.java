package librayManagmentSystem.controlers.member;

import librayManagmentSystem.model.Member;
import librayManagmentSystem.repository.member.MemberRepository;
import librayManagmentSystem.repository.member.MemberRepositoryImpl;

import java.util.List;

public class MemberControllerImpl implements MemberController {
    MemberRepository memberRepository = new MemberRepositoryImpl();
    @Override
    public boolean saveMember(Member member) {
        return memberRepository.saveMember(member);
    }

    @Override
    public List<Member> getMemberList() {
        return memberRepository.getMemberList();
    }

    @Override
    public boolean isMemberExists() {
        return memberRepository.isMemberExists();
    }

    @Override
    public Member getMembersByReg(int reg) {
        return memberRepository.getMembersByReg(reg);
    }
}
