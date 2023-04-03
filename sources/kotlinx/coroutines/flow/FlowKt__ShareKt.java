package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a¨\u0006\u001c"}, mo44877d2 = {"T", "Lz42;", "Lhu0;", "scope", "Li06;", "started", "", "replay", "Lxz5;", "e", "Lh06;", "c", "(Lz42;I)Lh06;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lr04;", "shared", "initialValue", "Ly23;", "d", "(Lhu0;Lkotlin/coroutines/CoroutineContext;Lz42;Lr04;Li06;Ljava/lang/Object;)Ly23;", "Lt86;", "g", "(Lz42;Lhu0;Li06;Ljava/lang/Object;)Lt86;", "a", "Lu04;", "b", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Share.kt */
public final /* synthetic */ class FlowKt__ShareKt {
    /* renamed from: a */
    public static final <T> xz5<T> m63364a(r04<T> r04) {
        return new r75(r04, (y23) null);
    }

    /* renamed from: b */
    public static final <T> t86<T> m63365b(u04<T> u04) {
        return new t75(u04, (y23) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3 == 0) goto L_0x0034;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> p000.h06<T> m63366c(p000.z42<? extends T> r7, int r8) {
        /*
            fd0$a r0 = p000.fd0.f37749f
            int r0 = r0.mo51639a()
            int r0 = p000.d75.m43382d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L_0x003d
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            z42 r2 = r1.mo51901k()
            if (r2 == 0) goto L_0x003d
            h06 r7 = new h06
            int r3 = r1.f40453d
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L_0x0027
            r4 = -2
            if (r3 == r4) goto L_0x0027
            if (r3 == 0) goto L_0x0027
            r0 = r3
            goto L_0x0035
        L_0x0027:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f40454e
            kotlinx.coroutines.channels.BufferOverflow r6 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r6) goto L_0x0030
            if (r3 != 0) goto L_0x0035
            goto L_0x0034
        L_0x0030:
            if (r8 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = r5
        L_0x0035:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.f40454e
            kotlin.coroutines.CoroutineContext r1 = r1.f40452a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L_0x003d:
            h06 r8 = new h06
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.m63366c(z42, int):h06");
    }

    /* renamed from: d */
    public static final <T> y23 m63367d(hu0 hu0, CoroutineContext coroutineContext, z42<? extends T> z42, r04<T> r04, i06 i06, T t) {
        CoroutineStart coroutineStart;
        if (vx2.m53586b(i06, i06.f38305a.mo52358c())) {
            coroutineStart = CoroutineStart.DEFAULT;
        } else {
            coroutineStart = CoroutineStart.UNDISPATCHED;
        }
        return b50.m55764a(hu0, coroutineContext, coroutineStart, new FlowKt__ShareKt$launchSharing$1(i06, z42, r04, t, (ns0<? super FlowKt__ShareKt$launchSharing$1>) null));
    }

    /* renamed from: e */
    public static final <T> xz5<T> m63368e(z42<? extends T> z42, hu0 hu0, i06 i06, int i) {
        h06<? extends T> c = m63366c(z42, i);
        r04 a = yz5.m74702a(i, c.f38139b, c.f38140c);
        return new r75(a, m63367d(hu0, c.f38141d, c.f38138a, a, i06, yz5.f46310a));
    }

    /* renamed from: f */
    public static /* synthetic */ xz5 m63369f(z42 z42, hu0 hu0, i06 i06, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return e52.m57204E(z42, hu0, i06, i);
    }

    /* renamed from: g */
    public static final <T> t86<T> m63370g(z42<? extends T> z42, hu0 hu0, i06 i06, T t) {
        h06<? extends T> c = m63366c(z42, 1);
        u04 a = u86.m72658a(t);
        return new t75(a, m63367d(hu0, c.f38141d, c.f38138a, a, i06, t));
    }
}
