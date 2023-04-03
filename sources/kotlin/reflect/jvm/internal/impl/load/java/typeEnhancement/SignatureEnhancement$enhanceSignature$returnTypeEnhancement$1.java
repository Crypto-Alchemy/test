package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 extends Lambda implements rc2<CallableMemberDescriptor, xc3> {
    public static final SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 INSTANCE = new SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1() {
        super(1);
    }

    public final xc3 invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        xc3 returnType = callableMemberDescriptor.getReturnType();
        vx2.m53588d(returnType);
        return returnType;
    }
}
