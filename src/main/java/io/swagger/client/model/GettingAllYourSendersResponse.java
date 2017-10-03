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
import io.swagger.client.model.Context89;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GettingAllYourSendersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:14:23.257Z")
public class GettingAllYourSendersResponse {
  @SerializedName("Code")
  private Double code = null;

  @SerializedName("Context")
  private List<Context89> context = null;

  @SerializedName("Error")
  private String error = null;

  public GettingAllYourSendersResponse code(Double code) {
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Double getCode() {
    return code;
  }

  public void setCode(Double code) {
    this.code = code;
  }

  public GettingAllYourSendersResponse context(List<Context89> context) {
    this.context = context;
    return this;
  }

  public GettingAllYourSendersResponse addContextItem(Context89 contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<Context89>();
    }
    this.context.add(contextItem);
    return this;
  }

   /**
   * 
   * @return context
  **/
  @ApiModelProperty(value = "")
  public List<Context89> getContext() {
    return context;
  }

  public void setContext(List<Context89> context) {
    this.context = context;
  }

  public GettingAllYourSendersResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * 
   * @return error
  **/
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GettingAllYourSendersResponse gettingAllYourSendersResponse = (GettingAllYourSendersResponse) o;
    return Objects.equals(this.code, gettingAllYourSendersResponse.code) &&
        Objects.equals(this.context, gettingAllYourSendersResponse.context) &&
        Objects.equals(this.error, gettingAllYourSendersResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, context, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GettingAllYourSendersResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

