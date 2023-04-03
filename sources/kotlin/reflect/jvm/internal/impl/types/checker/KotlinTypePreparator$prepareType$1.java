package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;

/* compiled from: KotlinTypePreparator.kt */
public /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReference implements rc2<ad3, w47> {
    public KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj);
    }

    public final String getName() {
        return "prepareType";
    }

    public final y83 getOwner() {
        return ua5.m52727b(KotlinTypePreparator.class);
    }

    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    public final w47 invoke(ad3 ad3) {
        vx2.m53591g(ad3, "p0");
        return ((KotlinTypePreparator) this.receiver).mo52872a(ad3);
    }
}
