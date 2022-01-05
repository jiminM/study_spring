package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RateDiscountPolishTest {
    RateDiscountPolish discountPolish = new RateDiscountPolish();

    @Test
    @DisplayName("vip는 10% 할인이 적용되야한다.")
    void vio_o(){
        Member member = new Member(1L,"member_vip", Grade.VIP);
        int discount = discountPolish.discount(member, 10000);
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("vip는 10% 할인이 적용되지 않아야 한다.")
    void vio_x(){
        Member member = new Member(2L,"member_vip", Grade.BASIC);
        int discount = discountPolish.discount(member, 10000);
        Assertions.assertThat(discount).isEqualTo(1000);
    }
}
