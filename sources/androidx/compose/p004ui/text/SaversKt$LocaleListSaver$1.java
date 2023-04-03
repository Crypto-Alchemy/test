package androidx.compose.p004ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lll5;", "Lsj3;", "it", "", "invoke", "(Lll5;Lsj3;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$LocaleListSaver$1 */
/* compiled from: Savers.kt */
public final class SaversKt$LocaleListSaver$1 extends Lambda implements fd2<ll5, sj3, Object> {
    public static final SaversKt$LocaleListSaver$1 INSTANCE = new SaversKt$LocaleListSaver$1();

    public SaversKt$LocaleListSaver$1() {
        super(2);
    }

    public final Object invoke(ll5 ll5, sj3 sj3) {
        vx2.m53591g(ll5, "$this$Saver");
        vx2.m53591g(sj3, "it");
        List<qj3> k = sj3.mo25801k();
        ArrayList arrayList = new ArrayList(k.size());
        int size = k.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(SaversKt.m3244u(k.get(i), SaversKt.m3233j(qj3.f16953b), ll5));
        }
        return arrayList;
    }
}
