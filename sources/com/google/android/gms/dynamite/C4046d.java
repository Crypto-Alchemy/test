package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4046d implements DynamiteModule.C4040a {
    /* renamed from: a */
    public final DynamiteModule.C4040a.C4042b mo30744a(Context context, String str, DynamiteModule.C4040a.C4041a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.C4040a.C4042b bVar = new DynamiteModule.C4040a.C4042b();
        int a = aVar.mo30745a(context, str, false);
        bVar.f22439b = a;
        if (a == 0) {
            bVar.f22440c = 0;
        } else {
            bVar.f22440c = 1;
        }
        return bVar;
    }
}
