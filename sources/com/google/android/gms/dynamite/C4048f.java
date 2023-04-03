package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4048f implements DynamiteModule.C4040a {
    /* renamed from: a */
    public final DynamiteModule.C4040a.C4042b mo30744a(Context context, String str, DynamiteModule.C4040a.C4041a aVar) throws DynamiteModule.LoadingException {
        int i;
        DynamiteModule.C4040a.C4042b bVar = new DynamiteModule.C4040a.C4042b();
        int b = aVar.mo30746b(context, str);
        bVar.f22438a = b;
        int i2 = 0;
        if (b != 0) {
            i = aVar.mo30745a(context, str, false);
            bVar.f22439b = i;
        } else {
            i = aVar.mo30745a(context, str, true);
            bVar.f22439b = i;
        }
        int i3 = bVar.f22438a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            bVar.f22440c = 0;
            return bVar;
        }
        if (i2 >= i) {
            bVar.f22440c = -1;
        } else {
            bVar.f22440c = 1;
        }
        return bVar;
    }
}
