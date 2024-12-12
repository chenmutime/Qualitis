package com.webank.wedatasphere.qualitis.rule.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author v_gaojiedeng@webank.com
 */
public class NoiseEliminationManagementResponse {

    @JsonProperty("noise_id")
    private Long noiseId;

    @JsonProperty("date_selection_method")
    private Integer dateSelectionMethod;

    @JsonProperty("business_date")
    private String businessDate;

    @JsonProperty("template_id")
    private Long templateId;

    @JsonProperty("noise_norm_ratio")
    private String noiseNormRatio;

    @JsonProperty("eliminate_strategy")
    private Integer eliminateStrategy;

    @JsonProperty("available")
    private Boolean available;

    @JsonProperty("curing_conditions")
    private Boolean curingConditions;

    public Long getNoiseId() {
        return noiseId;
    }

    public void setNoiseId(Long noiseId) {
        this.noiseId = noiseId;
    }

    public Integer getDateSelectionMethod() {
        return dateSelectionMethod;
    }

    public void setDateSelectionMethod(Integer dateSelectionMethod) {
        this.dateSelectionMethod = dateSelectionMethod;
    }

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getNoiseNormRatio() {
        return noiseNormRatio;
    }

    public void setNoiseNormRatio(String noiseNormRatio) {
        this.noiseNormRatio = noiseNormRatio;
    }

    public Integer getEliminateStrategy() {
        return eliminateStrategy;
    }

    public void setEliminateStrategy(Integer eliminateStrategy) {
        this.eliminateStrategy = eliminateStrategy;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getCuringConditions() {
        return curingConditions;
    }

    public void setCuringConditions(Boolean curingConditions) {
        this.curingConditions = curingConditions;
    }
}
