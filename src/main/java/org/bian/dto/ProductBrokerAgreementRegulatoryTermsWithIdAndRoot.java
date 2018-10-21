package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductBrokerAgreementRegulatoryTermsWithIdAndRoot
 */
public class ProductBrokerAgreementRegulatoryTermsWithIdAndRoot   {
  private String brokerAgreementReference = null;

  private String brokerAgreementRegulatoryTermReference = null;

  private Object brokerAgreementRegulatoryTermRecord = null;

  private String regulatoryAuthority = null;

  private String applicableRegulationReference = null;

  private String applicableRegulationInterpretation = null;


  /**
   * `status: Provisionally Registered`  bian-reference: ProductBrokerMasterAgreement 
   * @return brokerAgreementReference
  **/

  public String getBrokerAgreementReference() {
    return brokerAgreementReference;
  }

  public void setBrokerAgreementReference(String brokerAgreementReference) {
    this.brokerAgreementReference = brokerAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return brokerAgreementRegulatoryTermReference
  **/

  public String getBrokerAgreementRegulatoryTermReference() {
    return brokerAgreementRegulatoryTermReference;
  }

  public void setBrokerAgreementRegulatoryTermReference(String brokerAgreementRegulatoryTermReference) {
    this.brokerAgreementRegulatoryTermReference = brokerAgreementRegulatoryTermReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info:  Terms and Legal conditions 
   * @return brokerAgreementRegulatoryTermRecord
  **/

  public Object getBrokerAgreementRegulatoryTermRecord() {
    return brokerAgreementRegulatoryTermRecord;
  }

  public void setBrokerAgreementRegulatoryTermRecord(Object brokerAgreementRegulatoryTermRecord) {
    this.brokerAgreementRegulatoryTermRecord = brokerAgreementRegulatoryTermRecord;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9jSw8nltEeG7BsjMvd1mEw_1652971177/elements/_9jSw9HltEeG7BsjMvd1mEw_769737890) bian-reference: ProductBrokerMasterAgreement(as Agreement).TermsAndConditions.ApplicableGovernanceRule.PublicationAgency  
   * @return regulatoryAuthority
  **/

  public String getRegulatoryAuthority() {
    return regulatoryAuthority;
  }

  public void setRegulatoryAuthority(String regulatoryAuthority) {
    this.regulatoryAuthority = regulatoryAuthority;
  }


  /**
   * `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreement(as Agreement).TermsAndConditions.ApplicableGovernanceRule(as Regulation)  
   * @return applicableRegulationReference
  **/

  public String getApplicableRegulationReference() {
    return applicableRegulationReference;
  }

  public void setApplicableRegulationReference(String applicableRegulationReference) {
    this.applicableRegulationReference = applicableRegulationReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreement(as Agreement).TermsAndConditions.ApplicableGovernanceRule(as Regulation)(as GovernanceRule).Description 
   * @return applicableRegulationInterpretation
  **/

  public String getApplicableRegulationInterpretation() {
    return applicableRegulationInterpretation;
  }

  public void setApplicableRegulationInterpretation(String applicableRegulationInterpretation) {
    this.applicableRegulationInterpretation = applicableRegulationInterpretation;
  }


}

