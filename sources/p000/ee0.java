package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ee0 */
/* compiled from: modifierChecks.kt */
public abstract class ee0 {

    /* renamed from: a */
    public final boolean f37523a;

    /* renamed from: ee0$a */
    /* compiled from: modifierChecks.kt */
    public static final class C7042a extends ee0 {

        /* renamed from: b */
        public static final C7042a f37524b = new C7042a();

        public C7042a() {
            super(false, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ee0$b */
    /* compiled from: modifierChecks.kt */
    public static final class C7043b extends ee0 {

        /* renamed from: b */
        public final String f37525b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7043b(String str) {
            super(false, (DefaultConstructorMarker) null);
            vx2.m53591g(str, "error");
            this.f37525b = str;
        }
    }

    /* renamed from: ee0$c */
    /* compiled from: modifierChecks.kt */
    public static final class C7044c extends ee0 {

        /* renamed from: b */
        public static final C7044c f37526b = new C7044c();

        public C7044c() {
            super(true, (DefaultConstructorMarker) null);
        }
    }

    public ee0(boolean z) {
        this.f37523a = z;
    }

    public /* synthetic */ ee0(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: a */
    public final boolean mo51451a() {
        return this.f37523a;
    }
}
