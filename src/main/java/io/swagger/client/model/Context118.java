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
import io.swagger.client.model.MailingLists119;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Context118
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:14:23.257Z")
public class Context118 {
  @SerializedName("ABVersion")
  private String abVersion = null;

  @SerializedName("CampaignDeliveredOn")
  private String campaignDeliveredOn = null;

  @SerializedName("CampaignID")
  private String campaignID = null;

  @SerializedName("CampaignIsArchived")
  private Boolean campaignIsArchived = null;

  @SerializedName("CampaignName")
  private String campaignName = null;

  @SerializedName("CampaignSubject")
  private String campaignSubject = null;

  @SerializedName("From")
  private String from = null;

  @SerializedName("MailingLists")
  private List<MailingLists119> mailingLists = null;

  @SerializedName("Sent")
  private Double sent = null;

  @SerializedName("To")
  private String to = null;

  @SerializedName("TotalBounces")
  private Double totalBounces = null;

  @SerializedName("TotalComplaints")
  private Double totalComplaints = null;

  @SerializedName("TotalForwards")
  private Double totalForwards = null;

  @SerializedName("TotalLinkClicks")
  private Double totalLinkClicks = null;

  @SerializedName("TotalOpens")
  private Double totalOpens = null;

  @SerializedName("TotalUnsubscribes")
  private Double totalUnsubscribes = null;

  @SerializedName("UniqueForwards")
  private Double uniqueForwards = null;

  @SerializedName("UniqueLinkClicks")
  private Double uniqueLinkClicks = null;

  @SerializedName("UniqueOpens")
  private Double uniqueOpens = null;

  public Context118 abVersion(String abVersion) {
    this.abVersion = abVersion;
    return this;
  }

   /**
   * 
   * @return abVersion
  **/
  @ApiModelProperty(value = "")
  public String getAbVersion() {
    return abVersion;
  }

  public void setAbVersion(String abVersion) {
    this.abVersion = abVersion;
  }

  public Context118 campaignDeliveredOn(String campaignDeliveredOn) {
    this.campaignDeliveredOn = campaignDeliveredOn;
    return this;
  }

   /**
   * 
   * @return campaignDeliveredOn
  **/
  @ApiModelProperty(value = "")
  public String getCampaignDeliveredOn() {
    return campaignDeliveredOn;
  }

  public void setCampaignDeliveredOn(String campaignDeliveredOn) {
    this.campaignDeliveredOn = campaignDeliveredOn;
  }

  public Context118 campaignID(String campaignID) {
    this.campaignID = campaignID;
    return this;
  }

   /**
   * 
   * @return campaignID
  **/
  @ApiModelProperty(value = "")
  public String getCampaignID() {
    return campaignID;
  }

  public void setCampaignID(String campaignID) {
    this.campaignID = campaignID;
  }

  public Context118 campaignIsArchived(Boolean campaignIsArchived) {
    this.campaignIsArchived = campaignIsArchived;
    return this;
  }

   /**
   * 
   * @return campaignIsArchived
  **/
  @ApiModelProperty(value = "")
  public Boolean getCampaignIsArchived() {
    return campaignIsArchived;
  }

  public void setCampaignIsArchived(Boolean campaignIsArchived) {
    this.campaignIsArchived = campaignIsArchived;
  }

  public Context118 campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * 
   * @return campaignName
  **/
  @ApiModelProperty(value = "")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public Context118 campaignSubject(String campaignSubject) {
    this.campaignSubject = campaignSubject;
    return this;
  }

   /**
   * 
   * @return campaignSubject
  **/
  @ApiModelProperty(value = "")
  public String getCampaignSubject() {
    return campaignSubject;
  }

  public void setCampaignSubject(String campaignSubject) {
    this.campaignSubject = campaignSubject;
  }

  public Context118 from(String from) {
    this.from = from;
    return this;
  }

