package java8.util.concurrent;

import java.lang.Thread;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java8.util.concurrent.C6042a;

/* renamed from: java8.util.concurrent.b */
/* compiled from: ForkJoinWorkerThread */
public class C6052b extends Thread {

    /* renamed from: a */
    public final C6042a f30382a;

    /* renamed from: d */
    public final C6042a.C6051g f30383d;

    /* renamed from: java8.util.concurrent.b$a */
    /* compiled from: ForkJoinWorkerThread */
    public static final class C6053a extends C6052b {

        /* renamed from: e */
        public static final ThreadGroup f30384e = ((ThreadGroup) AccessController.doPrivileged(new C6054a()));

        /* renamed from: g */
        public static final AccessControlContext f30385g = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain((CodeSource) null, (PermissionCollection) null)});

        /* renamed from: java8.util.concurrent.b$a$a */
        /* compiled from: ForkJoinWorkerThread */
        public static class C6054a implements PrivilegedAction<ThreadGroup> {
            /* renamed from: a */
            public ThreadGroup run() {
                ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                while (true) {
                    ThreadGroup parent = threadGroup.getParent();
                    if (parent == null) {
                        return new ThreadGroup(threadGroup, "InnocuousForkJoinWorkerThreadGroup");
                    }
                    threadGroup = parent;
                }
            }
        }

        public C6053a(C6042a aVar) {
            super(aVar, ClassLoader.getSystemClassLoader(), f30384e, f30385g);
        }

        /* renamed from: a */
        public void mo44300a() {
            gl6.m44755b(this);
        }

        public void setContextClassLoader(ClassLoader classLoader) {
            throw new SecurityException("setContextClassLoader");
        }

        public void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        }
    }

    public C6052b(C6042a aVar, ClassLoader classLoader) {
        super("aForkJoinWorkerThread");
        gl6.m44766m(this, classLoader);
        this.f30382a = aVar;
        this.f30383d = aVar.mo44240C(this);
    }

    /* renamed from: a */
    public void mo44300a() {
    }

    /* renamed from: b */
    public C6042a mo44301b() {
        return this.f30382a;
    }

    /* renamed from: c */
    public void mo44302c() {
    }

    /* renamed from: d */
    public void mo44303d(Throwable th) {
    }

    public void run() {
        if (this.f30383d.f30379h == null) {
            Throwable th = null;
            try {
                mo44302c();
                this.f30382a.mo44241D(this.f30383d);
                try {
                    mo44303d((Throwable) null);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable unused) {
            }
            this.f30382a.mo44255h(this, th);
        }
    }

    public C6052b(C6042a aVar, ClassLoader classLoader, ThreadGroup threadGroup, AccessControlContext accessControlContext) {
        super(threadGroup, "aForkJoinWorkerThread");
        super.setContextClassLoader(classLoader);
        gl6.m44767n(this, accessControlContext);
        gl6.m44755b(this);
        this.f30382a = aVar;
        this.f30383d = aVar.mo44240C(this);
    }
}
