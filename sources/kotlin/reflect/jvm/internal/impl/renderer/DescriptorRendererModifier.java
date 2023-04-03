package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DescriptorRenderer.kt */
public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    
    public static final Set<DescriptorRendererModifier> ALL = null;
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS = null;
    public static final C7647a Companion = null;
    private final boolean includeByDefault;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier$a */
    /* compiled from: DescriptorRenderer.kt */
    public static final class C7647a {
        public C7647a() {
        }

        public /* synthetic */ C7647a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        Companion = new C7647a((DefaultConstructorMarker) null);
        DescriptorRendererModifier[] values = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : values) {
            if (descriptorRendererModifier.includeByDefault) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = CollectionsKt___CollectionsKt.m47315O0(arrayList);
        ALL = ArraysKt___ArraysKt.m47250D0(values());
    }

    /* access modifiers changed from: public */
    DescriptorRendererModifier(boolean z) {
        this.includeByDefault = z;
    }
}
