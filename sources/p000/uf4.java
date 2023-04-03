package p000;

import androidx.compose.runtime.ComposerKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001b"}, mo44877d2 = {"Luf4;", "N", "Ltp;", "node", "Lr37;", "f", "(Ljava/lang/Object;)V", "h", "", "index", "instance", "c", "(ILjava/lang/Object;)V", "e", "count", "b", "from", "to", "a", "clear", "Ltp;", "applier", "I", "offset", "nesting", "<init>", "(Ltp;I)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: uf4 */
/* compiled from: Applier.kt */
public final class uf4<N> implements C3379tp<N> {

    /* renamed from: a */
    public final C3379tp<N> f18468a;

    /* renamed from: b */
    public final int f18469b;

    /* renamed from: c */
    public int f18470c;

    public uf4(C3379tp<N> tpVar, int i) {
        vx2.m53591g(tpVar, "applier");
        this.f18468a = tpVar;
        this.f18469b = i;
    }

    /* renamed from: a */
    public void mo20932a(int i, int i2, int i3) {
        int i4;
        if (this.f18470c == 0) {
            i4 = this.f18469b;
        } else {
            i4 = 0;
        }
        this.f18468a.mo20932a(i + i4, i2 + i4, i3);
    }

    /* renamed from: b */
    public void mo20933b(int i, int i2) {
        int i3;
        C3379tp<N> tpVar = this.f18468a;
        if (this.f18470c == 0) {
            i3 = this.f18469b;
        } else {
            i3 = 0;
        }
        tpVar.mo20933b(i + i3, i2);
    }

    /* renamed from: c */
    public void mo20934c(int i, N n) {
        int i2;
        C3379tp<N> tpVar = this.f18468a;
        if (this.f18470c == 0) {
            i2 = this.f18469b;
        } else {
            i2 = 0;
        }
        tpVar.mo20934c(i + i2, n);
    }

    public void clear() {
        ComposerKt.m2032x("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public /* synthetic */ void mo20935d() {
        C3295sp.m27063b(this);
    }

    /* renamed from: e */
    public void mo20936e(int i, N n) {
        int i2;
        C3379tp<N> tpVar = this.f18468a;
        if (this.f18470c == 0) {
            i2 = this.f18469b;
        } else {
            i2 = 0;
        }
        tpVar.mo20936e(i + i2, n);
    }

    /* renamed from: f */
    public void mo25329f(N n) {
        this.f18470c++;
        this.f18468a.mo25329f(n);
    }

    /* renamed from: g */
    public /* synthetic */ void mo25330g() {
        C3295sp.m27062a(this);
    }

    /* renamed from: h */
    public void mo25331h() {
        boolean z;
        int i = this.f18470c;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f18470c = i - 1;
            this.f18468a.mo25331h();
            return;
        }
        ComposerKt.m2032x("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }
}
