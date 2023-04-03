package p000;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.media3.common.C0785d;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: b60 */
/* compiled from: BundleableUtil */
public final class b60 {
    /* renamed from: a */
    public static void m11128a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) w67.m29360j(b60.class.getClassLoader()));
        }
    }

    /* renamed from: b */
    public static <T extends C0785d> ImmutableList<T> m11129b(C0785d.C0786a<T> aVar, List<Bundle> list) {
        ImmutableList.C4534a builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            builder.mo34667a(aVar.mo104a((Bundle) C2725kr.m20985e(list.get(i))));
        }
        return builder.mo34692l();
    }

    /* renamed from: c */
    public static <T extends C0785d> SparseArray<T> m11130c(C0785d.C0786a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), aVar.mo104a(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    /* renamed from: d */
    public static <T extends C0785d> ArrayList<Bundle> m11131d(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (T bundle : collection) {
            arrayList.add(bundle.toBundle());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static <T extends C0785d> SparseArray<Bundle> m11132e(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), ((C0785d) sparseArray.valueAt(i)).toBundle());
        }
        return sparseArray2;
    }
}
