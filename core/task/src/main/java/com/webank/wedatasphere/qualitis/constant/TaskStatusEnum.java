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

package com.webank.wedatasphere.qualitis.constant;

/**
 * @author howeye
 */
public enum TaskStatusEnum {
    /**
     * Task status
     * 1 submitted，2 inited，3 running，4 succeed，5 pass verification,
     * 6 failed verification, 7 failed, 8 task not exist, 9 cancelled, 10 timeout, 11 scheduled
     */
    SUBMITTED(1, "已提交", "SUBMITTED"),
    INITED(2, "初始化", "INITED"),
    RUNNING(3, "运行中", "RUNNING"),
    SUCCEED(4, "成功", "SUCCEED"),
    PASS_CHECKOUT(5, "通过校验", "PASS_CHECKOUT"),
    FAIL_CHECKOUT(6, "未通过校验", "FAIL_CHECKOUT"),
    FAILED(7, "失败", "FAILED"),
    TASK_NOT_EXIST(8, "Task不存在", "TASK_NOT_EXIST"),
    CANCELLED(9, "取消", "CANCELLED"),
    TIMEOUT(10, "超时", "TIMEOUT"),
    SCHEDULED(11, "调度中", "SCHEDULED"),
    ;

    private Integer code;
    private String message;
    private String state;

    TaskStatusEnum(Integer code, String message, String state) {
        this.code = code;
        this.message = message;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getState() {
        return state;
    }

    public static String getTaskStateByCode(Integer code) {
        for (TaskStatusEnum t : TaskStatusEnum.values()) {
            if (t.getCode().equals(code)) {
                return t.getState();
            }
        }

        return null;
    }
}
