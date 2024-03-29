// Copyright 2021 Tencent Inc. All rights reserved.
//
// 连锁加盟供应链分账API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 1.0.12

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.brandprofitsharing.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** QueryOrderAmountRequest */
public class QueryOrderAmountRequest {
  /** 微信订单号 说明：微信支付订单号 */
  @SerializedName("transaction_id")
  @Expose(serialize = false)
  private String transactionId;

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOrderAmountRequest {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
