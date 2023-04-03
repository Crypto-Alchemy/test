package p000;

import com.tinder.scarlet.internal.connection.Connection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.fx5;
import p000.ix5;
import p000.ja6;
import p000.ju3;
import p000.mx5;
import p000.rt1;
import p000.yj7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J!\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002JC\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0011\u001a\u00020\u00012\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\""}, mo44877d2 = {"Lhm5;", "", "T", "Ljava/lang/Class;", "service", "b", "(Ljava/lang/Class;)Ljava/lang/Object;", "serviceInterface", "f", "Lfx5;", "serviceInstance", "Ljava/lang/reflect/InvocationHandler;", "c", "Ljava/lang/reflect/Method;", "method", "", "i", "proxy", "", "args", "e", "(Ljava/lang/reflect/Method;Lfx5;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "h", "j", "g", "Lpi5;", "a", "Lpi5;", "runtimePlatform", "Lfx5$a;", "Lfx5$a;", "serviceFactory", "<init>", "(Lpi5;Lfx5$a;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: hm5 */
/* compiled from: Scarlet.kt */
public final class hm5 {

    /* renamed from: a */
    public final pi5 f29662a;

    /* renamed from: b */
    public final fx5.C5853a f29663b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010%\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006("}, mo44877d2 = {"Lhm5$a;", "", "Lyj7$b;", "factory", "k", "Lkg3;", "lifecycle", "j", "Lzw;", "backoffStrategy", "c", "Lju3$a;", "a", "Lja6$a;", "b", "Lhm5;", "d", "Lfx5$a;", "g", "Lcom/tinder/scarlet/internal/connection/Connection$Factory;", "e", "Lmx5$a;", "h", "Lku3;", "f", "Lka6;", "i", "Lyj7$b;", "webSocketFactory", "Lkg3;", "Lzw;", "", "Ljava/util/List;", "messageAdapterFactories", "streamAdapterFactories", "Lpi5;", "Lpi5;", "platform", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: hm5$a */
    /* compiled from: Scarlet.kt */
    public static final class C5925a {

        /* renamed from: g */
        public static final C5926a f29664g = new C5926a((DefaultConstructorMarker) null);
        @Deprecated

        /* renamed from: h */
        public static final u81 f29665h = new u81((yg3) null, 1, (DefaultConstructorMarker) null);
        @Deprecated

        /* renamed from: i */
        public static final long f29666i = 1000;
        @Deprecated

        /* renamed from: j */
        public static final long f29667j = 10000;
        @Deprecated

        /* renamed from: k */
        public static final px1 f29668k = new px1(1000, 10000);
        @Deprecated

        /* renamed from: l */
        public static final nm5 f29669l;

        /* renamed from: a */
        public yj7.C6745b f29670a;

        /* renamed from: b */
        public kg3 f29671b = f29665h;

        /* renamed from: c */
        public C6779zw f29672c = f29668k;

        /* renamed from: d */
        public final List<ju3.C6128a> f29673d = new ArrayList();

        /* renamed from: e */
        public final List<ja6.C6024a> f29674e = new ArrayList();

        /* renamed from: f */
        public final pi5 f29675f = pi5.f32712a.mo46747c();

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002XD¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002XD¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lhm5$a$a;", "", "Lu81;", "DEFAULT_LIFECYCLE", "Lu81;", "Lpx1;", "DEFAULT_RETRY_STRATEGY", "Lpx1;", "Lnm5;", "DEFAULT_SCHEDULER", "Lnm5;", "", "RETRY_BASE_DURATION", "J", "RETRY_MAX_DURATION", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: hm5$a$a */
        /* compiled from: Scarlet.kt */
        public static final class C5926a {
            public C5926a() {
            }

            public /* synthetic */ C5926a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            nm5 a = sm5.m51860a();
            vx2.m53590f(a, "computation()");
            f29669l = a;
        }

        /* renamed from: a */
        public final C5925a mo43323a(ju3.C6128a aVar) {
            vx2.m53591g(aVar, "factory");
            this.f29673d.add(aVar);
            return this;
        }

        /* renamed from: b */
        public final C5925a mo43324b(ja6.C6024a aVar) {
            vx2.m53591g(aVar, "factory");
            this.f29674e.add(aVar);
            return this;
        }

        /* renamed from: c */
        public final C5925a mo43325c(C6779zw zwVar) {
            vx2.m53591g(zwVar, "backoffStrategy");
            this.f29672c = zwVar;
            return this;
        }

        /* renamed from: d */
        public final hm5 mo43326d() {
            return new hm5(this.f29675f, mo43329g());
        }

        /* renamed from: e */
        public final Connection.Factory mo43327e() {
            kg3 kg3 = this.f29671b;
            yj7.C6745b bVar = this.f29670a;
            if (bVar != null) {
                return new Connection.Factory(kg3, bVar, this.f29672c, f29669l);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: f */
        public final ku3 mo43328f() {
            List<ju3.C6128a> list = this.f29673d;
            list.add(new g50());
            r37 r37 = r37.f33317a;
            return new ku3(CollectionsKt___CollectionsKt.m47311K0(list));
        }

        /* renamed from: g */
        public final fx5.C5853a mo43329g() {
            return new fx5.C5853a(mo43327e(), mo43330h());
        }

        /* renamed from: h */
        public final mx5.C6267a mo43330h() {
            ku3 f = mo43328f();
            ka6 i = mo43331i();
            rt1.C6443b bVar = new rt1.C6443b(f);
            return new mx5.C6267a(this.f29675f, new ix5.C6017d.C6018a(f), new ix5.C6015c.C6016a(f29669l, bVar, i));
        }

        /* renamed from: i */
        public final ka6 mo43331i() {
            List<ja6.C6024a> list = this.f29674e;
            list.add(new i50());
            r37 r37 = r37.f33317a;
            return new ka6(CollectionsKt___CollectionsKt.m47311K0(list));
        }

        /* renamed from: j */
        public final C5925a mo43332j(kg3 kg3) {
            vx2.m53591g(kg3, "lifecycle");
            this.f29671b = kg3;
            return this;
        }

        /* renamed from: k */
        public final C5925a mo43333k(yj7.C6745b bVar) {
            vx2.m53591g(bVar, "factory");
            this.f29670a = bVar;
            return this;
        }
    }

    public hm5(pi5 pi5, fx5.C5853a aVar) {
        vx2.m53591g(pi5, "runtimePlatform");
        vx2.m53591g(aVar, "serviceFactory");
        this.f29662a = pi5;
        this.f29663b = aVar;
    }

    /* renamed from: d */
    public static final Object m45303d(hm5 hm5, Class cls, fx5 fx5, Object obj, Method method, Object[] objArr) {
        vx2.m53591g(hm5, "this$0");
        vx2.m53591g(cls, "$serviceInterface");
        vx2.m53591g(fx5, "$serviceInstance");
        if (objArr == null) {
            objArr = new Object[0];
        }
        Object[] objArr2 = objArr;
        pi5 pi5 = hm5.f29662a;
        vx2.m53590f(method, "method");
        if (pi5.mo46745c(method)) {
            pi5 pi52 = hm5.f29662a;
            vx2.m53590f(obj, "proxy");
            return pi52.mo46744b(method, cls, obj, objArr2);
        } else if (!hm5.mo43321i(method)) {
            return fx5.mo42682a(method, objArr2);
        } else {
            vx2.m53590f(obj, "proxy");
            return hm5.mo43317e(method, fx5, cls, obj, objArr2);
        }
    }

    /* renamed from: b */
    public final <T> T mo43315b(Class<T> cls) {
        vx2.m53591g(cls, "service");
        return mo43318f(cls);
    }

    /* renamed from: c */
    public final InvocationHandler mo43316c(Class<?> cls, fx5 fx5) {
        return new gm5(this, cls, fx5);
    }

    /* renamed from: e */
    public final Object mo43317e(Method method, fx5 fx5, Class<?> cls, Object obj, Object[] objArr) {
        if (mo43319g(method)) {
            boolean z = false;
            if (obj == objArr[0]) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (mo43322j(method)) {
            return vx2.m53598n("Scarlet service implementation for ", cls.getName());
        } else {
            if (mo43320h(method)) {
                return Integer.valueOf(fx5.hashCode());
            }
            throw new IllegalStateException(vx2.m53598n("Cannot execute ", method));
        }
    }

    /* renamed from: f */
    public final <T> T mo43318f(Class<T> cls) {
        fx5 a = this.f29663b.mo42684a(cls);
        a.mo42683b();
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, mo43316c(cls, a)));
    }

    /* renamed from: g */
    public final boolean mo43319g(Method method) {
        if (vx2.m53586b(method.getName(), "equals")) {
            if (Arrays.equals(new Class[]{Object.class}, method.getParameterTypes())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo43320h(Method method) {
        boolean z;
        if (vx2.m53586b(method.getName(), "hashCode")) {
            Class[] parameterTypes = method.getParameterTypes();
            vx2.m53590f(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo43321i(Method method) {
        return vx2.m53586b(method.getDeclaringClass(), Object.class);
    }

    /* renamed from: j */
    public final boolean mo43322j(Method method) {
        boolean z;
        if (vx2.m53586b(method.getName(), "toString")) {
            Class[] parameterTypes = method.getParameterTypes();
            vx2.m53590f(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
