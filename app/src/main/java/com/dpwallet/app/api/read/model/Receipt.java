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

/**
 * Receipt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-28T20:27:13.465275500-07:00[America/Los_Angeles]")
public class Receipt {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Object type = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status = null;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private Object gasUsed = null;

  public static final String SERIALIZED_NAME_CUMULATIVE_GAS_USED = "cumulativeGasUsed";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_GAS_USED)
  private Object cumulativeGasUsed = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_GAS_PRICE = "effectiveGasPrice";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_GAS_PRICE)
  private Object effectiveGasPrice = null;

  public Receipt type(Object type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }

  public Receipt status(Object status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Object getStatus() {
    return status;
  }

  public void setStatus(Object status) {
    this.status = status;
  }

  public Receipt contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Get contractAddress
   * @return contractAddress
  **/
  @ApiModelProperty(value = "")
  public String getContractAddress() {
    return contractAddress;
  }

  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }

  public Receipt gasUsed(Object gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Get gasUsed
   * @return gasUsed
  **/
  @ApiModelProperty(value = "")
  public Object getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(Object gasUsed) {
    this.gasUsed = gasUsed;
  }

  public Receipt cumulativeGasUsed(Object cumulativeGasUsed) {
    this.cumulativeGasUsed = cumulativeGasUsed;
    return this;
  }

   /**
   * Get cumulativeGasUsed
   * @return cumulativeGasUsed
  **/
  @ApiModelProperty(value = "")
  public Object getCumulativeGasUsed() {
    return cumulativeGasUsed;
  }

  public void setCumulativeGasUsed(Object cumulativeGasUsed) {
    this.cumulativeGasUsed = cumulativeGasUsed;
  }

  public Receipt effectiveGasPrice(Object effectiveGasPrice) {
    this.effectiveGasPrice = effectiveGasPrice;
    return this;
  }

   /**
   * Get effectiveGasPrice
   * @return effectiveGasPrice
  **/
  @ApiModelProperty(value = "")
  public Object getEffectiveGasPrice() {
    return effectiveGasPrice;
  }

  public void setEffectiveGasPrice(Object effectiveGasPrice) {
    this.effectiveGasPrice = effectiveGasPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Receipt receipt = (Receipt) o;
    return Objects.equals(this.type, receipt.type) &&
        Objects.equals(this.status, receipt.status) &&
        Objects.equals(this.contractAddress, receipt.contractAddress) &&
        Objects.equals(this.gasUsed, receipt.gasUsed) &&
        Objects.equals(this.cumulativeGasUsed, receipt.cumulativeGasUsed) &&
        Objects.equals(this.effectiveGasPrice, receipt.effectiveGasPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, status, contractAddress, gasUsed, cumulativeGasUsed, effectiveGasPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Receipt {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    cumulativeGasUsed: ").append(toIndentedString(cumulativeGasUsed)).append("\n");
    sb.append("    effectiveGasPrice: ").append(toIndentedString(effectiveGasPrice)).append("\n");
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

