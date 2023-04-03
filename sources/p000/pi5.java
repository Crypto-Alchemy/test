package p000;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u000b\u0005B\t\b\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016JS\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\b\u001a\u00020\u00012&\u0010\n\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\t0\t\"\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f\u0001\u0002\u0010\u0011¨\u0006\u0012"}, mo44877d2 = {"Lpi5;", "", "Ljava/lang/reflect/Method;", "method", "", "c", "Ljava/lang/Class;", "declaringClass", "proxy", "", "args", "b", "(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "()V", "a", "Lpi5$b;", "Lpi5$c;", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: pi5 */
/* compiled from: RuntimePlatform.kt */
public abstract class pi5 {

    /* renamed from: a */
    public static final C6360a f32712a;

    /* renamed from: b */
    public static final pi5 f32713b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lpi5$a;", "", "Lpi5;", "c", "b", "PLATFORM", "Lpi5;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: pi5$a */
    /* compiled from: RuntimePlatform.kt */
    public static final class C6360a {
        public C6360a() {
        }

        public /* synthetic */ C6360a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final pi5 mo46746b() {
            try {
                Class.forName("java.util.Optional");
                return new C6362c();
            } catch (ClassNotFoundException unused) {
                return new C6361b();
            }
        }

        /* renamed from: c */
        public final pi5 mo46747c() {
            return pi5.f32713b;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lpi5$b;", "Lpi5;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: pi5$b */
    /* compiled from: RuntimePlatform.kt */
    public static final class C6361b extends pi5 {
        public C6361b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016JS\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2&\u0010\u000b\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n0\n\"\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, mo44877d2 = {"Lpi5$c;", "Lpi5;", "Ljava/lang/reflect/Method;", "method", "", "c", "Ljava/lang/Class;", "declaringClass", "", "proxy", "", "args", "b", "(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: pi5$c */
    /* compiled from: RuntimePlatform.kt */
    public static final class C6362c extends pi5 {
        public C6362c() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public Object mo46744b(Method method, Class<?> cls, Object obj, Object[]... objArr) {
            vx2.m53591g(method, "method");
            vx2.m53591g(cls, "declaringClass");
            vx2.m53591g(obj, "proxy");
            vx2.m53591g(objArr, "args");
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            Object invokeWithArguments = declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(new Object[]{objArr});
            vx2.m53590f(invokeWithArguments, "constructor.newInstance(…invokeWithArguments(args)");
            return invokeWithArguments;
        }

        /* renamed from: c */
        public boolean mo46745c(Method method) {
            vx2.m53591g(method, "method");
            return method.isDefault();
        }
    }

    static {
        C6360a aVar = new C6360a((DefaultConstructorMarker) null);
        f32712a = aVar;
        f32713b = aVar.mo46746b();
    }

    public pi5() {
    }

    public /* synthetic */ pi5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo46744b(Method method, Class<?> cls, Object obj, Object[]... objArr) {
        vx2.m53591g(method, "method");
        vx2.m53591g(cls, "declaringClass");
        vx2.m53591g(obj, "proxy");
        vx2.m53591g(objArr, "args");
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public boolean mo46745c(Method method) {
        vx2.m53591g(method, "method");
        return false;
    }
}
