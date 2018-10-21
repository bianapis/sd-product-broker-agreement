package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductBrokerAgreementRefreshResponse
 */
public class ProductBrokerAgreementRefreshResponse   {
  private String refreshStatus = null;


  /**
   * Get refreshStatus
   * @return refreshStatus
  **/

  public String getRefreshStatus() {
    return refreshStatus;
  }

  public void setRefreshStatus(String refreshStatus) {
    this.refreshStatus = refreshStatus;
  }


}

