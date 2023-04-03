package p000;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.web3j.ens.contracts.generated.ENS;

/* renamed from: v16 */
/* compiled from: SignaturePropagator */
public interface v16 {

    /* renamed from: a */
    public static final v16 f45205a = new C9432a();

    /* renamed from: v16$a */
    /* compiled from: SignaturePropagator */
    public static class C9432a implements v16 {
        /* renamed from: c */
        public static /* synthetic */ void m73030c(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = ENS.FUNC_OWNER;
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo66392a(CallableMemberDescriptor callableMemberDescriptor, List<String> list) {
            if (callableMemberDescriptor == null) {
                m73030c(5);
            }
            if (list == null) {
                m73030c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        /* renamed from: b */
        public C9433b mo66393b(m13 m13, if0 if0, xc3 xc3, xc3 xc32, List<n87> list, List<a17> list2) {
            if (m13 == null) {
                m73030c(0);
            }
            if (if0 == null) {
                m73030c(1);
            }
            if (xc3 == null) {
                m73030c(2);
            }
            if (list == null) {
                m73030c(3);
            }
            if (list2 == null) {
                m73030c(4);
            }
            return new C9433b(xc3, xc32, list, list2, Collections.emptyList(), false);
        }
    }

    /* renamed from: v16$b */
    /* compiled from: SignaturePropagator */
    public static class C9433b {

        /* renamed from: a */
        public final xc3 f45206a;

        /* renamed from: b */
        public final xc3 f45207b;

        /* renamed from: c */
        public final List<n87> f45208c;

        /* renamed from: d */
        public final List<a17> f45209d;

        /* renamed from: e */
        public final List<String> f45210e;

        /* renamed from: f */
        public final boolean f45211f;

        public C9433b(xc3 xc3, xc3 xc32, List<n87> list, List<a17> list2, List<String> list3, boolean z) {
            if (xc3 == null) {
                m73033a(0);
            }
            if (list == null) {
                m73033a(1);
            }
            if (list2 == null) {
                m73033a(2);
            }
            if (list3 == null) {
                m73033a(3);
            }
            this.f45206a = xc3;
            this.f45207b = xc32;
            this.f45208c = list;
            this.f45209d = list2;
            this.f45210e = list3;
            this.f45211f = z;
        }

        /* renamed from: a */
        public static /* synthetic */ void m73033a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public List<String> mo66394b() {
            List<String> list = this.f45210e;
            if (list == null) {
                m73033a(7);
            }
            return list;
        }

        /* renamed from: c */
        public xc3 mo66395c() {
            return this.f45207b;
        }

        /* renamed from: d */
        public xc3 mo66396d() {
            xc3 xc3 = this.f45206a;
            if (xc3 == null) {
                m73033a(4);
            }
            return xc3;
        }

        /* renamed from: e */
        public List<a17> mo66397e() {
            List<a17> list = this.f45209d;
            if (list == null) {
                m73033a(6);
            }
            return list;
        }

        /* renamed from: f */
        public List<n87> mo66398f() {
            List<n87> list = this.f45208c;
            if (list == null) {
                m73033a(5);
            }
            return list;
        }

        /* renamed from: g */
        public boolean mo66399g() {
            return this.f45211f;
        }
    }

    /* renamed from: a */
    void mo66392a(CallableMemberDescriptor callableMemberDescriptor, List<String> list);

    /* renamed from: b */
    C9433b mo66393b(m13 m13, if0 if0, xc3 xc3, xc3 xc32, List<n87> list, List<a17> list2);
}
