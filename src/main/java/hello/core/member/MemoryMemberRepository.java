package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component // memoryMemberRepository
public class MemoryMemberRepository implements MemberRepository {

    // 이렇게 하면 안됨, 여러군데에서 접근을 하기때문에! 컨커런트 해시맵을 써야한다! 동시성 이슈떄문에
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
