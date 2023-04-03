package p000;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002R\u001a\u0010\r\u001a\u00020\t8\u0006XD¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Let5;", "", "Lct5;", "c", "segment", "Lr37;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "Lct5;", "LOCK", "d", "HASH_BUCKET_COUNT", "", "e", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "<init>", "()V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: et5 */
/* compiled from: SegmentPool.kt */
public final class et5 {

    /* renamed from: a */
    public static final et5 f37605a = new et5();

    /* renamed from: b */
    public static final int f37606b = 65536;

    /* renamed from: c */
    public static final ct5 f37607c = new ct5(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    public static final int f37608d;

    /* renamed from: e */
    public static final AtomicReference<ct5>[] f37609e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f37608d = highestOneBit;
        AtomicReference<ct5>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f37609e = atomicReferenceArr;
    }

    /* renamed from: b */
    public static final void m57488b(ct5 ct5) {
        boolean z;
        AtomicReference<ct5> a;
        ct5 ct52;
        int i;
        vx2.m53591g(ct5, "segment");
        if (ct5.f37205f == null && ct5.f37206g == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!ct5.f37203d && (ct52 = a.get()) != f37607c) {
            if (ct52 == null) {
                i = 0;
            } else {
                i = ct52.f37202c;
            }
            if (i < f37606b) {
                ct5.f37205f = ct52;
                ct5.f37201b = 0;
                ct5.f37202c = i + 8192;
                if (!ao0.m10672a((a = f37605a.mo51544a()), ct52, ct5)) {
                    ct5.f37205f = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static final ct5 m57489c() {
        AtomicReference<ct5> a = f37605a.mo51544a();
        ct5 ct5 = f37607c;
        ct5 andSet = a.getAndSet(ct5);
        if (andSet == ct5) {
            return new ct5();
        }
        if (andSet == null) {
            a.set((Object) null);
            return new ct5();
        }
        a.set(andSet.f37205f);
        andSet.f37205f = null;
        andSet.f37202c = 0;
        return andSet;
    }

    /* renamed from: a */
    public final AtomicReference<ct5> mo51544a() {
        return f37609e[(int) (Thread.currentThread().getId() & (((long) f37608d) - 1))];
    }
}
