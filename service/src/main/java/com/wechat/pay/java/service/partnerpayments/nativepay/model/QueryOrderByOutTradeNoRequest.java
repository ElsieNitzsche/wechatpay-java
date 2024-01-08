// Copyright 2021 Tencent Inc. All rights reserved.
//
// Native支付
//
// Native支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.partnerpayments.nativepay.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** QueryOrderByOutTradeNoRequest */
public class QueryOrderByOutTradeNoRequest {
  /** outTradeNo 说明：商户订单号 */
  @SerializedName("out_trade_no")
  @Expose(serialize = false)
  private String outTradeNo;
  /** spMchid 说明：服务商户号 */
  @SerializedName("sp_mchid")
  @Expose(serialize = false)
  private String spMchid;
  /** subMchid 说明：子商户号 */
  @SerializedName("sub_mchid")
  @Expose(serialize = false)
  private String subMchid;

  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  public String getSpMchid() {
    return spMchid;
  }

  public void setSpMchid(String spMchid) {
    this.spMchid = spMchid;
  }

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOrderByOutTradeNoRequest {\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    spMchid: ").append(toIndentedString(spMchid)).append("\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
