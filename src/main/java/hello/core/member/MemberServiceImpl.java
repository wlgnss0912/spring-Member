package hello.core.member;

//구현체가 하나만 있을때 관례상 Impl이라고 많이 사용한다
public class MemberServiceImpl implements MemberService{

    //ctrl + shift + enter 자동 완성
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
