package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * f2를 클릭하면 오류난 곳으로 이동
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);

}
