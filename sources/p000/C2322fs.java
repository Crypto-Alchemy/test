package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: fs */
/* compiled from: AsynchronousMediaCodecCallback */
public final class C2322fs extends MediaCodec.Callback {

    /* renamed from: a */
    public final Object f12009a = new Object();

    /* renamed from: b */
    public final HandlerThread f12010b;

    /* renamed from: c */
    public Handler f12011c;

    /* renamed from: d */
    public final hw2 f12012d;

    /* renamed from: e */
    public final hw2 f12013e;

    /* renamed from: f */
    public final ArrayDeque<MediaCodec.BufferInfo> f12014f;

    /* renamed from: g */
    public final ArrayDeque<MediaFormat> f12015g;

    /* renamed from: h */
    public MediaFormat f12016h;

    /* renamed from: i */
    public MediaFormat f12017i;

    /* renamed from: j */
    public MediaCodec.CodecException f12018j;

    /* renamed from: k */
    public long f12019k;

    /* renamed from: l */
    public boolean f12020l;

    /* renamed from: m */
    public IllegalStateException f12021m;

    public C2322fs(HandlerThread handlerThread) {
        this.f12010b = handlerThread;
        this.f12012d = new hw2();
        this.f12013e = new hw2();
        this.f12014f = new ArrayDeque<>();
        this.f12015g = new ArrayDeque<>();
    }

    /* renamed from: b */
    public final void mo20120b(MediaFormat mediaFormat) {
        this.f12013e.mo21408a(-2);
        this.f12015g.add(mediaFormat);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo20121c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12009a
            monitor-enter(r0)
            boolean r1 = r3.mo20127i()     // Catch:{ all -> 0x0020 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000c:
            r3.mo20128j()     // Catch:{ all -> 0x0020 }
            hw2 r1 = r3.f12012d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.mo21411d()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            hw2 r1 = r3.f12012d     // Catch:{ all -> 0x0020 }
            int r2 = r1.mo21412e()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2322fs.mo20121c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo20122d(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f12009a
            monitor-enter(r0)
            boolean r1 = r9.mo20127i()     // Catch:{ all -> 0x004a }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x000c:
            r9.mo20128j()     // Catch:{ all -> 0x004a }
            hw2 r1 = r9.f12013e     // Catch:{ all -> 0x004a }
            boolean r1 = r1.mo21411d()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x0019:
            hw2 r1 = r9.f12013e     // Catch:{ all -> 0x004a }
            int r1 = r1.mo21412e()     // Catch:{ all -> 0x004a }
            if (r1 < 0) goto L_0x003b
            android.media.MediaFormat r2 = r9.f12016h     // Catch:{ all -> 0x004a }
            p000.C2725kr.m20989i(r2)     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f12014f     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004a }
            int r4 = r2.offset     // Catch:{ all -> 0x004a }
            int r5 = r2.size     // Catch:{ all -> 0x004a }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004a }
            int r8 = r2.flags     // Catch:{ all -> 0x004a }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x003b:
            r10 = -2
            if (r1 != r10) goto L_0x0048
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f12015g     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004a }
            r9.f12016h = r10     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2322fs.mo20122d(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: e */
    public void mo20123e() {
        synchronized (this.f12009a) {
            this.f12019k++;
            ((Handler) w67.m29360j(this.f12011c)).post(new C2249es(this));
        }
    }

    /* renamed from: f */
    public final void mo20124f() {
        if (!this.f12015g.isEmpty()) {
            this.f12017i = this.f12015g.getLast();
        }
        this.f12012d.mo21409b();
        this.f12013e.mo21409b();
        this.f12014f.clear();
        this.f12015g.clear();
        this.f12018j = null;
    }

    /* renamed from: g */
    public MediaFormat mo20125g() {
        MediaFormat mediaFormat;
        synchronized (this.f12009a) {
            mediaFormat = this.f12016h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void mo20126h(MediaCodec mediaCodec) {
        boolean z;
        if (this.f12011c == null) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f12010b.start();
        Handler handler = new Handler(this.f12010b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f12011c = handler;
    }

    /* renamed from: i */
    public final boolean mo20127i() {
        if (this.f12019k > 0 || this.f12020l) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo20128j() {
        mo20129k();
        mo20130l();
    }

    /* renamed from: k */
    public final void mo20129k() {
        IllegalStateException illegalStateException = this.f12021m;
        if (illegalStateException != null) {
            this.f12021m = null;
            throw illegalStateException;
        }
    }

    /* renamed from: l */
    public final void mo20130l() {
        MediaCodec.CodecException codecException = this.f12018j;
        if (codecException != null) {
            this.f12018j = null;
            throw codecException;
        }
    }

    /* renamed from: m */
    public final void mo20131m() {
        synchronized (this.f12009a) {
            if (!this.f12020l) {
                long j = this.f12019k - 1;
                this.f12019k = j;
                if (j <= 0) {
                    if (j < 0) {
                        mo20132n(new IllegalStateException());
                    } else {
                        mo20124f();
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo20132n(IllegalStateException illegalStateException) {
        synchronized (this.f12009a) {
            this.f12021m = illegalStateException;
        }
    }

    /* renamed from: o */
    public void mo20133o() {
        synchronized (this.f12009a) {
            this.f12020l = true;
            this.f12010b.quit();
            mo20124f();
        }
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f12009a) {
            this.f12018j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f12009a) {
            this.f12012d.mo21408a(i);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f12009a) {
            MediaFormat mediaFormat = this.f12017i;
            if (mediaFormat != null) {
                mo20120b(mediaFormat);
                this.f12017i = null;
            }
            this.f12013e.mo21408a(i);
            this.f12014f.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f12009a) {
            mo20120b(mediaFormat);
            this.f12017i = null;
        }
    }
}
