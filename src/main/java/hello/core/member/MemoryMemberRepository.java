package hello.core.member;

import java.util.HashMap;
import java.util.Map;

//alt + enter
public class MemoryMemberRepository implements MemberRepository {
    //원래 동시성 이슈로 컨커르드 해쉬맵?을 쓴다.
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