   /**
   * 
   * @return from
  **/
  @ApiModelProperty(value = "")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Context118 mailingLists(List<MailingLists119> mailingLists) {
    this.mailingLists = mailingLists;
    return this;
  }

  public Context118 addMailingListsItem(MailingLists119 mailingListsItem) {
    if (this.mailingLists == null) {
      this.mailingLists = new ArrayList<MailingLists119>();
    }
    this.mailingLists.add(mailingListsItem);
    return this;
  }

   /**
   * 
   * @return mailingLists
  **/
  @ApiModelProperty(value = "")
  public List<MailingLists119> getMailingLists() {
    return mailingLists;
  }

  public void setMailingLists(List<MailingLists119> mailingLists) {
    this.mailingLists = mailingLists;
  }

  public Context118 sent(Double sent) {
    this.sent = sent;
    return this;
  }

   /**
   * 
   * @return sent
  **/
  @ApiModelProperty(value = "")
  public Double getSent() {
    return sent;
  }

  public void setSent(Double sent) {
    this.sent = sent;
  }

  public Context118 to(String to) {
    this.to = to;
    return this;
  }

   /**
   * 
   * @return to
  **/
  @ApiModelProperty(value = "")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Context118 totalBounces(Double totalBounces) {
    this.totalBounces = totalBounces;
    return this;
  }

   /**
   * 
   * @return totalBounces
  **/
  @ApiModelProperty(value = "")
  public Double getTotalBounces() {
    return totalBounces;
  }

  public void setTotalBounces(Double totalBounces) {
    this.totalBounces = totalBounces;
  }

  public Context118 totalComplaints(Double totalComplaints) {
    this.totalComplaints = totalComplaints;
    return this;
  }

   /**
   * 
   * @return totalComplaints
  **/
  @ApiModelProperty(value = "")
  public Double getTotalComplaints() {
    return totalComplaints;
  }

  public void setTotalComplaints(Double totalComplaints) {
    this.totalComplaints = totalComplaints;
  }

  public Context118 totalForwards(Double totalForwards) {
    this.totalForwards = totalForwards;
    return this;
  }

   /**
   * 
   * @return totalForwards
  **/
  @ApiModelProperty(value = "")
  public Double getTotalForwards() {
    return totalForwards;
  }

  public void setTotalForwards(Double totalForwards) {
    this.totalForwards = totalForwards;
  }

  public Context118 totalLinkClicks(Double totalLinkClicks) {
    this.totalLinkClicks = totalLinkClicks;
    return this;
  }

   /**
   * 
   * @return totalLinkClicks
  **/
  @ApiModelProperty(value = "")
  public Double getTotalLinkClicks() {
    return totalLinkClicks;
  }

  public void setTotalLinkClicks(Double totalLinkClicks) {
    this.totalLinkClicks = totalLinkClicks;
  }

  public Context118 totalOpens(Double totalOpens) {
    this.totalOpens = totalOpens;
    return this;
  }

   /**
   * 
   * @return totalOpens
  **/
  @ApiModelProperty(value = "")
  public Double getTotalOpens() {
    return totalOpens;
  }

  public void setTotalOpens(Double totalOpens) {
    this.totalOpens = totalOpens;
  }

  public Context118 totalUnsubscribes(Double totalUnsubscribes) {
    this.totalUnsubscribes = totalUnsubscribes;
    return this;
  }

   /**
   * 
   * @return totalUnsubscribes
  **/
  @ApiModelProperty(value = "")
  public Double getTotalUnsubscribes() {
    return totalUnsubscribes;
  }

  public void setTotalUnsubscribes(Double totalUnsubscribes) {
    this.totalUnsubscribes = totalUnsubscribes;
  }

  public Context118 uniqueForwards(Double uniqueForwards) {
    this.uniqueForwards = uniqueForwards;
    return this;
  }

   /**
   * 
   * @return uniqueForwards
  **/
  @ApiModelProperty(value = "")
  public Double getUniqueForwards() {
    return uniqueForwards;
  }

