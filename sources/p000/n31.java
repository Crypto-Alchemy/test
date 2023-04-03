package p000;

/* renamed from: n31 */
/* compiled from: DecoderCounters */
public final class n31 {

    /* renamed from: a */
    public int f15306a;

    /* renamed from: b */
    public int f15307b;

    /* renamed from: c */
    public int f15308c;

    /* renamed from: d */
    public int f15309d;

    /* renamed from: e */
    public int f15310e;

    /* renamed from: f */
    public int f15311f;

    /* renamed from: g */
    public int f15312g;

    /* renamed from: h */
    public int f15313h;

    /* renamed from: i */
    public int f15314i;

    /* renamed from: j */
    public int f15315j;

    /* renamed from: k */
    public long f15316k;

    /* renamed from: l */
    public int f15317l;

    /* renamed from: a */
    public void mo23486a(long j) {
        mo23487b(j, 1);
    }

    /* renamed from: b */
    public final void mo23487b(long j, int i) {
        this.f15316k += j;
        this.f15317l += i;
    }

    /* renamed from: c */
    public synchronized void mo23488c() {
    }

    public String toString() {
        return w67.m29294A("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f15306a), Integer.valueOf(this.f15307b), Integer.valueOf(this.f15308c), Integer.valueOf(this.f15309d), Integer.valueOf(this.f15310e), Integer.valueOf(this.f15311f), Integer.valueOf(this.f15312g), Integer.valueOf(this.f15313h), Integer.valueOf(this.f15314i), Integer.valueOf(this.f15315j), Long.valueOf(this.f15316k), Integer.valueOf(this.f15317l));
    }
}
