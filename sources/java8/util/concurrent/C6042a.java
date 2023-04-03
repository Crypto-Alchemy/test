package java8.util.concurrent;

import java.lang.Thread;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.Permission;
import java.security.Permissions;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java8.util.concurrent.C6052b;
import java8.util.concurrent.CompletableFuture;
import java8.util.concurrent.ForkJoinTask;
import sun.misc.Unsafe;

/* renamed from: java8.util.concurrent.a */
/* compiled from: ForkJoinPool */
public class C6042a extends AbstractExecutorService {

    /* renamed from: C */
    public static final C6046c f30336C = new C6044b((C6043a) null);

    /* renamed from: H */
    public static final RuntimePermission f30337H = new RuntimePermission("modifyThread");

    /* renamed from: I */
    public static final C6042a f30338I;

    /* renamed from: L */
    public static final int f30339L;

    /* renamed from: M */
    public static final int f30340M;

    /* renamed from: P */
    public static int f30341P;

    /* renamed from: Q */
    public static final Unsafe f30342Q;

    /* renamed from: U */
    public static final long f30343U;

    /* renamed from: X */
    public static final long f30344X;

    /* renamed from: Y */
    public static final int f30345Y;

    /* renamed from: Z */
    public static final int f30346Z;

    /* renamed from: e0 */
    public static final Class<?> f30347e0 = CompletableFuture.C6039b.class;

    /* renamed from: A */
    public final Thread.UncaughtExceptionHandler f30348A;

    /* renamed from: B */
    public final ju4<? super C6042a> f30349B;

    /* renamed from: a */
    public volatile long f30350a;

    /* renamed from: d */
    public volatile long f30351d;

    /* renamed from: e */
    public final long f30352e;

    /* renamed from: g */
    public int f30353g;

    /* renamed from: k */
    public final int f30354k;

    /* renamed from: r */
    public volatile int f30355r;

    /* renamed from: s */
    public C6051g[] f30356s;

    /* renamed from: x */
    public final String f30357x;

    /* renamed from: y */
    public final C6046c f30358y;

    /* renamed from: java8.util.concurrent.a$a */
    /* compiled from: ForkJoinPool */
    public static class C6043a implements PrivilegedAction<C6042a> {
        /* renamed from: a */
        public C6042a run() {
            return new C6042a((byte) 0, (C6043a) null);
        }
    }

    /* renamed from: java8.util.concurrent.a$b */
    /* compiled from: ForkJoinPool */
    public static final class C6044b implements C6046c {

        /* renamed from: a */
        public static final AccessControlContext f30359a = C6042a.m46243f(new RuntimePermission("getClassLoader"));

        /* renamed from: java8.util.concurrent.a$b$a */
        /* compiled from: ForkJoinPool */
        public class C6045a implements PrivilegedAction<C6052b> {

            /* renamed from: a */
            public final /* synthetic */ C6042a f30360a;

            public C6045a(C6042a aVar) {
                this.f30360a = aVar;
            }

            /* renamed from: a */
            public C6052b run() {
                return new C6052b(this.f30360a, ClassLoader.getSystemClassLoader());
            }
        }

        public C6044b() {
        }

        public /* synthetic */ C6044b(C6043a aVar) {
            this();
        }

        /* renamed from: a */
        public final C6052b mo44278a(C6042a aVar) {
            return (C6052b) AccessController.doPrivileged(new C6045a(aVar), f30359a);
        }
    }

    /* renamed from: java8.util.concurrent.a$c */
    /* compiled from: ForkJoinPool */
    public interface C6046c {
        /* renamed from: a */
        C6052b mo44278a(C6042a aVar);
    }

    /* renamed from: java8.util.concurrent.a$d */
    /* compiled from: ForkJoinPool */
    public static final class C6047d implements C6046c {

        /* renamed from: a */
        public static final AccessControlContext f30362a = C6042a.m46243f(C6042a.f30337H, new RuntimePermission("enableContextClassLoaderOverride"), new RuntimePermission("modifyThreadGroup"), new RuntimePermission("getClassLoader"), new RuntimePermission("setContextClassLoader"));

        /* renamed from: java8.util.concurrent.a$d$a */
        /* compiled from: ForkJoinPool */
        public class C6048a implements PrivilegedAction<C6052b> {

            /* renamed from: a */
            public final /* synthetic */ C6042a f30363a;

            public C6048a(C6042a aVar) {
                this.f30363a = aVar;
            }

            /* renamed from: a */
            public C6052b run() {
                return new C6052b.C6053a(this.f30363a);
            }
        }

        public C6047d() {
        }

        public /* synthetic */ C6047d(C6043a aVar) {
            this();
        }

        /* renamed from: a */
        public final C6052b mo44278a(C6042a aVar) {
            return (C6052b) AccessController.doPrivileged(new C6048a(aVar), f30362a);
        }
    }

    /* renamed from: java8.util.concurrent.a$e */
    /* compiled from: ForkJoinPool */
    public interface C6049e {
        boolean block() throws InterruptedException;

        boolean isReleasable();
    }

    /* renamed from: java8.util.concurrent.a$f */
    /* compiled from: ForkJoinPool */
    public static final class C6050f {

        /* renamed from: a */
        public static final gw3 f30365a = new gw3();

        /* renamed from: b */
        public static final Unsafe f30366b;

        /* renamed from: c */
        public static final long f30367c;

        static {
            Unsafe unsafe = n47.f31967a;
            f30366b = unsafe;
            try {
                f30367c = unsafe.objectFieldOffset(gw3.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new ExceptionInInitializerError(e);
            }
        }

        /* renamed from: a */
        public static void m46283a() {
            f30366b.putIntVolatile(f30365a, f30367c, 0);
        }

        /* renamed from: b */
        public static void m46284b() {
            f30366b.putOrderedInt(f30365a, f30367c, 0);
        }
    }

    /* renamed from: java8.util.concurrent.a$g */
    /* compiled from: ForkJoinPool */
    public static final class C6051g {

        /* renamed from: k */
        public static final Unsafe f30368k;

        /* renamed from: l */
        public static final long f30369l;

        /* renamed from: m */
        public static final int f30370m;

        /* renamed from: n */
        public static final int f30371n;

        /* renamed from: a */
        public volatile int f30372a;

        /* renamed from: b */
        public int f30373b;

        /* renamed from: c */
        public int f30374c;

        /* renamed from: d */
        public int f30375d;

        /* renamed from: e */
        public volatile int f30376e;

        /* renamed from: f */
        public volatile int f30377f = 4096;

        /* renamed from: g */
        public int f30378g = 4096;

        /* renamed from: h */
        public ForkJoinTask<?>[] f30379h;

        /* renamed from: i */
        public final C6042a f30380i;

        /* renamed from: j */
        public final C6052b f30381j;

        static {
            Unsafe unsafe = n47.f31967a;
            f30368k = unsafe;
            try {
                f30369l = unsafe.objectFieldOffset(C6051g.class.getDeclaredField("a"));
                f30370m = unsafe.arrayBaseOffset(ForkJoinTask[].class);
                int arrayIndexScale = unsafe.arrayIndexScale(ForkJoinTask[].class);
                if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                    f30371n = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                    return;
                }
                throw new ExceptionInInitializerError("array index scale not a power of two");
            } catch (Exception e) {
                throw new ExceptionInInitializerError(e);
            }
        }

        public C6051g(C6042a aVar, C6052b bVar) {
            this.f30380i = aVar;
            this.f30381j = bVar;
        }

