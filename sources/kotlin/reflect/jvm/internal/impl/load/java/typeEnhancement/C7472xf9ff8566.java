package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1 */
/* compiled from: AbstractSignatureParts.kt */
public final class C7472xf9ff8566 extends Lambda implements rc2<TAnnotation, Boolean> {
    public final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7472xf9ff8566(AbstractSignatureParts<TAnnotation> abstractSignatureParts) {
        super(1);
        this.this$0 = abstractSignatureParts;
    }

    public final Boolean invoke(TAnnotation tannotation) {
        vx2.m53591g(tannotation, "$this$extractNullability");
        return Boolean.valueOf(this.this$0.mo53701r(tannotation));
    }
}
