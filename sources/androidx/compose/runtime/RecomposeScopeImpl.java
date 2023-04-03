package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bV\u0010WJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019J\u0006\u0010\u001d\u001a\u00020\u0005J\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u0011R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f8\u0006@BX\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010!R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R*\u0010;\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000309\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010:R$\u0010@\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8B@BX\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010C\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8@@BX\u000e¢\u0006\f\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u0011\u0010E\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bD\u0010=R\u0011\u0010G\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bF\u0010=R$\u0010J\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u000e¢\u0006\f\u001a\u0004\bH\u0010=\"\u0004\bI\u0010?R$\u0010M\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u000e¢\u0006\f\u001a\u0004\bK\u0010=\"\u0004\bL\u0010?R$\u0010P\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u000e¢\u0006\f\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R$\u0010S\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u000e¢\u0006\f\u001a\u0004\bQ\u0010=\"\u0004\bR\u0010?R\u0011\u0010U\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bT\u0010=¨\u0006X"}, mo44877d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Lnn5;", "Lo85;", "Lnn0;", "composer", "Lr37;", "h", "", "value", "Landroidx/compose/runtime/InvalidationResult;", "s", "w", "Lbo0;", "composition", "g", "invalidate", "Lkotlin/Function2;", "", "block", "a", "token", "F", "y", "instance", "v", "Lfq2;", "instances", "", "u", "x", "Lkotlin/Function1;", "Lvn0;", "i", "I", "flags", "<set-?>", "b", "Lbo0;", "l", "()Lbo0;", "Lbg;", "c", "Lbg;", "j", "()Lbg;", "z", "(Lbg;)V", "anchor", "d", "Lfd2;", "e", "currentToken", "Ldq2;", "f", "Ldq2;", "trackedInstances", "Leq2;", "Lqc1;", "Leq2;", "trackedDependencies", "o", "()Z", "C", "(Z)V", "rereading", "p", "D", "skipped", "r", "valid", "k", "canRecompose", "q", "E", "used", "m", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "A", "defaultsInvalid", "n", "B", "requiresRecompose", "t", "isConditional", "<init>", "(Lbo0;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RecomposeScopeImpl.kt */
public final class RecomposeScopeImpl implements nn5, o85 {

    /* renamed from: a */
    public int f1528a;

    /* renamed from: b */
    public bo0 f1529b;

    /* renamed from: c */
    public C1628bg f1530c;

    /* renamed from: d */
    public fd2<? super nn0, ? super Integer, r37> f1531d;

    /* renamed from: e */
    public int f1532e;

    /* renamed from: f */
    public dq2 f1533f;

    /* renamed from: g */
    public eq2<qc1<?>, Object> f1534g;

    public RecomposeScopeImpl(bo0 bo0) {
        this.f1529b = bo0;
    }

    /* renamed from: A */
    public final void mo3059A(boolean z) {
        if (z) {
            this.f1528a |= 4;
        } else {
            this.f1528a &= -5;
        }
    }

    /* renamed from: B */
    public final void mo3060B(boolean z) {
        if (z) {
            this.f1528a |= 8;
        } else {
            this.f1528a &= -9;
        }
    }

    /* renamed from: C */
    public final void mo3061C(boolean z) {
        if (z) {
            this.f1528a |= 32;
        } else {
            this.f1528a &= -33;
        }
    }

    /* renamed from: D */
    public final void mo3062D(boolean z) {
        if (z) {
            this.f1528a |= 16;
        } else {
            this.f1528a &= -17;
        }
    }

    /* renamed from: E */
    public final void mo3063E(boolean z) {
        if (z) {
            this.f1528a |= 1;
        } else {
            this.f1528a &= -2;
        }
    }

    /* renamed from: F */
    public final void mo3064F(int i) {
        this.f1532e = i;
        mo3062D(false);
    }

    /* renamed from: a */
    public void mo3065a(fd2<? super nn0, ? super Integer, r37> fd2) {
        vx2.m53591g(fd2, "block");
        this.f1531d = fd2;
    }

    /* renamed from: g */
    public final void mo3066g(bo0 bo0) {
        vx2.m53591g(bo0, "composition");
        this.f1529b = bo0;
    }

    /* renamed from: h */
    public final void mo3067h(nn0 nn0) {
        r37 r37;
        vx2.m53591g(nn0, "composer");
        fd2<? super nn0, ? super Integer, r37> fd2 = this.f1531d;
        if (fd2 != null) {
            fd2.invoke(nn0, 1);
            r37 = r37.f33317a;
        } else {
            r37 = null;
        }
        if (r37 == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    /* renamed from: i */
    public final rc2<vn0, r37> mo3068i(int i) {
        boolean z;
        dq2 dq2 = this.f1533f;
        if (dq2 == null || mo3076p()) {
            return null;
        }
        int e = dq2.mo18880e();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= e) {
                break;
            }
            vx2.m53589e(dq2.mo18879d()[i2], "null cannot be cast to non-null type kotlin.Any");
            if (dq2.mo18881f()[i2] != i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            return new RecomposeScopeImpl$end$1$2(this, i, dq2);
        }
        return null;
    }

    public void invalidate() {
        bo0 bo0 = this.f1529b;
        if (bo0 != null) {
            bo0.mo11765z(this, (Object) null);
        }
    }

    /* renamed from: j */
    public final C1628bg mo3070j() {
        return this.f1530c;
    }

    /* renamed from: k */
    public final boolean mo3071k() {
        if (this.f1531d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final bo0 mo3072l() {
        return this.f1529b;
    }

    /* renamed from: m */
    public final boolean mo3073m() {
        if ((this.f1528a & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo3074n() {
        if ((this.f1528a & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo3075o() {
        if ((this.f1528a & 32) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo3076p() {
        if ((this.f1528a & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo3077q() {
        if ((this.f1528a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean mo3078r() {
        boolean z;
        if (this.f1529b == null) {
            return false;
        }
        C1628bg bgVar = this.f1530c;
        if (bgVar != null) {
            z = bgVar.mo11640b();
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final InvalidationResult mo3079s(Object obj) {
        InvalidationResult z;
        bo0 bo0 = this.f1529b;
        if (bo0 == null || (z = bo0.mo11765z(this, obj)) == null) {
            return InvalidationResult.IGNORED;
        }
        return z;
    }

    /* renamed from: t */
    public final boolean mo3080t() {
        if (this.f1534g != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049 A[SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3081u(p000.fq2<java.lang.Object> r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            eq2<qc1<?>, java.lang.Object> r1 = r6.f1534g
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            boolean r2 = r7.mo20053q()
            if (r2 == 0) goto L_0x004d
            boolean r2 = r7.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x0018
        L_0x0016:
            r7 = r0
            goto L_0x004a
        L_0x0018:
            java.util.Iterator r7 = r7.iterator()
        L_0x001c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0016
            java.lang.Object r2 = r7.next()
            boolean r4 = r2 instanceof p000.qc1
            if (r4 == 0) goto L_0x0046
            qc1 r2 = (p000.qc1) r2
            h56 r4 = r2.mo25070a()
            if (r4 != 0) goto L_0x0036
            h56 r4 = p000.i56.m19417f()
        L_0x0036:
            java.lang.Object r5 = r2.mo25071c()
            java.lang.Object r2 = r1.mo19459e(r2)
            boolean r2 = r4.mo11485b(r5, r2)
            if (r2 == 0) goto L_0x0046
            r2 = r0
            goto L_0x0047
        L_0x0046:
            r2 = r3
        L_0x0047:
            if (r2 != 0) goto L_0x001c
            r7 = r3
        L_0x004a:
            if (r7 == 0) goto L_0x004d
            return r3
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.mo3081u(fq2):boolean");
    }

    /* renamed from: v */
    public final void mo3082v(Object obj) {
        vx2.m53591g(obj, "instance");
        if (!mo3075o()) {
            dq2 dq2 = this.f1533f;
            if (dq2 == null) {
                dq2 = new dq2();
                this.f1533f = dq2;
            }
            dq2.mo18876a(obj, this.f1532e);
            if (obj instanceof qc1) {
                eq2<qc1<?>, Object> eq2 = this.f1534g;
                if (eq2 == null) {
                    eq2 = new eq2<>(0, 1, (DefaultConstructorMarker) null);
                    this.f1534g = eq2;
                }
                eq2.mo19465k(obj, ((qc1) obj).mo25071c());
            }
        }
    }

    /* renamed from: w */
    public final void mo3083w() {
        this.f1529b = null;
        this.f1533f = null;
        this.f1534g = null;
    }

    /* renamed from: x */
    public final void mo3084x() {
        dq2 dq2;
        bo0 bo0 = this.f1529b;
        if (bo0 != null && (dq2 = this.f1533f) != null) {
            mo3061C(true);
            try {
                int e = dq2.mo18880e();
                for (int i = 0; i < e; i++) {
                    Object obj = dq2.mo18879d()[i];
                    vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i2 = dq2.mo18881f()[i];
                    bo0.mo11753n(obj);
                }
            } finally {
                mo3061C(false);
            }
        }
    }

    /* renamed from: y */
    public final void mo3085y() {
        mo3062D(true);
    }

    /* renamed from: z */
    public final void mo3086z(C1628bg bgVar) {
        this.f1530c = bgVar;
    }
}
