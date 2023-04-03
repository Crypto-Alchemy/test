package p000;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzce;
import com.google.mlkit.common.sdkinternal.C4913a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ce9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class ce9 {

    /* renamed from: k */
    public static final zzce f21700k = zzce.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f21701a;

    /* renamed from: b */
    public final String f21702b;

    /* renamed from: c */
    public final ae9 f21703c;

    /* renamed from: d */
    public final c06 f21704d;

    /* renamed from: e */
    public final tl6 f21705e;

    /* renamed from: f */
    public final tl6 f21706f;

    /* renamed from: g */
    public final String f21707g;

    /* renamed from: h */
    public final int f21708h;

    /* renamed from: i */
    public final Map f21709i = new HashMap();

    /* renamed from: j */
    public final Map f21710j = new HashMap();

    public ce9(Context context, c06 c06, ae9 ae9, String str) {
        int i;
        this.f21701a = context.getPackageName();
        this.f21702b = sl0.m51827a(context);
        this.f21704d = c06;
        this.f21703c = ae9;
        ff9.m44309a();
        this.f21707g = str;
        this.f21705e = C4913a.m38741a().mo36735b(new sd9(this));
        C4913a a = C4913a.m38741a();
        c06.getClass();
        this.f21706f = a.mo36735b(new ud9(c06));
        zzce zzce = f21700k;
        if (zzce.containsKey(str)) {
            i = DynamiteModule.m33817b(context, (String) zzce.get(str));
        } else {
            i = -1;
        }
        this.f21708h = i;
    }

    /* renamed from: a */
    public final /* synthetic */ String mo29961a() throws Exception {
        return hg3.m45196a().mo43183b(this.f21707g);
    }
}
