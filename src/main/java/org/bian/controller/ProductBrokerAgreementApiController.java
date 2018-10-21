/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.AgreeTerms;

@BianRestController
public class ProductBrokerAgreementApiController {

	@Autowired
	ProductBrokerAgreementApiService service;
	
	@AgreeTerms.Evaluate
	public BianResponse<ProductBrokerAgreementEvaluationResponse> evaluate(@RequestBody BianRequest<ProductBrokerAgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(bianRequest.getData()));
	}
	
	@AgreeTerms.Initiate
	public BianResponse<ProductBrokerAgreementWithIdAndRoot> initiate(@RequestBody BianRequest<ProductBrokerAgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@BQ("legal-terms")
	@AgreeTerms.Initiate
	public BianResponse<ProductBrokerAgreementLegalTermsWithIdAndRoot> initiateLegalTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductBrokerAgreementLegalTerms> bianRequest) {
		return BianResponse.forSuccess(service.initiateLegalTerms(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("policy-terms")
	@AgreeTerms.Initiate
	public BianResponse<ProductBrokerAgreementPolicyTermsWithIdAndRoot> initiatePolicyTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductBrokerAgreementPolicyTerms> bianRequest) {
		return BianResponse.forSuccess(service.initiatePolicyTerms(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("regulatory-terms")
	@AgreeTerms.Initiate
	public BianResponse<ProductBrokerAgreementRegulatoryTermsWithIdAndRoot> initiateRegulatoryTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductBrokerAgreementRegulatoryTerms> bianRequest) {
		return BianResponse.forSuccess(service.initiateRegulatoryTerms(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.RequestPut
	public BianResponse<ProductBrokerAgreementRefreshResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductBrokerAgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Retrieve
	public BianResponse<ProductBrokerAgreementWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@AgreeTerms.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@AgreeTerms.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@AgreeTerms.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("legal-terms")
	@AgreeTerms.Retrieve
	public BianResponse<ProductBrokerAgreementLegalTermsWithIdAndRoot> retrieveLegalTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLegalTerms(crReferenceId, bqReferenceId));
	}
	
	@BQ("policy-terms")
	@AgreeTerms.Retrieve
	public BianResponse<ProductBrokerAgreementPolicyTermsWithIdAndRoot> retrievePolicyTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePolicyTerms(crReferenceId, bqReferenceId));
	}
	
	@BQ("regulatory-terms")
	@AgreeTerms.Retrieve
	public BianResponse<ProductBrokerAgreementRegulatoryTermsWithIdAndRoot> retrieveRegulatoryTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRegulatoryTerms(crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@AgreeTerms.Update
	public BianResponse<ProductBrokerAgreementWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductBrokerAgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
