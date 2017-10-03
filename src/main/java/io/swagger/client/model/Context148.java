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
import io.swagger.client.model.Paging;
import io.swagger.client.model.Subscribers150;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Context148
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:14:23.257Z")
public class Context148 {
  @SerializedName("Paging")
  private Paging paging = null;

  @SerializedName("Subscribers")
  private List<Subscribers150> subscribers = null;

  public Context148 paging(Paging paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @ApiModelProperty(value = "")
  public Paging getPaging() {
    return paging;
  }

  public void setPaging(Paging paging) {
    this.paging = paging;
  }

  public Context148 subscribers(List<Subscribers150> subscribers) {
    this.subscribers = subscribers;
    return this;
  }

  public Context148 addSubscribersItem(Subscribers150 subscribersItem) {
    if (this.subscribers == null) {
      this.subscribers = new ArrayList<Subscribers150>();
    }
    this.subscribers.add(subscribersItem);
    return this;
  }

   /**
   * 
   * @return subscribers
  **/
  @ApiModelProperty(value = "")
  public List<Subscribers150> getSubscribers() {
    return subscribers;
  }

  public void setSubscribers(List<Subscribers150> subscribers) {
    this.subscribers = subscribers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context148 context148 = (Context148) o;
    return Objects.equals(this.paging, context148.paging) &&
        Objects.equals(this.subscribers, context148.subscribers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, subscribers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context148 {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    subscribers: ").append(toIndentedString(subscribers)).append("\n");
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

