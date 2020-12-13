package com.why.member.feign;

import com.why.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WHY
 * 2020/12/8 14:48
 * 声明式远程调用
 */
@FeignClient("coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/test")
    public R test();
}
