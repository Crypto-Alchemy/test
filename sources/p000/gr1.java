package p000;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: gr1 */
/* compiled from: ErrorReporter */
public interface gr1 {

    /* renamed from: a */
    public static final gr1 f38061a = new C7141a();

    /* renamed from: gr1$a */
    /* compiled from: ErrorReporter */
    public static class C7141a implements gr1 {
        /* renamed from: c */
        public static /* synthetic */ void m58225c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo51978a(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                m58225c(2);
            }
        }

        /* renamed from: b */
        public void mo51979b(if0 if0, List<String> list) {
            if (if0 == null) {
                m58225c(0);
            }
            if (list == null) {
                m58225c(1);
            }
        }
    }

    /* renamed from: a */
    void mo51978a(CallableMemberDescriptor callableMemberDescriptor);

    /* renamed from: b */
    void mo51979b(if0 if0, List<String> list);
}
