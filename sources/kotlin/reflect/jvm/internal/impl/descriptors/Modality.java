package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Modality.kt */
public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    
    public static final C7413a Companion = null;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.Modality$a */
    /* compiled from: Modality.kt */
    public static final class C7413a {
        public C7413a() {
        }

        public /* synthetic */ C7413a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Modality mo53240a(boolean z, boolean z2, boolean z3) {
            if (z) {
                return Modality.SEALED;
            }
            if (z2) {
                return Modality.ABSTRACT;
            }
            if (z3) {
                return Modality.OPEN;
            }
            return Modality.FINAL;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C7413a((DefaultConstructorMarker) null);
    }
}
