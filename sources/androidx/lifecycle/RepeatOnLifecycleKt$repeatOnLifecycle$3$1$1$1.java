package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Lug3;", "<anonymous parameter 0>", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lr37;", "f", "(Lug3;Landroidx/lifecycle/Lifecycle$Event;)V"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: RepeatOnLifecycle.kt */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements C0715e {

    /* renamed from: a */
    public final /* synthetic */ Lifecycle.Event f3920a;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef<y23> f3921d;

    /* renamed from: e */
    public final /* synthetic */ hu0 f3922e;

    /* renamed from: g */
    public final /* synthetic */ Lifecycle.Event f3923g;

    /* renamed from: k */
    public final /* synthetic */ ma0<r37> f3924k;

    /* renamed from: r */
    public final /* synthetic */ y04 f3925r;

    /* renamed from: s */
    public final /* synthetic */ fd2<hu0, ns0<? super r37>, Object> f3926s;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
    @v21(mo48631c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", mo48632f = "RepeatOnLifecycle.kt", mo48633l = {171, 110}, mo48634m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 */
    /* compiled from: RepeatOnLifecycle.kt */
    public static final class C07021 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C07021(y04, fd2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C07021) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th;
            y04 y04;
            y04 y042;
            fd2<hu0, ns0<? super r37>, Object> fd2;
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                y042 = y04;
                fd2 = fd2;
                this.L$0 = y042;
                this.L$1 = fd2;
                this.label = 1;
                if (y042.mo55746a((Object) null, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                fd2 = (fd2) this.L$1;
                hg5.m45199b(obj);
                y042 = (y04) this.L$0;
            } else if (i == 2) {
                y04 = (y04) this.L$0;
                try {
                    hg5.m45199b(obj);
                    r37 r37 = r37.f33317a;
                    y04.mo55747b((Object) null);
                    return r37.f33317a;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(fd2, (ns0<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1>) null);
                this.L$0 = y042;
                this.L$1 = null;
                this.label = 2;
                if (iu0.m59115e(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == d) {
                    return d;
                }
                y04 = y042;
                r37 r372 = r37.f33317a;
                y04.mo55747b((Object) null);
                return r37.f33317a;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                y04 = y042;
                th = th4;
                y04.mo55747b((Object) null);
                throw th;
            }
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(Lifecycle.Event event, Ref$ObjectRef<y23> ref$ObjectRef, hu0 hu0, Lifecycle.Event event2, ma0<? super r37> ma0, y04 y04, fd2<? super hu0, ? super ns0<? super r37>, ? extends Object> fd2) {
        this.f3920a = event;
        this.f3921d = ref$ObjectRef;
        this.f3922e = hu0;
        this.f3923g = event2;
        this.f3924k = ma0;
        this.f3925r = y04;
        this.f3926s = fd2;
    }

    /* renamed from: f */
    public final void mo907f(ug3 ug3, Lifecycle.Event event) {
        vx2.m53591g(ug3, "<anonymous parameter 0>");
        vx2.m53591g(event, "event");
        if (event == this.f3920a) {
            Ref$ObjectRef<y23> ref$ObjectRef = this.f3921d;
            hu0 hu0 = this.f3922e;
            final y04 y04 = this.f3925r;
            final fd2<hu0, ns0<? super r37>, Object> fd2 = this.f3926s;
            ref$ObjectRef.element = d50.m56748b(hu0, (CoroutineContext) null, (CoroutineStart) null, new C07021((ns0<? super C07021>) null), 3, (Object) null);
            return;
        }
        if (event == this.f3923g) {
            y23 y23 = (y23) this.f3921d.element;
            if (y23 != null) {
                y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
            }
            this.f3921d.element = null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            ma0<r37> ma0 = this.f3924k;
            Result.C6167a aVar = Result.Companion;
            ma0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
        }
    }
}
