package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;

/* compiled from: AbstractSignatureParts.kt */
public final class AbstractSignatureParts$toIndexed$1$1 extends Lambda implements rc2<AbstractSignatureParts.C7471a, Iterable<? extends AbstractSignatureParts.C7471a>> {
    public final /* synthetic */ s17 $this_with;
    public final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$toIndexed$1$1(AbstractSignatureParts<TAnnotation> abstractSignatureParts, s17 s17) {
        super(1);
        this.this$0 = abstractSignatureParts;
        this.$this_with = s17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = r10.$this_with.mo51105t0(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.C7471a> invoke(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.C7471a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "it"
            p000.vx2.m53591g(r11, r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation> r0 = r10.this$0
            boolean r0 = r0.mo53704u()
            r1 = 0
            if (r0 == 0) goto L_0x0027
            ad3 r0 = r11.mo53711b()
            if (r0 == 0) goto L_0x0023
            s17 r2 = r10.$this_with
            l42 r0 = r2.mo51105t0(r0)
            if (r0 == 0) goto L_0x0023
            s17 r2 = r10.$this_with
            k75 r0 = r2.mo51116z(r0)
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return r1
        L_0x0027:
            ad3 r0 = r11.mo53711b()
            if (r0 == 0) goto L_0x00a5
            s17 r2 = r10.$this_with
            zz6 r0 = r2.mo51107u0(r0)
            if (r0 == 0) goto L_0x00a5
            s17 r2 = r10.$this_with
            java.util.List r0 = r2.mo51076d0(r0)
            if (r0 == 0) goto L_0x00a5
            s17 r2 = r10.$this_with
            ad3 r3 = r11.mo53711b()
            java.util.List r2 = r2.mo51042A(r3)
            s17 r3 = r10.$this_with
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation> r4 = r10.this$0
            java.util.Iterator r5 = r0.iterator()
            java.util.Iterator r6 = r2.iterator()
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r0 = p000.dk0.m43495u(r0, r8)
            int r2 = p000.dk0.m43495u(r2, r8)
            int r0 = java.lang.Math.min(r0, r2)
            r7.<init>(r0)
        L_0x0066:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r5.next()
            java.lang.Object r2 = r6.next()
            nz6 r2 = (p000.nz6) r2
            c17 r0 = (p000.c17) r0
            boolean r8 = r3.mo51071Y(r2)
            if (r8 == 0) goto L_0x008e
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a
            k23 r8 = r11.mo53710a()
            r2.<init>(r1, r8, r0)
            goto L_0x00a0
        L_0x008e:
            ad3 r2 = r3.mo51088l(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a r8 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a
            k23 r9 = r11.mo53710a()
            k23 r9 = r4.mo53686c(r2, r9)
            r8.<init>(r2, r9, r0)
            r2 = r8
        L_0x00a0:
            r7.add(r2)
            goto L_0x0066
        L_0x00a4:
            r1 = r7
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$toIndexed$1$1.invoke(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a):java.lang.Iterable");
    }
}
