package p000;

import androidx.media3.common.C0836t;
import androidx.media3.common.C0842w;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import p000.xn3;

/* renamed from: et6 */
/* compiled from: TrackSelectionUtil */
public final class et6 {
    /* renamed from: a */
    public static C0842w m16339a(xn3.C3633a aVar, bt6[] bt6Arr) {
        ImmutableList immutableList;
        List[] listArr = new List[bt6Arr.length];
        for (int i = 0; i < bt6Arr.length; i++) {
            bt6 bt6 = bt6Arr[i];
            if (bt6 != null) {
                immutableList = ImmutableList.m36628of(bt6);
            } else {
                immutableList = ImmutableList.m36627of();
            }
            listArr[i] = immutableList;
        }
        return m16340b(aVar, listArr);
    }

    /* renamed from: b */
    public static C0842w m16340b(xn3.C3633a aVar, List<? extends bt6>[] listArr) {
        boolean z;
        boolean z2;
        xn3.C3633a aVar2 = aVar;
        ImmutableList.C4534a aVar3 = new ImmutableList.C4534a();
        for (int i = 0; i < aVar.mo27836d(); i++) {
            ws6 f = aVar2.mo27838f(i);
            List<? extends bt6> list = listArr[i];
            for (int i2 = 0; i2 < f.f19234a; i2++) {
                C0836t b = f.mo27595b(i2);
                if (aVar2.mo27833a(i, i2, false) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = b.f4469a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < b.f4469a; i4++) {
                    iArr[i4] = aVar2.mo27839g(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        bt6 bt6 = (bt6) list.get(i5);
                        if (bt6.mo7678n().equals(b) && bt6.mo7675l(i4) != -1) {
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z2;
                }
                aVar3.mo34667a(new C0842w.C0843a(b, z, iArr, zArr));
            }
        }
        ws6 h = aVar.mo27840h();
        for (int i6 = 0; i6 < h.f19234a; i6++) {
            C0836t b2 = h.mo27595b(i6);
            int[] iArr2 = new int[b2.f4469a];
            Arrays.fill(iArr2, 0);
            aVar3.mo34667a(new C0842w.C0843a(b2, false, iArr2, new boolean[b2.f4469a]));
        }
        return new C0842w(aVar3.mo34692l());
    }
}
