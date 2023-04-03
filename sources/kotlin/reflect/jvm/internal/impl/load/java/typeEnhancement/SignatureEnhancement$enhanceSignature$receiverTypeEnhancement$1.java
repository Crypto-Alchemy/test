package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends Lambda implements rc2<CallableMemberDescriptor, xc3> {
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 INSTANCE = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }

    public final xc3 invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        h85 J = callableMemberDescriptor.mo51315J();
        vx2.m53588d(J);
        xc3 type = J.getType();
        vx2.m53590f(type, "it.extensionReceiverParameter!!.type");
        return type;
    }
}
