package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolish {
    int discount(Member member, int price);
}
