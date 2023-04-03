package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;

/* renamed from: xx4 */
/* compiled from: ProtoContainer.kt */
public abstract class xx4 {

    /* renamed from: a */
    public final t24 f46050a;

    /* renamed from: b */
    public final w17 f46051b;

    /* renamed from: c */
    public final a66 f46052c;

    /* renamed from: xx4$a */
    /* compiled from: ProtoContainer.kt */
    public static final class C9612a extends xx4 {

        /* renamed from: d */
        public final ProtoBuf$Class f46053d;

        /* renamed from: e */
        public final C9612a f46054e;

        /* renamed from: f */
        public final nf0 f46055f;

        /* renamed from: g */
        public final ProtoBuf$Class.Kind f46056g;

        /* renamed from: h */
        public final boolean f46057h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9612a(ProtoBuf$Class protoBuf$Class, t24 t24, w17 w17, a66 a66, C9612a aVar) {
            super(t24, w17, a66, (DefaultConstructorMarker) null);
            vx2.m53591g(protoBuf$Class, "classProto");
            vx2.m53591g(t24, "nameResolver");
            vx2.m53591g(w17, "typeTable");
            this.f46053d = protoBuf$Class;
            this.f46054e = aVar;
            this.f46055f = v24.m73043a(t24, protoBuf$Class.getFqName());
            ProtoBuf$Class.Kind d = b42.f36657f.mo50465d(protoBuf$Class.getFlags());
            this.f46056g = d == null ? ProtoBuf$Class.Kind.CLASS : d;
            Boolean g = b42.f36658g.mo50465d(protoBuf$Class.getFlags());
            vx2.m53590f(g, "IS_INNER.get(classProto.flags)");
            this.f46057h = g.booleanValue();
        }

        /* renamed from: a */
        public u82 mo66965a() {
            u82 b = this.f46055f.mo62673b();
            vx2.m53590f(b, "classId.asSingleFqName()");
            return b;
        }

        /* renamed from: e */
        public final nf0 mo66970e() {
            return this.f46055f;
        }

        /* renamed from: f */
        public final ProtoBuf$Class mo66971f() {
            return this.f46053d;
        }

        /* renamed from: g */
        public final ProtoBuf$Class.Kind mo66972g() {
            return this.f46056g;
        }

        /* renamed from: h */
        public final C9612a mo66973h() {
            return this.f46054e;
        }

        /* renamed from: i */
        public final boolean mo66974i() {
            return this.f46057h;
        }
    }

    /* renamed from: xx4$b */
    /* compiled from: ProtoContainer.kt */
    public static final class C9613b extends xx4 {

        /* renamed from: d */
        public final u82 f46058d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9613b(u82 u82, t24 t24, w17 w17, a66 a66) {
            super(t24, w17, a66, (DefaultConstructorMarker) null);
            vx2.m53591g(u82, "fqName");
            vx2.m53591g(t24, "nameResolver");
            vx2.m53591g(w17, "typeTable");
            this.f46058d = u82;
        }

        /* renamed from: a */
        public u82 mo66965a() {
            return this.f46058d;
        }
    }

    public xx4(t24 t24, w17 w17, a66 a66) {
        this.f46050a = t24;
        this.f46051b = w17;
        this.f46052c = a66;
    }

    public /* synthetic */ xx4(t24 t24, w17 w17, a66 a66, DefaultConstructorMarker defaultConstructorMarker) {
        this(t24, w17, a66);
    }

    /* renamed from: a */
    public abstract u82 mo66965a();

    /* renamed from: b */
    public final t24 mo66966b() {
        return this.f46050a;
    }

    /* renamed from: c */
    public final a66 mo66967c() {
        return this.f46052c;
    }

    /* renamed from: d */
    public final w17 mo66968d() {
        return this.f46051b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + mo66965a();
    }
}
