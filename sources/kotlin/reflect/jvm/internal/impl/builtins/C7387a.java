package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a */
/* compiled from: DefaultBuiltIns.kt */
public final class C7387a extends C7389b {

    /* renamed from: h */
    public static final C7388a f39079h = new C7388a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final C7387a f39080i = new C7387a(false, 1, (DefaultConstructorMarker) null);

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a$a */
    /* compiled from: DefaultBuiltIns.kt */
    public static final class C7388a {
        public C7388a() {
        }

        public /* synthetic */ C7388a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7387a mo53142a() {
            return C7387a.f39080i;
        }
    }

    public C7387a(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            mo53166f(false);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7387a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
