// Copyright 2021 Tencent Inc. All rights reserved.
//
// JSAPI支付
//
// JSAPI支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payments.jsapi.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/** 优惠功能 */
public class Detail {
  /**
   * 订单原价 说明：1.商户侧一张小票订单可能被分多次支付，订单原价用于记录整张小票的交易金额。 2.当订单原价与支付金额不相等，则不享受优惠。
   * 3.该字段主要用于防止同一张小票分多次支付，以享受多次优惠的情况，正常支付订单不必上传此参数。
   */
  @SerializedName("cost_price")
  private Integer costPrice;
  /** 商品小票ID 说明：商家小票ID。 */
  @SerializedName("invoice_id")
  private String invoiceId;
  /** 单品列表 说明： */
  @SerializedName("goods_detail")
  private List<GoodsDetail> goodsDetail;

  public Integer getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(Integer costPrice) {
    this.costPrice = costPrice;
  }

  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public List<GoodsDetail> getGoodsDetail() {
    return goodsDetail;
  }

  public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
    this.goodsDetail = goodsDetail;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Detail {\n");
    sb.append("    costPrice: ").append(toIndentedString(costPrice)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    goodsDetail: ").append(toIndentedString(goodsDetail)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