        /* renamed from: a */
        public final void mo44283a() {
            while (true) {
                ForkJoinTask<?> i = mo44291i();
                if (i != null) {
                    ForkJoinTask.cancelIgnoringExceptions(i);
                } else {
                    return;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java8.util.concurrent.ForkJoinTask<?>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java8.util.concurrent.ForkJoinTask<?>[] mo44284b() {
            /*
                r13 = this;
                java8.util.concurrent.ForkJoinTask<?>[] r6 = r13.f30379h
                if (r6 == 0) goto L_0x0006
                int r0 = r6.length
                goto L_0x0007
            L_0x0006:
                r0 = 0
            L_0x0007:
                r1 = 8192(0x2000, float:1.14794E-41)
                if (r0 <= 0) goto L_0x000e
                int r2 = r0 << 1
                goto L_0x000f
            L_0x000e:
                r2 = r1
            L_0x000f:
                if (r2 < r1) goto L_0x0054
                r1 = 67108864(0x4000000, float:1.5046328E-36)
                if (r2 > r1) goto L_0x0054
                java8.util.concurrent.ForkJoinTask[] r7 = new java8.util.concurrent.ForkJoinTask[r2]
                r13.f30379h = r7
                if (r6 == 0) goto L_0x0053
                int r8 = r0 + -1
                if (r8 <= 0) goto L_0x0053
                int r9 = r13.f30378g
                int r0 = r13.f30377f
                int r1 = r9 - r0
                if (r1 <= 0) goto L_0x0053
                int r10 = r2 + -1
                r11 = r0
            L_0x002a:
                r0 = r11 & r8
                long r0 = (long) r0
                int r2 = f30371n
                long r0 = r0 << r2
                int r2 = f30370m
                long r2 = (long) r2
                long r2 = r2 + r0
                sun.misc.Unsafe r0 = f30368k
                java.lang.Object r1 = r0.getObjectVolatile(r6, r2)
                r12 = r1
                java8.util.concurrent.ForkJoinTask r12 = (java8.util.concurrent.ForkJoinTask) r12
                if (r12 == 0) goto L_0x004c
                r5 = 0
                r1 = r6
                r4 = r12
                boolean r0 = p000.fm0.m44335a(r0, r1, r2, r4, r5)
                if (r0 == 0) goto L_0x004c
                r0 = r11 & r10
                r7[r0] = r12
            L_0x004c:
                int r11 = r11 + 1
                if (r11 != r9) goto L_0x002a
                java8.util.concurrent.C6042a.C6050f.m46284b()
            L_0x0053:
                return r7
            L_0x0054:
                java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
                java.lang.String r1 = "Queue capacity exceeded"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.C6051g.mo44284b():java8.util.concurrent.ForkJoinTask[]");
        }

        /* renamed from: c */
        public final boolean mo44285c() {
            Thread.State state;
            C6052b bVar = this.f30381j;
            if (bVar == null || (state = bVar.getState()) == Thread.State.BLOCKED || state == Thread.State.WAITING || state == Thread.State.TIMED_WAITING) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final int mo44286d(CountedCompleter<?> countedCompleter, int i) {
            boolean z;
            int i2;
            int length;
            if (countedCompleter == null) {
                return 0;
            }
            int i3 = countedCompleter.status;
            if (i3 < 0) {
                return i3;
            }
            while (true) {
                int i4 = this.f30377f;
                int i5 = this.f30378g;
                ForkJoinTask<?>[] forkJoinTaskArr = this.f30379h;
                if (forkJoinTaskArr != null && i4 != i5 && (length = forkJoinTaskArr.length) > 0) {
                    int i6 = i5 - 1;
                    long j = (((long) ((length - 1) & i6)) << f30371n) + ((long) f30370m);
                    ForkJoinTask forkJoinTask = (ForkJoinTask) f30368k.getObject(forkJoinTaskArr, j);
                    if (forkJoinTask instanceof CountedCompleter) {
                        CountedCompleter<?> countedCompleter2 = (CountedCompleter) forkJoinTask;
                        CountedCompleter<?> countedCompleter3 = countedCompleter2;
                        while (true) {
                            if (countedCompleter3 != countedCompleter) {
                                countedCompleter3 = countedCompleter3.completer;
                                if (countedCompleter3 == null) {
                                    break;
                                }
                            } else if (fm0.m44335a(f30368k, forkJoinTaskArr, j, countedCompleter2, (Object) null)) {
                                this.f30378g = i6;
                                C6050f.m46284b();
                                countedCompleter2.doExec();
                                z = true;
                            }
                        }
                    }
                }
                z = false;
                i2 = countedCompleter.status;
                if (i2 < 0 || !z || (i != 0 && i - 1 == 0)) {
                }
            }
            return i2;
        }

        /* renamed from: e */
        public final void mo44287e(int i) {
            int i2;
            int length;
            do {
                int i3 = 0;
                while (true) {
                    int i4 = this.f30377f;
                    int i5 = this.f30378g;
                    ForkJoinTask<?>[] forkJoinTaskArr = this.f30379h;
                    if (forkJoinTaskArr != null && (i2 = i4 - i5) < 0 && (length = forkJoinTaskArr.length) > 0) {
                        int i6 = i4 + 1;
                        ForkJoinTask forkJoinTask = (ForkJoinTask) C6042a.m46245m(forkJoinTaskArr, (((long) (i4 & (length - 1))) << f30371n) + ((long) f30370m), (Object) null);
                        if (forkJoinTask != null) {
                            this.f30377f = i6;
                            forkJoinTask.doExec();
                            if (i != 0 && (i3 = i3 + 1) == i) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } while (i2 != -1);
        }

        /* renamed from: f */
        public final void mo44288f(int i) {
            int length;
            while (true) {
                int i2 = this.f30377f;
                int i3 = this.f30378g;
                ForkJoinTask<?>[] forkJoinTaskArr = this.f30379h;
                if (forkJoinTaskArr != null && i2 != i3 && (length = forkJoinTaskArr.length) > 0) {
                    int i4 = i3 - 1;
                    ForkJoinTask forkJoinTask = (ForkJoinTask) C6042a.m46245m(forkJoinTaskArr, (((long) ((length - 1) & i4)) << f30371n) + ((long) f30370m), (Object) null);
                    if (forkJoinTask != null) {
                        this.f30378g = i4;
                        C6050f.m46284b();
                        forkJoinTask.doExec();
                        if (i != 0 && i - 1 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: g */
        public final ForkJoinTask<?> mo44289g() {
            if ((this.f30375d & 65536) != 0) {
                return mo44291i();
            }
            return mo44292j();
        }

        /* renamed from: h */
        public final ForkJoinTask<?> mo44290h() {
            int length;
            int i;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f30379h;
            if (forkJoinTaskArr == null || (length = forkJoinTaskArr.length) <= 0) {
                return null;
            }
            int i2 = length - 1;
            if ((this.f30375d & 65536) != 0) {
                i = this.f30377f;
            } else {
                i = this.f30378g - 1;
            }
            return forkJoinTaskArr[i2 & i];
        }

        /* renamed from: i */
        public final ForkJoinTask<?> mo44291i() {
            int i;
            int length;
            while (true) {
                int i2 = this.f30377f;
                int i3 = this.f30378g;
                ForkJoinTask<?>[] forkJoinTaskArr = this.f30379h;
                if (forkJoinTaskArr == null || (i = i2 - i3) >= 0 || (length = forkJoinTaskArr.length) <= 0) {
                    return null;
                }
                long j = (((long) ((length - 1) & i2)) << f30371n) + ((long) f30370m);
                Unsafe unsafe = f30368k;
                ForkJoinTask<?> forkJoinTask = (ForkJoinTask) unsafe.getObjectVolatile(forkJoinTaskArr, j);
                int i4 = i2 + 1;
                if (i2 == this.f30377f) {
                    if (forkJoinTask != null) {
                        if (fm0.m44335a(unsafe, forkJoinTaskArr, j, forkJoinTask, (Object) null)) {
                            this.f30377f = i4;
                            return forkJoinTask;
                        }
                    } else if (i == -1) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: j */
        public final ForkJoinTask<?> mo44292j() {
            int length;
            int i = this.f30377f;
            int i2 = this.f30378g;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f30379h;
            if (forkJoinTaskArr == null || i == i2 || (length = forkJoinTaskArr.length) <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            long j = (((long) ((length - 1) & i3)) << f30371n) + ((long) f30370m);
            Unsafe unsafe = f30368k;
            ForkJoinTask<?> forkJoinTask = (ForkJoinTask) unsafe.getObject(forkJoinTaskArr, j);
            if (forkJoinTask == null || !fm0.m44335a(unsafe, forkJoinTaskArr, j, forkJoinTask, (Object) null)) {
                return null;
            }
            this.f30378g = i3;
            C6050f.m46284b();
            return forkJoinTask;
        }

        /* renamed from: k */
        public final void mo44293k(ForkJoinTask<?> forkJoinTask) {
            int length;
            int i = this.f30378g;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f30379h;
            if (forkJoinTaskArr != null && (length = forkJoinTaskArr.length) > 0) {
                long j = (((long) ((length - 1) & i)) << f30371n) + ((long) f30370m);
                C6042a aVar = this.f30380i;
                this.f30378g = i + 1;
                f30368k.putOrderedObject(forkJoinTaskArr, j, forkJoinTask);
                int i2 = this.f30377f - i;
                if (i2 == 0 && aVar != null) {
                    C6050f.m46283a();
                    aVar.mo44242E();
                } else if (i2 + length == 1) {
                    mo44284b();
                }
            }
        }

        /* renamed from: l */
        public final int mo44294l() {
            int i = this.f30377f - this.f30378g;
            if (i >= 0) {
                return 0;
            }
            return -i;
        }

        /* JADX WARNING: type inference failed for: r0v11, types: [java8.util.concurrent.ForkJoinTask] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo44295m(java8.util.concurrent.CountedCompleter<?> r22, int r23) {
            /*
                r21 = this;
                r6 = r21
                r7 = r22
                r8 = 0
                if (r7 == 0) goto L_0x008c
                int r0 = r7.status
                if (r0 < 0) goto L_0x008b
                r9 = r23
            L_0x000d:
                int r0 = r6.f30377f
                int r10 = r6.f30378g
                java8.util.concurrent.ForkJoinTask<?>[] r12 = r6.f30379h
                if (r12 == 0) goto L_0x007e
                if (r0 == r10) goto L_0x007e
                int r0 = r12.length
                if (r0 <= 0) goto L_0x007e
                int r0 = r0 + -1
                int r15 = r10 + -1
                r0 = r0 & r15
                long r0 = (long) r0
                int r2 = f30371n
                long r0 = r0 << r2
                int r2 = f30370m
                long r2 = (long) r2
                long r13 = r0 + r2
                sun.misc.Unsafe r0 = f30368k
                java.lang.Object r0 = r0.getObject(r12, r13)
                java8.util.concurrent.ForkJoinTask r0 = (java8.util.concurrent.ForkJoinTask) r0
                boolean r1 = r0 instanceof java8.util.concurrent.CountedCompleter
                if (r1 == 0) goto L_0x007e
                r17 = r0
                java8.util.concurrent.CountedCompleter r17 = (java8.util.concurrent.CountedCompleter) r17
                r0 = r17
            L_0x003a:
                if (r0 == r7) goto L_0x0041
                java8.util.concurrent.CountedCompleter<?> r0 = r0.completer
                if (r0 != 0) goto L_0x003a
                goto L_0x007e
            L_0x0041:
                sun.misc.Unsafe r11 = f30368k
                long r4 = f30369l
                r16 = 0
                r18 = 1
                r0 = r11
                r1 = r21
                r2 = r4
                r19 = r4
                r4 = r16
                r5 = r18
                boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
                if (r0 == 0) goto L_0x007e
                int r0 = r6.f30378g
                if (r0 != r10) goto L_0x0071
                java8.util.concurrent.ForkJoinTask<?>[] r0 = r6.f30379h
                if (r0 != r12) goto L_0x0071
                r16 = 0
                r0 = r11
                r10 = r15
                r15 = r17
                boolean r1 = p000.fm0.m44335a(r11, r12, r13, r15, r16)
                if (r1 == 0) goto L_0x0072
                r6.f30378g = r10
                r1 = 1
                goto L_0x0073
            L_0x0071:
                r0 = r11
            L_0x0072:
                r1 = r8
            L_0x0073:
                r2 = r19
                r0.putOrderedInt(r6, r2, r8)
                if (r1 == 0) goto L_0x007f
                r17.doExec()
                goto L_0x007f
            L_0x007e:
                r1 = r8
            L_0x007f:
                int r0 = r7.status
                if (r0 < 0) goto L_0x008b
                if (r1 == 0) goto L_0x008b
                if (r9 == 0) goto L_0x000d
                int r9 = r9 + -1
                if (r9 != 0) goto L_0x000d
            L_0x008b:
                r8 = r0
            L_0x008c:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.C6051g.mo44295m(java8.util.concurrent.CountedCompleter, int):int");
        }

        /* renamed from: n */
        public final boolean mo44296n() {
            return f30368k.compareAndSwapInt(this, f30369l, 0, 1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java8.util.concurrent.ForkJoinTask<?>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo44297o(java8.util.concurrent.ForkJoinTask<?> r13) {
            /*
                r12 = this;
                int r0 = r12.f30377f
                int r1 = r12.f30378g
                int r0 = r0 - r1
                if (r0 >= 0) goto L_0x0063
                java8.util.concurrent.ForkJoinTask<?>[] r0 = r12.f30379h
                if (r0 == 0) goto L_0x0063
                int r2 = r0.length
                if (r2 <= 0) goto L_0x0063
                int r8 = r2 + -1
                int r1 = r1 + -1
                r9 = r1
            L_0x0013:
                r2 = r9 & r8
                int r3 = f30371n
                int r2 = r2 << r3
                int r3 = f30370m
                int r2 = r2 + r3
                long r4 = (long) r2
                sun.misc.Unsafe r2 = f30368k
                java.lang.Object r3 = r2.getObject(r0, r4)
                r10 = r3
                java8.util.concurrent.ForkJoinTask r10 = (java8.util.concurrent.ForkJoinTask) r10
                if (r10 != 0) goto L_0x0028
                goto L_0x0063
            L_0x0028:
                if (r10 != r13) goto L_0x0060
                r7 = 0
                r3 = r0
                r6 = r10
                boolean r13 = p000.fm0.m44335a(r2, r3, r4, r6, r7)
                if (r13 == 0) goto L_0x0063
                r12.f30378g = r1
            L_0x0035:
                if (r9 == r1) goto L_0x0059
                int r13 = r9 + 1
                r2 = r13 & r8
                int r3 = f30371n
                int r2 = r2 << r3
                int r4 = f30370m
                int r2 = r2 + r4
                long r5 = (long) r2
                sun.misc.Unsafe r2 = f30368k
                java.lang.Object r7 = r2.getObject(r0, r5)
                java8.util.concurrent.ForkJoinTask r7 = (java8.util.concurrent.ForkJoinTask) r7
                r11 = 0
                r2.putObjectVolatile(r0, r5, r11)
                r5 = r9 & r8
                int r3 = r5 << r3
                int r3 = r3 + r4
                long r3 = (long) r3
                r2.putOrderedObject(r0, r3, r7)
                r9 = r13
                goto L_0x0035
            L_0x0059:
                java8.util.concurrent.C6042a.C6050f.m46284b()
                r10.doExec()
                goto L_0x0063
            L_0x0060:
                int r9 = r9 + -1
                goto L_0x0013
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.C6051g.mo44297o(java8.util.concurrent.ForkJoinTask):void");
        }

        /* renamed from: p */
        public final boolean mo44298p(ForkJoinTask<?> forkJoinTask) {
            int length;
            boolean z = true;
            int i = this.f30378g - 1;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f30379h;
            if (forkJoinTaskArr == null || (length = forkJoinTaskArr.length) <= 0) {
                return false;
            }
            long j = (((long) ((length - 1) & i)) << f30371n) + ((long) f30370m);
            Unsafe unsafe = f30368k;
            if (((ForkJoinTask) unsafe.getObject(forkJoinTaskArr, j)) != forkJoinTask) {
                return false;
            }
            long j2 = f30369l;
            long j3 = j2;
            if (!unsafe.compareAndSwapInt(this, j2, 0, 1)) {
                return false;
            }
            if (this.f30378g == i + 1 && this.f30379h == forkJoinTaskArr && fm0.m44335a(unsafe, forkJoinTaskArr, j, forkJoinTask, (Object) null)) {
                this.f30378g = i;
            } else {
                z = false;
            }
            unsafe.putOrderedInt(this, j3, 0);
            return z;
        }

        /* renamed from: q */
        public final boolean mo44299q(ForkJoinTask<?> forkJoinTask) {
            int length;
            int i = this.f30377f;
            int i2 = this.f30378g;
            ForkJoinTask<?>[] forkJoinTaskArr = this.f30379h;
            if (forkJoinTaskArr == null || i == i2 || (length = forkJoinTaskArr.length) <= 0) {
                return false;
            }
            int i3 = i2 - 1;
            if (!fm0.m44335a(f30368k, forkJoinTaskArr, (((long) ((length - 1) & i3)) << f30371n) + ((long) f30370m), forkJoinTask, (Object) null)) {
                return false;
            }
            this.f30378g = i3;
            C6050f.m46284b();
            return true;
        }
    }

    static {
        Unsafe unsafe = n47.f31967a;
        f30342Q = unsafe;
        try {
            f30343U = unsafe.objectFieldOffset(C6042a.class.getDeclaredField("a"));
            f30344X = unsafe.objectFieldOffset(C6042a.class.getDeclaredField("r"));
            f30345Y = unsafe.arrayBaseOffset(ForkJoinTask[].class);
            int arrayIndexScale = unsafe.arrayIndexScale(ForkJoinTask[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                f30346Z = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                Class<LockSupport> cls = LockSupport.class;
                int i = 256;
                try {
                    String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.maximumSpares");
                    if (property != null) {
                        i = Integer.parseInt(property);
                    }
                } catch (Exception unused) {
                }
                f30340M = i;
                C6042a aVar = (C6042a) AccessController.doPrivileged(new C6043a());
                f30338I = aVar;
                f30339L = Math.max(aVar.f30355r & 65535, 1);
                return;
            }
            throw new ExceptionInInitializerError("array index scale not a power of two");
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public /* synthetic */ C6042a(byte b, C6043a aVar) {
        this(b);
    }

    /* renamed from: B */
    public static void m46239B() {
        f30338I.mo44252b(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public static void m46240c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f30337H);
        }
    }

    /* renamed from: d */
    public static C6042a m46241d() {
        return f30338I;
    }

    /* renamed from: e */
    public static C6051g m46242e() {
        C6051g[] gVarArr;
        int length;
        C6042a aVar = f30338I;
        int c = gl6.m44756c();
        if (aVar == null || (gVarArr = aVar.f30356s) == null || (length = gVarArr.length) <= 0) {
            return null;
        }
        return gVarArr[c & (length - 1) & 126];
    }

    /* renamed from: f */
    public static AccessControlContext m46243f(Permission... permissionArr) {
        Permissions permissions = new Permissions();
        for (Permission add : permissionArr) {
            permissions.add(add);
        }
        return new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain((CodeSource) null, permissions)});
    }

    /* renamed from: l */
    public static long m46244l(Object obj, long j, long j2) {
        Unsafe unsafe;
        long longVolatile;
        do {
            unsafe = f30342Q;
            longVolatile = unsafe.getLongVolatile(obj, j);
        } while (!unsafe.compareAndSwapLong(obj, j, longVolatile, longVolatile + j2));
        return longVolatile;
    }

    /* renamed from: m */
    public static Object m46245m(Object obj, long j, Object obj2) {
        Unsafe unsafe;
        Object objectVolatile;
        do {
            unsafe = f30342Q;
            objectVolatile = unsafe.getObjectVolatile(obj, j);
        } while (!fm0.m44335a(unsafe, obj, j, objectVolatile, obj2));
        return objectVolatile;
    }

    /* renamed from: n */
    public static int m46246n() {
        return f30339L;
    }

    /* renamed from: p */
    public static int m46247p() {
        C6052b bVar;
        C6042a aVar;
        C6051g gVar;
        Thread currentThread = Thread.currentThread();
        int i = 0;
        if (!(currentThread instanceof C6052b) || (aVar = (bVar = (C6052b) currentThread).f30382a) == null || (gVar = bVar.f30383d) == null) {
            return 0;
        }
        int i2 = aVar.f30355r & 65535;
        int i3 = ((int) (aVar.f30350a >> 48)) + i2;
        int i4 = gVar.f30378g - gVar.f30377f;
        int i5 = i2 >>> 1;
        if (i3 <= i5) {
            int i6 = i5 >>> 1;
            if (i3 > i6) {
                i = 1;
            } else {
                int i7 = i6 >>> 1;
                if (i3 > i7) {
                    i = 2;
                } else if (i3 > (i7 >>> 1)) {
                    i = 4;
                } else {
                    i = 8;
                }
            }
        }
        return i4 - i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[LOOP:0: B:17:0x0031->B:35:0x0031, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m46248q(java.util.concurrent.Executor r10, java8.util.concurrent.C6042a.C6049e r11) {
        /*
            if (r11 == 0) goto L_0x007c
            boolean r0 = r10 instanceof java8.util.concurrent.C6042a
            if (r0 == 0) goto L_0x007c
            java8.util.concurrent.a r10 = (java8.util.concurrent.C6042a) r10
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof java8.util.concurrent.C6052b
            if (r1 == 0) goto L_0x0019
            java8.util.concurrent.b r0 = (java8.util.concurrent.C6052b) r0
            java8.util.concurrent.a r1 = r0.f30382a
            if (r1 != r10) goto L_0x0019
            java8.util.concurrent.a$g r10 = r0.f30383d
            goto L_0x002f
        L_0x0019:
            int r0 = p000.gl6.m44756c()
            if (r0 == 0) goto L_0x002e
            java8.util.concurrent.a$g[] r10 = r10.f30356s
            if (r10 == 0) goto L_0x002e
            int r1 = r10.length
            if (r1 <= 0) goto L_0x002e
            int r1 = r1 + -1
            r0 = r0 & r1
            r0 = r0 & 126(0x7e, float:1.77E-43)
            r10 = r10[r0]
            goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            if (r10 == 0) goto L_0x007c
        L_0x0031:
            int r0 = r10.f30377f
            int r1 = r10.f30378g
            java8.util.concurrent.ForkJoinTask<?>[] r3 = r10.f30379h
            if (r3 == 0) goto L_0x007c
            int r1 = r0 - r1
            if (r1 >= 0) goto L_0x007c
            int r2 = r3.length
            if (r2 <= 0) goto L_0x007c
            int r2 = r2 + -1
            r2 = r2 & r0
            long r4 = (long) r2
            int r2 = f30346Z
            long r4 = r4 << r2
            int r2 = f30345Y
            long r6 = (long) r2
            long r4 = r4 + r6
            sun.misc.Unsafe r2 = f30342Q
            java.lang.Object r6 = r2.getObjectVolatile(r3, r4)
            r8 = r6
            java8.util.concurrent.ForkJoinTask r8 = (java8.util.concurrent.ForkJoinTask) r8
            boolean r6 = r11.isReleasable()
            if (r6 == 0) goto L_0x005b
            goto L_0x007c
        L_0x005b:
            int r9 = r0 + 1
            int r6 = r10.f30377f
            if (r0 != r6) goto L_0x0031
            if (r8 != 0) goto L_0x0067
            r0 = -1
            if (r1 != r0) goto L_0x0031
            goto L_0x007c
        L_0x0067:
            boolean r0 = m46249t(r8)
            if (r0 != 0) goto L_0x006e
            goto L_0x007c
        L_0x006e:
            r7 = 0
            r6 = r8
            boolean r0 = p000.fm0.m44335a(r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x0031
            r10.f30377f = r9
            r8.doExec()
            goto L_0x0031
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.m46248q(java.util.concurrent.Executor, java8.util.concurrent.a$e):void");
    }

    /* renamed from: t */
    public static boolean m46249t(ForkJoinTask<?> forkJoinTask) {
        Class<?> cls;
        if (forkJoinTask == null || (cls = f30347e0) == null) {
            return false;
        }
        return cls.isAssignableFrom(forkJoinTask.getClass());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0043 A[LOOP:2: B:26:0x0043->B:29:0x004d, LOOP_START] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m46250v(java8.util.concurrent.C6042a.C6049e r9) throws java.lang.InterruptedException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof java8.util.concurrent.C6052b
            if (r1 == 0) goto L_0x0043
            java8.util.concurrent.b r0 = (java8.util.concurrent.C6052b) r0
            java8.util.concurrent.a r1 = r0.f30382a
            if (r1 == 0) goto L_0x0043
            java8.util.concurrent.a$g r0 = r0.f30383d
            if (r0 == 0) goto L_0x0043
        L_0x0012:
            boolean r2 = r9.isReleasable()
            if (r2 != 0) goto L_0x004f
            int r2 = r1.mo44247J(r0)
            if (r2 == 0) goto L_0x0012
        L_0x001e:
            r3 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            r5 = 0
            boolean r0 = r9.isReleasable()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x002e
            boolean r0 = r9.block()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x001e
        L_0x002e:
            long r7 = f30343U
            if (r2 <= 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = r5
        L_0x0034:
            m46244l(r1, r7, r3)
            goto L_0x004f
        L_0x0038:
            r9 = move-exception
            long r7 = f30343U
            if (r2 <= 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r3 = r5
        L_0x003f:
            m46244l(r1, r7, r3)
            throw r9
        L_0x0043:
            boolean r0 = r9.isReleasable()
            if (r0 != 0) goto L_0x004f
            boolean r0 = r9.block()
            if (r0 == 0) goto L_0x0043
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.m46250v(java8.util.concurrent.a$e):void");
    }

    /* renamed from: w */
    public static Object m46251w(String str) throws Exception {
        String property = System.getProperty(str);
        if (property == null) {
            return null;
        }
        return ClassLoader.getSystemClassLoader().loadClass(property).getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    /* renamed from: x */
    public static final synchronized int m46252x() {
        int i;
        synchronized (C6042a.class) {
            i = f30341P + 1;
            f30341P = i;
        }
        return i;
    }

    /* renamed from: A */
    public ForkJoinTask<?> mo44239A() {
        return mo44275z(true);
    }

    /* renamed from: C */
    public final C6051g mo44240C(C6052b bVar) {
        int i;
        int length;
        bVar.setDaemon(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f30348A;
        if (uncaughtExceptionHandler != null) {
            bVar.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        C6051g gVar = new C6051g(this, bVar);
        int i2 = this.f30355r & 65536;
        String str = this.f30357x;
        if (str != null) {
            synchronized (str) {
                C6051g[] gVarArr = this.f30356s;
                int i3 = this.f30353g - 1640531527;
                this.f30353g = i3;
                i = 0;
                if (gVarArr != null && (length = gVarArr.length) > 1) {
                    int i4 = length - 1;
                    int i5 = i3 & i4;
                    int i6 = ((i3 << 1) | 1) & i4;
                    int i7 = length >>> 1;
                    while (true) {
                        C6051g gVar2 = gVarArr[i6];
                        if (gVar2 == null) {
                            break;
                        } else if (gVar2.f30372a == 1073741824) {
                            break;
                        } else {
                            i7--;
                            if (i7 == 0) {
                                i6 = length | 1;
                                break;
                            }
                            i6 = (i6 + 2) & i4;
                        }
                    }
                    int i8 = i2 | i6 | (i3 & 1073610752);
                    gVar.f30375d = i8;
                    gVar.f30372a = i8;
                    if (i6 < length) {
                        gVarArr[i6] = gVar;
                    } else {
                        int i9 = length << 1;
                        C6051g[] gVarArr2 = new C6051g[i9];
                        gVarArr2[i6] = gVar;
                        int i10 = i9 - 1;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            C6051g gVar3 = gVarArr[i];
                            if (gVar3 != null) {
                                gVarArr2[gVar3.f30375d & i10 & 126] = gVar3;
                            }
                            int i11 = i + 1;
                            if (i11 >= length) {
                                break;
                            }
                            gVarArr2[i11] = gVarArr[i11];
                            i = i11 + 1;
                        }
                        this.f30356s = gVarArr2;
                    }
                    i = i5;
                }
            }
            bVar.setName(str.concat(Integer.toString(i)));
        }
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        r10 = r9.f30372a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r10 < 0) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        r15 = (r10 + 65536) | Integer.MIN_VALUE;
        r9.f30372a = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d9, code lost:
        r4 = r8.f30350a;
        r9.f30373b = (int) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        if (f30342Q.compareAndSwapLong(r23, f30343U, r4, ((r4 - 281474976710656L) & -4294967296L) | (((long) r15) & 4294967295L)) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f4, code lost:
        r15 = r9.f30373b;
        r9.f30376e = java8.util.concurrent.ForkJoinTask.CANCELLED;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        if (r9.f30372a < 0) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ff, code lost:
        r9.f30376e = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0106, code lost:
        r0 = r8.f30355r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0108, code lost:
        if (r0 >= 0) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010b, code lost:
        r4 = r8.f30350a;
        r1 = (65535 & r0) + ((int) (r4 >> 48));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0117, code lost:
        if (r1 > 0) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
        if ((r0 & 262144) == 0) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0123, code lost:
        if (mo44249L(false, false) == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0126, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0127, code lost:
        r17 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012d, code lost:
        if ((r17 & 1) != 0) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012f, code lost:
        java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0132, code lost:
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0135, code lost:
        if (r1 > 0) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0137, code lost:
        if (r15 == 0) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013a, code lost:
        if (r10 != ((int) r4)) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013c, code lost:
        r0 = r8.f30352e + java.lang.System.currentTimeMillis();
        java.util.concurrent.locks.LockSupport.parkUntil(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014a, code lost:
        if (r8.f30350a != r4) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0155, code lost:
        if ((r0 - java.lang.System.currentTimeMillis()) > 20) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0157, code lost:
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0171, code lost:
        if (f30342Q.compareAndSwapLong(r23, f30343U, r4, ((r4 - 4294967296L) & -4294967296L) | (((long) r15) & 4294967295L)) == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0173, code lost:
        r9.f30372a = 1073741824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0177, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0178, code lost:
        r20 = r6;
        java.util.concurrent.locks.LockSupport.park(r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017d, code lost:
        r2 = r17;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44241D(java8.util.concurrent.C6042a.C6051g r24) {
        /*
            r23 = this;
            r8 = r23
            r9 = r24
            r24.mo44284b()
            int r0 = r9.f30375d
            int r1 = p000.gl6.m44765l()
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0011
            r0 = 1
        L_0x0011:
            r1 = 0
        L_0x0012:
            java8.util.concurrent.a$g[] r2 = r8.f30356s
            if (r2 == 0) goto L_0x0181
            int r3 = r2.length
            int r4 = r3 + -1
            r12 = r0
            r0 = r3
            r5 = 0
        L_0x001c:
            if (r0 <= 0) goto L_0x00b2
            r7 = r12 & r4
            if (r7 < 0) goto L_0x00a3
            if (r7 >= r3) goto L_0x00a3
            r7 = r2[r7]
            if (r7 == 0) goto L_0x00a3
            int r13 = r7.f30377f
            int r14 = r7.f30378g
            int r14 = r13 - r14
            if (r14 >= 0) goto L_0x00a3
            java8.util.concurrent.ForkJoinTask<?>[] r14 = r7.f30379h
            if (r14 == 0) goto L_0x00a3
            int r15 = r14.length
            if (r15 <= 0) goto L_0x00a3
            int r5 = r7.f30375d
            int r15 = r15 + -1
            r15 = r15 & r13
            r21 = r12
            long r11 = (long) r15
            int r15 = f30346Z
            long r11 = r11 << r15
            int r15 = f30345Y
            r22 = r7
            long r6 = (long) r15
            long r6 = r6 + r11
            sun.misc.Unsafe r15 = f30342Q
            java.lang.Object r11 = r15.getObjectVolatile(r14, r6)
            java8.util.concurrent.ForkJoinTask r11 = (java8.util.concurrent.ForkJoinTask) r11
            if (r11 == 0) goto L_0x009d
            int r12 = r13 + 1
            r10 = r22
            r22 = r2
            int r2 = r10.f30377f
            if (r13 != r2) goto L_0x009f
            r20 = 0
            r16 = r14
            r17 = r6
            r19 = r11
            boolean r2 = p000.fm0.m44335a(r15, r16, r17, r19, r20)
            if (r2 == 0) goto L_0x009f
            r10.f30377f = r12
            int r2 = r10.f30378g
            int r12 = r12 - r2
            if (r12 >= 0) goto L_0x0076
            if (r5 == r1) goto L_0x0076
            r23.mo44242E()
        L_0x0076:
            r9.f30376e = r5
            r11.doExec()
            int r1 = r9.f30375d
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r2
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0088
            r9.mo44287e(r2)
            goto L_0x008b
        L_0x0088:
            r9.mo44288f(r2)
        L_0x008b:
            java8.util.concurrent.b r1 = r9.f30381j
            int r2 = r9.f30374c
            r6 = 1
            int r2 = r2 + r6
            r9.f30374c = r2
            r2 = 0
            r9.f30376e = r2
            if (r1 == 0) goto L_0x009b
            r1.mo44300a()
        L_0x009b:
            r1 = r5
            goto L_0x009f
        L_0x009d:
            r22 = r2
        L_0x009f:
            r12 = r21
            r5 = 1
            goto L_0x00ac
        L_0x00a3:
            r22 = r2
            r21 = r12
            if (r5 == 0) goto L_0x00aa
            goto L_0x00b4
        L_0x00aa:
            int r12 = r21 + 1
        L_0x00ac:
            int r0 = r0 + -1
            r2 = r22
            goto L_0x001c
        L_0x00b2:
            r21 = r12
        L_0x00b4:
            if (r5 == 0) goto L_0x00c2
            int r0 = r21 << 13
            r0 = r21 ^ r0
            int r2 = r0 >>> 17
            r0 = r0 ^ r2
            int r2 = r0 << 5
            r0 = r0 ^ r2
            goto L_0x0012
        L_0x00c2:
            int r10 = r9.f30372a
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r13 = -4294967296(0xffffffff00000000, double:NaN)
            if (r10 < 0) goto L_0x00f4
            r0 = 65536(0x10000, float:9.18355E-41)
            int r10 = r10 + r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r10 | r0
            r9.f30372a = r15
        L_0x00d9:
            long r4 = r8.f30350a
            int r0 = (int) r4
            r9.f30373b = r0
            r0 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r0 = r4 - r0
            long r0 = r0 & r13
            long r2 = (long) r15
            long r2 = r2 & r11
            long r6 = r0 | r2
            sun.misc.Unsafe r0 = f30342Q
            long r2 = f30343U
            r1 = r23
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L_0x00d9
            goto L_0x0102
        L_0x00f4:
            int r15 = r9.f30373b
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            r9.f30376e = r0
            r2 = 0
        L_0x00fb:
            int r0 = r9.f30372a
            if (r0 < 0) goto L_0x0106
            r0 = 0
            r9.f30376e = r0
        L_0x0102:
            r0 = r21
            goto L_0x0011
        L_0x0106:
            int r0 = r8.f30355r
            if (r0 >= 0) goto L_0x010b
            return
        L_0x010b:
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            long r4 = r8.f30350a
            r3 = 48
            long r6 = r4 >> r3
            int r3 = (int) r6
            int r1 = r1 + r3
            if (r1 > 0) goto L_0x0126
            r3 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0126
            r6 = 0
            boolean r0 = r8.mo44249L(r6, r6)
            if (r0 == 0) goto L_0x0127
            return
        L_0x0126:
            r6 = 0
        L_0x0127:
            r16 = 1
            int r17 = r2 + 1
            r0 = r17 & 1
            if (r0 != 0) goto L_0x0135
            java.lang.Thread.interrupted()
        L_0x0132:
            r20 = r6
            goto L_0x017d
        L_0x0135:
            if (r1 > 0) goto L_0x0178
            if (r15 == 0) goto L_0x0178
            int r0 = (int) r4
            if (r10 != r0) goto L_0x0178
            long r0 = r8.f30352e
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            java.util.concurrent.locks.LockSupport.parkUntil(r8, r0)
            long r2 = r8.f30350a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0132
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r2 = 20
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0132
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r4 - r0
            long r0 = r0 & r13
            long r2 = (long) r15
            long r2 = r2 & r11
            long r18 = r0 | r2
            sun.misc.Unsafe r0 = f30342Q
            long r2 = f30343U
            r1 = r23
            r20 = r6
            r6 = r18
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L_0x017d
            r0 = 1073741824(0x40000000, float:2.0)
            r9.f30372a = r0
            return
        L_0x0178:
            r20 = r6
            java.util.concurrent.locks.LockSupport.park(r23)
        L_0x017d:
            r2 = r17
            goto L_0x00fb
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.mo44241D(java8.util.concurrent.a$g):void");
    }

    /* renamed from: E */
    public final void mo44242E() {
        int i;
        C6051g gVar;
        while (true) {
            long j = this.f30350a;
            if (j < 0) {
                int i2 = (int) j;
                if (i2 != 0) {
                    C6051g[] gVarArr = this.f30356s;
                    if (gVarArr != null && gVarArr.length > (i = 65535 & i2) && (gVar = gVarArr[i]) != null) {
                        int i3 = i2 & Integer.MAX_VALUE;
                        int i4 = gVar.f30372a;
                        long j2 = (((long) gVar.f30373b) & 4294967295L) | (-4294967296L & (281474976710656L + j));
                        C6052b bVar = gVar.f30381j;
                        if (i2 == i4) {
                            if (f30342Q.compareAndSwapLong(this, f30343U, j, j2)) {
                                gVar.f30372a = i3;
                                if (gVar.f30376e < 0) {
                                    LockSupport.unpark(bVar);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else if ((140737488355328L & j) != 0) {
                    mo44246I(j);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: F */
    public ForkJoinTask<?> submit(Runnable runnable) {
        ForkJoinTask forkJoinTask;
        kf4.m47057e(runnable);
        if (runnable instanceof ForkJoinTask) {
            forkJoinTask = (ForkJoinTask) runnable;
        } else {
            forkJoinTask = new ForkJoinTask.AdaptedRunnableAction(runnable);
        }
        return mo44261k(forkJoinTask);
    }

    /* renamed from: G */
    public <T> ForkJoinTask<T> submit(Runnable runnable, T t) {
        return mo44261k(new ForkJoinTask.AdaptedRunnable(runnable, t));
    }

    /* renamed from: H */
    public <T> ForkJoinTask<T> submit(Callable<T> callable) {
        return mo44261k(new ForkJoinTask.AdaptedCallable(callable));
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001b  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44246I(long r9) {
        /*
            r8 = this;
            r4 = r9
        L_0x0001:
            r9 = -281474976710656(0xffff000000000000, double:NaN)
            r0 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r0 = r0 + r4
            long r9 = r9 & r0
            r0 = 281470681743360(0xffff00000000, double:1.39064994160909E-309)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 + r4
            long r0 = r0 & r2
            long r6 = r9 | r0
            long r9 = r8.f30350a
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x002a
            sun.misc.Unsafe r0 = f30342Q
            long r2 = f30343U
            r1 = r8
            boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r9 == 0) goto L_0x002a
            r8.mo44254g()
            goto L_0x003b
        L_0x002a:
            long r4 = r8.f30350a
            r9 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r9 = r9 & r4
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x003b
            int r9 = (int) r4
            if (r9 == 0) goto L_0x0001
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.mo44246I(long):void");
    }

    /* renamed from: J */
    public final int mo44247J(C6051g gVar) {
        int length;
        boolean z;
        Thread.State state;
        long j;
        C6051g gVar2 = gVar;
        long j2 = this.f30350a;
        C6051g[] gVarArr = this.f30356s;
        short s = (short) ((int) (j2 >>> 32));
        if (s >= 0) {
            if (gVarArr == null || (length = gVarArr.length) <= 0 || gVar2 == null) {
                return 0;
            }
            int i = (int) j2;
            if (i != 0) {
                C6051g gVar3 = gVarArr[i & (length - 1)];
                int i2 = gVar2.f30372a;
                if (i2 < 0) {
                    j = 281474976710656L + j2;
                } else {
                    j = j2;
                }
                long j3 = -4294967296L & j;
                int i3 = i & Integer.MAX_VALUE;
                if (gVar3 == null) {
                    return 0;
                }
                int i4 = gVar3.f30372a;
                C6052b bVar = gVar3.f30381j;
                long j4 = (((long) gVar3.f30373b) & 4294967295L) | j3;
                if (i4 != i) {
                    return 0;
                }
                if (!f30342Q.compareAndSwapLong(this, f30343U, j2, j4)) {
                    return 0;
                }
                gVar3.f30372a = i3;
                if (gVar3.f30376e < 0) {
                    LockSupport.unpark(bVar);
                }
                if (i2 < 0) {
                    return -1;
                }
                return 1;
            } else if (((int) (j2 >> 48)) - ((short) (this.f30354k & 65535)) > 0) {
                return f30342Q.compareAndSwapLong(this, f30343U, j2, (-281474976710656L & (j2 - 281474976710656L)) | (281474976710655L & j2)) ? 1 : 0;
            } else {
                short s2 = this.f30355r & 65535;
                int i5 = s2 + s;
                int i6 = i5;
                int i7 = 0;
                int i8 = 1;
                while (true) {
                    if (i8 >= length) {
                        z = false;
                        break;
                    }
                    C6051g gVar4 = gVarArr[i8];
                    if (gVar4 != null) {
                        if (gVar4.f30376e == 0) {
                            z = true;
                            break;
                        }
                        i6--;
                        C6052b bVar2 = gVar4.f30381j;
                        if (bVar2 != null && ((state = bVar2.getState()) == Thread.State.BLOCKED || state == Thread.State.WAITING)) {
                            i7++;
                        }
                    }
                    i8 += 2;
                }
                if (z || i6 != 0 || this.f30350a != j2) {
                    return 0;
                }
                if (i5 >= 32767 || s >= (this.f30354k >>> 16)) {
                    ju4<? super C6042a> ju4 = this.f30349B;
                    if (ju4 != null && ju4.test(this)) {
                        return -1;
                    }
                    if (i7 < s2) {
                        Thread.yield();
                        return 0;
                    }
                    throw new RejectedExecutionException("Thread limit exceeded replacing blocked worker");
                }
            }
        }
        if (!f30342Q.compareAndSwapLong(this, f30343U, j2, ((4294967296L + j2) & 281470681743360L) | (-281470681743361L & j2)) || !mo44254g()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: K */
    public final boolean mo44248K(ForkJoinTask<?> forkJoinTask) {
        int length;
        C6051g gVar;
        int c = gl6.m44756c();
        C6051g[] gVarArr = this.f30356s;
        if (gVarArr == null || (length = gVarArr.length) <= 0 || (gVar = gVarArr[c & (length - 1) & 126]) == null || !gVar.mo44298p(forkJoinTask)) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public final boolean mo44249L(boolean z, boolean z2) {
        int i;
        int i2;
        while (true) {
            int i3 = this.f30355r;
            int i4 = 0;
            if ((i3 & 262144) != 0) {
                while (true) {
                    int i5 = this.f30355r;
                    int i6 = 65535;
                    long j = 0;
                    int i7 = 1;
                    if ((i5 & Integer.MIN_VALUE) == 0) {
                        if (!z) {
                            while (true) {
                                long j2 = this.f30350a;
                                C6051g[] gVarArr = this.f30356s;
                                char c = '0';
                                if ((i5 & i6) + ((int) (j2 >> 48)) <= 0) {
                                    if (gVarArr != null) {
                                        int i8 = i4;
                                        while (true) {
                                            if (i8 >= gVarArr.length) {
                                                break;
                                            }
                                            C6051g gVar = gVarArr[i8];
                                            if (gVar != null) {
                                                int i9 = gVar.f30376e;
                                                int i10 = gVar.f30372a;
                                                int i11 = gVar.f30375d;
                                                int i12 = gVar.f30377f;
                                                if (i12 != gVar.f30378g || ((i11 & 1) == i7 && (i9 >= 0 || i10 >= 0))) {
                                                    i7 = 1;
                                                } else {
                                                    j2 += (((long) i9) << c) + (((long) i10) << 32) + (((long) i12) << 16) + ((long) i11);
                                                }
                                            }
                                            i8++;
                                            c = '0';
                                            i7 = 1;
                                        }
                                        i7 = 1;
                                    }
                                    i7 = 0;
                                }
                                i5 = this.f30355r;
                                if ((i5 & Integer.MIN_VALUE) != 0) {
                                    i4 = 0;
                                    break;
                                } else if (i7 != 0) {
                                    return false;
                                } else {
                                    i4 = 0;
                                    if (this.f30356s == gVarArr) {
                                        if (j == j2) {
                                            break;
                                        }
                                        j = j2;
                                    }
                                    i6 = 65535;
                                    i7 = 1;
                                }
                            }
                        }
                        int i13 = i5;
                        if ((i13 & Integer.MIN_VALUE) == 0) {
                            f30342Q.compareAndSwapInt(this, f30344X, i13, i13 | Integer.MIN_VALUE);
                        }
                    } else {
                        while ((this.f30355r & 524288) == 0) {
                            long j3 = 0;
                            while (true) {
                                long j4 = this.f30350a;
                                C6051g[] gVarArr2 = this.f30356s;
                                if (gVarArr2 != null) {
                                    for (int i14 = i4; i14 < gVarArr2.length; i14++) {
                                        C6051g gVar2 = gVarArr2[i14];
                                        if (gVar2 != null) {
                                            C6052b bVar = gVar2.f30381j;
                                            gVar2.mo44283a();
                                            if (bVar != null) {
                                                try {
                                                    bVar.interrupt();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            j4 += (((long) gVar2.f30372a) << 32) + ((long) gVar2.f30377f);
                                        }
                                    }
                                }
                                i = this.f30355r;
                                i2 = i & 524288;
                                if (i2 != 0) {
                                    break;
                                }
                                if (this.f30356s == gVarArr2) {
                                    if (j3 == j4) {
                                        break;
                                    }
                                    j3 = j4;
                                }
                                i4 = 0;
                            }
                            if (i2 != 0 || (i & 65535) + ((short) ((int) (this.f30350a >>> 32))) > 0) {
                                return true;
                            }
                            if (f30342Q.compareAndSwapInt(this, f30344X, i, i | 524288)) {
                                synchronized (this) {
                                    notifyAll();
                                }
                                return true;
                            }
                            i4 = 0;
                        }
                        return true;
                    }
                }
            } else if (!z2 || this == f30338I) {
                return false;
            } else {
                f30342Q.compareAndSwapInt(this, f30344X, i3, i3 | 262144);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo44250a(C6051g gVar, ForkJoinTask<?> forkJoinTask, long j) {
        long j2;
        C6051g gVar2;
        ForkJoinTask<?>[] forkJoinTaskArr;
        int length;
        int d;
        C6051g gVar3 = gVar;
        ForkJoinTask<?> forkJoinTask2 = forkJoinTask;
        if (gVar3 == null || forkJoinTask2 == null) {
            return 0;
        }
        if ((forkJoinTask2 instanceof CountedCompleter) && (d = gVar3.mo44286d((CountedCompleter) forkJoinTask2, 0)) < 0) {
            return d;
        }
        gVar.mo44297o(forkJoinTask);
        int i = gVar3.f30376e;
        int i2 = gVar3.f30375d;
        int i3 = forkJoinTask2.status;
        while (i3 >= 0) {
            boolean z = true;
            int l = gl6.m44765l() | 1;
            C6051g[] gVarArr = this.f30356s;
            if (gVarArr != null) {
                int length2 = gVarArr.length;
                int i4 = length2 - 1;
                int i5 = -length2;
                while (true) {
                    if (i5 >= length2) {
                        break;
                    }
                    int i6 = (l + i5) & i4;
                    if (i6 >= 0 && i6 < length2 && (gVar2 = gVarArr[i6]) != null && gVar2.f30376e == i2) {
                        int i7 = gVar2.f30377f;
                        if (i7 - gVar2.f30378g < 0 && (forkJoinTaskArr = gVar2.f30379h) != null && (length = forkJoinTaskArr.length) > 0) {
                            int i8 = gVar2.f30375d;
                            long j3 = (((long) ((length - 1) & i7)) << f30346Z) + ((long) f30345Y);
                            Unsafe unsafe = f30342Q;
                            ForkJoinTask forkJoinTask3 = (ForkJoinTask) unsafe.getObjectVolatile(forkJoinTaskArr, j3);
                            if (forkJoinTask3 != null) {
                                int i9 = i7 + 1;
                                if (i7 == gVar2.f30377f && i2 == gVar2.f30376e && fm0.m44335a(unsafe, forkJoinTaskArr, j3, forkJoinTask3, (Object) null)) {
                                    gVar2.f30377f = i9;
                                    gVar3.f30376e = i8;
                                    forkJoinTask3.doExec();
                                    gVar3.f30376e = i;
                                }
                            }
                        }
                    }
                    i5 += 2;
                }
            }
            z = false;
            int i10 = forkJoinTask2.status;
            if (i10 < 0) {
                return i10;
            }
            if (!z) {
                long j4 = 0;
                if (j == 0) {
                    j2 = 0;
                } else {
                    long nanoTime = j - System.nanoTime();
                    if (nanoTime <= 0) {
                        return i10;
                    }
                    j2 = TimeUnit.NANOSECONDS.toMillis(nanoTime);
                    if (j2 <= 0) {
                        j2 = 1;
                    }
                }
                int J = mo44247J(gVar);
                if (J != 0) {
                    forkJoinTask2.internalWait(j2);
                    long j5 = f30343U;
                    if (J > 0) {
                        j4 = 281474976710656L;
                    }
                    m46244l(this, j5, j4);
                }
                i10 = forkJoinTask2.status;
            }
            i3 = i10;
        }
        return i3;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        } else if (this == f30338I) {
            mo44252b(j, timeUnit);
            return false;
        } else {
            long nanos = timeUnit.toNanos(j);
            if (isTerminated()) {
                return true;
            }
            if (nanos <= 0) {
                return false;
            }
            long nanoTime = System.nanoTime() + nanos;
            synchronized (this) {
                while (!isTerminated()) {
                    if (nanos <= 0) {
                        return false;
                    }
                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
                    if (millis <= 0) {
                        millis = 1;
                    }
                    wait(millis);
                    nanos = nanoTime - System.nanoTime();
                }
                return true;
            }
        }
    }

    /* renamed from: b */
    public boolean mo44252b(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            C6052b bVar = (C6052b) currentThread;
            if (bVar.f30382a == this) {
                mo44266s(bVar.f30383d);
                return true;
            }
        }
        long nanoTime = System.nanoTime();
        while (true) {
            ForkJoinTask<?> z = mo44275z(false);
            if (z != null) {
                z.doExec();
            } else if (mo44273u()) {
                return true;
            } else {
                if (System.nanoTime() - nanoTime > nanos) {
                    return false;
                }
                Thread.yield();
            }
        }
    }

    public void execute(Runnable runnable) {
        ForkJoinTask forkJoinTask;
        kf4.m47057e(runnable);
        if (runnable instanceof ForkJoinTask) {
            forkJoinTask = (ForkJoinTask) runnable;
        } else {
            forkJoinTask = new ForkJoinTask.RunnableExecuteAction(runnable);
        }
        mo44261k(forkJoinTask);
    }

    /* renamed from: g */
    public final boolean mo44254g() {
        C6052b bVar;
        C6046c cVar = this.f30358y;
        Throwable th = null;
        if (cVar != null) {
            try {
                bVar = cVar.mo44278a(this);
                if (bVar != null) {
                    try {
                        bVar.start();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = null;
            }
        } else {
            bVar = null;
        }
        mo44255h(bVar, th);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040 A[LOOP:0: B:26:0x0040->B:27:0x0064, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44255h(java8.util.concurrent.C6052b r18, java.lang.Throwable r19) {
        /*
            r17 = this;
            r9 = r17
            r0 = r18
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 0
            r12 = 0
            if (r0 == 0) goto L_0x003a
            java8.util.concurrent.a$g r0 = r0.f30383d
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = r9.f30357x
            int r3 = r0.f30374c
            long r3 = (long) r3
            long r3 = r3 & r10
            int r5 = r0.f30375d
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            if (r2 == 0) goto L_0x0037
            monitor-enter(r2)
            java8.util.concurrent.a$g[] r6 = r9.f30356s     // Catch:{ all -> 0x0034 }
            if (r6 == 0) goto L_0x002d
            int r7 = r6.length     // Catch:{ all -> 0x0034 }
            if (r7 <= r5) goto L_0x002d
            r7 = r6[r5]     // Catch:{ all -> 0x0034 }
            if (r7 != r0) goto L_0x002d
            r6[r5] = r1     // Catch:{ all -> 0x0034 }
        L_0x002d:
            long r5 = r9.f30351d     // Catch:{ all -> 0x0034 }
            long r5 = r5 + r3
            r9.f30351d = r5     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r0
        L_0x0037:
            int r1 = r0.f30372a
            goto L_0x003c
        L_0x003a:
            r0 = r1
        L_0x003b:
            r1 = r12
        L_0x003c:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0066
        L_0x0040:
            sun.misc.Unsafe r1 = f30342Q
            long r3 = f30343U
            long r5 = r9.f30350a
            r7 = -281474976710656(0xffff000000000000, double:NaN)
            r13 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r13 = r5 - r13
            long r7 = r7 & r13
            r13 = 281470681743360(0xffff00000000, double:1.39064994160909E-309)
            r15 = 4294967296(0x100000000, double:2.121995791E-314)
            long r15 = r5 - r15
            long r13 = r13 & r15
            long r7 = r7 | r13
            long r13 = r5 & r10
            long r7 = r7 | r13
            r2 = r17
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 == 0) goto L_0x0040
        L_0x0066:
            if (r0 == 0) goto L_0x006b
            r0.mo44283a()
        L_0x006b:
            boolean r1 = r9.mo44249L(r12, r12)
            if (r1 != 0) goto L_0x007a
            if (r0 == 0) goto L_0x007a
            java8.util.concurrent.ForkJoinTask<?>[] r0 = r0.f30379h
            if (r0 == 0) goto L_0x007a
            r17.mo44242E()
        L_0x007a:
            if (r19 != 0) goto L_0x0080
            java8.util.concurrent.ForkJoinTask.helpExpungeStaleExceptions()
            goto L_0x0083
        L_0x0080:
            java8.util.concurrent.ForkJoinTask.rethrow(r19)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.mo44255h(java8.util.concurrent.b, java.lang.Throwable):void");
    }

    /* renamed from: i */
    public final int mo44256i(CountedCompleter<?> countedCompleter, int i) {
        int length;
        C6051g gVar;
        int c = gl6.m44756c();
        C6051g[] gVarArr = this.f30356s;
        if (gVarArr == null || (length = gVarArr.length) <= 0 || (gVar = gVarArr[c & (length - 1) & 126]) == null) {
            return 0;
        }
        return gVar.mo44295m(countedCompleter, i);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        try {
            for (Callable adaptedCallable : collection) {
                ForkJoinTask.AdaptedCallable adaptedCallable2 = new ForkJoinTask.AdaptedCallable(adaptedCallable);
                arrayList.add(adaptedCallable2);
                mo44261k(adaptedCallable2);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ForkJoinTask) arrayList.get(i)).quietlyJoin();
            }
            return arrayList;
        } catch (Throwable th) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((Future) arrayList.get(i2)).cancel(false);
            }
            throw th;
        }
    }

    public boolean isShutdown() {
        if ((this.f30355r & 262144) != 0) {
            return true;
        }
        return false;
    }

    public boolean isTerminated() {
        if ((this.f30355r & 524288) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo44260j(ForkJoinTask<?> forkJoinTask) {
        int length;
        boolean z;
        boolean z2;
        int length2;
        boolean z3;
        int length3;
        int length4;
        int c = gl6.m44756c();
        if (c == 0) {
            gl6.m44762i();
            c = gl6.m44756c();
        }
        while (true) {
            int i = this.f30355r;
            C6051g[] gVarArr = this.f30356s;
            if ((i & 262144) == 0 && gVarArr != null && (length = gVarArr.length) > 0) {
                C6051g gVar = gVarArr[(length - 1) & c & 126];
                if (gVar == null) {
                    String str = this.f30357x;
                    int i2 = (c | 1073741824) & -65538;
                    C6051g gVar2 = new C6051g(this, (C6052b) null);
                    gVar2.f30375d = i2;
                    gVar2.f30376e = 1073741824;
                    gVar2.f30372a = 1;
                    if (str != null) {
                        synchronized (str) {
                            C6051g[] gVarArr2 = this.f30356s;
                            if (gVarArr2 != null && (length4 = gVarArr2.length) > 0) {
                                int i3 = i2 & (length4 - 1) & 126;
                                if (gVarArr2[i3] == null) {
                                    gVarArr2[i3] = gVar2;
                                    z2 = true;
                                    z = z2;
                                }
                            }
                            z2 = false;
                            z = z2;
                        }
                    } else {
                        z2 = false;
                        z = false;
                    }
                    gVar = gVar2;
                } else if (gVar.mo44296n()) {
                    int i4 = gVar.f30377f;
                    int i5 = gVar.f30378g;
                    ForkJoinTask<?>[] forkJoinTaskArr = gVar.f30379h;
                    if (forkJoinTaskArr != null && (length3 = forkJoinTaskArr.length) > 0) {
                        int i6 = length3 - 1;
                        int i7 = i4 - i5;
                        if (i6 + i7 > 0) {
                            forkJoinTaskArr[i6 & i5] = forkJoinTask;
                            gVar.f30378g = i5 + 1;
                            gVar.f30372a = 0;
                            if (i7 >= 0 || gVar.f30377f - i5 >= -1) {
                                z3 = false;
                                z2 = true;
                            } else {
                                return;
                            }
                        }
                    }
                    z3 = true;
                    z2 = true;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z2) {
                    if (z) {
                        try {
                            gVar.mo44284b();
                            int i8 = gVar.f30378g;
                            ForkJoinTask<?>[] forkJoinTaskArr2 = gVar.f30379h;
                            if (forkJoinTaskArr2 != null && (length2 = forkJoinTaskArr2.length) > 0) {
                                forkJoinTaskArr2[(length2 - 1) & i8] = forkJoinTask;
                                gVar.f30378g = i8 + 1;
                            }
                        } finally {
                            gVar.f30372a = 0;
                        }
                    }
                    mo44242E();
                    return;
                }
                c = gl6.m44754a(c);
            }
        }
        throw new RejectedExecutionException();
    }

    /* renamed from: k */
    public final <T> ForkJoinTask<T> mo44261k(ForkJoinTask<T> forkJoinTask) {
        C6051g gVar;
        kf4.m47057e(forkJoinTask);
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            C6052b bVar = (C6052b) currentThread;
            if (bVar.f30382a == this && (gVar = bVar.f30383d) != null) {
                gVar.mo44293k(forkJoinTask);
                return forkJoinTask;
            }
        }
        mo44260j(forkJoinTask);
        return forkJoinTask;
    }

    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new ForkJoinTask.AdaptedRunnable(runnable, t);
    }

    /* renamed from: o */
    public int mo44264o() {
        int i = this.f30355r & 65535;
        if (i > 0) {
            return i;
        }
        return 1;
    }

    /* renamed from: r */
    public final int mo44265r(C6051g gVar, CountedCompleter<?> countedCompleter, int i) {
        if (gVar == null) {
            return 0;
        }
        return gVar.mo44286d(countedCompleter, i);
    }

    /* renamed from: s */
    public final void mo44266s(C6051g gVar) {
        boolean z;
        boolean z2;
        int i;
        C6051g gVar2;
        ForkJoinTask<?>[] forkJoinTaskArr;
        int length;
        C6051g gVar3 = gVar;
        int i2 = gVar3.f30376e;
        int i3 = gVar3.f30375d & 65536;
        char c = 65535;
        int i4 = i2;
        char c2 = 65535;
        while (true) {
            if (i3 != 0) {
                gVar3.mo44287e(0);
            } else {
                gVar3.mo44288f(0);
            }
            if (c2 == c && gVar3.f30372a >= 0) {
                c2 = 1;
            }
            int l = gl6.m44765l();
            C6051g[] gVarArr = this.f30356s;
            long j = 281474976710656L;
            if (gVarArr != null) {
                int length2 = gVarArr.length;
                int i5 = length2 - 1;
                int i6 = length2;
                z = true;
                while (true) {
                    if (i6 <= 0) {
                        z2 = true;
                        break;
                    }
                    int i7 = (l - i6) & i5;
                    if (i7 >= 0 && i7 < length2 && (gVar2 = gVarArr[i7]) != null) {
                        int i8 = gVar2.f30377f;
                        if (i8 - gVar2.f30378g < 0 && (forkJoinTaskArr = gVar2.f30379h) != null && (length = forkJoinTaskArr.length) > 0) {
                            if (c2 == 0) {
                                m46244l(this, f30343U, j);
                                c2 = 1;
                            }
                            long j2 = (((long) ((length - 1) & i8)) << f30346Z) + ((long) f30345Y);
                            Unsafe unsafe = f30342Q;
                            ForkJoinTask forkJoinTask = (ForkJoinTask) unsafe.getObjectVolatile(forkJoinTaskArr, j2);
                            if (forkJoinTask != null) {
                                int i9 = i8 + 1;
                                if (i8 == gVar2.f30377f && fm0.m44335a(unsafe, forkJoinTaskArr, j2, forkJoinTask, (Object) null)) {
                                    gVar2.f30377f = i9;
                                    gVar3.f30376e = gVar2.f30375d;
                                    forkJoinTask.doExec();
                                    gVar3.f30376e = i2;
                                    i4 = i2;
                                }
                            }
                            z2 = false;
                            z = false;
                        } else if ((gVar2.f30376e & 1073741824) == 0) {
                            z = false;
                        }
                    }
                    i6--;
                    j = 281474976710656L;
                }
            } else {
                z2 = true;
                z = true;
            }
            if (z) {
                break;
            }
            if (z2) {
                if (i4 != 1073741824) {
                    gVar3.f30376e = 1073741824;
                    i = 1073741824;
                } else {
                    i = i4;
                }
                if (c2 == 1) {
                    m46244l(this, f30343U, -281474976710656L);
                    i4 = i;
                    c2 = 0;
                } else {
                    i4 = i;
                }
            }
            c = 65535;
        }
        if (c2 == 0) {
            m46244l(this, f30343U, 281474976710656L);
        }
        gVar3.f30376e = i2;
    }

    public void shutdown() {
        m46240c();
        mo44249L(false, true);
    }

    public List<Runnable> shutdownNow() {
        m46240c();
        mo44249L(true, true);
        return Collections.emptyList();
    }

    public String toString() {
        int i;
        String str;
        long j = this.f30351d;
        C6051g[] gVarArr = this.f30356s;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        if (gVarArr != null) {
            i = 0;
            for (int i3 = 0; i3 < gVarArr.length; i3++) {
                C6051g gVar = gVarArr[i3];
                if (gVar != null) {
                    int l = gVar.mo44294l();
                    if ((i3 & 1) == 0) {
                        j3 += (long) l;
                    } else {
                        j2 += (long) l;
                        j += ((long) gVar.f30374c) & 4294967295L;
                        if (gVar.mo44285c()) {
                            i++;
                        }
                    }
                }
            }
        } else {
            i = 0;
        }
        int i4 = this.f30355r;
        short s = 65535 & i4;
        long j4 = this.f30350a;
        int i5 = ((short) ((int) (j4 >>> 32))) + s;
        int i6 = ((int) (j4 >> 48)) + s;
        if (i6 >= 0) {
            i2 = i6;
        }
        if ((524288 & i4) != 0) {
            str = "Terminated";
        } else if ((Integer.MIN_VALUE & i4) != 0) {
            str = "Terminating";
        } else if ((i4 & 262144) != 0) {
            str = "Shutting down";
        } else {
            str = "Running";
        }
        return super.toString() + "[" + str + ", parallelism = " + s + ", size = " + i5 + ", active = " + i2 + ", running = " + i + ", steals = " + j + ", tasks = " + j2 + ", submissions = " + j3 + "]";
    }

    /* renamed from: u */
    public boolean mo44273u() {
        while (true) {
            long j = this.f30350a;
            int i = this.f30355r;
            short s = 65535 & i;
            int i2 = ((short) ((int) (j >>> 32))) + s;
            int i3 = s + ((int) (j >> 48));
            if ((i & -2146959360) != 0) {
                return true;
            }
            if (i3 > 0) {
                return false;
            }
            C6051g[] gVarArr = this.f30356s;
            if (gVarArr != null) {
                for (int i4 = 1; i4 < gVarArr.length; i4 += 2) {
                    C6051g gVar = gVarArr[i4];
                    if (gVar != null) {
                        if ((gVar.f30376e & 1073741824) == 0) {
                            return false;
                        }
                        i2--;
                    }
                }
            }
            if (i2 == 0 && this.f30350a == j) {
                return true;
            }
        }
    }

    /* renamed from: y */
    public final ForkJoinTask<?> mo44274y(C6051g gVar) {
        ForkJoinTask<?> forkJoinTask;
        if (gVar != null) {
            if ((gVar.f30375d & 65536) != 0) {
                forkJoinTask = gVar.mo44291i();
            } else {
                forkJoinTask = gVar.mo44292j();
            }
            if (forkJoinTask != null) {
                return forkJoinTask;
            }
        }
        return mo44275z(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r14 = (((long) ((r11 - 1) & r10)) << f30346Z) + ((long) f30345Y);
        r12 = f30342Q;
        r1 = (java8.util.concurrent.ForkJoinTask) r12.getObjectVolatile(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r1 == null) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r2 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r10 != r9.f30377f) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (p000.fm0.m44335a(r12, r13, r14, r1, (java.lang.Object) null) == false) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r9.f30377f = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0002, code lost:
        continue;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java8.util.concurrent.ForkJoinTask<?> mo44275z(boolean r19) {
        /*
            r18 = this;
            r0 = r18
        L_0x0002:
            int r1 = r0.f30355r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 != 0) goto L_0x0071
            java8.util.concurrent.a$g[] r1 = r0.f30356s
            if (r1 == 0) goto L_0x0071
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0071
            int r2 = r2 + -1
            int r3 = p000.gl6.m44765l()
            int r4 = r3 >>> 16
            if (r19 == 0) goto L_0x0022
            r3 = r3 & -2
            r3 = r3 & r2
            r4 = r4 & -2
            r4 = r4 | 2
            goto L_0x0025
        L_0x0022:
            r3 = r3 & r2
            r4 = r4 | 1
        L_0x0025:
            r5 = 0
            r6 = r3
            r7 = r5
            r8 = r7
        L_0x0029:
            r9 = r1[r6]
            if (r9 == 0) goto L_0x0067
            int r10 = r9.f30377f
            int r7 = r7 + r10
            int r11 = r9.f30378g
            int r11 = r10 - r11
            if (r11 >= 0) goto L_0x0067
            java8.util.concurrent.ForkJoinTask<?>[] r13 = r9.f30379h
            if (r13 == 0) goto L_0x0067
            int r11 = r13.length
            if (r11 <= 0) goto L_0x0067
            int r11 = r11 + -1
            r1 = r11 & r10
            long r1 = (long) r1
            int r3 = f30346Z
            long r1 = r1 << r3
            int r3 = f30345Y
            long r3 = (long) r3
            long r14 = r1 + r3
            sun.misc.Unsafe r12 = f30342Q
            java.lang.Object r1 = r12.getObjectVolatile(r13, r14)
            java8.util.concurrent.ForkJoinTask r1 = (java8.util.concurrent.ForkJoinTask) r1
            if (r1 == 0) goto L_0x0002
            int r2 = r10 + 1
            int r3 = r9.f30377f
            if (r10 != r3) goto L_0x0002
            r17 = 0
            r16 = r1
            boolean r3 = p000.fm0.m44335a(r12, r13, r14, r16, r17)
            if (r3 == 0) goto L_0x0002
            r9.f30377f = r2
            return r1
        L_0x0067:
            int r6 = r6 + r4
            r6 = r6 & r2
            if (r6 != r3) goto L_0x0029
            if (r8 != r7) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r8 = r7
            r7 = r5
            goto L_0x0029
        L_0x0071:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.mo44275z(boolean):java8.util.concurrent.ForkJoinTask");
    }

    public C6042a() {
        this(Math.min(32767, Runtime.getRuntime().availableProcessors()), f30336C, (Thread.UncaughtExceptionHandler) null, false, 0, 32767, 1, (ju4<? super C6042a>) null, 60000, TimeUnit.MILLISECONDS);
    }

    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new ForkJoinTask.AdaptedCallable(callable);
    }

    public C6042a(int i, C6046c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z, int i2, int i3, int i4, ju4<? super C6042a> ju4, long j, TimeUnit timeUnit) {
        int i5 = i;
        int i6 = i3;
        long j2 = j;
        if (i5 <= 0 || i5 > 32767 || i6 < i5 || j2 <= 0) {
            throw new IllegalArgumentException();
        }
        kf4.m47057e(cVar);
        long max = Math.max(timeUnit.toMillis(j2), 20);
        long j3 = ((((long) (-Math.min(Math.max(i2, i), 32767))) << 32) & 281470681743360L) | ((((long) (-i5)) << 48) & -281474976710656L);
        int i7 = (z ? 65536 : 0) | i5;
        int min = ((Math.min(i6, 32767) - i5) << 16) | ((Math.min(Math.max(i4, 0), 32767) - i5) & 65535);
        int i8 = i5 > 1 ? i5 - 1 : 1;
        int i9 = i8 | (i8 >>> 1);
        int i10 = i9 | (i9 >>> 2);
        int i11 = i10 | (i10 >>> 4);
        int i12 = i11 | (i11 >>> 8);
        this.f30357x = "ForkJoinPool-" + m46252x() + "-worker-";
        this.f30356s = new C6051g[(((i12 | (i12 >>> 16)) + 1) << 1)];
        this.f30358y = cVar;
        this.f30348A = uncaughtExceptionHandler;
        this.f30349B = ju4;
        this.f30352e = max;
        this.f30354k = min;
        this.f30355r = i7;
        this.f30350a = j3;
        m46240c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6042a(byte r11) {
        /*
            r10 = this;
            r10.<init>()
            r11 = 0
            r0 = -1
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool.common.parallelism"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ Exception -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0022 }
        L_0x0011:
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool.common.threadFactory"
            java.lang.Object r1 = m46251w(r1)     // Catch:{ Exception -> 0x0022 }
            java8.util.concurrent.a$c r1 = (java8.util.concurrent.C6042a.C6046c) r1     // Catch:{ Exception -> 0x0022 }
            java.lang.String r2 = "java.util.concurrent.ForkJoinPool.common.exceptionHandler"
            java.lang.Object r2 = m46251w(r2)     // Catch:{ Exception -> 0x0023 }
            java.lang.Thread$UncaughtExceptionHandler r2 = (java.lang.Thread.UncaughtExceptionHandler) r2     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0022:
            r1 = r11
        L_0x0023:
            r2 = r11
        L_0x0024:
            if (r1 != 0) goto L_0x0034
            java.lang.SecurityManager r1 = java.lang.System.getSecurityManager()
            if (r1 != 0) goto L_0x002f
            java8.util.concurrent.a$c r1 = f30336C
            goto L_0x0034
        L_0x002f:
            java8.util.concurrent.a$d r1 = new java8.util.concurrent.a$d
            r1.<init>(r11)
        L_0x0034:
            r3 = 1
            if (r0 >= 0) goto L_0x0043
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 - r3
            if (r0 > 0) goto L_0x0043
            r0 = r3
        L_0x0043:
            r4 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r4) goto L_0x0048
            r0 = r4
        L_0x0048:
            int r4 = -r0
            long r4 = (long) r4
            r6 = 32
            long r6 = r4 << r6
            r8 = 281470681743360(0xffff00000000, double:1.39064994160909E-309)
            long r6 = r6 & r8
            r8 = 48
            long r4 = r4 << r8
            r8 = -281474976710656(0xffff000000000000, double:NaN)
            long r4 = r4 & r8
            long r4 = r4 | r6
            int r6 = 1 - r0
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            int r7 = f30340M
            int r7 = r7 << 16
            r6 = r6 | r7
            if (r0 <= r3) goto L_0x006b
            int r7 = r0 + -1
            goto L_0x006c
        L_0x006b:
            r7 = r3
        L_0x006c:
            int r8 = r7 >>> 1
            r7 = r7 | r8
            int r8 = r7 >>> 2
            r7 = r7 | r8
            int r8 = r7 >>> 4
            r7 = r7 | r8
            int r8 = r7 >>> 8
            r7 = r7 | r8
            int r8 = r7 >>> 16
            r7 = r7 | r8
            int r7 = r7 + r3
            int r3 = r7 << 1
            java.lang.String r7 = "ForkJoinPool.commonPool-worker-"
            r10.f30357x = r7
            java8.util.concurrent.a$g[] r3 = new java8.util.concurrent.C6042a.C6051g[r3]
            r10.f30356s = r3
            r10.f30358y = r1
            r10.f30348A = r2
            r10.f30349B = r11
            r1 = 60000(0xea60, double:2.9644E-319)
            r10.f30352e = r1
            r10.f30354k = r6
            r10.f30355r = r0
            r10.f30350a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.C6042a.<init>(byte):void");
    }
}
