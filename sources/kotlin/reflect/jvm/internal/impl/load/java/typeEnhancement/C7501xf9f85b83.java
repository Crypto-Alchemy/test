package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 */
/* compiled from: signatureEnhancement.kt */
public final class C7501xf9f85b83 extends Lambda implements rc2<CallableMemberDescriptor, xc3> {

    /* renamed from: $p */
    public final /* synthetic */ n87 f39584$p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7501xf9f85b83(n87 n87) {
        super(1);
        this.f39584$p = n87;
    }

    public final xc3 invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        xc3 type = callableMemberDescriptor.mo51763f().get(this.f39584$p.getIndex()).getType();
        vx2.m53590f(type, "it.valueParameters[p.index].type");
        return type;
    }
}
