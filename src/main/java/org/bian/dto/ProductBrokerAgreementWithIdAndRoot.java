package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductBrokerAgreementWithIdAndRoot
 */
public class ProductBrokerAgreementWithIdAndRoot   {
  private String brokerAgreementReference = null;

  private Object brokerAgreemenRecord = null;

  private String partyReference = null;

  private String agreementType = null;

  private String agreementJurisdiction = null;

  private String agreementValidFromToDate = null;

  private String agreementSignaturesResponsibleParties = null;

  private String documentReference = null;


  /**
   * `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreement 
   * @return brokerAgreementReference
  **/

  public String getBrokerAgreementReference() {
    return brokerAgreementReference;
  }

  public void setBrokerAgreementReference(String brokerAgreementReference) {
    this.brokerAgreementReference = brokerAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info:  Terms combined for the complete agreement 
   * @return brokerAgreemenRecord
  **/

  public Object getBrokerAgreemenRecord() {
    return brokerAgreemenRecord;
  }

  public void setBrokerAgreemenRecord(Object brokerAgreemenRecord) {
    this.brokerAgreemenRecord = brokerAgreemenRecord;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633) bian-reference: ProductBrokerMasterAgreement.ProductBrokerRelationship.ProductBroker(as Role).Player(as Party) 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreement.ProductBrokerRelationship.EngagementModel 
   * @return agreementType
  **/

  public String getAgreementType() {
    return agreementType;
  }

  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E2tpUMTGEeChad0JzLk7QA_1799405832/elements/_lVDYAWZaEeOd7pBdBqENMg) bian-reference: ProductBrokerMasterAgreement(as Agreement).Jurisdiction  
   * @return agreementJurisdiction
  **/

  public String getAgreementJurisdiction() {
    return agreementJurisdiction;
  }

  public void setAgreementJurisdiction(String agreementJurisdiction) {
    this.agreementJurisdiction = agreementJurisdiction;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E2tpUMTGEeChad0JzLk7QA_1799405832/elements/_llDYQIiZEeGjuoi-J4XM2Q_2033941627) bian-reference: ProductBrokerMasterAgreement(as Agreement).ValidityPeriod 
   * @return agreementValidFromToDate
  **/

  public String getAgreementValidFromToDate() {
    return agreementValidFromToDate;
  }

  public void setAgreementValidFromToDate(String agreementValidFromToDate) {
    this.agreementValidFromToDate = agreementValidFromToDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return agreementSignaturesResponsibleParties
  **/

  public String getAgreementSignaturesResponsibleParties() {
    return agreementSignaturesResponsibleParties;
  }

  public void setAgreementSignaturesResponsibleParties(String agreementSignaturesResponsibleParties) {
    this.agreementSignaturesResponsibleParties = agreementSignaturesResponsibleParties;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E2tpUMTGEeChad0JzLk7QA_1799405832/elements/_K5uxMMRaEeGGj8mSL0xBEQ_-912494530) bian-reference: ProductBrokerMasterAgreement(as Agreement).MaterialisingDocument  `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreement(as Agreement).Attachment 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


}

