package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductBrokerAgreementLegalTerms
 */
public class ProductBrokerAgreementLegalTerms   {
  private Object brokerAgreementLegalTermRecord = null;

  private String jurisdiction = null;

  private String applicableLawReference = null;

  private String applicableLawInterpretation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return brokerAgreementLegalTermRecord
  **/

  public Object getBrokerAgreementLegalTermRecord() {
    return brokerAgreementLegalTermRecord;
  }

  public void setBrokerAgreementLegalTermRecord(Object brokerAgreementLegalTermRecord) {
    this.brokerAgreementLegalTermRecord = brokerAgreementLegalTermRecord;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E2tpUMTGEeChad0JzLk7QA_1799405832/elements/_lVDYAWZaEeOd7pBdBqENMg) bian-reference: ProductBrokerMasterAgreementt(as Agreement).Jurisdiction 
   * @return jurisdiction
  **/

  public String getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  /**
   * `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreement(as Agreement).TermsAndConditions.ApplicableGovernanceRule(as Law) 
   * @return applicableLawReference
  **/

  public String getApplicableLawReference() {
    return applicableLawReference;
  }

  public void setApplicableLawReference(String applicableLawReference) {
    this.applicableLawReference = applicableLawReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreementt(as Agreement).TermsAndConditions.ApplicableGovernanceRule(as Law)(as GovernanceRule).Description  
   * @return applicableLawInterpretation
  **/

  public String getApplicableLawInterpretation() {
    return applicableLawInterpretation;
  }

  public void setApplicableLawInterpretation(String applicableLawInterpretation) {
    this.applicableLawInterpretation = applicableLawInterpretation;
  }


}

