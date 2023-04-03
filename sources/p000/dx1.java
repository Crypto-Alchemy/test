package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0836t;
import androidx.media3.exoplayer.source.C0973i;
import java.util.List;

/* renamed from: dx1 */
/* compiled from: ExoTrackSelection */
public interface dx1 extends bt6 {

    /* renamed from: dx1$a */
    /* compiled from: ExoTrackSelection */
    public static final class C2207a {

        /* renamed from: a */
        public final C0836t f10969a;

        /* renamed from: b */
        public final int[] f10970b;

        /* renamed from: c */
        public final int f10971c;

        public C2207a(C0836t tVar, int... iArr) {
            this(tVar, iArr, 0);
        }

        public C2207a(C0836t tVar, int[] iArr, int i) {
            if (iArr.length == 0) {
                gk3.m18127d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f10969a = tVar;
            this.f10970b = iArr;
            this.f10971c = i;
        }
    }

    /* renamed from: dx1$b */
    /* compiled from: ExoTrackSelection */
    public interface C2208b {
        /* renamed from: a */
        dx1[] mo18998a(C2207a[] aVarArr, C2332fx fxVar, C0973i.C0975b bVar, C0831s sVar);
    }

    /* renamed from: c */
    void mo7664c();

    /* renamed from: d */
    int mo7665d();

    /* renamed from: e */
    boolean mo7666e(long j, pe0 pe0, List<? extends qq3> list);

    /* renamed from: f */
    boolean mo7668f(int i, long j);

    /* renamed from: g */
    boolean mo7669g(int i, long j);

    /* renamed from: i */
    void mo7672i(float f);

    /* renamed from: j */
    Object mo7673j();

    /* renamed from: k */
    void mo7674k();

    /* renamed from: m */
    void mo7677m(long j, long j2, long j3, List<? extends qq3> list, rq3[] rq3Arr);

    /* renamed from: o */
    void mo7679o(boolean z);

    /* renamed from: p */
    void mo7680p();

    /* renamed from: q */
    int mo7681q(long j, List<? extends qq3> list);

    /* renamed from: r */
    C0792h mo7682r();

    /* renamed from: s */
    int mo7683s();

    /* renamed from: t */
    void mo7684t();
}
