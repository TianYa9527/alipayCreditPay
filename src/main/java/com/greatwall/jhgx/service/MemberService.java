package com.greatwall.jhgx.service;

import com.greatwall.component.ccyl.common.service.ISuperService;
import com.greatwall.jhgx.domain.Member;
import com.greatwall.jhgx.domain.PayOrder;

import java.util.List;

public interface MemberService extends ISuperService<Member> {
    List<PayOrder> selectOrder(String authCode);
}
