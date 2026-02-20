package com.yourorg.core.kafka.event;

public record HrUserCreatedEvent(
        EventMetadata metadata,
        HrUserCreatedPayload data
) {
}
