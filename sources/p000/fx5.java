package p000;

import com.tinder.scarlet.internal.connection.Connection;
import java.lang.reflect.Method;
import kotlin.Metadata;
import p000.mx5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J#\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lfx5;", "", "Lr37;", "b", "Ljava/lang/reflect/Method;", "method", "", "args", "a", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/tinder/scarlet/internal/connection/Connection;", "Lcom/tinder/scarlet/internal/connection/Connection;", "connection", "Lmx5;", "Lmx5;", "serviceMethodExecutor", "<init>", "(Lcom/tinder/scarlet/internal/connection/Connection;Lmx5;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: fx5 */
/* compiled from: Service.kt */
public final class fx5 {

    /* renamed from: a */
    public final Connection f29013a;

    /* renamed from: b */
    public final mx5 f29014b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u0014\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lfx5$a;", "", "Ljava/lang/Class;", "serviceInterface", "Lfx5;", "a", "service", "Lr37;", "b", "Lcom/tinder/scarlet/internal/connection/Connection$Factory;", "Lcom/tinder/scarlet/internal/connection/Connection$Factory;", "connectionFactory", "Lmx5$a;", "Lmx5$a;", "serviceMethodExecutorFactory", "<init>", "(Lcom/tinder/scarlet/internal/connection/Connection$Factory;Lmx5$a;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: fx5$a */
    /* compiled from: Service.kt */
    public static final class C5853a {

        /* renamed from: a */
        public final Connection.Factory f29015a;

        /* renamed from: b */
        public final mx5.C6267a f29016b;

        public C5853a(Connection.Factory factory, mx5.C6267a aVar) {
            vx2.m53591g(factory, "connectionFactory");
            vx2.m53591g(aVar, "serviceMethodExecutorFactory");
            this.f29015a = factory;
            this.f29016b = aVar;
        }

        /* renamed from: a */
        public final fx5 mo42684a(Class<?> cls) {
            vx2.m53591g(cls, "serviceInterface");
            mo42685b(cls);
            Connection b = this.f29015a.mo39681b();
            return new fx5(b, this.f29016b.mo45916a(cls, b));
        }

        /* renamed from: b */
        public final void mo42685b(Class<?> cls) {
            boolean z;
            if (cls.isInterface()) {
                Class[] interfaces = cls.getInterfaces();
                vx2.m53590f(interfaces, "service.interfaces");
                if (interfaces.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("Service interfaces must not extend other interfaces.".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Service declarations must be interfaces.".toString());
        }
    }

    public fx5(Connection connection, mx5 mx5) {
        vx2.m53591g(connection, "connection");
        vx2.m53591g(mx5, "serviceMethodExecutor");
        this.f29013a = connection;
        this.f29014b = mx5;
    }

    /* renamed from: a */
    public final Object mo42682a(Method method, Object[] objArr) {
        vx2.m53591g(method, "method");
        vx2.m53591g(objArr, "args");
        return this.f29014b.mo45915a(method, objArr);
    }

    /* renamed from: b */
    public final void mo42683b() {
        this.f29013a.mo39680c();
    }
}