  public void setUniqueForwards(Double uniqueForwards) {
    this.uniqueForwards = uniqueForwards;
  }

  public Context118 uniqueLinkClicks(Double uniqueLinkClicks) {
    this.uniqueLinkClicks = uniqueLinkClicks;
    return this;
  }

   /**
   * 
   * @return uniqueLinkClicks
  **/
  @ApiModelProperty(value = "")
  public Double getUniqueLinkClicks() {
    return uniqueLinkClicks;
  }

  public void setUniqueLinkClicks(Double uniqueLinkClicks) {
    this.uniqueLinkClicks = uniqueLinkClicks;
  }

  public Context118 uniqueOpens(Double uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * 
   * @return uniqueOpens
  **/
  @ApiModelProperty(value = "")
  public Double getUniqueOpens() {
    return uniqueOpens;
  }

  public void setUniqueOpens(Double uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context118 context118 = (Context118) o;
    return Objects.equals(this.abVersion, context118.abVersion) &&
        Objects.equals(this.campaignDeliveredOn, context118.campaignDeliveredOn) &&
        Objects.equals(this.campaignID, context118.campaignID) &&
        Objects.equals(this.campaignIsArchived, context118.campaignIsArchived) &&
        Objects.equals(this.campaignName, context118.campaignName) &&
        Objects.equals(this.campaignSubject, context118.campaignSubject) &&
        Objects.equals(this.from, context118.from) &&
        Objects.equals(this.mailingLists, context118.mailingLists) &&
        Objects.equals(this.sent, context118.sent) &&
        Objects.equals(this.to, context118.to) &&
        Objects.equals(this.totalBounces, context118.totalBounces) &&
        Objects.equals(this.totalComplaints, context118.totalComplaints) &&
        Objects.equals(this.totalForwards, context118.totalForwards) &&
        Objects.equals(this.totalLinkClicks, context118.totalLinkClicks) &&
        Objects.equals(this.totalOpens, context118.totalOpens) &&
        Objects.equals(this.totalUnsubscribes, context118.totalUnsubscribes) &&
        Objects.equals(this.uniqueForwards, context118.uniqueForwards) &&
        Objects.equals(this.uniqueLinkClicks, context118.uniqueLinkClicks) &&
        Objects.equals(this.uniqueOpens, context118.uniqueOpens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abVersion, campaignDeliveredOn, campaignID, campaignIsArchived, campaignName, campaignSubject, from, mailingLists, sent, to, totalBounces, totalComplaints, totalForwards, totalLinkClicks, totalOpens, totalUnsubscribes, uniqueForwards, uniqueLinkClicks, uniqueOpens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context118 {\n");
    
    sb.append("    abVersion: ").append(toIndentedString(abVersion)).append("\n");
    sb.append("    campaignDeliveredOn: ").append(toIndentedString(campaignDeliveredOn)).append("\n");
    sb.append("    campaignID: ").append(toIndentedString(campaignID)).append("\n");
    sb.append("    campaignIsArchived: ").append(toIndentedString(campaignIsArchived)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignSubject: ").append(toIndentedString(campaignSubject)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    mailingLists: ").append(toIndentedString(mailingLists)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    totalBounces: ").append(toIndentedString(totalBounces)).append("\n");
    sb.append("    totalComplaints: ").append(toIndentedString(totalComplaints)).append("\n");
    sb.append("    totalForwards: ").append(toIndentedString(totalForwards)).append("\n");
    sb.append("    totalLinkClicks: ").append(toIndentedString(totalLinkClicks)).append("\n");
    sb.append("    totalOpens: ").append(toIndentedString(totalOpens)).append("\n");
    sb.append("    totalUnsubscribes: ").append(toIndentedString(totalUnsubscribes)).append("\n");
    sb.append("    uniqueForwards: ").append(toIndentedString(uniqueForwards)).append("\n");
    sb.append("    uniqueLinkClicks: ").append(toIndentedString(uniqueLinkClicks)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
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

