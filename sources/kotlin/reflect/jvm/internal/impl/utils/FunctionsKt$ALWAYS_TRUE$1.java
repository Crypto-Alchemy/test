package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Lambda;

/* compiled from: functions.kt */
public final class FunctionsKt$ALWAYS_TRUE$1 extends Lambda implements rc2<Object, Boolean> {
    public static final FunctionsKt$ALWAYS_TRUE$1 INSTANCE = new FunctionsKt$ALWAYS_TRUE$1();

    public FunctionsKt$ALWAYS_TRUE$1() {
        super(1);
    }

    public final Boolean invoke(Object obj) {
        return Boolean.TRUE;
    }
}
