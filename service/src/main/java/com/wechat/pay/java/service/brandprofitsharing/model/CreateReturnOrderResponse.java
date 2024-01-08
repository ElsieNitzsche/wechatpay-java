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

import com.google.gson.annotations.SerializedName;

/** CreateReturnOrderResponse */
public class CreateReturnOrderResponse {
  /** 子商户号 说明：分账回退的接收商户，对应原分账出资的分账方商户，填写微信支付分配的商户号。 */
  @SerializedName("sub_mchid")
  private String subMchid;
  /** 微信分账单号 说明：参考请求参数 */
  @SerializedName("order_id")
  private String orderId;
  /** 商户分账单号 说明：参考请求参数 */
  @SerializedName("out_order_no")
  private String outOrderNo;
  /** 商户回退单号 说明：此回退单号是商户在自己后台生成的一个新的回退单号，在商户后台唯一 只能是数字、大小写字母_-*@ ，同一回退单号多次请求等同一次。 */
  @SerializedName("out_return_no")
  private String outReturnNo;
  /** 回退商户号 说明：回退商户号只能填写原分账请求中接收分账的商户号。 */
  @SerializedName("return_mchid")
  private String returnMchid;
  /** 回退金额 说明：需要从分账接收方回退的金额，单位为分，只能为整数，不能超过原始分账单分出给该接收方的金额 */
  @SerializedName("amount")
  private Long amount;
  /** 微信回退单号 说明：微信分账回退单号，微信系统返回的唯一标识 */
  @SerializedName("return_no")
  private String returnNo;
  /**
   * 回退结果
   * 说明：如果请求返回为处理中，则商户可以通过调用回退结果查询接口获取请求的最终处理结果。如果返回为处理中，请勿变更商户回退单号，使用相同的参数再次发起分账回退，否则会出现资金风险。在处理中状态的回退单如果5天没有成功，会因为超时被设置为已失败
   * 枚举值： - PROCESSING：处理中 - SUCCESS：已成功 - FAIL：已失败
   */
  @SerializedName("result")
  private String result;
  /**
   * 失败原因 说明：回退失败的原因，此字段仅回退结果为FAIL时存在，枚举值： - ACCOUNT_ABNORMAL：原分账接收方账户异常 - TIME_OUT_CLOSED：超时关单 -
   * PAYER_ACCOUNT_ABNORMAL: 原分账分出方账户异常
   */
  @SerializedName("fail_reason")
  private String failReason;
  /**
   * 完成时间 说明：分账回退完成时间，遵循RFC3339标准格式，格式为
   * yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC
   * 8小时，即北京时间）。例如：2015-05-20T13:29:35:120+08:00表示北京时间2015年05月20日13点29分35秒。
   */
  @SerializedName("finish_time")
  private String finishTime;

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getOutOrderNo() {
    return outOrderNo;
  }

  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }

  public String getOutReturnNo() {
    return outReturnNo;
  }

  public void setOutReturnNo(String outReturnNo) {
    this.outReturnNo = outReturnNo;
  }

  public String getReturnMchid() {
    return returnMchid;
  }

  public void setReturnMchid(String returnMchid) {
    this.returnMchid = returnMchid;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public String getReturnNo() {
    return returnNo;
  }

  public void setReturnNo(String returnNo) {
    this.returnNo = returnNo;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getFailReason() {
    return failReason;
  }

  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }

  public String getFinishTime() {
    return finishTime;
  }

  public void setFinishTime(String finishTime) {
    this.finishTime = finishTime;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReturnOrderResponse {\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    outReturnNo: ").append(toIndentedString(outReturnNo)).append("\n");
    sb.append("    returnMchid: ").append(toIndentedString(returnMchid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    returnNo: ").append(toIndentedString(returnNo)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
