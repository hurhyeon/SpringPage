package hello.core.member;

//test용 
public interface MemberRepository {
    void save(Member member);
    Member findById(Long  memberId);
}
