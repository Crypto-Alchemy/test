package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ReportLevel.kt */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final C7448a Companion = null;
    private final String description;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.ReportLevel$a */
    /* compiled from: ReportLevel.kt */
    public static final class C7448a {
        public C7448a() {
        }

        public /* synthetic */ C7448a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C7448a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ReportLevel(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        if (this == IGNORE) {
            return true;
        }
        return false;
    }

    public final boolean isWarning() {
        if (this == WARN) {
            return true;
        }
        return false;
    }
}
