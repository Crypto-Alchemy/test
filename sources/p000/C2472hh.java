package p000;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.p004ui.autofill.AutofillType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001a\u0010\b\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¨\u0006\t"}, mo44877d2 = {"Lfh;", "Landroid/view/ViewStructure;", "root", "Lr37;", "b", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "a", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: hh */
/* compiled from: AndroidAutofill.android.kt */
public final class C2472hh {
    /* renamed from: a */
    public static final void m18881a(C2292fh fhVar, SparseArray<AutofillValue> sparseArray) {
        vx2.m53591g(fhVar, "<this>");
        vx2.m53591g(sparseArray, "values");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = sparseArray.get(keyAt);
            C3228rv rvVar = C3228rv.f17375a;
            vx2.m53590f(autofillValue, "value");
            if (rvVar.mo25546d(autofillValue)) {
                fhVar.mo19913b().mo26874b(keyAt, rvVar.mo25551i(autofillValue).toString());
            } else if (rvVar.mo25544b(autofillValue)) {
                throw new NotImplementedError("An operation is not implemented: " + "b/138604541: Add onFill() callback for date");
            } else if (rvVar.mo25545c(autofillValue)) {
                throw new NotImplementedError("An operation is not implemented: " + "b/138604541: Add onFill() callback for list");
            } else if (rvVar.mo25547e(autofillValue)) {
                throw new NotImplementedError("An operation is not implemented: " + "b/138604541:  Add onFill() callback for toggle");
            }
        }
    }

    /* renamed from: b */
    public static final void m18882b(C2292fh fhVar, ViewStructure viewStructure) {
        Rect a;
        ViewStructure viewStructure2 = viewStructure;
        vx2.m53591g(fhVar, "<this>");
        vx2.m53591g(viewStructure2, "root");
        int a2 = C2852mv.f15256a.mo23408a(viewStructure2, fhVar.mo19913b().mo26873a().size());
        for (Map.Entry next : fhVar.mo19913b().mo26873a().entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            C3385tv tvVar = (C3385tv) next.getValue();
            C2852mv mvVar = C2852mv.f15256a;
            ViewStructure b = mvVar.mo23409b(viewStructure2, a2);
            if (b != null) {
                C3228rv rvVar = C3228rv.f17375a;
                AutofillId a3 = rvVar.mo25543a(viewStructure2);
                vx2.m53588d(a3);
                rvVar.mo25549g(b, a3, intValue);
                mvVar.mo23411d(b, intValue, fhVar.mo19914c().getContext().getPackageName(), (String) null, (String) null);
                rvVar.mo25550h(b, 1);
                List<AutofillType> a4 = tvVar.mo26569a();
                ArrayList arrayList = new ArrayList(a4.size());
                int size = a4.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(C2385gh.m18065a(a4.get(i)));
                }
                Object[] array = arrayList.toArray(new String[0]);
                vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                rvVar.mo25548f(b, (String[]) array);
                tvVar.mo26570b();
                a95 b2 = tvVar.mo26570b();
                if (!(b2 == null || (a = c95.m11756a(b2)) == null)) {
                    C2852mv.f15256a.mo23410c(b, a.left, a.top, 0, 0, a.width(), a.height());
                }
            }
            a2++;
        }
    }
}
