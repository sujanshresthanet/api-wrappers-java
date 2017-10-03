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
import io.swagger.client.model.MailingLists134;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:14:23.257Z")
public class A {
  @SerializedName("ABVersion")
  private Double abVersion = null;

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
  private List<MailingLists134> mailingLists = null;

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

  public A abVersion(Double abVersion) {
    this.abVersion = abVersion;
    return this;
  }

   /**
   * 
   * @return abVersion
  **/
  @ApiModelProperty(value = "")
  public Double getAbVersion() {
    return abVersion;
  }

  public void setAbVersion(Double abVersion) {
    this.abVersion = abVersion;
  }

  public A campaignDeliveredOn(String campaignDeliveredOn) {
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

  public A campaignID(String campaignID) {
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

  public A campaignIsArchived(Boolean campaignIsArchived) {
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

  public A campaignName(String campaignName) {
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

  public A campaignSubject(String campaignSubject) {
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

  public A from(String from) {
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

  public A mailingLists(List<MailingLists134> mailingLists) {
    this.mailingLists = mailingLists;
    return this;
  }

  public A addMailingListsItem(MailingLists134 mailingListsItem) {
    if (this.mailingLists == null) {
      this.mailingLists = new ArrayList<MailingLists134>();
    }
    this.mailingLists.add(mailingListsItem);
    return this;
  }

   /**
   * 
   * @return mailingLists
  **/
  @ApiModelProperty(value = "")
  public List<MailingLists134> getMailingLists() {
    return mailingLists;
  }

  public void setMailingLists(List<MailingLists134> mailingLists) {
    this.mailingLists = mailingLists;
  }

  public A sent(Double sent) {
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

  public A to(String to) {
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

  public A totalBounces(Double totalBounces) {
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

  public A totalComplaints(Double totalComplaints) {
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

  public A totalForwards(Double totalForwards) {
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

  public A totalLinkClicks(Double totalLinkClicks) {
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

  public A totalOpens(Double totalOpens) {
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

  public A totalUnsubscribes(Double totalUnsubscribes) {
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

  public A uniqueForwards(Double uniqueForwards) {
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

  public A uniqueLinkClicks(Double uniqueLinkClicks) {
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

  public A uniqueOpens(Double uniqueOpens) {
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
    A A = (A) o;
    return Objects.equals(this.abVersion, A.abVersion) &&
        Objects.equals(this.campaignDeliveredOn, A.campaignDeliveredOn) &&
        Objects.equals(this.campaignID, A.campaignID) &&
        Objects.equals(this.campaignIsArchived, A.campaignIsArchived) &&
        Objects.equals(this.campaignName, A.campaignName) &&
        Objects.equals(this.campaignSubject, A.campaignSubject) &&
        Objects.equals(this.from, A.from) &&
        Objects.equals(this.mailingLists, A.mailingLists) &&
        Objects.equals(this.sent, A.sent) &&
        Objects.equals(this.to, A.to) &&
        Objects.equals(this.totalBounces, A.totalBounces) &&
        Objects.equals(this.totalComplaints, A.totalComplaints) &&
        Objects.equals(this.totalForwards, A.totalForwards) &&
        Objects.equals(this.totalLinkClicks, A.totalLinkClicks) &&
        Objects.equals(this.totalOpens, A.totalOpens) &&
        Objects.equals(this.totalUnsubscribes, A.totalUnsubscribes) &&
        Objects.equals(this.uniqueForwards, A.uniqueForwards) &&
        Objects.equals(this.uniqueLinkClicks, A.uniqueLinkClicks) &&
        Objects.equals(this.uniqueOpens, A.uniqueOpens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abVersion, campaignDeliveredOn, campaignID, campaignIsArchived, campaignName, campaignSubject, from, mailingLists, sent, to, totalBounces, totalComplaints, totalForwards, totalLinkClicks, totalOpens, totalUnsubscribes, uniqueForwards, uniqueLinkClicks, uniqueOpens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class A {\n");
    
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

