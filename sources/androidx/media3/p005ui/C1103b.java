package androidx.media3.p005ui;

/* renamed from: androidx.media3.ui.b */
/* compiled from: TimeBar */
public interface C1103b {

    /* renamed from: androidx.media3.ui.b$a */
    /* compiled from: TimeBar */
    public interface C1104a {
        /* renamed from: I */
        void mo8189I(C1103b bVar, long j);

        /* renamed from: K */
        void mo8190K(C1103b bVar, long j, boolean z);

        /* renamed from: p */
        void mo8192p(C1103b bVar, long j);
    }

    /* renamed from: a */
    void mo8102a(C1104a aVar);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i);

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
