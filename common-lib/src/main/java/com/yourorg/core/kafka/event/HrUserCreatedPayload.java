package com.yourorg.core.kafka.event;

import java.time.Instant;

import com.yourorg.core.constant.enums.UserStatus;
import com.yourorg.core.constant.enums.UserType;

public record HrUserCreatedPayload(
        String tenantCode,
        String employeeId,
        String email,
        String displayName,
        UserType userType,
        UserStatus status,
        Instant terminatedAt,
        Instant createdAt,
        Instant updatedAt
) {
}
