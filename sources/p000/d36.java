package p000;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* renamed from: d36 */
/* compiled from: KotlinType.kt */
public abstract class d36 extends w47 implements f36, mz6 {
    public d36() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: O0 */
    public abstract d36 mo51121O0(boolean z);

    /* renamed from: P0 */
    public abstract d36 mo51122P0(rz6 rz6);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C9460vl s : getAnnotations()) {
            vb6.m73169i(sb, "[", DescriptorRenderer.m62073s(DescriptorRenderer.f39995j, s, (AnnotationUseSiteTarget) null, 2, (Object) null), "] ");
        }
        sb.append(mo51134H0());
        if (!mo51132F0().isEmpty()) {
            CollectionsKt___CollectionsKt.m47336g0(mo51132F0(), sb, ", ", "<", ">", 0, (CharSequence) null, (rc2) null, 112, (Object) null);
        }
        if (mo51135I0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
