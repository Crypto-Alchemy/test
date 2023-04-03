package p000;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import p000.C6966d7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010R>\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0004@BX\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, mo44877d2 = {"Lb7;", "Ld7;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "j", "()Ld7;", "", "size", "", "k", "(I)[Ld7;", "i", "slot", "Lr37;", "l", "(Ld7;)V", "<set-?>", "a", "[Ld7;", "n", "()[Ld7;", "getSlots$annotations", "()V", "slots", "d", "I", "m", "()I", "nCollectors", "e", "nextIndex", "Lrc6;", "g", "Lrc6;", "_subscriptionCount", "Lt86;", "c", "()Lt86;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: b7 */
/* compiled from: AbstractSharedFlow.kt */
public abstract class C6850b7<S extends C6966d7<?>> {

    /* renamed from: a */
    public S[] f36692a;

    /* renamed from: d */
    public int f36693d;

    /* renamed from: e */
    public int f36694e;

    /* renamed from: g */
    public rc6 f36695g;

    /* renamed from: c */
    public final t86<Integer> mo50501c() {
        rc6 rc6;
        synchronized (this) {
            rc6 = this.f36695g;
            if (rc6 == null) {
                rc6 = new rc6(this.f36693d);
                this.f36695g = rc6;
            }
        }
        return rc6;
    }

    /* renamed from: i */
    public final S mo50502i() {
        S s;
        rc6 rc6;
        synchronized (this) {
            S[] sArr = this.f36692a;
            if (sArr == null) {
                sArr = mo50504k(2);
                this.f36692a = sArr;
            } else if (this.f36693d >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                vx2.m53590f(copyOf, "copyOf(this, newSize)");
                this.f36692a = (C6966d7[]) copyOf;
                sArr = (C6966d7[]) copyOf;
            }
            int i = this.f36694e;
            do {
                s = sArr[i];
                if (s == null) {
                    s = mo50503j();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.mo51147a(this));
            this.f36694e = i;
            this.f36693d++;
            rc6 = this.f36695g;
        }
        if (rc6 != null) {
            rc6.mo65632a0(1);
        }
        return s;
    }

    /* renamed from: j */
    public abstract S mo50503j();

    /* renamed from: k */
    public abstract S[] mo50504k(int i);

    /* renamed from: l */
    public final void mo50505l(S s) {
        rc6 rc6;
        int i;
        ns0[] b;
        synchronized (this) {
            int i2 = this.f36693d - 1;
            this.f36693d = i2;
            rc6 = this.f36695g;
            if (i2 == 0) {
                this.f36694e = 0;
            }
            b = s.mo51148b(this);
        }
        for (ns0 ns0 : b) {
            if (ns0 != null) {
                Result.C6167a aVar = Result.Companion;
                ns0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
            }
        }
        if (rc6 != null) {
            rc6.mo65632a0(-1);
        }
    }

    /* renamed from: m */
    public final int mo50506m() {
        return this.f36693d;
    }

    /* renamed from: n */
    public final S[] mo50507n() {
        return this.f36692a;
    }
}
