package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: ClassKind.kt */
public enum ClassKind {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY((String) null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    
    private final String codeRepresentation;

    /* access modifiers changed from: public */
    ClassKind(String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        if (this == OBJECT || this == ENUM_ENTRY) {
            return true;
        }
        return false;
    }
}
