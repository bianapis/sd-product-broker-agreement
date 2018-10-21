/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductBrokerAgreementApiServiceImpl implements ProductBrokerAgreementApiService {

	public ProductBrokerAgreementEvaluationResponse evaluate(ProductBrokerAgreementBase request){
		return JsonReader.read("evaluate-ProductBrokerAgreementEvaluationResponse.json",new TypeReference<ProductBrokerAgreementEvaluationResponse>(){});
	}
	
	public ProductBrokerAgreementWithIdAndRoot initiate(ProductBrokerAgreementBase request){
		return JsonReader.read("initiate-ProductBrokerAgreementWithIdAndRoot.json",new TypeReference<ProductBrokerAgreementWithIdAndRoot>(){});
	}
	
	public ProductBrokerAgreementLegalTermsWithIdAndRoot initiateLegalTerms(String crReferenceId, ProductBrokerAgreementLegalTerms request){
		return JsonReader.read("initiate-ProductBrokerAgreementLegalTermsWithIdAndRoot.json",new TypeReference<ProductBrokerAgreementLegalTermsWithIdAndRoot>(){});
	}
	
	public ProductBrokerAgreementPolicyTermsWithIdAndRoot initiatePolicyTerms(String crReferenceId, ProductBrokerAgreementPolicyTerms request){
		return JsonReader.read("initiate-ProductBrokerAgreementPolicyTermsWithIdAndRoot.json",new TypeReference<ProductBrokerAgreementPolicyTermsWithIdAndRoot>(){});
	}
	
	public ProductBrokerAgreementRegulatoryTermsWithIdAndRoot initiateRegulatoryTerms(String crReferenceId, ProductBrokerAgreementRegulatoryTerms request){
		return JsonReader.read("initiate-ProductBrokerAgreementRegulatoryTermsWithIdAndRoot.json",new TypeReference<ProductBrokerAgreementRegulatoryTermsWithIdAndRoot>(){});
	}
	
	public ProductBrokerAgreementRefreshResponse requestPut(String crReferenceId, ProductBrokerAgreementBase request){
		return JsonReader.read("requestPut-ProductBrokerAgreementRefreshResponse.json",new TypeReference<ProductBrokerAgreementRefreshResponse>(){});
	}
	
	public ProductBrokerAgreementWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ProductBrokerAgreementWithIdAndRoot.json",new TypeReference<ProductBrokerAgreementWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ProductBrokerAgreementLegalTermsWithIdAndRoot retrieveLegalTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductBrokerAgreementLegalTermsWithIdAndRoot.json",new TypeReference<ProductBrokerAgreementLegalTermsWithIdAndRoot>(){});
	}
	
	public ProductBrokerAgreementPolicyTermsWithIdAndRoot retrievePolicyTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductBrokerAgreementPolicyTermsWithIdAndRoot.json",new TypeReference<ProductBrokerAgreementPolicyTermsWithIdAndRoot>(){});
	}
	
	public ProductBrokerAgreementRegulatoryTermsWithIdAndRoot retrieveRegulatoryTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductBrokerAgreementRegulatoryTermsWithIdAndRoot.json",new TypeReference<ProductBrokerAgreementRegulatoryTermsWithIdAndRoot>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public ProductBrokerAgreementWithIdAndRoot update(String crReferenceId, ProductBrokerAgreementBase request){
		return JsonReader.read("update-ProductBrokerAgreementWithIdAndRoot.json",new TypeReference<ProductBrokerAgreementWithIdAndRoot>(){});
	}
	
}
