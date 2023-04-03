package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;

/* renamed from: iw3 */
/* compiled from: ModalityUtils.kt */
public final class iw3 {
    /* renamed from: a */
    public static final boolean m59127a(if0 if0) {
        vx2.m53591g(if0, "<this>");
        if (if0.mo51326p() != Modality.FINAL || if0.getKind() == ClassKind.ENUM_CLASS) {
            return false;
        }
        return true;
    }
}
