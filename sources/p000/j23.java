package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* renamed from: j23 */
/* compiled from: typeQualifiers.kt */
public final class j23 {

    /* renamed from: e */
    public static final C7239a f38572e = new C7239a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final j23 f38573f = new j23((NullabilityQualifier) null, (MutabilityQualifier) null, false, false, 8, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final NullabilityQualifier f38574a;

    /* renamed from: b */
    public final MutabilityQualifier f38575b;

    /* renamed from: c */
    public final boolean f38576c;

    /* renamed from: d */
    public final boolean f38577d;

    /* renamed from: j23$a */
    /* compiled from: typeQualifiers.kt */
    public static final class C7239a {
        public C7239a() {
        }

        public /* synthetic */ C7239a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final j23 mo52604a() {
            return j23.f38573f;
        }
    }

    public j23(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.f38574a = nullabilityQualifier;
        this.f38575b = mutabilityQualifier;
        this.f38576c = z;
        this.f38577d = z2;
    }

    /* renamed from: b */
    public final boolean mo52600b() {
        return this.f38576c;
    }

    /* renamed from: c */
    public final MutabilityQualifier mo52601c() {
        return this.f38575b;
    }

    /* renamed from: d */
    public final NullabilityQualifier mo52602d() {
        return this.f38574a;
    }

    /* renamed from: e */
    public final boolean mo52603e() {
        return this.f38577d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j23(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z2);
    }
}
