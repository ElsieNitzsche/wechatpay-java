// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销商家券对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.0.11

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.merchantexclusivecoupon.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** ModifyMiniAppInfo */
public class ModifyMiniAppInfo {
  /** 商家小程序AppID 说明：需要小程序AppID与归属商户号有绑定关系 */
  @SerializedName("mini_programs_appid")
  private String miniProgramsAppid;
  /** 商家小程序path 说明：商家小程序path */
  @SerializedName("mini_programs_path")
  private String miniProgramsPath;
  /** 入口文案 说明：入口文案，字数上限为5个，一个中文汉字/英文字母/数字均占用一个字数。 */
  @SerializedName("entrance_words")
  private String entranceWords;
  /** 引导文案 说明：小程序入口引导文案，字数上限为6个，一个中文汉字/英文字母/数字均占用一个字数。 */
  @SerializedName("guiding_words")
  private String guidingWords;

  public String getMiniProgramsAppid() {
    return miniProgramsAppid;
  }

  public void setMiniProgramsAppid(String miniProgramsAppid) {
    this.miniProgramsAppid = miniProgramsAppid;
  }

  public String getMiniProgramsPath() {
    return miniProgramsPath;
  }

  public void setMiniProgramsPath(String miniProgramsPath) {
    this.miniProgramsPath = miniProgramsPath;
  }

  public String getEntranceWords() {
    return entranceWords;
  }

  public void setEntranceWords(String entranceWords) {
    this.entranceWords = entranceWords;
  }

  public String getGuidingWords() {
    return guidingWords;
  }

  public void setGuidingWords(String guidingWords) {
    this.guidingWords = guidingWords;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyMiniAppInfo {\n");
    sb.append("    miniProgramsAppid: ").append(toIndentedString(miniProgramsAppid)).append("\n");
    sb.append("    miniProgramsPath: ").append(toIndentedString(miniProgramsPath)).append("\n");
    sb.append("    entranceWords: ").append(toIndentedString(entranceWords)).append("\n");
    sb.append("    guidingWords: ").append(toIndentedString(guidingWords)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
