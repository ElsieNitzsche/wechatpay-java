// Copyright 2021 Tencent Inc. All rights reserved.
//
// 支付有礼活动对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.1.2

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.giftactivity.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/** AvailablePeriod */
public class AvailablePeriod {
  /** 可用时间 说明：可用时间 */
  @SerializedName("available_time")
  private List<AvailableTime> availableTime;
  /** 每日可用时间 说明：每日可用时间 */
  @SerializedName("available_day_time")
  private List<AvailableDayTime> availableDayTime;

  public List<AvailableTime> getAvailableTime() {
    return availableTime;
  }

  public void setAvailableTime(List<AvailableTime> availableTime) {
    this.availableTime = availableTime;
  }

  public List<AvailableDayTime> getAvailableDayTime() {
    return availableDayTime;
  }

  public void setAvailableDayTime(List<AvailableDayTime> availableDayTime) {
    this.availableDayTime = availableDayTime;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePeriod {\n");
    sb.append("    availableTime: ").append(toIndentedString(availableTime)).append("\n");
    sb.append("    availableDayTime: ").append(toIndentedString(availableDayTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
