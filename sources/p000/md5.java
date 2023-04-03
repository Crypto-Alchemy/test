package p000;

import androidx.media3.common.C0792h;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import p000.cr4;

/* renamed from: md5 */
/* compiled from: Renderer */
public interface md5 extends cr4.C2116b {

    /* renamed from: md5$a */
    /* compiled from: Renderer */
    public interface C2822a {
        /* renamed from: a */
        void mo11280a();

        /* renamed from: b */
        void mo11281b();
    }

    /* renamed from: c */
    void mo21683c();

    /* renamed from: e */
    boolean mo7149e();

    /* renamed from: f */
    int mo21684f();

    /* renamed from: g */
    boolean mo7150g();

    String getName();

    int getState();

    /* renamed from: h */
    yk5 mo21686h();

    /* renamed from: i */
    boolean mo21687i();

    /* renamed from: j */
    void mo21688j();

    /* renamed from: l */
    void mo21689l(pd5 pd5, C0792h[] hVarArr, yk5 yk5, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    /* renamed from: m */
    void mo21690m() throws IOException;

    /* renamed from: n */
    boolean mo21691n();

    /* renamed from: o */
    void mo21692o(C0792h[] hVarArr, yk5 yk5, long j, long j2) throws ExoPlaybackException;

    /* renamed from: p */
    od5 mo21693p();

    /* renamed from: r */
    void mo7465r(float f, float f2) throws ExoPlaybackException;

    void reset();

    /* renamed from: s */
    void mo21695s(int i, br4 br4);

    void start() throws ExoPlaybackException;

    void stop();

    /* renamed from: u */
    void mo7468u(long j, long j2) throws ExoPlaybackException;

    /* renamed from: v */
    long mo21698v();

    /* renamed from: w */
    void mo21699w(long j) throws ExoPlaybackException;

    /* renamed from: x */
    sq3 mo7162x();
}
