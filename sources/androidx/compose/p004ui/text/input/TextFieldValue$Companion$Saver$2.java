package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.SaversKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/TextFieldValue;", "it", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2 */
/* compiled from: TextFieldValue.kt */
public final class TextFieldValue$Companion$Saver$2 extends Lambda implements rc2<Object, TextFieldValue> {
    public static final TextFieldValue$Companion$Saver$2 INSTANCE = new TextFieldValue$Companion$Saver$2();

    public TextFieldValue$Companion$Saver$2() {
        super(1);
    }

    public final TextFieldValue invoke(Object obj) {
        C3205rl rlVar;
        vx2.m53591g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        kl5<C3205rl, Object> e = SaversKt.m3228e();
        Boolean bool = Boolean.FALSE;
        ao6 ao6 = null;
        if (!vx2.m53586b(obj2, bool) && obj2 != null) {
            rlVar = e.mo3147b(obj2);
        } else {
            rlVar = null;
        }
        vx2.m53588d(rlVar);
        Object obj3 = list.get(1);
        kl5<ao6, Object> q = SaversKt.m3240q(ao6.f7681b);
        if (!vx2.m53586b(obj3, bool) && obj3 != null) {
            ao6 = q.mo3147b(obj3);
        }
        vx2.m53588d(ao6);
        return new TextFieldValue(rlVar, ao6.mo11071m(), (ao6) null, 4, (DefaultConstructorMarker) null);
    }
}
