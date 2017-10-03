/*
 * Moosend API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Criterion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Context145
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:14:23.257Z")
public class Context145 {
  @SerializedName("CreatedBy")
  private String createdBy = null;

  @SerializedName("CreatedOn")
  private String createdOn = null;

  @SerializedName("Criteria")
  private List<Criterion> criteria = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FetchType")
  private Double fetchType = null;

  @SerializedName("FetchValue")
  private Double fetchValue = null;

  @SerializedName("ID")
  private Double ID = null;

  @SerializedName("MatchType")
  private Double matchType = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("UpdatedBy")
  private String updatedBy = null;

  @SerializedName("UpdatedOn")
  private String updatedOn = null;

  public Context145 createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Context145 createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public Context145 criteria(List<Criterion> criteria) {
    this.criteria = criteria;
    return this;
  }

  public Context145 addCriteriaItem(Criterion criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<Criterion>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

   /**
   * 
   * @return criteria
  **/
  @ApiModelProperty(value = "")
  public List<Criterion> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<Criterion> criteria) {
    this.criteria = criteria;
  }

  public Context145 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Context145 fetchType(Double fetchType) {
    this.fetchType = fetchType;
    return this;
  }

   /**
   * 
   * @return fetchType
  **/
  @ApiModelProperty(value = "")
  public Double getFetchType() {
    return fetchType;
  }

  public void setFetchType(Double fetchType) {
    this.fetchType = fetchType;
  }

  public Context145 fetchValue(Double fetchValue) {
    this.fetchValue = fetchValue;
    return this;
  }

   /**
   * 
   * @return fetchValue
  **/
  @ApiModelProperty(value = "")
  public Double getFetchValue() {
    return fetchValue;
  }

  public void setFetchValue(Double fetchValue) {
    this.fetchValue = fetchValue;
  }

  public Context145 ID(Double ID) {
    this.ID = ID;
    return this;
  }

   /**
   * 
   * @return ID
  **/
  @ApiModelProperty(value = "")
  public Double getID() {
    return ID;
  }

  public void setID(Double ID) {
    this.ID = ID;
  }

  public Context145 matchType(Double matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * 
   * @return matchType
  **/
  @ApiModelProperty(value = "")
  public Double getMatchType() {
    return matchType;
  }

  public void setMatchType(Double matchType) {
    this.matchType = matchType;
  }

  public Context145 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Context145 updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * 
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Context145 updatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * 
   * @return updatedOn
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context145 context145 = (Context145) o;
    return Objects.equals(this.createdBy, context145.createdBy) &&
        Objects.equals(this.createdOn, context145.createdOn) &&
        Objects.equals(this.criteria, context145.criteria) &&
        Objects.equals(this.description, context145.description) &&
        Objects.equals(this.fetchType, context145.fetchType) &&
        Objects.equals(this.fetchValue, context145.fetchValue) &&
        Objects.equals(this.ID, context145.ID) &&
        Objects.equals(this.matchType, context145.matchType) &&
        Objects.equals(this.name, context145.name) &&
        Objects.equals(this.updatedBy, context145.updatedBy) &&
        Objects.equals(this.updatedOn, context145.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, criteria, description, fetchType, fetchValue, ID, matchType, name, updatedBy, updatedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context145 {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fetchType: ").append(toIndentedString(fetchType)).append("\n");
    sb.append("    fetchValue: ").append(toIndentedString(fetchValue)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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

