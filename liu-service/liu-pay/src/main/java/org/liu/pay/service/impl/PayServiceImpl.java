package org.liu.pay.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.liu.pay.entity.request.ApiPayRequest;
import org.liu.pay.entity.response.ApiPayResponse;
import org.liu.pay.service.PayService;

@Slf4j
public class PayServiceImpl implements PayService {
    @Override
    public ApiPayResponse pay(ApiPayRequest apiPayRequest) {
        log.info("支付正在实现中");
        return null;
    }
}
