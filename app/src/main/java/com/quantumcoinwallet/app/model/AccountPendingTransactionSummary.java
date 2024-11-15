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


package com.quantumcoinwallet.app.model;

import java.util.Objects;

import com.quantumcoinwallet.app.api.read.model.Receipt;
import com.quantumcoinwallet.app.api.read.model.TransactionType;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import org.threeten.bp.OffsetDateTime;

/**
 * AccountPendingTransactionSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-28T20:27:13.465275500-07:00[America/Los_Angeles]")
public class AccountPendingTransactionSummary {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_BLOCK_NUMBER = "blockNumber";
  @SerializedName(SERIALIZED_NAME_BLOCK_NUMBER)
  private Double blockNumber;

  public static final String SERIALIZED_NAME_BLOCK_HASH = "blockHash";
  @SerializedName(SERIALIZED_NAME_BLOCK_HASH)
  private String blockHash;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Object nonce = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public static final String SERIALIZED_NAME_GAS = "gas";
  @SerializedName(SERIALIZED_NAME_GAS)
  private Object gas = null;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private Object gasPrice = null;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionType transactionType;

  public static final String SERIALIZED_NAME_RECEIPT = "receipt";
  @SerializedName(SERIALIZED_NAME_RECEIPT)
  private Receipt receipt = null;

  public AccountPendingTransactionSummary hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(value = "")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public AccountPendingTransactionSummary blockNumber(Double blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Get blockNumber
   * @return blockNumber
  **/
  @ApiModelProperty(value = "")
  public Double getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(Double blockNumber) {
    this.blockNumber = blockNumber;
  }

  public AccountPendingTransactionSummary blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Get blockHash
   * @return blockHash
  **/
  @ApiModelProperty(value = "")
  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public AccountPendingTransactionSummary createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AccountPendingTransactionSummary nonce(Object nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Get nonce
   * @return nonce
  **/
  @ApiModelProperty(value = "")
  public Object getNonce() {
    return nonce;
  }

  public void setNonce(Object nonce) {
    this.nonce = nonce;
  }

  public AccountPendingTransactionSummary from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public AccountPendingTransactionSummary to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public AccountPendingTransactionSummary value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public AccountPendingTransactionSummary gas(Object gas) {
    this.gas = gas;
    return this;
  }

   /**
   * Get gas
   * @return gas
  **/
  @ApiModelProperty(value = "")
  public Object getGas() {
    return gas;
  }

  public void setGas(Object gas) {
    this.gas = gas;
  }

  public AccountPendingTransactionSummary gasPrice(Object gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @ApiModelProperty(value = "")
  public Object getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(Object gasPrice) {
    this.gasPrice = gasPrice;
  }

  public AccountPendingTransactionSummary transactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")
  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public AccountPendingTransactionSummary receipt(Receipt receipt) {
    this.receipt = receipt;
    return this;
  }

   /**
   * Get receipt
   * @return receipt
  **/
  @ApiModelProperty(value = "")
  public Receipt getReceipt() {
    return receipt;
  }

  public void setReceipt(Receipt receipt) {
    this.receipt = receipt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPendingTransactionSummary accountPendingTransactionSummary = (AccountPendingTransactionSummary) o;
    return Objects.equals(this.hash, accountPendingTransactionSummary.hash) &&
        Objects.equals(this.blockNumber, accountPendingTransactionSummary.blockNumber) &&
        Objects.equals(this.blockHash, accountPendingTransactionSummary.blockHash) &&
        Objects.equals(this.createdAt, accountPendingTransactionSummary.createdAt) &&
        Objects.equals(this.nonce, accountPendingTransactionSummary.nonce) &&
        Objects.equals(this.from, accountPendingTransactionSummary.from) &&
        Objects.equals(this.to, accountPendingTransactionSummary.to) &&
        Objects.equals(this.value, accountPendingTransactionSummary.value) &&
        Objects.equals(this.gas, accountPendingTransactionSummary.gas) &&
        Objects.equals(this.gasPrice, accountPendingTransactionSummary.gasPrice) &&
        Objects.equals(this.transactionType, accountPendingTransactionSummary.transactionType) &&
        Objects.equals(this.receipt, accountPendingTransactionSummary.receipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, blockNumber, blockHash, createdAt, nonce, from, to, value, gas, gasPrice, transactionType, receipt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPendingTransactionSummary {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

