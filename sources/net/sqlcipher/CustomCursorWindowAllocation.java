package net.sqlcipher;

public class CustomCursorWindowAllocation implements CursorWindowAllocation {
    private long growthPaddingSize;
    private long initialAllocationSize;
    private long maxAllocationSize;

    public CustomCursorWindowAllocation(long j, long j2, long j3) {
        this.initialAllocationSize = j;
        this.growthPaddingSize = j2;
        this.maxAllocationSize = j3;
    }

    public long getGrowthPaddingSize() {
        return this.growthPaddingSize;
    }

    public long getInitialAllocationSize() {
        return this.initialAllocationSize;
    }

    public long getMaxAllocationSize() {
        return this.maxAllocationSize;
    }
}
