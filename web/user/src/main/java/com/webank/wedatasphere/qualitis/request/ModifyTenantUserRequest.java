/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.qualitis.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.webank.wedatasphere.qualitis.exception.UnExpectedRequestException;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

/**
 * @author howeye
 */
public class ModifyTenantUserRequest {

    @JsonProperty("tenant_user_id")
    private Long tenantUserId;
    @JsonProperty("tenant_user_name")
    private String tenantUserName;
    @JsonProperty("tenant_user_depts")
    private List<Long> deptIds;
    @JsonProperty("tenant_user_services")
    private List<Long> services;

    public ModifyTenantUserRequest() {
        // Default Constructor
    }

    public Long getTenantUserId() {
        return tenantUserId;
    }

    public void setTenantUserId(Long tenantUserId) {
        this.tenantUserId = tenantUserId;
    }

    public String getTenantUserName() {
        return tenantUserName;
    }

    public void setTenantUserName(String tenantUserName) {
        this.tenantUserName = tenantUserName;
    }

    public List<Long> getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(List<Long> deptIds) {
        this.deptIds = deptIds;
    }

    public List<Long> getServices() {
        return services;
    }

    public void setServices(List<Long> services) {
        this.services = services;
    }

    public static void checkRequest(ModifyTenantUserRequest request) throws UnExpectedRequestException {
        if (request == null) {
            throw new UnExpectedRequestException("{&REQUEST_CAN_NOT_BE_NULL}");
        }

        if (request.getTenantUserId() == null) {
            throw new UnExpectedRequestException("TenantUser id {&CAN_NOT_BE_NULL_OR_EMPTY}, request: " + request);
        }

        if (StringUtils.isBlank(request.getTenantUserName())) {
            throw new UnExpectedRequestException("TenantUser name {&CAN_NOT_BE_NULL_OR_EMPTY}, request: " + request);
        }

        if (CollectionUtils.isEmpty(request.getDeptIds())) {
            throw new UnExpectedRequestException("Depts {&CAN_NOT_BE_NULL}");
        }

        if (CollectionUtils.isEmpty(request.getServices())) {
            throw new UnExpectedRequestException("Services {&CAN_NOT_BE_NULL}");
        }
    }

    @Override
    public String toString() {
        return "ModifyProxyUserRequest{" +
                "tenantUserId=" + tenantUserId +
                ", tenantUserName='" + tenantUserName + '\'' +
                '}';
    }
}
