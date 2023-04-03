package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;

/* compiled from: FunctionClassKind.kt */
public enum FunctionClassKind {
    Function(C7395c.f39113r, "Function", false, false),
    SuspendFunction(C7395c.f39105j, "SuspendFunction", true, false),
    KFunction(r4, "KFunction", false, true),
    KSuspendFunction(r4, "KSuspendFunction", true, true);
    
    public static final C7397a Companion = null;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final u82 packageFqName;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a */
    /* compiled from: FunctionClassKind.kt */
    public static final class C7397a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a$a */
        /* compiled from: FunctionClassKind.kt */
        public static final class C7398a {

            /* renamed from: a */
            public final FunctionClassKind f39209a;

            /* renamed from: b */
            public final int f39210b;

            public C7398a(FunctionClassKind functionClassKind, int i) {
                vx2.m53591g(functionClassKind, "kind");
                this.f39209a = functionClassKind;
                this.f39210b = i;
            }

            /* renamed from: a */
            public final FunctionClassKind mo53203a() {
                return this.f39209a;
            }

            /* renamed from: b */
            public final int mo53204b() {
                return this.f39210b;
            }

            /* renamed from: c */
            public final FunctionClassKind mo53205c() {
                return this.f39209a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7398a)) {
                    return false;
                }
                C7398a aVar = (C7398a) obj;
                return this.f39209a == aVar.f39209a && this.f39210b == aVar.f39210b;
            }

            public int hashCode() {
                return (this.f39209a.hashCode() * 31) + this.f39210b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f39209a + ", arity=" + this.f39210b + ')';
            }
        }

        public C7397a() {
        }

        public /* synthetic */ C7397a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FunctionClassKind mo53199a(u82 u82, String str) {
            boolean z;
            vx2.m53591g(u82, "packageFqName");
            vx2.m53591g(str, "className");
            for (FunctionClassKind functionClassKind : FunctionClassKind.values()) {
                if (!vx2.m53586b(functionClassKind.getPackageFqName(), u82) || !yb6.m74336M(str, functionClassKind.getClassNamePrefix(), false, 2, (Object) null)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return functionClassKind;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final FunctionClassKind mo53200b(String str, u82 u82) {
            vx2.m53591g(str, "className");
            vx2.m53591g(u82, "packageFqName");
            C7398a c = mo53201c(str, u82);
            if (c != null) {
                return c.mo53205c();
            }
            return null;
        }

        /* renamed from: c */
        public final C7398a mo53201c(String str, u82 u82) {
            vx2.m53591g(str, "className");
            vx2.m53591g(u82, "packageFqName");
            FunctionClassKind a = mo53199a(u82, str);
            if (a == null) {
                return null;
            }
            String substring = str.substring(a.getClassNamePrefix().length());
            vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
            Integer d = mo53202d(substring);
            if (d != null) {
                return new C7398a(a, d.intValue());
            }
            return null;
        }

        /* renamed from: d */
        public final Integer mo53202d(String str) {
            boolean z;
            boolean z2;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = str.charAt(i2) - '0';
                if (charAt < 0 || charAt >= 10) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return null;
                }
                i = (i * 10) + charAt;
            }
            return Integer.valueOf(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C7397a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    FunctionClassKind(u82 u82, String str, boolean z, boolean z2) {
        this.packageFqName = u82;
        this.classNamePrefix = str;
        this.isSuspendType = z;
        this.isReflectType = z2;
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final u82 getPackageFqName() {
        return this.packageFqName;
    }

    public final r24 numberedClassName(int i) {
        r24 h = r24.m71445h(this.classNamePrefix + i);
        vx2.m53590f(h, "identifier(\"$classNamePrefix$arity\")");
        return h;
    }
}
