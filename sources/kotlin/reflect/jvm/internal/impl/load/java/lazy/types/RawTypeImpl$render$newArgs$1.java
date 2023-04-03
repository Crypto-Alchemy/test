package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;

/* compiled from: RawType.kt */
public final class RawTypeImpl$render$newArgs$1 extends Lambda implements rc2<String, CharSequence> {
    public static final RawTypeImpl$render$newArgs$1 INSTANCE = new RawTypeImpl$render$newArgs$1();

    public RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    public final CharSequence invoke(String str) {
        vx2.m53591g(str, "it");
        return "(raw) " + str;
    }
}
