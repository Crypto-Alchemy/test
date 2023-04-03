package androidx.compose.p004ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lsj3;", "invoke", "(Ljava/lang/Object;)Lsj3;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$LocaleListSaver$2 */
/* compiled from: Savers.kt */
public final class SaversKt$LocaleListSaver$2 extends Lambda implements rc2<Object, sj3> {
    public static final SaversKt$LocaleListSaver$2 INSTANCE = new SaversKt$LocaleListSaver$2();

    public SaversKt$LocaleListSaver$2() {
        super(1);
    }

    public final sj3 invoke(Object obj) {
        vx2.m53591g(obj, "it");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            kl5<qj3, Object> j = SaversKt.m3233j(qj3.f16953b);
            qj3 qj3 = null;
            if (!vx2.m53586b(obj2, Boolean.FALSE) && obj2 != null) {
                qj3 = j.mo3147b(obj2);
            }
            vx2.m53588d(qj3);
            arrayList.add(qj3);
        }
        return new sj3(arrayList);
    }
}
