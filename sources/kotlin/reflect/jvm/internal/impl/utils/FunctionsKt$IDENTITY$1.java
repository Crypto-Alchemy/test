package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Lambda;

/* compiled from: functions.kt */
public final class FunctionsKt$IDENTITY$1 extends Lambda implements rc2<Object, Object> {
    public static final FunctionsKt$IDENTITY$1 INSTANCE = new FunctionsKt$IDENTITY$1();

    public FunctionsKt$IDENTITY$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        return obj;
    }
}
