package androidx.compose.p004ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "acc", "Lsw3$b;", "element", "invoke", "(Ljava/lang/String;Lsw3$b;)Ljava/lang/String;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.CombinedModifier$toString$1 */
/* compiled from: Modifier.kt */
public final class CombinedModifier$toString$1 extends Lambda implements fd2<String, sw3.C3309b, String> {
    public static final CombinedModifier$toString$1 INSTANCE = new CombinedModifier$toString$1();

    public CombinedModifier$toString$1() {
        super(2);
    }

    public final String invoke(String str, sw3.C3309b bVar) {
        vx2.m53591g(str, "acc");
        vx2.m53591g(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }
}
