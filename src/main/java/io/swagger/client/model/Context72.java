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
import io.swagger.client.model.Campaign;
import io.swagger.client.model.Paging76;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Context72
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:14:23.257Z")
public class Context72 {
  @SerializedName("Campaigns")
  private List<Campaign> campaigns = null;

  @SerializedName("Paging")
  private Paging76 paging = null;

  public Context72 campaigns(List<Campaign> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public Context72 addCampaignsItem(Campaign campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<Campaign>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * 
   * @return campaigns
  **/
  @ApiModelProperty(value = "")
  public List<Campaign> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<Campaign> campaigns) {
    this.campaigns = campaigns;
  }

  public Context72 paging(Paging76 paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @ApiModelProperty(value = "")
  public Paging76 getPaging() {
    return paging;
  }

  public void setPaging(Paging76 paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context72 context72 = (Context72) o;
    return Objects.equals(this.campaigns, context72.campaigns) &&
        Objects.equals(this.paging, context72.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, paging);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context72 {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

