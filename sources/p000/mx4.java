package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C7427d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* renamed from: mx4 */
/* compiled from: PropertySetterDescriptorImpl */
public class mx4 extends dx4 implements lx4 {

    /* renamed from: H */
    public n87 f41018H;

    /* renamed from: I */
    public final lx4 f41019I;

    /* JADX WARNING: type inference failed for: r20v0, types: [lx4] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mx4(p000.fx4 r12, p000.C6983dm r13, kotlin.reflect.jvm.internal.impl.descriptors.Modality r14, p000.fd1 r15, boolean r16, boolean r17, boolean r18, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r19, p000.lx4 r20, p000.a66 r21) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0006
            r0 = 0
            m64478Q(r0)
        L_0x0006:
            if (r13 != 0) goto L_0x000c
            r0 = 1
            m64478Q(r0)
        L_0x000c:
            if (r14 != 0) goto L_0x0012
            r0 = 2
            m64478Q(r0)
        L_0x0012:
            if (r15 != 0) goto L_0x0018
            r0 = 3
            m64478Q(r0)
        L_0x0018:
            if (r19 != 0) goto L_0x001e
            r0 = 4
            m64478Q(r0)
        L_0x001e:
            if (r21 != 0) goto L_0x0024
            r0 = 5
            m64478Q(r0)
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<set-"
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
            r1.f41019I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mx4.<init>(fx4, dm, kotlin.reflect.jvm.internal.impl.descriptors.Modality, fd1, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, lx4, a66):void");
    }

    /* renamed from: J0 */
    public static ValueParameterDescriptorImpl m64477J0(lx4 lx4, xc3 xc3, C6983dm dmVar) {
        if (lx4 == null) {
            m64478Q(7);
        }
        if (xc3 == null) {
            m64478Q(8);
        }
        if (dmVar == null) {
            m64478Q(9);
        }
        return new ValueParameterDescriptorImpl(lx4, (n87) null, 0, dmVar, n66.f41115n, xc3, false, false, false, (xc3) null, a66.f36360a);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m64478Q(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: K0 */
    public lx4 mo51329y0() {
        lx4 lx4 = this.f41019I;
        if (lx4 == null) {
            m64478Q(13);
        }
        return lx4;
    }

    /* renamed from: L0 */
    public void mo56333L0(n87 n87) {
        if (n87 == null) {
            m64478Q(6);
        }
        this.f41018H = n87;
    }

    /* renamed from: d */
    public Collection<? extends lx4> mo51659d() {
        Collection<C7427d> F0 = super.mo51310F0(false);
        if (F0 == null) {
            m64478Q(10);
        }
        return F0;
    }

    /* renamed from: f */
    public List<n87> mo51763f() {
        n87 n87 = this.f41018H;
        if (n87 != null) {
            List<n87> singletonList = Collections.singletonList(n87);
            if (singletonList == null) {
                m64478Q(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }

    public xc3 getReturnType() {
        d36 Z = DescriptorUtilsKt.m62445f(this).mo53165Z();
        if (Z == null) {
            m64478Q(12);
        }
        return Z;
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return h31.mo52106d(this, d);
    }
}
