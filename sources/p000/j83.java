package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* renamed from: j83 */
/* compiled from: methodSignatureMapping.kt */
public abstract class j83 {

    /* renamed from: a */
    public static final C7254b f38617a = new C7254b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final C7256d f38618b = new C7256d(JvmPrimitiveType.BOOLEAN);

    /* renamed from: c */
    public static final C7256d f38619c = new C7256d(JvmPrimitiveType.CHAR);

    /* renamed from: d */
    public static final C7256d f38620d = new C7256d(JvmPrimitiveType.BYTE);

    /* renamed from: e */
    public static final C7256d f38621e = new C7256d(JvmPrimitiveType.SHORT);

    /* renamed from: f */
    public static final C7256d f38622f = new C7256d(JvmPrimitiveType.INT);

    /* renamed from: g */
    public static final C7256d f38623g = new C7256d(JvmPrimitiveType.FLOAT);

    /* renamed from: h */
    public static final C7256d f38624h = new C7256d(JvmPrimitiveType.LONG);

    /* renamed from: i */
    public static final C7256d f38625i = new C7256d(JvmPrimitiveType.DOUBLE);

    /* renamed from: j83$a */
    /* compiled from: methodSignatureMapping.kt */
    public static final class C7253a extends j83 {

        /* renamed from: j */
        public final j83 f38626j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7253a(j83 j83) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(j83, "elementType");
            this.f38626j = j83;
        }

        /* renamed from: i */
        public final j83 mo52640i() {
            return this.f38626j;
        }
    }

    /* renamed from: j83$b */
    /* compiled from: methodSignatureMapping.kt */
    public static final class C7254b {
        public C7254b() {
        }

        public /* synthetic */ C7254b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7256d mo52641a() {
            return j83.f38618b;
        }

        /* renamed from: b */
        public final C7256d mo52642b() {
            return j83.f38620d;
        }

        /* renamed from: c */
        public final C7256d mo52643c() {
            return j83.f38619c;
        }

        /* renamed from: d */
        public final C7256d mo52644d() {
            return j83.f38625i;
        }

        /* renamed from: e */
        public final C7256d mo52645e() {
            return j83.f38623g;
        }

        /* renamed from: f */
        public final C7256d mo52646f() {
            return j83.f38622f;
        }

        /* renamed from: g */
        public final C7256d mo52647g() {
            return j83.f38624h;
        }

        /* renamed from: h */
        public final C7256d mo52648h() {
            return j83.f38621e;
        }
    }

    /* renamed from: j83$c */
    /* compiled from: methodSignatureMapping.kt */
    public static final class C7255c extends j83 {

        /* renamed from: j */
        public final String f38627j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7255c(String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "internalName");
            this.f38627j = str;
        }

        /* renamed from: i */
        public final String mo52649i() {
            return this.f38627j;
        }
    }

    /* renamed from: j83$d */
    /* compiled from: methodSignatureMapping.kt */
    public static final class C7256d extends j83 {

        /* renamed from: j */
        public final JvmPrimitiveType f38628j;

        public C7256d(JvmPrimitiveType jvmPrimitiveType) {
            super((DefaultConstructorMarker) null);
            this.f38628j = jvmPrimitiveType;
        }

        /* renamed from: i */
        public final JvmPrimitiveType mo52650i() {
            return this.f38628j;
        }
    }

    public j83() {
    }

    public /* synthetic */ j83(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return l83.f40589a.mo52878d(this);
    }
}
