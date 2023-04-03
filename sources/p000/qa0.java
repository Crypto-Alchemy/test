package p000;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001al\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u0010\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a\u001c\u0010\u0012\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u000bH\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"T", "Lkotlin/Function1;", "Lns0;", "", "completion", "Lr37;", "c", "(Lrc2;Lns0;)V", "R", "Lkotlin/Function2;", "receiver", "", "onCancellation", "d", "(Lfd2;Ljava/lang/Object;Lns0;Lrc2;)V", "fatalCompletion", "b", "e", "a", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: qa0 */
/* compiled from: Cancellable.kt */
public final class qa0 {
    /* renamed from: a */
    public static final void m71195a(ns0<?> ns0, Throwable th) {
        Result.C6167a aVar = Result.Companion;
        ns0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m71196b(ns0<? super r37> ns0, ns0<?> ns02) {
        try {
            ns0<? super r37> c = IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0);
            Result.C6167a aVar = Result.Companion;
            mh1.m64330c(c, Result.m75635constructorimpl(r37.f33317a), (rc2) null, 2, (Object) null);
        } catch (Throwable th) {
            m71195a(ns02, th);
        }
    }

    /* renamed from: c */
    public static final <T> void m71197c(rc2<? super ns0<? super T>, ? extends Object> rc2, ns0<? super T> ns0) {
        try {
            ns0<r37> c = IntrinsicsKt__IntrinsicsJvmKt.m47425c(IntrinsicsKt__IntrinsicsJvmKt.m47423a(rc2, ns0));
            Result.C6167a aVar = Result.Companion;
            mh1.m64330c(c, Result.m75635constructorimpl(r37.f33317a), (rc2) null, 2, (Object) null);
        } catch (Throwable th) {
            m71195a(ns0, th);
        }
    }

    /* renamed from: d */
    public static final <R, T> void m71198d(fd2<? super R, ? super ns0<? super T>, ? extends Object> fd2, R r, ns0<? super T> ns0, rc2<? super Throwable, r37> rc2) {
        try {
            ns0<r37> c = IntrinsicsKt__IntrinsicsJvmKt.m47425c(IntrinsicsKt__IntrinsicsJvmKt.m47424b(fd2, r, ns0));
            Result.C6167a aVar = Result.Companion;
            mh1.m64329b(c, Result.m75635constructorimpl(r37.f33317a), rc2);
        } catch (Throwable th) {
            m71195a(ns0, th);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m71199e(fd2 fd2, Object obj, ns0 ns0, rc2 rc2, int i, Object obj2) {
        if ((i & 4) != 0) {
            rc2 = null;
        }
        m71198d(fd2, obj, ns0, rc2);
    }
}
