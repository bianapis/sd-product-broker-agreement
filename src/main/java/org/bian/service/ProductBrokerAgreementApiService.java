/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductBrokerAgreementApiService {

	ProductBrokerAgreementEvaluationResponse evaluate(ProductBrokerAgreementBase request);
	
	ProductBrokerAgreementWithIdAndRoot initiate(ProductBrokerAgreementBase request);
	
	ProductBrokerAgreementLegalTermsWithIdAndRoot initiateLegalTerms(String crReferenceId, ProductBrokerAgreementLegalTerms request);
	
	ProductBrokerAgreementPolicyTermsWithIdAndRoot initiatePolicyTerms(String crReferenceId, ProductBrokerAgreementPolicyTerms request);
	
	ProductBrokerAgreementRegulatoryTermsWithIdAndRoot initiateRegulatoryTerms(String crReferenceId, ProductBrokerAgreementRegulatoryTerms request);
	
	ProductBrokerAgreementRefreshResponse requestPut(String crReferenceId, ProductBrokerAgreementBase request);
	
	ProductBrokerAgreementWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	ProductBrokerAgreementLegalTermsWithIdAndRoot retrieveLegalTerms(String crReferenceId, String bqReferenceId);
	
	ProductBrokerAgreementPolicyTermsWithIdAndRoot retrievePolicyTerms(String crReferenceId, String bqReferenceId);
	
	ProductBrokerAgreementRegulatoryTermsWithIdAndRoot retrieveRegulatoryTerms(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	ProductBrokerAgreementWithIdAndRoot update(String crReferenceId, ProductBrokerAgreementBase request);
	
}
