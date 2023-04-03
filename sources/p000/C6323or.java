package p000;

import android.os.Bundle;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: or */
public abstract class C6323or {
    /* renamed from: a */
    public static C6323or m49401a(long j, Map<String, AssetPackState> map) {
        return new wr7(j, map);
    }

    /* renamed from: b */
    public static C6323or m49402b(Bundle bundle, rs7 rs7) {
        return m49403c(bundle, rs7, new ArrayList());
    }

    /* renamed from: c */
    public static C6323or m49403c(Bundle bundle, rs7 rs7, List<String> list) {
        return m49404d(bundle, rs7, list, kr7.f31010b);
    }

    /* renamed from: d */
    public static C6323or m49404d(Bundle bundle, rs7 rs7, List<String> list, ir7 ir7) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m36339d(bundle, str, rs7, ir7));
        }
        for (String next : list) {
            hashMap.put(next, AssetPackState.m36338b(next, 4, 0, 0, 0, Utils.DOUBLE_EPSILON, 1));
        }
        return m49401a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: e */
    public abstract Map<String, AssetPackState> mo46453e();

    /* renamed from: f */
    public abstract long mo46454f();
}
