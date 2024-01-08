// Copyright 2021 Tencent Inc. All rights reserved.
//
// Native支付
//
// Native支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payments.nativepay.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** 商户门店信息 */
public class StoreInfo {
  /** 门店编号 说明：商户侧门店编号 */
  @SerializedName("id")
  private String id;
  /** 门店名称 说明：商户侧门店名称 */
  @SerializedName("name")
  private String name;
  /** 地区编码 说明：地区编码，详细请见微信支付提供的文档 */
  @SerializedName("area_code")
  private String areaCode;
  /** 详细地址 说明：详细的商户门店地址 */
  @SerializedName("address")
  private String address;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
