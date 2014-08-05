/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-08-05 at 22:03:05 UTC 
 * Modify at your own risk.
 */

package com.example.agriexpensett.cycleendpoint.model;

/**
 * Model definition for Cycle.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the cycleendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Cycle extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String account;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double costPer;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer cropId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cropName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double harvestAmt;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String harvestType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key key;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyrep;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double landQty;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String landType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double totalSpent;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAccount() {
    return account;
  }

  /**
   * @param account account or {@code null} for none
   */
  public Cycle setAccount(java.lang.String account) {
    this.account = account;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getCostPer() {
    return costPer;
  }

  /**
   * @param costPer costPer or {@code null} for none
   */
  public Cycle setCostPer(java.lang.Double costPer) {
    this.costPer = costPer;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCropId() {
    return cropId;
  }

  /**
   * @param cropId cropId or {@code null} for none
   */
  public Cycle setCropId(java.lang.Integer cropId) {
    this.cropId = cropId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCropName() {
    return cropName;
  }

  /**
   * @param cropName cropName or {@code null} for none
   */
  public Cycle setCropName(java.lang.String cropName) {
    this.cropName = cropName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getHarvestAmt() {
    return harvestAmt;
  }

  /**
   * @param harvestAmt harvestAmt or {@code null} for none
   */
  public Cycle setHarvestAmt(java.lang.Double harvestAmt) {
    this.harvestAmt = harvestAmt;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHarvestType() {
    return harvestType;
  }

  /**
   * @param harvestType harvestType or {@code null} for none
   */
  public Cycle setHarvestType(java.lang.String harvestType) {
    this.harvestType = harvestType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Cycle setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getKey() {
    return key;
  }

  /**
   * @param key key or {@code null} for none
   */
  public Cycle setKey(Key key) {
    this.key = key;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyrep() {
    return keyrep;
  }

  /**
   * @param keyrep keyrep or {@code null} for none
   */
  public Cycle setKeyrep(java.lang.String keyrep) {
    this.keyrep = keyrep;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLandQty() {
    return landQty;
  }

  /**
   * @param landQty landQty or {@code null} for none
   */
  public Cycle setLandQty(java.lang.Double landQty) {
    this.landQty = landQty;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLandType() {
    return landType;
  }

  /**
   * @param landType landType or {@code null} for none
   */
  public Cycle setLandType(java.lang.String landType) {
    this.landType = landType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getTotalSpent() {
    return totalSpent;
  }

  /**
   * @param totalSpent totalSpent or {@code null} for none
   */
  public Cycle setTotalSpent(java.lang.Double totalSpent) {
    this.totalSpent = totalSpent;
    return this;
  }

  @Override
  public Cycle set(String fieldName, Object value) {
    return (Cycle) super.set(fieldName, value);
  }

  @Override
  public Cycle clone() {
    return (Cycle) super.clone();
  }

}
