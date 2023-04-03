package androidx.compose.p004ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"Lnd2;", "", "T", "Lx7;", "parentValue", "childValue", "invoke", "(Lx7;Lx7;)Lx7;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1 */
/* compiled from: SemanticsProperties.kt */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements fd2<C3574x7<nd2<? extends Boolean>>, C3574x7<nd2<? extends Boolean>>, C3574x7<nd2<? extends Boolean>>> {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    public final C3574x7<nd2<? extends Boolean>> invoke(C3574x7<nd2<? extends Boolean>> x7Var, C3574x7<nd2<? extends Boolean>> x7Var2) {
        String str;
        nd2<? extends Boolean> nd2;
        vx2.m53591g(x7Var2, "childValue");
        if (x7Var == null || (str = x7Var.mo27684b()) == null) {
            str = x7Var2.mo27684b();
        }
        if (x7Var == null || (nd2 = x7Var.mo27683a()) == null) {
            nd2 = x7Var2.mo27683a();
        }
        return new C3574x7<>(str, nd2);
    }
}
