package p000;

import com.tinder.scarlet.internal.connection.Connection;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.ix5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lmx5;", "", "Ljava/lang/reflect/Method;", "method", "", "args", "a", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "Lix5;", "Ljava/util/Map;", "getServiceMethods$scarlet", "()Ljava/util/Map;", "serviceMethods", "<init>", "(Ljava/util/Map;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: mx5 */
/* compiled from: ServiceMethodExecutor.kt */
public final class mx5 {

    /* renamed from: a */
    public final Map<Method, ix5> f31877a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\n*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Lmx5$a;", "", "Ljava/lang/Class;", "serviceInterface", "Lcom/tinder/scarlet/internal/connection/Connection;", "connection", "Lmx5;", "a", "", "Ljava/lang/reflect/Method;", "Lix5;", "c", "d", "", "Lix5$b;", "b", "Lpi5;", "Lpi5;", "runtimePlatform", "Lix5$d$a;", "Lix5$d$a;", "sendServiceMethodFactory", "Lix5$c$a;", "Lix5$c$a;", "receiveServiceMethodFactory", "<init>", "(Lpi5;Lix5$d$a;Lix5$c$a;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: mx5$a */
    /* compiled from: ServiceMethodExecutor.kt */
    public static final class C6267a {

        /* renamed from: a */
        public final pi5 f31878a;

        /* renamed from: b */
        public final ix5.C6017d.C6018a f31879b;

        /* renamed from: c */
        public final ix5.C6015c.C6016a f31880c;

        public C6267a(pi5 pi5, ix5.C6017d.C6018a aVar, ix5.C6015c.C6016a aVar2) {
            vx2.m53591g(pi5, "runtimePlatform");
            vx2.m53591g(aVar, "sendServiceMethodFactory");
            vx2.m53591g(aVar2, "receiveServiceMethodFactory");
            this.f31878a = pi5;
            this.f31879b = aVar;
            this.f31880c = aVar2;
        }

        /* renamed from: a */
        public final mx5 mo45916a(Class<?> cls, Connection connection) {
            vx2.m53591g(cls, "serviceInterface");
            vx2.m53591g(connection, "connection");
            return new mx5(mo45918c(cls, connection));
        }

        /* renamed from: b */
        public final ix5.C6014b mo45917b(Annotation annotation) {
            if (annotation instanceof hu5) {
                return this.f31879b;
            }
            if (annotation instanceof y75) {
                return this.f31880c;
            }
            return null;
        }

        /* renamed from: c */
        public final Map<Method, ix5> mo45918c(Class<?> cls, Connection connection) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            vx2.m53590f(declaredMethods, "declaredMethods");
            ArrayList<Method> arrayList = new ArrayList<>();
            for (Method method : declaredMethods) {
                pi5 pi5 = this.f31878a;
                vx2.m53590f(method, "it");
                if (!pi5.mo46745c(method)) {
                    arrayList.add(method);
                }
            }
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
            for (Method method2 : arrayList) {
                vx2.m53590f(method2, "it");
                arrayList2.add(mo45919d(method2, connection));
            }
            return C6177b.m47369q(CollectionsKt___CollectionsKt.m47321R0(arrayList, arrayList2));
        }

        /* renamed from: d */
        public final ix5 mo45919d(Method method, Connection connection) {
            Annotation[] annotations = method.getAnnotations();
            vx2.m53590f(annotations, "annotations");
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Annotation annotation : annotations) {
                vx2.m53590f(annotation, "it");
                ix5.C6014b b = mo45917b(annotation);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            if (arrayList.size() == 1) {
                z = true;
            }
            if (z) {
                return ((ix5.C6014b) CollectionsKt___CollectionsKt.m47329Z(arrayList)).mo43965a(connection, method);
            }
            throw new IllegalArgumentException(vx2.m53598n("A method must have one and only one service method annotation: ", method).toString());
        }
    }

    public mx5(Map<Method, ? extends ix5> map) {
        vx2.m53591g(map, "serviceMethods");
        this.f31877a = map;
    }

    /* renamed from: a */
    public final Object mo45915a(Method method, Object[] objArr) {
        vx2.m53591g(method, "method");
        vx2.m53591g(objArr, "args");
        ix5 ix5 = this.f31877a.get(method);
        if (ix5 != null) {
            ix5 ix52 = ix5;
            if (ix52 instanceof ix5.C6017d) {
                return ((ix5.C6017d) ix52).mo43970a(objArr[0]);
            }
            if (ix52 instanceof ix5.C6015c) {
                return ((ix5.C6015c) ix52).mo43966b();
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Service method not found".toString());
    }
}
