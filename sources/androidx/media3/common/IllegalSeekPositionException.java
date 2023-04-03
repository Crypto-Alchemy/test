package androidx.media3.common;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final C0831s timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(C0831s sVar, int i, long j) {
        this.timeline = sVar;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
