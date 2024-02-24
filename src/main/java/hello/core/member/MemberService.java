package hello.core.member;

//test용
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
