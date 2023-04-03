package kotlin.reflect.jvm.internal.impl.descriptors;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;

/* compiled from: InvalidModuleException.kt */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String str) {
        super(str);
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
    }
}
