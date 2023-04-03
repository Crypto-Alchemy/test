package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import p000.lt0;

/* renamed from: sv3 */
/* compiled from: MiddlewareUtils */
public class sv3 {
    /* renamed from: a */
    public static lt0.C2787a m27135a(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Rect rect, String str, PointF pointF, Map<String, Object> map4, Object obj, Uri uri) {
        lt0.C2787a aVar = new lt0.C2787a();
        if (rect != null) {
            aVar.f14721g = rect.width();
            aVar.f14722h = rect.height();
        }
        aVar.f14723i = str;
        if (pointF != null) {
            aVar.f14724j = pointF.x;
            aVar.f14725k = pointF.y;
        }
        aVar.f14719e = obj;
        aVar.f14720f = uri;
        aVar.f14717c = map3;
        aVar.f14718d = map4;
        aVar.f14716b = map2;
        aVar.f14715a = map;
        return aVar;
    }
}
