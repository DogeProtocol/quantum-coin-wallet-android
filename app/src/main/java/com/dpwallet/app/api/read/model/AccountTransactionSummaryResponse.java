/*
 * Accounts Read Data Plane
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dpwallet.app.api.read.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * AccountTransactionSummaryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-28T20:27:13.465275500-07:00[America/Los_Angeles]")
public class AccountTransactionSummaryResponse {
  public static final String SERIALIZED_NAME_PAGE_COUNT = "pageCount";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<AccountTransactionSummary> result = new ArrayList<AccountTransactionSummary>();

  public AccountTransactionSummaryResponse pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public AccountTransactionSummaryResponse result(List<AccountTransactionSummary> result) {
    this.result = result;
    return this;
  }

  public AccountTransactionSummaryResponse addResultItem(AccountTransactionSummary resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<AccountTransactionSummary>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public List<AccountTransactionSummary> getResult() {
    return result;
  }

  public void setResult(List<AccountTransactionSummary> result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTransactionSummaryResponse accountTransactionSummaryResponse = (AccountTransactionSummaryResponse) o;
    return Objects.equals(this.pageCount, accountTransactionSummaryResponse.pageCount) &&
        Objects.equals(this.result, accountTransactionSummaryResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageCount, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTransactionSummaryResponse {\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

