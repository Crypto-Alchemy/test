package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C7427d;

/* renamed from: jx4 */
/* compiled from: PropertyGetterDescriptorImpl */
public class jx4 extends dx4 implements ix4 {

    /* renamed from: H */
    public xc3 f38809H;

    /* renamed from: I */
    public final ix4 f38810I;

    /* JADX WARNING: type inference failed for: r20v0, types: [ix4] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jx4(p000.fx4 r12, p000.C6983dm r13, kotlin.reflect.jvm.internal.impl.descriptors.Modality r14, p000.fd1 r15, boolean r16, boolean r17, boolean r18, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r19, p000.ix4 r20, p000.a66 r21) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0006
            r0 = 0
            m59608Q(r0)
        L_0x0006:
            if (r13 != 0) goto L_0x000c
            r0 = 1
            m59608Q(r0)
        L_0x000c:
            if (r14 != 0) goto L_0x0012
            r0 = 2
            m59608Q(r0)
        L_0x0012:
            if (r15 != 0) goto L_0x0018
            r0 = 3
            m59608Q(r0)
        L_0x0018:
            if (r19 != 0) goto L_0x001e
            r0 = 4
            m59608Q(r0)
        L_0x001e:
            if (r21 != 0) goto L_0x0024
            r0 = 5
            m59608Q(r0)
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<get-"
            r0.append(r1)
            r24 r1 = r12.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r24 r5 = p000.r24.m71447m(r0)
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r12
            r4 = r13
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r20 == 0) goto L_0x005a
            r1 = r11
            r0 = r20
            goto L_0x005c
        L_0x005a:
            r0 = r11
            r1 = r0
        L_0x005c:
            r1.f38810I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jx4.<init>(fx4, dm, kotlin.reflect.jvm.internal.impl.descriptors.Modality, fd1, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, ix4, a66):void");
    }

    /* renamed from: Q */
    public static /* synthetic */ void m59608Q(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: J0 */
    public ix4 mo51329y0() {
        ix4 ix4 = this.f38810I;
        if (ix4 == null) {
            m59608Q(8);
        }
        return ix4;
    }

    /* renamed from: K0 */
    public void mo52818K0(xc3 xc3) {
        if (xc3 == null) {
            xc3 = mo51316R().getType();
        }
        this.f38809H = xc3;
    }

    /* renamed from: d */
    public Collection<? extends ix4> mo51659d() {
        Collection<C7427d> F0 = super.mo51310F0(true);
        if (F0 == null) {
            m59608Q(6);
        }
        return F0;
    }

    /* renamed from: f */
    public List<n87> mo51763f() {
        List<n87> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m59608Q(7);
        }
        return emptyList;
    }

    public xc3 getReturnType() {
        return this.f38809H;
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return h31.mo52104b(this, d);
    }
}
