package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.l90;
import p000.pt0;

/* renamed from: wo4 */
/* compiled from: Platform */
public class wo4 {

    /* renamed from: c */
    public static final wo4 f45741c = m73703f();

    /* renamed from: a */
    public final boolean f45742a;

    /* renamed from: b */
    public final Constructor<MethodHandles.Lookup> f45743b;

    /* renamed from: wo4$a */
    /* compiled from: Platform */
    public static final class C9558a extends wo4 {

        /* renamed from: wo4$a$a */
        /* compiled from: Platform */
        public static final class C9559a implements Executor {

            /* renamed from: a */
            public final Handler f45744a = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.f45744a.post(runnable);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9558a() {
            /*
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L_0x0008
                r0 = 1
                goto L_0x0009
            L_0x0008:
                r0 = 0
            L_0x0009:
                r2.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.wo4.C9558a.<init>():void");
        }

        /* renamed from: c */
        public Executor mo66753c() {
            return new C9559a();
        }

        /* renamed from: h */
        public Object mo66756h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return wo4.super.mo66756h(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public wo4(boolean z) {
        this.f45742a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f45743b = constructor;
    }

    /* renamed from: f */
    public static wo4 m73703f() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new C9558a();
        }
        return new wo4(true);
    }

    /* renamed from: g */
    public static wo4 m73704g() {
        return f45741c;
    }

    /* renamed from: a */
    public List<? extends l90.C7825a> mo66751a(Executor executor) {
        b71 b71 = new b71(executor);
        if (!this.f45742a) {
            return Collections.singletonList(b71);
        }
        return Arrays.asList(new l90.C7825a[]{gm0.f38037a, b71});
    }

    /* renamed from: b */
    public int mo66752b() {
        if (this.f45742a) {
            return 2;
        }
        return 1;
    }

    /* renamed from: c */
    public Executor mo66753c() {
        return null;
    }

    /* renamed from: d */
    public List<? extends pt0.C9195a> mo66754d() {
        if (this.f45742a) {
            return Collections.singletonList(ri4.f44373a);
        }
        return Collections.emptyList();
    }

    /* renamed from: e */
    public int mo66755e() {
        return this.f45742a ? 1 : 0;
    }

    @IgnoreJRERequirement
    /* renamed from: h */
    public Object mo66756h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f45743b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    /* renamed from: i */
    public boolean mo66757i(Method method) {
        if (!this.f45742a || !method.isDefault()) {
            return false;
        }
        return true;
    }
}
