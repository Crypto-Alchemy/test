package p000;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.mlkit.common.sdkinternal.C4913a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pa9 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class pa9 {

    /* renamed from: k */
    public static final zzar f32626k = zzar.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f32627a;

    /* renamed from: b */
    public final String f32628b;

    /* renamed from: c */
    public final na9 f32629c;

    /* renamed from: d */
    public final c06 f32630d;

    /* renamed from: e */
    public final tl6 f32631e;

    /* renamed from: f */
    public final tl6 f32632f;

    /* renamed from: g */
    public final String f32633g;

    /* renamed from: h */
    public final int f32634h;

    /* renamed from: i */
    public final Map f32635i = new HashMap();

    /* renamed from: j */
    public final Map f32636j = new HashMap();

    public pa9(Context context, c06 c06, na9 na9, String str) {
        int i;
        this.f32627a = context.getPackageName();
        this.f32628b = sl0.m51827a(context);
        this.f32630d = c06;
        this.f32629c = na9;
        xb9.m54342a();
        this.f32633g = str;
        this.f32631e = C4913a.m38741a().mo36735b(new ha9(this));
        C4913a a = C4913a.m38741a();
        c06.getClass();
        this.f32632f = a.mo36735b(new ja9(c06));
        zzar zzar = f32626k;
        if (zzar.containsKey(str)) {
            i = DynamiteModule.m33817b(context, (String) zzar.get(str));
        } else {
            i = -1;
        }
        this.f32634h = i;
    }

    /* renamed from: a */
    public final /* synthetic */ String mo46674a() throws Exception {
        return hg3.m45196a().mo43183b(this.f32633g);
    }
}
