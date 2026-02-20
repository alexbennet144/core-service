package com.yourorg.core.kafka.event;

import java.time.Instant;
import java.util.UUID;

public record EventMetadata(
        UUID eventId,
        String eventType,
        String eventVersion,
        Instant occurredAt,
        String source
) {
}
