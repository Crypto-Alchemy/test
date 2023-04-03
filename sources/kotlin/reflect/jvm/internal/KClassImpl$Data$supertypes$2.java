package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo44877d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$supertypes$2 extends Lambda implements pc2<List<? extends KTypeImpl>> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;
    public final /* synthetic */ KClassImpl<T> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<kotlin.reflect.jvm.internal.KTypeImpl> invoke() {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.KClassImpl<T>$Data r0 = r7.this$0
            if0 r0 = r0.mo53009m()
            yz6 r0 = r0.mo50046g()
            java.util.Collection r0 = r0.mo51811g()
            java.lang.String r1 = "descriptor.typeConstructor.supertypes"
            p000.vx2.m53590f(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.KClassImpl<T>$Data r2 = r7.this$0
            kotlin.reflect.jvm.internal.KClassImpl<T> r3 = r7.this$1
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r0.next()
            xc3 r4 = (p000.xc3) r4
            kotlin.reflect.jvm.internal.KTypeImpl r5 = new kotlin.reflect.jvm.internal.KTypeImpl
            java.lang.String r6 = "kotlinType"
            p000.vx2.m53590f(r4, r6)
            kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$1$1 r6 = new kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$1$1
            r6.<init>(r4, r2, r3)
            r5.<init>(r4, r6)
            r1.add(r5)
            goto L_0x0024
        L_0x0043:
            kotlin.reflect.jvm.internal.KClassImpl<T>$Data r0 = r7.this$0
            if0 r0 = r0.mo53009m()
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60144t0(r0)
            if (r0 != 0) goto L_0x00a7
            boolean r0 = r1.isEmpty()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0059
        L_0x0057:
            r2 = r3
            goto L_0x0088
        L_0x0059:
            java.util.Iterator r0 = r1.iterator()
        L_0x005d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0057
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.KTypeImpl r4 = (kotlin.reflect.jvm.internal.KTypeImpl) r4
            xc3 r4 = r4.mo53096n()
            if0 r4 = p000.dd1.m56813e(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = r4.getKind()
            java.lang.String r5 = "getClassDescriptorForType(it.type).kind"
            p000.vx2.m53590f(r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r4 == r5) goto L_0x0085
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            if (r4 != r5) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r4 = r2
            goto L_0x0086
        L_0x0085:
            r4 = r3
        L_0x0086:
            if (r4 != 0) goto L_0x005d
        L_0x0088:
            if (r2 == 0) goto L_0x00a7
            kotlin.reflect.jvm.internal.KTypeImpl r0 = new kotlin.reflect.jvm.internal.KTypeImpl
            kotlin.reflect.jvm.internal.KClassImpl<T>$Data r2 = r7.this$0
            if0 r2 = r2.mo53009m()
            kotlin.reflect.jvm.internal.impl.builtins.b r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62445f(r2)
            d36 r2 = r2.mo53169i()
            java.lang.String r3 = "descriptor.builtIns.anyType"
            p000.vx2.m53590f(r2, r3)
            kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$3 r3 = kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.C73623.INSTANCE
            r0.<init>(r2, r3)
            r1.add(r0)
        L_0x00a7:
            java.util.List r0 = p000.ak0.m55533c(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.invoke():java.util.List");
    }
}
