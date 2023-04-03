package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: UnsignedType.kt */
public enum UnsignedType {
    UBYTE(r1),
    USHORT(r1),
    UINT(r1),
    ULONG(r1);
    
    private final nf0 arrayClassId;
    private final nf0 classId;
    private final r24 typeName;

    /* access modifiers changed from: public */
    UnsignedType(nf0 nf0) {
        this.classId = nf0;
        r24 j = nf0.mo62681j();
        vx2.m53590f(j, "classId.shortClassName");
        this.typeName = j;
        u82 h = nf0.mo62678h();
        this.arrayClassId = new nf0(h, r24.m71445h(j.mo65594d() + "Array"));
    }

    public final nf0 getArrayClassId() {
        return this.arrayClassId;
    }

    public final nf0 getClassId() {
        return this.classId;
    }

    public final r24 getTypeName() {
        return this.typeName;
    }
}
