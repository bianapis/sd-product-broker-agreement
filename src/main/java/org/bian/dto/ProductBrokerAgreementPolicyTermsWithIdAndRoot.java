package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductBrokerAgreementPolicyTermsWithIdAndRoot
 */
public class ProductBrokerAgreementPolicyTermsWithIdAndRoot   {
  private String brokerAgreementReference = null;

  private String brokerAgreementPolicyTermReference = null;

  private Object brokerAgreementPolicyTermRecord = null;

  private String bankPolicyGuidelineType = null;

  private String applicableBankPolicyRuleReference = null;

  private String applicableBankPolicyRuleInterpretation = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return brokerAgreementPolicyTermReference
  **/

  public String getBrokerAgreementPolicyTermReference() {
    return brokerAgreementPolicyTermReference;
  }

  public void setBrokerAgreementPolicyTermReference(String brokerAgreementPolicyTermReference) {
    this.brokerAgreementPolicyTermReference = brokerAgreementPolicyTermReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return brokerAgreementPolicyTermRecord
  **/

  public Object getBrokerAgreementPolicyTermRecord() {
    return brokerAgreementPolicyTermRecord;
  }

  public void setBrokerAgreementPolicyTermRecord(Object brokerAgreementPolicyTermRecord) {
    this.brokerAgreementPolicyTermRecord = brokerAgreementPolicyTermRecord;
  }


  /**
   * `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreement(as Agreement).TermsAndConditions.ApplicableGovernanceRule(as Policy)(as GovernanceRule).Type 
   * @return bankPolicyGuidelineType
  **/

  public String getBankPolicyGuidelineType() {
    return bankPolicyGuidelineType;
  }

  public void setBankPolicyGuidelineType(String bankPolicyGuidelineType) {
    this.bankPolicyGuidelineType = bankPolicyGuidelineType;
  }


  /**
   * `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreement(as Agreement).TermsAndConditions.ApplicableGovernanceRule(as Policy)(as GovernanceRule) 
   * @return applicableBankPolicyRuleReference
  **/

  public String getApplicableBankPolicyRuleReference() {
    return applicableBankPolicyRuleReference;
  }

  public void setApplicableBankPolicyRuleReference(String applicableBankPolicyRuleReference) {
    this.applicableBankPolicyRuleReference = applicableBankPolicyRuleReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: ProductBrokerMasterAgreement(as Agreement).TermsAndConditions.ApplicableGovernanceRule(as Policy)(as GovernanceRule).Description 
   * @return applicableBankPolicyRuleInterpretation
  **/

  public String getApplicableBankPolicyRuleInterpretation() {
    return applicableBankPolicyRuleInterpretation;
  }

  public void setApplicableBankPolicyRuleInterpretation(String applicableBankPolicyRuleInterpretation) {
    this.applicableBankPolicyRuleInterpretation = applicableBankPolicyRuleInterpretation;
  }


}

