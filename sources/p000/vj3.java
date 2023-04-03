package p000;

import android.p001os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, mo44877d2 = {"Lvj3;", "", "Lsj3;", "localeList", "a", "Lpj;", "textPaint", "Lr37;", "b", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vj3 */
/* compiled from: LocaleExtensions.android.kt */
public final class vj3 {

    /* renamed from: a */
    public static final vj3 f18807a = new vj3();

    /* renamed from: a */
    public final Object mo27152a(sj3 sj3) {
        vx2.m53591g(sj3, "localeList");
        ArrayList arrayList = new ArrayList(dk0.m43495u(sj3, 10));
        Iterator it = sj3.iterator();
        while (it.hasNext()) {
            arrayList.add(rj3.m26229a((qj3) it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    /* renamed from: b */
    public final void mo27153b(C3074pj pjVar, sj3 sj3) {
        vx2.m53591g(pjVar, "textPaint");
        vx2.m53591g(sj3, "localeList");
        ArrayList arrayList = new ArrayList(dk0.m43495u(sj3, 10));
        Iterator it = sj3.iterator();
        while (it.hasNext()) {
            arrayList.add(rj3.m26229a((qj3) it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        throw null;
    }
}
