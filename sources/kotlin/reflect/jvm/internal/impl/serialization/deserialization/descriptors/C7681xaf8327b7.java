package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1 */
/* compiled from: DeserializedClassDescriptor.kt */
public final class C7681xaf8327b7 extends Lambda implements rc2<r24, if0> {
    public final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors this$0;
    public final /* synthetic */ DeserializedClassDescriptor this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7681xaf8327b7(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors, DeserializedClassDescriptor deserializedClassDescriptor) {
        super(1);
        this.this$0 = enumEntryClassDescriptors;
        this.this$1 = deserializedClassDescriptor;
    }

    public final if0 invoke(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        ProtoBuf$EnumEntry protoBuf$EnumEntry = (ProtoBuf$EnumEntry) this.this$0.f40185a.get(r24);
        if (protoBuf$EnumEntry == null) {
            return null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = this.this$1;
        DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.this$0;
        return yq1.m74586F0(deserializedClassDescriptor.mo55172U0().mo56231h(), deserializedClassDescriptor, r24, enumEntryClassDescriptors.f40187c, new od1(deserializedClassDescriptor.mo55172U0().mo56231h(), new C7682x65bb8e11(deserializedClassDescriptor, protoBuf$EnumEntry)), a66.f36360a);
    }
}
