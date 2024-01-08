// Copyright 2021 Tencent Inc. All rights reserved.
//
// H5支付
//
// H5支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.partnerpayments.h5.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** 支付场景描述 */
public class SceneInfo {
  /** 用户终端IP 说明：用户终端IP */
  @SerializedName("payer_client_ip")
  private String payerClientIp;
  /** 商户端设备号 说明：商户端设备号 */
  @SerializedName("device_id")
  private String deviceId;
  /** storeInfo */
  @SerializedName("store_info")
  private StoreInfo storeInfo;
  /** h5Info */
  @SerializedName("h5_info")
  private H5Info h5Info;

  public String getPayerClientIp() {
    return payerClientIp;
  }

  public void setPayerClientIp(String payerClientIp) {
    this.payerClientIp = payerClientIp;
  }

  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public StoreInfo getStoreInfo() {
    return storeInfo;
  }

  public void setStoreInfo(StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
  }

  public H5Info getH5Info() {
    return h5Info;
  }

  public void setH5Info(H5Info h5Info) {
    this.h5Info = h5Info;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneInfo {\n");
    sb.append("    payerClientIp: ").append(toIndentedString(payerClientIp)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    storeInfo: ").append(toIndentedString(storeInfo)).append("\n");
    sb.append("    h5Info: ").append(toIndentedString(h5Info)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
