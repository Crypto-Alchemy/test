package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.C3205rl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000\u001a(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, mo44877d2 = {"T", "", "Lrl$a;", "ranges", "", "start", "end", "c", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "b", "lStart", "lEnd", "rStart", "rEnd", "d", "Lrl;", "a", "Lrl;", "EmptyAnnotatedString", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: sl */
/* compiled from: AnnotatedString.kt */
public final class C3278sl {

    /* renamed from: a */
    public static final C3205rl f17701a = new C3205rl("", (List) null, (List) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final boolean m26950b(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 != i4) {
                return true;
            }
            if ((i3 == i4) == (i == i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final <T> List<C3205rl.C3206a<T>> m26951c(List<? extends C3205rl.C3206a<? extends T>> list, int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C3205rl.C3206a aVar = (C3205rl.C3206a) obj;
                if (m26952d(i, i2, aVar.mo25446f(), aVar.mo25443d())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C3205rl.C3206a aVar2 = (C3205rl.C3206a) arrayList.get(i4);
                arrayList2.add(new C3205rl.C3206a(aVar2.mo25444e(), Math.max(i, aVar2.mo25446f()) - i, Math.min(i2, aVar2.mo25443d()) - i, aVar2.mo25447g()));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
    }

    /* renamed from: d */
    public static final boolean m26952d(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) < Math.min(i2, i4) || m26950b(i, i2, i3, i4) || m26950b(i3, i4, i, i2)) {
            return true;
        }
        return false;
    }
}
