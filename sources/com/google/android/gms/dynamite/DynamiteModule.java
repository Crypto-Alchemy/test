package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class DynamiteModule {

    /* renamed from: b */
    public static final C4040a f22420b = new C4044b();

    /* renamed from: c */
    public static final C4040a f22421c = new C4045c();

    /* renamed from: d */
    public static final C4040a f22422d = new C4046d();

    /* renamed from: e */
    public static final C4040a f22423e = new C4047e();

    /* renamed from: f */
    public static final C4040a f22424f = new C4048f();

    /* renamed from: g */
    public static final C4040a f22425g = new C4049g();

    /* renamed from: h */
    public static Boolean f22426h = null;

    /* renamed from: i */
    public static String f22427i = null;

    /* renamed from: j */
    public static boolean f22428j = false;

    /* renamed from: k */
    public static int f22429k = -1;

    /* renamed from: l */
    public static Boolean f22430l;

    /* renamed from: m */
    public static final ThreadLocal f22431m = new ThreadLocal();

    /* renamed from: n */
    public static final ThreadLocal f22432n = new zh8();

    /* renamed from: o */
    public static final C4040a.C4041a f22433o = new C4043a();

    /* renamed from: p */
    public static final C4040a f22434p = new C4050h();

    /* renamed from: q */
    public static ng9 f22435q;

    /* renamed from: r */
    public static xh9 f22436r;

    /* renamed from: a */
    public final Context f22437a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, ve9 ve9) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, ve9 ve9) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C4040a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public interface C4041a {
            /* renamed from: a */
            int mo30745a(Context context, String str, boolean z) throws LoadingException;

            /* renamed from: b */
            int mo30746b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public static class C4042b {

            /* renamed from: a */
            public int f22438a = 0;

            /* renamed from: b */
            public int f22439b = 0;

            /* renamed from: c */
            public int f22440c = 0;
        }

        /* renamed from: a */
        C4042b mo30744a(Context context, String str, C4041a aVar) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        cu4.m43221k(context);
        this.f22437a = context;
    }

    /* renamed from: a */
    public static int m33816a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (if4.m45709a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb = new StringBuilder();
            sb.append("Module descriptor id '");
            sb.append(valueOf);
            sb.append("' didn't match expected id '");
            sb.append(str);
            sb.append("'");
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Local module descriptor class for ");
            sb2.append(str);
            sb2.append(" not found.");
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    /* renamed from: b */
    public static int m33817b(Context context, String str) {
        return m33819e(context, str, false);
    }

    /* renamed from: d */
    public static DynamiteModule m33818d(Context context, C4040a aVar, String str) throws LoadingException {
        int i;
        Boolean bool;
        DynamiteModule dynamiteModule;
        ro2 ro2;
        xh9 xh9;
        boolean z;
        Boolean valueOf;
        ro2 ro22;
        Context context2 = context;
        C4040a aVar2 = aVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal threadLocal = f22431m;
        jb9 jb9 = (jb9) threadLocal.get();
        jb9 jb92 = new jb9((d99) null);
        threadLocal.set(jb92);
        ThreadLocal threadLocal2 = f22432n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C4040a.C4042b a = aVar2.mo30744a(context2, str2, f22433o);
            int i2 = a.f22438a;
            int i3 = a.f22439b;
            StringBuilder sb = new StringBuilder();
            sb.append("Considering local module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i3);
            int i4 = a.f22440c;
            if (i4 != 0) {
                if (i4 == -1) {
                    if (a.f22438a != 0) {
                        i4 = -1;
                    }
                }
                if (!(i4 == 1 && a.f22439b == 0)) {
                    if (i4 == -1) {
                        DynamiteModule g = m33821g(context2, str2);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = jb92.f30453a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(jb9);
                        return g;
                    } else if (i4 == 1) {
                        try {
                            int i5 = a.f22439b;
                            try {
                                synchronized (cls) {
                                    if (m33824j(context)) {
                                        bool = f22426h;
                                    } else {
                                        throw new LoadingException("Remote loading disabled", (ve9) null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str2);
                                        sb2.append(", version >= ");
                                        sb2.append(i5);
                                        synchronized (cls) {
                                            xh9 = f22436r;
                                        }
                                        if (xh9 != null) {
                                            jb9 jb93 = (jb9) threadLocal.get();
                                            if (jb93 == null || jb93.f30453a == null) {
                                                throw new LoadingException("No result cursor", (ve9) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = jb93.f30453a;
                                            gf4.m44716s1(null);
                                            synchronized (cls) {
                                                if (f22429k >= 2) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                valueOf = Boolean.valueOf(z);
                                            }
                                            if (valueOf.booleanValue()) {
                                                ro22 = xh9.mo49485s1(gf4.m44716s1(applicationContext), str2, i5, gf4.m44716s1(cursor2));
                                            } else {
                                                ro22 = xh9.mo49484r1(gf4.m44716s1(applicationContext), str2, i5, gf4.m44716s1(cursor2));
                                            }
                                            Context context3 = (Context) gf4.m44715r1(ro22);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new LoadingException("Failed to get module context", (ve9) null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", (ve9) null);
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str2);
                                        sb3.append(", version >= ");
                                        sb3.append(i5);
                                        ng9 k = m33825k(context);
                                        if (k != null) {
                                            int c = k.mo46076c();
                                            if (c >= 3) {
                                                jb9 jb94 = (jb9) threadLocal.get();
                                                if (jb94 != null) {
                                                    ro2 = k.mo46080u1(gf4.m44716s1(context), str2, i5, gf4.m44716s1(jb94.f30453a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", (ve9) null);
                                                }
                                            } else if (c == 2) {
                                                ro2 = k.mo46081v1(gf4.m44716s1(context), str2, i5);
                                            } else {
                                                ro2 = k.mo46079t1(gf4.m44716s1(context), str2, i5);
                                            }
                                            Object r1 = gf4.m44715r1(ro2);
                                            if (r1 != null) {
                                                dynamiteModule = new DynamiteModule((Context) r1);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", (ve9) null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", (ve9) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = jb92.f30453a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(jb9);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", (ve9) null);
                            } catch (RemoteException e) {
                                throw new LoadingException("Failed to load remote module.", e, (ve9) null);
                            } catch (LoadingException e2) {
                                throw e2;
                            } catch (Throwable th) {
                                pu0.m50111a(context2, th);
                                throw new LoadingException("Failed to load remote module.", th, (ve9) null);
                            }
                        } catch (LoadingException e3) {
                            String message = e3.getMessage();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Failed to load remote module: ");
                            sb4.append(message);
                            int i6 = a.f22438a;
                            if (i6 != 0) {
                                if (aVar.mo30744a(context2, str2, new C4051i(i6, 0)).f22440c == -1) {
                                    DynamiteModule g2 = m33821g(context2, str2);
                                    if (i != 0) {
                                        f22432n.set(Long.valueOf(longValue));
                                    }
                                    return g2;
                                }
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e3, (ve9) null);
                        }
                    } else {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i4, (ve9) null);
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str2 + " found. Local version is " + a.f22438a + " and remote version is " + a.f22439b + ".", (ve9) null);
        } finally {
            if (longValue == 0) {
                f22432n.remove();
            } else {
                f22432n.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = jb92.f30453a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f22431m.set(jb9);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    /* renamed from: e */
    public static int m33819e(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0192 }
            java.lang.Boolean r1 = f22426h     // Catch:{ all -> 0x018f }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00cf
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            m33822h(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x003f:
            boolean r5 = m33824j(r10)     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            return r3
        L_0x0048:
            boolean r5 = f22428j     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00a7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a7
        L_0x0055:
            r6 = 1
            int r6 = m33820f(r10, r11, r12, r6)     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r7 = f22427i     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = p000.ya8.m54670a()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = f22427i     // Catch:{ LoadingException -> 0x009d }
            p000.cu4.m43221k(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
            goto L_0x008f
        L_0x0081:
            re8 r7 = new re8     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = f22427i     // Catch:{ LoadingException -> 0x009d }
            p000.cu4.m43221k(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
        L_0x008f:
            m33822h(r7)     // Catch:{ LoadingException -> 0x009d }
            r1.set(r2, r7)     // Catch:{ LoadingException -> 0x009d }
            f22426h = r5     // Catch:{ LoadingException -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a7:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            goto L_0x00cd
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r4.<init>()     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x018f }
            r4.append(r1)     // Catch:{ all -> 0x018f }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x018f }
        L_0x00cd:
            f22426h = r1     // Catch:{ all -> 0x018f }
        L_0x00cf:
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00ee
            int r10 = m33820f(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00db }
            return r10
        L_0x00db:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0192 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
            r12.<init>()     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x0192 }
            r12.append(r11)     // Catch:{ all -> 0x0192 }
            return r3
        L_0x00ee:
            ng9 r4 = m33825k(r10)     // Catch:{ all -> 0x0192 }
            if (r4 != 0) goto L_0x00f6
            goto L_0x0186
        L_0x00f6:
            int r0 = r4.mo46076c()     // Catch:{ RemoteException -> 0x016e }
            r1 = 3
            if (r0 < r1) goto L_0x0157
            java.lang.ThreadLocal r0 = f22431m     // Catch:{ RemoteException -> 0x016e }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x016e }
            jb9 r0 = (p000.jb9) r0     // Catch:{ RemoteException -> 0x016e }
            if (r0 == 0) goto L_0x0111
            android.database.Cursor r0 = r0.f30453a     // Catch:{ RemoteException -> 0x016e }
            if (r0 == 0) goto L_0x0111
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x016e }
            goto L_0x0186
        L_0x0111:
            ro2 r5 = p000.gf4.m44716s1(r10)     // Catch:{ RemoteException -> 0x016e }
            java.lang.ThreadLocal r0 = f22432n     // Catch:{ RemoteException -> 0x016e }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x016e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x016e }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x016e }
            r6 = r11
            r7 = r12
            ro2 r11 = r4.mo46082w1(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x016e }
            java.lang.Object r11 = p000.gf4.m44715r1(r11)     // Catch:{ RemoteException -> 0x016e }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x016e }
            if (r11 == 0) goto L_0x0151
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x014e, all -> 0x014b }
            if (r12 != 0) goto L_0x0136
            goto L_0x0151
        L_0x0136:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x014e, all -> 0x014b }
            if (r12 <= 0) goto L_0x0143
            boolean r0 = m33823i(r11)     // Catch:{ RemoteException -> 0x014e, all -> 0x014b }
            if (r0 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r2 = r11
        L_0x0144:
            if (r2 == 0) goto L_0x0149
            r2.close()     // Catch:{ all -> 0x0192 }
        L_0x0149:
            r3 = r12
            goto L_0x0186
        L_0x014b:
            r12 = move-exception
            r2 = r11
            goto L_0x0189
        L_0x014e:
            r12 = move-exception
            r2 = r11
            goto L_0x0170
        L_0x0151:
            if (r11 == 0) goto L_0x0186
            r11.close()     // Catch:{ all -> 0x0192 }
            goto L_0x0186
        L_0x0157:
            r1 = 2
            if (r0 != r1) goto L_0x0163
            ro2 r0 = p000.gf4.m44716s1(r10)     // Catch:{ RemoteException -> 0x016e }
            int r3 = r4.mo46078s1(r0, r11, r12)     // Catch:{ RemoteException -> 0x016e }
            goto L_0x0186
        L_0x0163:
            ro2 r0 = p000.gf4.m44716s1(r10)     // Catch:{ RemoteException -> 0x016e }
            int r3 = r4.mo46077r1(r0, r11, r12)     // Catch:{ RemoteException -> 0x016e }
            goto L_0x0186
        L_0x016c:
            r12 = r11
            goto L_0x0189
        L_0x016e:
            r11 = move-exception
            r12 = r11
        L_0x0170:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r12.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x0187 }
            r12.append(r11)     // Catch:{ all -> 0x0187 }
            if (r2 == 0) goto L_0x0186
            r2.close()     // Catch:{ all -> 0x0192 }
        L_0x0186:
            return r3
        L_0x0187:
            r11 = move-exception
            goto L_0x016c
        L_0x0189:
            if (r2 == 0) goto L_0x018e
            r2.close()     // Catch:{ all -> 0x0192 }
        L_0x018e:
            throw r12     // Catch:{ all -> 0x0192 }
        L_0x018f:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            throw r11     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r11 = move-exception
            p000.pu0.m50111a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m33819e(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c2  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m33820f(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f22432n     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r12.<init>()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f22427i = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f22429k = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = r11
        L_0x007f:
            f22428j = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = m33823i(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b1
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00ab:
            r10 = move-exception
            r11 = r10
            goto L_0x00c0
        L_0x00ae:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b1:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00be }
            if (r12 == 0) goto L_0x00b6
            throw r11     // Catch:{ all -> 0x00be }
        L_0x00b6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00be }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00be }
            throw r12     // Catch:{ all -> 0x00be }
        L_0x00be:
            r11 = move-exception
            r0 = r10
        L_0x00c0:
            if (r0 == 0) goto L_0x00c5
            r0.close()
        L_0x00c5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m33820f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: g */
    public static DynamiteModule m33821g(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: h */
    public static void m33822h(ClassLoader classLoader) throws LoadingException {
        xh9 xh9;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                xh9 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof xh9) {
                    xh9 = (xh9) queryLocalInterface;
                } else {
                    xh9 = new xh9(iBinder);
                }
            }
            f22436r = xh9;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (ve9) null);
        }
    }

    /* renamed from: i */
    public static boolean m33823i(Cursor cursor) {
        jb9 jb9 = (jb9) f22431m.get();
        if (jb9 == null || jb9.f30453a != null) {
            return false;
        }
        jb9.f30453a = cursor;
        return true;
    }

    /* renamed from: j */
    public static boolean m33824j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f22430l)) {
            return true;
        }
        boolean z = false;
        if (f22430l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (zh2.m55108h().mo49670j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f22430l = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f22428j = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public static ng9 m33825k(Context context) {
        ng9 ng9;
        synchronized (DynamiteModule.class) {
            ng9 ng92 = f22435q;
            if (ng92 != null) {
                return ng92;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    ng9 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof ng9) {
                        ng9 = (ng9) queryLocalInterface;
                    } else {
                        ng9 = new ng9(iBinder);
                    }
                }
                if (ng9 != null) {
                    f22435q = ng9;
                    return ng9;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
            }
        }
        return null;
    }

    /* renamed from: c */
    public IBinder mo30743c(String str) throws LoadingException {
        try {
            return (IBinder) this.f22437a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, (ve9) null);
        }
    }
}
