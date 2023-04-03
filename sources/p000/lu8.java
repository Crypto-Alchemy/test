package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: lu8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class lu8 {

    /* renamed from: a */
    public final Context f31406a;

    /* renamed from: b */
    public String f31407b;

    /* renamed from: c */
    public String f31408c;

    /* renamed from: d */
    public String f31409d;

    /* renamed from: e */
    public Boolean f31410e;

    /* renamed from: f */
    public long f31411f;

    /* renamed from: g */
    public zzcl f31412g;

    /* renamed from: h */
    public boolean f31413h = true;

    /* renamed from: i */
    public final Long f31414i;

    /* renamed from: j */
    public String f31415j;

    public lu8(Context context, zzcl zzcl, Long l) {
        cu4.m43221k(context);
        Context applicationContext = context.getApplicationContext();
        cu4.m43221k(applicationContext);
        this.f31406a = applicationContext;
        this.f31414i = l;
        if (zzcl != null) {
            this.f31412g = zzcl;
            this.f31407b = zzcl.f22626r;
            this.f31408c = zzcl.f22625k;
            this.f31409d = zzcl.f22624g;
            this.f31413h = zzcl.f22623e;
            this.f31411f = zzcl.f22622d;
            this.f31415j = zzcl.f22628x;
            Bundle bundle = zzcl.f22627s;
            if (bundle != null) {
                this.f31410e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
