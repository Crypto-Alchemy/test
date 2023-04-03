package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: UnsignedType.kt */
public enum UnsignedArrayType {
    UBYTEARRAY(r1),
    USHORTARRAY(r1),
    UINTARRAY(r1),
    ULONGARRAY(r1);
    
    private final nf0 classId;
    private final r24 typeName;

    /* access modifiers changed from: public */
    UnsignedArrayType(nf0 nf0) {
        this.classId = nf0;
        r24 j = nf0.mo62681j();
        vx2.m53590f(j, "classId.shortClassName");
        this.typeName = j;
    }

    public final r24 getTypeName() {
        return this.typeName;
    }
}
