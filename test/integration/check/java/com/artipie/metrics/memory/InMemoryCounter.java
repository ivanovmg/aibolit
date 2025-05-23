/*
 * SPDX-FileCopyrightText: Copyright (c) 2020 artipie.com
 * SPDX-FileCopyrightText: Copyright (c) 2019-2025 Aibolit
 * SPDX-License-Identifier: MIT
 */
package com.artipie.metrics.memory;

import com.artipie.metrics.Counter;
import java.util.concurrent.atomic.AtomicLong;

/**
 * {@link Counter} implementation storing data in memory.
 *
 * @since 0.8
 */
public final class InMemoryCounter implements Counter {

    /**
     * Current counter value.
     */
    private final AtomicLong counter = new AtomicLong();

    @Override
    public void add(final long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                String.format("Amount should not be negative: %d", amount)
            );
        }
        this.counter.addAndGet(amount);
    }

    @Override
    public void inc() {
        this.counter.incrementAndGet();
    }

    /**
     * Get counter value.
     *
     * @return Counter value.
     */
    public long value() {
        return this.counter.get();
    }
}
