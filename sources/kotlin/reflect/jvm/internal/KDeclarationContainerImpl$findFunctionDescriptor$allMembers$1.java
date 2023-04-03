package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "descriptor", "", "invoke", "(Lkotlin/reflect/jvm/internal/impl/descriptors/c;)Ljava/lang/CharSequence;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KDeclarationContainerImpl.kt */
public final class KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 extends Lambda implements rc2<C7425c, CharSequence> {
    public static final KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 INSTANCE = new KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1();

    public KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1() {
        super(1);
    }

    public final CharSequence invoke(C7425c cVar) {
        vx2.m53591g(cVar, "descriptor");
        return DescriptorRenderer.f39995j.mo54810q(cVar) + " | " + si5.f44568a.mo65862g(cVar).mo52967a();
    }
}
