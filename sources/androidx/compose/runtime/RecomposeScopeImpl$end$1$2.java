package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lvn0;", "composition", "Lr37;", "invoke", "(Lvn0;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: RecomposeScopeImpl.kt */
public final class RecomposeScopeImpl$end$1$2 extends Lambda implements rc2<vn0, r37> {
    public final /* synthetic */ dq2 $instances;
    public final /* synthetic */ int $token;
    public final /* synthetic */ RecomposeScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i, dq2 dq2) {
        super(1);
        this.this$0 = recomposeScopeImpl;
        this.$token = i;
        this.$instances = dq2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((vn0) obj);
        return r37.f33317a;
    }

    public final void invoke(vn0 vn0) {
        vx2.m53591g(vn0, "composition");
        if (this.this$0.f1532e == this.$token && vx2.m53586b(this.$instances, this.this$0.f1533f) && (vn0 instanceof bo0)) {
            dq2 dq2 = this.$instances;
            int i = this.$token;
            RecomposeScopeImpl recomposeScopeImpl = this.this$0;
            int e = dq2.mo18880e();
            int i2 = 0;
            for (int i3 = 0; i3 < e; i3++) {
                Object obj = dq2.mo18879d()[i3];
                vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Any");
                int i4 = dq2.mo18881f()[i3];
                boolean z = i4 != i;
                if (z) {
                    bo0 bo0 = (bo0) vn0;
                    bo0.mo11739D(obj, recomposeScopeImpl);
                    qc1 qc1 = obj instanceof qc1 ? (qc1) obj : null;
                    if (qc1 != null) {
                        bo0.mo11738C(qc1);
                        eq2 c = recomposeScopeImpl.f1534g;
                        if (c != null) {
                            c.mo19464j(qc1);
                            if (c.mo19461g() == 0) {
                                recomposeScopeImpl.f1534g = null;
                            }
                        }
                    }
                }
                if (!z) {
                    if (i2 != i3) {
                        dq2.mo18879d()[i2] = obj;
                        dq2.mo18881f()[i2] = i4;
                    }
                    i2++;
                }
            }
            int e2 = dq2.mo18880e();
            for (int i5 = i2; i5 < e2; i5++) {
                dq2.mo18879d()[i5] = null;
            }
            dq2.mo18882g(i2);
            if (this.$instances.mo18880e() == 0) {
                this.this$0.f1533f = null;
            }
        }
    }
}
