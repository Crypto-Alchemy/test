package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0003\u0012\u000b\u0013B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo44877d2 = {"Landroidx/paging/SingleRunner;", "", "", "priority", "Lkotlin/Function1;", "Lns0;", "Lr37;", "block", "b", "(ILrc2;Lns0;)Ljava/lang/Object;", "Landroidx/paging/SingleRunner$Holder;", "a", "Landroidx/paging/SingleRunner$Holder;", "holder", "", "cancelPreviousInEqualPriority", "<init>", "(Z)V", "CancelIsolatedRunnerException", "Holder", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: SingleRunner.kt */
public final class SingleRunner {

    /* renamed from: b */
    public static final C1192a f6236b = new C1192a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final Holder f6237a;

    @Metadata(mo44875bv = {1, 0, 3}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "runner", "Landroidx/paging/SingleRunner;", "(Landroidx/paging/SingleRunner;)V", "getRunner", "()Landroidx/paging/SingleRunner;", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* compiled from: SingleRunner.kt */
    public static final class CancelIsolatedRunnerException extends CancellationException {
        private final SingleRunner runner;

        public CancelIsolatedRunnerException(SingleRunner singleRunner) {
            vx2.m53591g(singleRunner, "runner");
            this.runner = singleRunner;
        }

        public final SingleRunner getRunner() {
            return this.runner;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, mo44877d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "", "priority", "Ly23;", "job", "", "b", "(ILy23;Lns0;)Ljava/lang/Object;", "Lr37;", "a", "(Ly23;Lns0;)Ljava/lang/Object;", "Ly04;", "Ly04;", "mutex", "Ly23;", "previous", "c", "I", "previousPriority", "Landroidx/paging/SingleRunner;", "d", "Landroidx/paging/SingleRunner;", "singleRunner", "e", "Z", "cancelPreviousInEqualPriority", "<init>", "(Landroidx/paging/SingleRunner;Z)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* compiled from: SingleRunner.kt */
    public static final class Holder {

        /* renamed from: a */
        public final y04 f6238a = z04.m74724b(false, 1, (Object) null);

        /* renamed from: b */
        public y23 f6239b;

        /* renamed from: c */
        public int f6240c;

        /* renamed from: d */
        public final SingleRunner f6241d;

        /* renamed from: e */
        public final boolean f6242e;

        public Holder(SingleRunner singleRunner, boolean z) {
            vx2.m53591g(singleRunner, "singleRunner");
            this.f6241d = singleRunner;
            this.f6242e = z;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0063 }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo8756a(p000.y23 r6, p000.ns0<? super p000.r37> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.SingleRunner$Holder$onFinish$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = (androidx.paging.SingleRunner$Holder$onFinish$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = new androidx.paging.SingleRunner$Holder$onFinish$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0040
                if (r2 != r3) goto L_0x0038
                java.lang.Object r6 = r0.L$2
                y04 r6 = (p000.y04) r6
                java.lang.Object r1 = r0.L$1
                y23 r1 = (p000.y23) r1
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                p000.hg5.m45199b(r7)
                r7 = r6
                r6 = r1
                goto L_0x0055
            L_0x0038:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0040:
                p000.hg5.m45199b(r7)
                y04 r7 = r5.f6238a
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r0 = r7.mo55746a(r4, r0)
                if (r0 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r0 = r5
            L_0x0055:
                y23 r1 = r0.f6239b     // Catch:{ all -> 0x0063 }
                if (r6 != r1) goto L_0x005b
                r0.f6239b = r4     // Catch:{ all -> 0x0063 }
            L_0x005b:
                r37 r6 = p000.r37.f33317a     // Catch:{ all -> 0x0063 }
                r7.mo55747b(r4)
                r37 r6 = p000.r37.f33317a
                return r6
            L_0x0063:
                r6 = move-exception
                r7.mo55747b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.mo8756a(y23, ns0):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[Catch:{ all -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[Catch:{ all -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo8757b(int r10, p000.y23 r11, p000.ns0<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof androidx.paging.SingleRunner$Holder$tryEnqueue$1
                if (r0 == 0) goto L_0x0013
                r0 = r12
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = (androidx.paging.SingleRunner$Holder$tryEnqueue$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = new androidx.paging.SingleRunner$Holder$tryEnqueue$1
                r0.<init>(r9, r12)
            L_0x0018:
                java.lang.Object r12 = r0.result
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0059
                if (r2 == r5) goto L_0x0047
                if (r2 != r3) goto L_0x003f
                int r10 = r0.I$0
                java.lang.Object r11 = r0.L$2
                y04 r11 = (p000.y04) r11
                java.lang.Object r1 = r0.L$1
                y23 r1 = (p000.y23) r1
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                p000.hg5.m45199b(r12)     // Catch:{ all -> 0x003c }
                goto L_0x00aa
            L_0x003c:
                r10 = move-exception
                goto L_0x00b8
            L_0x003f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0047:
                int r10 = r0.I$0
                java.lang.Object r11 = r0.L$2
                y04 r11 = (p000.y04) r11
                java.lang.Object r2 = r0.L$1
                y23 r2 = (p000.y23) r2
                java.lang.Object r6 = r0.L$0
                androidx.paging.SingleRunner$Holder r6 = (androidx.paging.SingleRunner.Holder) r6
                p000.hg5.m45199b(r12)
                goto L_0x0072
            L_0x0059:
                p000.hg5.m45199b(r12)
                y04 r12 = r9.f6238a
                r0.L$0 = r9
                r0.L$1 = r11
                r0.L$2 = r12
                r0.I$0 = r10
                r0.label = r5
                java.lang.Object r2 = r12.mo55746a(r4, r0)
                if (r2 != r1) goto L_0x006f
                return r1
            L_0x006f:
                r6 = r9
                r2 = r11
                r11 = r12
            L_0x0072:
                y23 r12 = r6.f6239b     // Catch:{ all -> 0x003c }
                if (r12 == 0) goto L_0x0089
                boolean r7 = r12.mo55502a()     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0089
                int r7 = r6.f6240c     // Catch:{ all -> 0x003c }
                if (r7 < r10) goto L_0x0089
                if (r7 != r10) goto L_0x0087
                boolean r7 = r6.f6242e     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r5 = 0
                goto L_0x00b0
            L_0x0089:
                if (r12 == 0) goto L_0x0095
                androidx.paging.SingleRunner$CancelIsolatedRunnerException r7 = new androidx.paging.SingleRunner$CancelIsolatedRunnerException     // Catch:{ all -> 0x003c }
                androidx.paging.SingleRunner r8 = r6.f6241d     // Catch:{ all -> 0x003c }
                r7.<init>(r8)     // Catch:{ all -> 0x003c }
                r12.mo52179c(r7)     // Catch:{ all -> 0x003c }
            L_0x0095:
                if (r12 == 0) goto L_0x00ac
                r0.L$0 = r6     // Catch:{ all -> 0x003c }
                r0.L$1 = r2     // Catch:{ all -> 0x003c }
                r0.L$2 = r11     // Catch:{ all -> 0x003c }
                r0.I$0 = r10     // Catch:{ all -> 0x003c }
                r0.label = r3     // Catch:{ all -> 0x003c }
                java.lang.Object r12 = r12.mo55508g(r0)     // Catch:{ all -> 0x003c }
                if (r12 != r1) goto L_0x00a8
                return r1
            L_0x00a8:
                r1 = r2
                r0 = r6
            L_0x00aa:
                r6 = r0
                r2 = r1
            L_0x00ac:
                r6.f6239b = r2     // Catch:{ all -> 0x003c }
                r6.f6240c = r10     // Catch:{ all -> 0x003c }
            L_0x00b0:
                java.lang.Boolean r10 = p000.a40.m31670a(r5)     // Catch:{ all -> 0x003c }
                r11.mo55747b(r4)
                return r10
            L_0x00b8:
                r11.mo55747b(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.mo8757b(int, y23, ns0):java.lang.Object");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Landroidx/paging/SingleRunner$a;", "", "", "DEFAULT_PRIORITY", "I", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.SingleRunner$a */
    /* compiled from: SingleRunner.kt */
    public static final class C1192a {
        public C1192a() {
        }

        public /* synthetic */ C1192a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SingleRunner() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public SingleRunner(boolean z) {
        this.f6237a = new Holder(this, z);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m8544c(SingleRunner singleRunner, int i, rc2 rc2, ns0 ns0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return singleRunner.mo8754b(i, rc2, ns0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo8754b(int r5, p000.rc2<? super p000.ns0<? super p000.r37>, ? extends java.lang.Object> r6, p000.ns0<? super p000.r37> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.SingleRunner$runInIsolation$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.paging.SingleRunner$runInIsolation$1 r0 = (androidx.paging.SingleRunner$runInIsolation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.SingleRunner$runInIsolation$1 r0 = new androidx.paging.SingleRunner$runInIsolation$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.L$0
            androidx.paging.SingleRunner r5 = (androidx.paging.SingleRunner) r5
            p000.hg5.m45199b(r7)     // Catch:{ CancelIsolatedRunnerException -> 0x002d }
            goto L_0x0053
        L_0x002d:
            r6 = move-exception
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            p000.hg5.m45199b(r7)
            androidx.paging.SingleRunner$runInIsolation$2 r7 = new androidx.paging.SingleRunner$runInIsolation$2     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            r0.L$0 = r4     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            r0.label = r3     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            java.lang.Object r5 = p000.iu0.m59115e(r7, r0)     // Catch:{ CancelIsolatedRunnerException -> 0x004b }
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x004b:
            r6 = move-exception
            r5 = r4
        L_0x004d:
            androidx.paging.SingleRunner r7 = r6.getRunner()
            if (r7 != r5) goto L_0x0056
        L_0x0053:
            r37 r5 = p000.r37.f33317a
            return r5
        L_0x0056:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.mo8754b(int, rc2, ns0):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleRunner(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
