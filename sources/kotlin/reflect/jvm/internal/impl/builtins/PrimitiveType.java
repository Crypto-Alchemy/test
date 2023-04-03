package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PrimitiveType.kt */
public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final C7384a Companion = null;
    public static final Set<PrimitiveType> NUMBER_TYPES = null;
    private final ef3 arrayTypeFqName$delegate;
    private final r24 arrayTypeName;
    private final ef3 typeFqName$delegate;
    private final r24 typeName;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$a */
    /* compiled from: PrimitiveType.kt */
    public static final class C7384a {
        public C7384a() {
        }

        public /* synthetic */ C7384a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        PrimitiveType primitiveType;
        PrimitiveType primitiveType2;
        PrimitiveType primitiveType3;
        PrimitiveType primitiveType4;
        PrimitiveType primitiveType5;
        PrimitiveType primitiveType6;
        PrimitiveType primitiveType7;
        Companion = new C7384a((DefaultConstructorMarker) null);
        NUMBER_TYPES = ny5.m49098h(primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7);
    }

    /* access modifiers changed from: public */
    PrimitiveType(String str) {
        r24 h = r24.m71445h(str);
        vx2.m53590f(h, "identifier(typeName)");
        this.typeName = h;
        r24 h2 = r24.m71445h(str + "Array");
        vx2.m53590f(h2, "identifier(\"${typeName}Array\")");
        this.arrayTypeName = h2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = C6169a.m47233b(lazyThreadSafetyMode, new PrimitiveType$typeFqName$2(this));
        this.arrayTypeFqName$delegate = C6169a.m47233b(lazyThreadSafetyMode, new PrimitiveType$arrayTypeFqName$2(this));
    }

    public final u82 getArrayTypeFqName() {
        return (u82) this.arrayTypeFqName$delegate.getValue();
    }

    public final r24 getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final u82 getTypeFqName() {
        return (u82) this.typeFqName$delegate.getValue();
    }

    public final r24 getTypeName() {
        return this.typeName;
    }
}
