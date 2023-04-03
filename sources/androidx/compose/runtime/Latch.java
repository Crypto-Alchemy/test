package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo44877d2 = {"Landroidx/compose/runtime/Latch;", "", "Lr37;", "d", "f", "c", "(Lns0;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "lock", "", "Lns0;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "e", "()Z", "isOpen", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Latch.kt */
public final class Latch {

    /* renamed from: a */
    public final Object f1515a = new Object();

    /* renamed from: b */
    public List<ns0<r37>> f1516b = new ArrayList();

    /* renamed from: c */
    public List<ns0<r37>> f1517c = new ArrayList();

    /* renamed from: d */
    public boolean f1518d = true;

    /* renamed from: c */
    public final Object mo3029c(ns0<? super r37> ns0) {
        if (mo3031e()) {
            return r37.f33317a;
        }
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        synchronized (this.f1515a) {
            this.f1516b.add(na0);
        }
        na0.mo56166t(new Latch$await$2$2(this, na0));
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    /* renamed from: d */
    public final void mo3030d() {
        synchronized (this.f1515a) {
            this.f1518d = false;
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: e */
    public final boolean mo3031e() {
        boolean z;
        synchronized (this.f1515a) {
            z = this.f1518d;
        }
        return z;
    }

    /* renamed from: f */
    public final void mo3032f() {
        synchronized (this.f1515a) {
            if (!mo3031e()) {
                List<ns0<r37>> list = this.f1516b;
                this.f1516b = this.f1517c;
                this.f1517c = list;
                this.f1518d = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Result.C6167a aVar = Result.Companion;
                    list.get(i).resumeWith(Result.m75635constructorimpl(r37.f33317a));
                }
                list.clear();
                r37 r37 = r37.f33317a;
            }
        }
    }
}
