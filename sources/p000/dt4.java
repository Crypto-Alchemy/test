package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListPopupWindow;
import java.util.List;
import java.util.Map;
import p000.ft4;

/* renamed from: dt4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class dt4 implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ ft4.C7102a f37398a;

    /* renamed from: d */
    public final /* synthetic */ Map f37399d;

    /* renamed from: e */
    public final /* synthetic */ List f37400e;

    /* renamed from: g */
    public final /* synthetic */ ListPopupWindow f37401g;

    public /* synthetic */ dt4(ft4.C7102a aVar, Map map, List list, ListPopupWindow listPopupWindow) {
        this.f37398a = aVar;
        this.f37399d = map;
        this.f37400e = list;
        this.f37401g = listPopupWindow;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ft4.m57927d(this.f37398a, this.f37399d, this.f37400e, this.f37401g, adapterView, view, i, j);
    }
}
