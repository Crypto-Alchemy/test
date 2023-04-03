package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.yx3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, mo44877d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Lyx3;", "", "timeNanos", "Lr37;", "w", "R", "Lkotlin/Function1;", "onFrame", "d", "(Lrc2;Lns0;)Ljava/lang/Object;", "", "cause", "t", "Lkotlin/Function0;", "a", "Lpc2;", "onNewAwaiters", "", "Ljava/lang/Object;", "lock", "e", "Ljava/lang/Throwable;", "failureCause", "", "Landroidx/compose/runtime/BroadcastFrameClock$a;", "g", "Ljava/util/List;", "awaiters", "k", "spareList", "", "u", "()Z", "hasAwaiters", "<init>", "(Lpc2;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BroadcastFrameClock.kt */
public final class BroadcastFrameClock implements yx3 {

    /* renamed from: a */
    public final pc2<r37> f1435a;

    /* renamed from: d */
    public final Object f1436d = new Object();

    /* renamed from: e */
    public Throwable f1437e;

    /* renamed from: g */
    public List<C0336a<?>> f1438g = new ArrayList();

    /* renamed from: k */
    public List<C0336a<?>> f1439k = new ArrayList();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$a;", "R", "", "", "timeNanos", "Lr37;", "b", "Lkotlin/Function1;", "a", "Lrc2;", "getOnFrame", "()Lrc2;", "onFrame", "Lns0;", "Lns0;", "()Lns0;", "continuation", "<init>", "(Lrc2;Lns0;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.BroadcastFrameClock$a */
    /* compiled from: BroadcastFrameClock.kt */
    public static final class C0336a<R> {

        /* renamed from: a */
        public final rc2<Long, R> f1440a;

        /* renamed from: b */
        public final ns0<R> f1441b;

        public C0336a(rc2<? super Long, ? extends R> rc2, ns0<? super R> ns0) {
            vx2.m53591g(rc2, "onFrame");
            vx2.m53591g(ns0, "continuation");
            this.f1440a = rc2;
            this.f1441b = ns0;
        }

        /* renamed from: a */
        public final ns0<R> mo2878a() {
            return this.f1441b;
        }

        /* renamed from: b */
        public final void mo2879b(long j) {
            Object obj;
            ns0<R> ns0 = this.f1441b;
            try {
                Result.C6167a aVar = Result.Companion;
                obj = Result.m75635constructorimpl(this.f1440a.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.C6167a aVar2 = Result.Companion;
                obj = Result.m75635constructorimpl(hg5.m45198a(th));
            }
            ns0.resumeWith(obj);
        }
    }

    public BroadcastFrameClock(pc2<r37> pc2) {
        this.f1435a = pc2;
    }

    /* renamed from: d */
    public <R> Object mo2869d(rc2<? super Long, ? extends R> rc2, ns0<? super R> ns0) {
        boolean z;
        C0336a aVar;
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.f1436d) {
            Throwable m = this.f1437e;
            if (m != null) {
                Result.C6167a aVar2 = Result.Companion;
                na0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(m)));
            } else {
                ref$ObjectRef.element = new C0336a(rc2, na0);
                if (!this.f1438g.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                List i = this.f1438g;
                T t = ref$ObjectRef.element;
                if (t == null) {
                    vx2.m53605u("awaiter");
                    aVar = null;
                } else {
                    aVar = (C0336a) t;
                }
                i.add(aVar);
                boolean z2 = !z;
                na0.mo56166t(new BroadcastFrameClock$withFrameNanos$2$1(this, ref$ObjectRef));
                if (z2 && this.f1435a != null) {
                    try {
                        this.f1435a.invoke();
                    } catch (Throwable th) {
                        mo2875t(th);
                    }
                }
            }
        }
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return s;
    }

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        return yx3.C3700a.m30852a(this, r, fd2);
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        return yx3.C3700a.m30853b(this, bVar);
    }

    public /* synthetic */ CoroutineContext.C6190b getKey() {
        return xx3.m30341a(this);
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return yx3.C3700a.m30854c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return yx3.C3700a.m30855d(this, coroutineContext);
    }

    /* renamed from: t */
    public final void mo2875t(Throwable th) {
        synchronized (this.f1436d) {
            if (this.f1437e == null) {
                this.f1437e = th;
                List<C0336a<?>> list = this.f1438g;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ns0 a = list.get(i).mo2878a();
                    Result.C6167a aVar = Result.Companion;
                    a.resumeWith(Result.m75635constructorimpl(hg5.m45198a(th)));
                }
                this.f1438g.clear();
                r37 r37 = r37.f33317a;
            }
        }
    }

    /* renamed from: u */
    public final boolean mo2876u() {
        boolean z;
        synchronized (this.f1436d) {
            z = !this.f1438g.isEmpty();
        }
        return z;
    }

    /* renamed from: w */
    public final void mo2877w(long j) {
        synchronized (this.f1436d) {
            List<C0336a<?>> list = this.f1438g;
            this.f1438g = this.f1439k;
            this.f1439k = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo2879b(j);
            }
            list.clear();
            r37 r37 = r37.f33317a;
        }
    }
}
