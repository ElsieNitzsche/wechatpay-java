// Copyright 2021 Tencent Inc. All rights reserved.
//
// H5支付
//
// H5支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payments.h5;

import static com.wechat.pay.java.core.http.UrlEncoder.urlEncode;
import static com.wechat.pay.java.core.util.GsonUtil.toJson;
import static java.util.Objects.requireNonNull;

import com.wechat.pay.java.core.Config;
import com.wechat.pay.java.core.exception.HttpException;
import com.wechat.pay.java.core.exception.MalformedMessageException;
import com.wechat.pay.java.core.exception.ServiceException;
import com.wechat.pay.java.core.exception.ValidationException;
import com.wechat.pay.java.core.http.Constant;
import com.wechat.pay.java.core.http.DefaultHttpClientBuilder;
import com.wechat.pay.java.core.http.HostName;
import com.wechat.pay.java.core.http.HttpClient;
import com.wechat.pay.java.core.http.HttpHeaders;
import com.wechat.pay.java.core.http.HttpMethod;
import com.wechat.pay.java.core.http.HttpRequest;
import com.wechat.pay.java.core.http.HttpResponse;
import com.wechat.pay.java.core.http.JsonRequestBody;
import com.wechat.pay.java.core.http.MediaType;
import com.wechat.pay.java.core.http.QueryParameter;
import com.wechat.pay.java.core.http.RequestBody;
import com.wechat.pay.java.service.payments.h5.model.CloseOrderRequest;
import com.wechat.pay.java.service.payments.h5.model.PrepayRequest;
import com.wechat.pay.java.service.payments.h5.model.PrepayResponse;
import com.wechat.pay.java.service.payments.h5.model.QueryOrderByIdRequest;
import com.wechat.pay.java.service.payments.h5.model.QueryOrderByOutTradeNoRequest;
import com.wechat.pay.java.service.payments.model.Transaction;

/** H5Service服务 */
public class H5Service {

  private final HttpClient httpClient;
  private final HostName hostName;

  private H5Service(HttpClient httpClient, HostName hostName) {
    this.httpClient = requireNonNull(httpClient);
    this.hostName = hostName;
  }
  /** H5Service构造器 */
  public static class Builder {

    private HttpClient httpClient;
    private HostName hostName;
    /**
     * 设置请求配置，以该配置构造默认的httpClient，若未调用httpClient()方法，则必须调用该方法
     *
     * @param config 请求配置
     * @return Builder
     */
    public Builder config(Config config) {
      this.httpClient = new DefaultHttpClientBuilder().config(config).build();

      return this;
    }
    /**
     * 设置微信支付域名，可选，默认为api.mch.weixin.qq.com
     *
     * @param hostName 微信支付域名
     * @return Builder
     */
    public Builder hostName(HostName hostName) {
      this.hostName = hostName;
      return this;
    }
    /**
     * 设置自定义httpClient，若未调用config()，则必须调用该方法
     *
     * @param httpClient httpClient
     * @return Builder
     */
    public Builder httpClient(HttpClient httpClient) {
      this.httpClient = httpClient;
      return this;
    }
    /**
     * 构造服务
     *
     * @return H5Service
     */
    public H5Service build() {
      return new H5Service(httpClient, hostName);
    }
  }

  /**
   * 关闭订单
   *
   * @param request 请求参数
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public void closeOrder(CloseOrderRequest request) {
    String requestPath =
        "https://api.mch.weixin.qq.com/v3/pay/transactions/out-trade-no/{out_trade_no}/close";

    CloseOrderRequest realRequest = request;
    // 添加 path param
    requestPath =
        requestPath.replace("{" + "out_trade_no" + "}", urlEncode(realRequest.getOutTradeNo()));

    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.POST)
            .url(requestPath)
            .headers(headers)
            .body(createRequestBody(realRequest))
            .build();
    httpClient.execute(httpRequest, null);
  }
  /**
   * H5支付下单
   *
   * @param request 请求参数
   * @return PrepayResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public PrepayResponse prepay(PrepayRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/pay/transactions/h5";
    PrepayRequest realRequest = request;
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.POST)
            .url(requestPath)
            .headers(headers)
            .body(createRequestBody(realRequest))
            .build();
    HttpResponse<PrepayResponse> httpResponse =
        httpClient.execute(httpRequest, PrepayResponse.class);
    return httpResponse.getServiceResponse();
  }
  /**
   * 微信支付订单号查询订单
   *
   * @param request 请求参数
   * @return Transaction
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public Transaction queryOrderById(QueryOrderByIdRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/pay/transactions/id/{transaction_id}";

    QueryOrderByIdRequest realRequest = request;
    // 添加 path param
    requestPath =
        requestPath.replace(
            "{" + "transaction_id" + "}", urlEncode(realRequest.getTransactionId()));

    // 添加 query param
    QueryParameter queryParameter = new QueryParameter();
    if (realRequest.getMchid() != null) {
      queryParameter.add("mchid", urlEncode(realRequest.getMchid()));
    }
    requestPath += queryParameter.getQueryStr();
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.GET)
            .url(requestPath)
            .headers(headers)
            .build();
    HttpResponse<Transaction> httpResponse = httpClient.execute(httpRequest, Transaction.class);
    return httpResponse.getServiceResponse();
  }
  /**
   * 商户订单号查询订单
   *
   * @param request 请求参数
   * @return Transaction
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public Transaction queryOrderByOutTradeNo(QueryOrderByOutTradeNoRequest request) {
    String requestPath =
        "https://api.mch.weixin.qq.com/v3/pay/transactions/out-trade-no/{out_trade_no}";

    QueryOrderByOutTradeNoRequest realRequest = request;
    // 添加 path param
    requestPath =
        requestPath.replace("{" + "out_trade_no" + "}", urlEncode(realRequest.getOutTradeNo()));

    // 添加 query param
    QueryParameter queryParameter = new QueryParameter();
    if (realRequest.getMchid() != null) {
      queryParameter.add("mchid", urlEncode(realRequest.getMchid()));
    }
    requestPath += queryParameter.getQueryStr();
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.GET)
            .url(requestPath)
            .headers(headers)
            .build();
    HttpResponse<Transaction> httpResponse = httpClient.execute(httpRequest, Transaction.class);
    return httpResponse.getServiceResponse();
  }

  private RequestBody createRequestBody(Object request) {
    return new JsonRequestBody.Builder().body(toJson(request)).build();
  }
}
