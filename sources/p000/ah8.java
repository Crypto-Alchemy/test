package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: ah8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class ah8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ String f20950k;

    /* renamed from: r */
    public final /* synthetic */ String f20951r;

    /* renamed from: s */
    public final /* synthetic */ Context f20952s;

    /* renamed from: x */
    public final /* synthetic */ Bundle f20953x;

    /* renamed from: y */
    public final /* synthetic */ cm8 f20954y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah8(cm8 cm8, String str, String str2, Context context, Bundle bundle) {
        super(cm8, true);
        this.f20954y = cm8;
        this.f20950k = str;
        this.f20951r = str2;
        this.f20952s = context;
        this.f20953x = bundle;
    }

    /* renamed from: a */
    public final void mo28979a() {
        String str;
        String str2;
        String str3;
        boolean z;
        try {
            if (cm8.m33093q(this.f20950k, this.f20951r)) {
                String str4 = this.f20951r;
                str2 = this.f20950k;
                str = str4;
                str3 = this.f20954y.f21808a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            cu4.m43221k(this.f20952s);
            cm8 cm8 = this.f20954y;
            ef8 unused = cm8.f21816i = cm8.mo30051t(this.f20952s, true);
            if (this.f20954y.f21816i == null) {
                String unused2 = this.f20954y.f21808a;
                return;
            }
            int a = DynamiteModule.m33816a(this.f20952s, ModuleDescriptor.MODULE_ID);
            int b = DynamiteModule.m33817b(this.f20952s, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a, b);
            if (b < a) {
                z = true;
            } else {
                z = false;
            }
            ((ef8) cu4.m43221k(this.f20954y.f21816i)).initialize(gf4.m44716s1(this.f20952s), new zzcl(42004, (long) max, z, str3, str2, str, this.f20953x, sq8.m51887a(this.f20952s)), this.f28894a);
        } catch (Exception e) {
            this.f20954y.mo30048o(e, true, false);
        }
    }
}
