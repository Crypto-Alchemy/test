package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00060\bj\u0002`\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo44877d2 = {"", "T", "Lk90;", "a", "(Lk90;Lns0;)Ljava/lang/Object;", "b", "Lbg5;", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "d", "(Ljava/lang/Exception;Lns0;)Ljava/lang/Object;", "retrofit"}, mo44878k = 2, mo44879mv = {1, 4, 0})
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo44877d2 = {"retrofit2/KotlinExtensions$a", "Lp90;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "retrofit"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: retrofit2.KotlinExtensions$a */
    /* compiled from: KotlinExtensions.kt */
    public static final class C9244a implements p90<T> {

        /* renamed from: a */
        public final /* synthetic */ ma0 f44357a;

        public C9244a(ma0 ma0) {
            this.f44357a = ma0;
        }

        /* renamed from: a */
        public void mo47103a(k90<T> k90, Throwable th) {
            vx2.m53592h(k90, "call");
            vx2.m53592h(th, "t");
            ma0 ma0 = this.f44357a;
            Result.C6167a aVar = Result.Companion;
            ma0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(th)));
        }

        /* renamed from: b */
        public void mo47104b(k90<T> k90, bg5<T> bg5) {
            vx2.m53592h(k90, "call");
            vx2.m53592h(bg5, "response");
            if (bg5.mo50581e()) {
                T a = bg5.mo50578a();
                if (a == null) {
                    Object tag = k90.request().tag(iy2.class);
                    if (tag == null) {
                        vx2.m53601q();
                    }
                    vx2.m53587c(tag, "call.request().tag(Invocation::class.java)!!");
                    Method a2 = ((iy2) tag).mo52552a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    vx2.m53587c(a2, "method");
                    Class<?> declaringClass = a2.getDeclaringClass();
                    vx2.m53587c(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(a2.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                    ma0 ma0 = this.f44357a;
                    Result.C6167a aVar = Result.Companion;
                    ma0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(kotlinNullPointerException)));
                    return;
                }
                this.f44357a.resumeWith(Result.m75635constructorimpl(a));
                return;
            }
            ma0 ma02 = this.f44357a;
            HttpException httpException = new HttpException(bg5);
            Result.C6167a aVar2 = Result.Companion;
            ma02.resumeWith(Result.m75635constructorimpl(hg5.m45198a(httpException)));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016J \u0010\n\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo44877d2 = {"retrofit2/KotlinExtensions$b", "Lp90;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "retrofit"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: retrofit2.KotlinExtensions$b */
    /* compiled from: KotlinExtensions.kt */
    public static final class C9245b implements p90<T> {

        /* renamed from: a */
        public final /* synthetic */ ma0 f44358a;

        public C9245b(ma0 ma0) {
            this.f44358a = ma0;
        }

        /* renamed from: a */
        public void mo47103a(k90<T> k90, Throwable th) {
            vx2.m53592h(k90, "call");
            vx2.m53592h(th, "t");
            ma0 ma0 = this.f44358a;
            Result.C6167a aVar = Result.Companion;
            ma0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(th)));
        }

        /* renamed from: b */
        public void mo47104b(k90<T> k90, bg5<T> bg5) {
            vx2.m53592h(k90, "call");
            vx2.m53592h(bg5, "response");
            if (bg5.mo50581e()) {
                this.f44358a.resumeWith(Result.m75635constructorimpl(bg5.mo50578a()));
                return;
            }
            ma0 ma0 = this.f44358a;
            HttpException httpException = new HttpException(bg5);
            Result.C6167a aVar = Result.Companion;
            ma0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(httpException)));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo44877d2 = {"retrofit2/KotlinExtensions$c", "Lp90;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "retrofit"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: retrofit2.KotlinExtensions$c */
    /* compiled from: KotlinExtensions.kt */
    public static final class C9246c implements p90<T> {

        /* renamed from: a */
        public final /* synthetic */ ma0 f44359a;

        public C9246c(ma0 ma0) {
            this.f44359a = ma0;
        }

        /* renamed from: a */
        public void mo47103a(k90<T> k90, Throwable th) {
            vx2.m53592h(k90, "call");
            vx2.m53592h(th, "t");
            ma0 ma0 = this.f44359a;
            Result.C6167a aVar = Result.Companion;
            ma0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(th)));
        }

        /* renamed from: b */
        public void mo47104b(k90<T> k90, bg5<T> bg5) {
            vx2.m53592h(k90, "call");
            vx2.m53592h(bg5, "response");
            this.f44359a.resumeWith(Result.m75635constructorimpl(bg5));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo44877d2 = {"Lr37;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 0})
    /* renamed from: retrofit2.KotlinExtensions$d */
    /* compiled from: KotlinExtensions.kt */
    public static final class C9247d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ns0 f44360a;

        /* renamed from: d */
        public final /* synthetic */ Exception f44361d;

        public C9247d(ns0 ns0, Exception exc) {
            this.f44360a = ns0;
            this.f44361d = exc;
        }

        public final void run() {
            ns0 c = IntrinsicsKt__IntrinsicsJvmKt.m47425c(this.f44360a);
            Exception exc = this.f44361d;
            Result.C6167a aVar = Result.Companion;
            c.resumeWith(Result.m75635constructorimpl(hg5.m45198a(exc)));
        }
    }

    /* renamed from: a */
    public static final <T> Object m71519a(k90<T> k90, ns0<? super T> ns0) {
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56166t(new C9248x19835f10(k90));
        k90.mo50512X(new C9244a(na0));
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return s;
    }

    /* renamed from: b */
    public static final <T> Object m71520b(k90<T> k90, ns0<? super T> ns0) {
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56166t(new C9249x19835f11(k90));
        k90.mo50512X(new C9245b(na0));
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return s;
    }

    /* renamed from: c */
    public static final <T> Object m71521c(k90<T> k90, ns0<? super bg5<T>> ns0) {
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56166t(new C9250xc95e9eb1(k90));
        k90.mo50512X(new C9246c(na0));
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m71522d(java.lang.Exception r4, p000.ns0<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            p000.hg5.m45199b(r5)
            goto L_0x005c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p000.hg5.m45199b(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = p000.qh1.m71264a()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$d r3 = new retrofit2.KotlinExtensions$d
            r3.<init>(r0, r4)
            r5.mo3894m(r2, r3)
            java.lang.Object r4 = p000.wx2.m54101d()
            java.lang.Object r5 = p000.wx2.m54101d()
            if (r4 != r5) goto L_0x0059
            p000.a31.m31656c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r37 r4 = p000.r37.f33317a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m71522d(java.lang.Exception, ns0):java.lang.Object");
    }
}
