package org.liu.pay.service;

import org.liu.pay.entity.request.ApiPayRequest;
import org.liu.pay.entity.response.ApiPayResponse;

public interface PayService {

    ApiPayResponse pay(ApiPayRequest apiPayRequest);
}
