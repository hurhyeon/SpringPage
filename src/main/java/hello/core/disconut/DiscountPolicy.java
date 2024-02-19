package hello.core.disconut;

import hello.core.member.Member;


//test용
public interface DiscountPolicy {

    int discount(Member member, int price);
}
