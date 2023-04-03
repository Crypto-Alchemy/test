package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", mo48632f = "Recomposer.kt", mo48633l = {882}, mo48634m = "invokeSuspend")
/* compiled from: Recomposer.kt */
public final class Recomposer$recompositionRunner$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ id2<hu0, yx3, ns0<? super r37>, Object> $block;
    public final /* synthetic */ yx3 $parentFrameClock;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", mo48632f = "Recomposer.kt", mo48633l = {883}, mo48634m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2 */
    /* compiled from: Recomposer.kt */
    public static final class C03462 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            C03462 r0 = new C03462(id2, yx3, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C03462) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                id2<hu0, yx3, ns0<? super r37>, Object> id2 = id2;
                yx3 yx3 = yx3;
                this.label = 1;
                if (id2.invoke((hu0) this.L$0, yx3, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                hg5.m45199b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, id2<? super hu0, ? super yx3, ? super ns0<? super r37>, ? extends Object> id2, yx3 yx3, ns0<? super Recomposer$recompositionRunner$2> ns0) {
        super(2, ns0);
        this.this$0 = recomposer;
        this.$block = id2;
        this.$parentFrameClock = yx3;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, ns0);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((Recomposer$recompositionRunner$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        y23 y23;
        qf4 qf4;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            y23 = g33.m58015l(((hu0) this.L$0).mo6303A());
            this.this$0.mo3116l0(y23);
            qf4 e = a56.f41e.mo66e(new Recomposer$recompositionRunner$2$unregisterApplyObserver$1(this.this$0));
            Recomposer.f1535v.mo3120c(this.this$0.f1559u);
            try {
                Object E = this.this$0.f1543e;
                Recomposer recomposer = this.this$0;
                synchronized (E) {
                    List z = recomposer.f1546h;
                    int size = z.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((kt0) z.get(i2)).mo11762w();
                    }
                    r37 r37 = r37.f33317a;
                }
                final id2<hu0, yx3, ns0<? super r37>, Object> id2 = this.$block;
                final yx3 yx3 = this.$parentFrameClock;
                C03462 r4 = new C03462((ns0<? super C03462>) null);
                this.L$0 = y23;
                this.L$1 = e;
                this.label = 1;
                if (iu0.m59115e(r4, this) == d) {
                    return d;
                }
                qf4 = e;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                qf4 = e;
                th = th3;
                qf4.dispose();
                Object E2 = this.this$0.f1543e;
                Recomposer recomposer2 = this.this$0;
                synchronized (E2) {
                    if (recomposer2.f1544f == y23) {
                        recomposer2.f1544f = null;
                    }
                    ma0 unused = recomposer2.mo3091U();
                }
                Recomposer.f1535v.mo3121d(this.this$0.f1559u);
                throw th;
            }
        } else if (i == 1) {
            qf4 = (qf4) this.L$1;
            y23 = (y23) this.L$0;
            try {
                hg5.m45199b(obj);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qf4.dispose();
        Object E3 = this.this$0.f1543e;
        Recomposer recomposer3 = this.this$0;
        synchronized (E3) {
            if (recomposer3.f1544f == y23) {
                recomposer3.f1544f = null;
            }
            ma0 unused2 = recomposer3.mo3091U();
        }
        Recomposer.f1535v.mo3121d(this.this$0.f1559u);
        return r37.f33317a;
    }
}
