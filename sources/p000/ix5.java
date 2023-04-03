package p000;

import com.tinder.scarlet.internal.connection.Connection;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.rt1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00042\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\b\t¨\u0006\n"}, mo44877d2 = {"Lix5;", "", "<init>", "()V", "a", "b", "c", "d", "Lix5$d;", "Lix5$c;", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: ix5 */
/* compiled from: ServiceMethod.kt */
public abstract class ix5 {

    /* renamed from: a */
    public static final C6013a f30150a = new C6013a((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Lix5$a;", "", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Type;", "d", "", "", "c", "(Ljava/lang/reflect/Method;)[Ljava/lang/annotation/Annotation;", "<init>", "()V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: ix5$a */
    /* compiled from: ServiceMethod.kt */
    public static final class C6013a {
        public C6013a() {
        }

        public /* synthetic */ C6013a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final Annotation[] mo43963c(Method method) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            vx2.m53590f(parameterAnnotations, "parameterAnnotations");
            Object H = ArraysKt___ArraysKt.m47256H(parameterAnnotations);
            vx2.m53590f(H, "parameterAnnotations.first()");
            return (Annotation[]) H;
        }

        /* renamed from: d */
        public final Type mo43964d(Method method) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            vx2.m53590f(genericParameterTypes, "genericParameterTypes");
            Object H = ArraysKt___ArraysKt.m47256H(genericParameterTypes);
            vx2.m53590f(H, "genericParameterTypes.first()");
            return (Type) H;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, mo44877d2 = {"Lix5$b;", "", "Lcom/tinder/scarlet/internal/connection/Connection;", "connection", "Ljava/lang/reflect/Method;", "method", "Lix5;", "a", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: ix5$b */
    /* compiled from: ServiceMethod.kt */
    public interface C6014b {
        /* renamed from: a */
        ix5 mo43965a(Connection connection, Method method);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B7\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002R\u001e\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo44877d2 = {"Lix5$c;", "Lix5;", "", "b", "Lrt1;", "Lrt1;", "getEventMapper$scarlet", "()Lrt1;", "eventMapper", "Lcom/tinder/scarlet/internal/connection/Connection;", "c", "Lcom/tinder/scarlet/internal/connection/Connection;", "connection", "Lnm5;", "d", "Lnm5;", "scheduler", "Lja6;", "e", "Lja6;", "streamAdapter", "<init>", "(Lrt1;Lcom/tinder/scarlet/internal/connection/Connection;Lnm5;Lja6;)V", "a", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: ix5$c */
    /* compiled from: ServiceMethod.kt */
    public static final class C6015c extends ix5 {

        /* renamed from: b */
        public final rt1<?> f30151b;

        /* renamed from: c */
        public final Connection f30152c;

        /* renamed from: d */
        public final nm5 f30153d;

        /* renamed from: e */
        public final ja6<Object, Object> f30154e;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lix5$c$a;", "Lix5$b;", "Lcom/tinder/scarlet/internal/connection/Connection;", "connection", "Ljava/lang/reflect/Method;", "method", "Lix5$c;", "b", "Lrt1;", "c", "Lja6;", "", "d", "Lnm5;", "a", "Lnm5;", "scheduler", "Lrt1$b;", "Lrt1$b;", "eventMapperFactory", "Lka6;", "Lka6;", "streamAdapterResolver", "<init>", "(Lnm5;Lrt1$b;Lka6;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: ix5$c$a */
        /* compiled from: ServiceMethod.kt */
        public static final class C6016a implements C6014b {

            /* renamed from: a */
            public final nm5 f30155a;

            /* renamed from: b */
            public final rt1.C6443b f30156b;

            /* renamed from: c */
            public final ka6 f30157c;

            public C6016a(nm5 nm5, rt1.C6443b bVar, ka6 ka6) {
                vx2.m53591g(nm5, "scheduler");
                vx2.m53591g(bVar, "eventMapperFactory");
                vx2.m53591g(ka6, "streamAdapterResolver");
                this.f30155a = nm5;
                this.f30156b = bVar;
                this.f30157c = ka6;
            }

            /* renamed from: b */
            public C6015c mo43965a(Connection connection, Method method) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                vx2.m53591g(connection, "connection");
                vx2.m53591g(method, "method");
                C6013a aVar = ix5.f30150a;
                boolean z5 = false;
                Class[] clsArr = new Class[0];
                if (method.getGenericParameterTypes().length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    vx2.m53590f(genericParameterTypes, "genericParameterTypes");
                    List F0 = ArraysKt___ArraysKt.m47254F0(genericParameterTypes, clsArr);
                    if (!(F0 instanceof Collection) || !F0.isEmpty()) {
                        Iterator it = F0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Pair pair = (Pair) it.next();
                            Type type = (Type) pair.component1();
                            Class cls = (Class) pair.component2();
                            if (cls == type || cls.isInstance(type)) {
                                z4 = true;
                                continue;
                            } else {
                                z4 = false;
                                continue;
                            }
                            if (!z4) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        C6013a aVar2 = ix5.f30150a;
                        Class[] clsArr2 = {ParameterizedType.class};
                        int i = 0;
                        while (true) {
                            if (i >= 1) {
                                break;
                            }
                            Class cls2 = clsArr2[i];
                            if (cls2 == method.getGenericReturnType() || cls2.isInstance(method.getGenericReturnType())) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                z5 = true;
                                break;
                            }
                            i++;
                        }
                        if (z5) {
                            C6013a aVar3 = ix5.f30150a;
                            Type genericReturnType = method.getGenericReturnType();
                            vx2.m53590f(genericReturnType, "genericReturnType");
                            if (!y17.m54605c(genericReturnType)) {
                                return new C6015c(mo43968c(method), connection, this.f30155a, mo43969d(method));
                            }
                            throw new IllegalArgumentException(vx2.m53598n("Method return type must not include a type variable or wildcard: ", method.getGenericReturnType()).toString());
                        }
                        throw new IllegalArgumentException(vx2.m53598n("Receive method must return ParameterizedType: ", method).toString());
                    }
                    throw new IllegalArgumentException(vx2.m53598n("Receive method must have zero parameter: ", method).toString());
                }
                throw new IllegalArgumentException(vx2.m53598n("Receive method must have zero parameter: ", method).toString());
            }

            /* renamed from: c */
            public final rt1<?> mo43968c(Method method) {
                rt1.C6443b bVar = this.f30156b;
                Type genericReturnType = method.getGenericReturnType();
                if (genericReturnType != null) {
                    Annotation[] annotations = method.getAnnotations();
                    vx2.m53590f(annotations, "method.annotations");
                    return bVar.mo47480a((ParameterizedType) genericReturnType, annotations);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            }

            /* renamed from: d */
            public final ja6<Object, Object> mo43969d(Method method) {
                ka6 ka6 = this.f30157c;
                Type genericReturnType = method.getGenericReturnType();
                vx2.m53590f(genericReturnType, "method.genericReturnType");
                return ka6.mo44729a(genericReturnType);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6015c(rt1<?> rt1, Connection connection, nm5 nm5, ja6<Object, ? extends Object> ja6) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(rt1, "eventMapper");
            vx2.m53591g(connection, "connection");
            vx2.m53591g(nm5, "scheduler");
            vx2.m53591g(ja6, "streamAdapter");
            this.f30151b = rt1;
            this.f30152c = connection;
            this.f30153d = nm5;
            this.f30154e = ja6;
        }

        /* renamed from: c */
        public static final vy4 m46042c(C6015c cVar) {
            vx2.m53591g(cVar, "this$0");
            return cVar.f30152c.mo39678a();
        }

        /* renamed from: b */
        public final Object mo43966b() {
            g52 z = g52.m44533l(new jx5(this)).mo42754E(this.f30153d).mo42779z(new kx5(this.f30151b));
            vx2.m53590f(z, "defer { connection.obser…e(eventMapper::mapToData)");
            return this.f30154e.mo40754a(a62.m31731a(z));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0004B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lix5$d;", "Lix5;", "", "data", "a", "Lcom/tinder/scarlet/internal/connection/Connection;", "b", "Lcom/tinder/scarlet/internal/connection/Connection;", "connection", "Lju3;", "c", "Lju3;", "messageAdapter", "<init>", "(Lcom/tinder/scarlet/internal/connection/Connection;Lju3;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: ix5$d */
    /* compiled from: ServiceMethod.kt */
    public static final class C6017d extends ix5 {

        /* renamed from: b */
        public final Connection f30158b;

        /* renamed from: c */
        public final ju3<Object> f30159c;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lix5$d$a;", "Lix5$b;", "Lcom/tinder/scarlet/internal/connection/Connection;", "connection", "Ljava/lang/reflect/Method;", "method", "Lix5$d;", "b", "Lku3;", "a", "Lku3;", "messageAdapterResolver", "<init>", "(Lku3;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
        /* renamed from: ix5$d$a */
        /* compiled from: ServiceMethod.kt */
        public static final class C6018a implements C6014b {

            /* renamed from: a */
            public final ku3 f30160a;

            public C6018a(ku3 ku3) {
                vx2.m53591g(ku3, "messageAdapterResolver");
                this.f30160a = ku3;
            }

            /* renamed from: b */
            public C6017d mo43965a(Connection connection, Method method) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                vx2.m53591g(connection, "connection");
                vx2.m53591g(method, "method");
                C6013a aVar = ix5.f30150a;
                boolean z5 = true;
                Class[] clsArr = {Object.class};
                if (method.getGenericParameterTypes().length == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    vx2.m53590f(genericParameterTypes, "genericParameterTypes");
                    List F0 = ArraysKt___ArraysKt.m47254F0(genericParameterTypes, clsArr);
                    if (!(F0 instanceof Collection) || !F0.isEmpty()) {
                        Iterator it = F0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Pair pair = (Pair) it.next();
                            Type type = (Type) pair.component1();
                            Class cls = (Class) pair.component2();
                            if (cls == type || cls.isInstance(type)) {
                                z4 = true;
                                continue;
                            } else {
                                z4 = false;
                                continue;
                            }
                            if (!z4) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        C6013a aVar2 = ix5.f30150a;
                        Class cls2 = Void.TYPE;
                        vx2.m53590f(cls2, "TYPE");
                        Class[] clsArr2 = {Boolean.TYPE, cls2};
                        int i = 0;
                        while (true) {
                            if (i >= 2) {
                                z5 = false;
                                break;
                            }
                            Class cls3 = clsArr2[i];
                            if (cls3 == method.getGenericReturnType() || cls3.isInstance(method.getGenericReturnType())) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                break;
                            }
                            i++;
                        }
                        if (z5) {
                            C6013a aVar3 = ix5.f30150a;
                            return new C6017d(connection, this.f30160a.mo45291b(aVar3.mo43964d(method), aVar3.mo43963c(method)));
                        }
                        throw new IllegalArgumentException(vx2.m53598n("Send method must return Boolean or Void: ", method).toString());
                    }
                    throw new IllegalArgumentException(vx2.m53598n("Send method must have one and only one parameter: ", method).toString());
                }
                throw new IllegalArgumentException(vx2.m53598n("Send method must have one and only one parameter: ", method).toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6017d(Connection connection, ju3<Object> ju3) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(connection, "connection");
            vx2.m53591g(ju3, "messageAdapter");
            this.f30158b = connection;
            this.f30159c = ju3;
        }

        /* renamed from: a */
        public final Object mo43970a(Object obj) {
            vx2.m53591g(obj, "data");
            return Boolean.valueOf(this.f30158b.mo39679b(this.f30159c.mo42689a(obj)));
        }
    }

    public ix5() {
    }

    public /* synthetic */ ix5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
