package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1 */
/* compiled from: DeserializedClassDescriptor.kt */
public final class C7680x32944d2c extends Lambda implements pc2<List<? extends a17>> {
    public final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7680x32944d2c(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
    }

    public final List<a17> invoke() {
        return TypeParameterUtilsKt.m60322d(this.this$0);
    }
}
