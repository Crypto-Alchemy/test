package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4047e implements DynamiteModule.C4040a {
    /* renamed from: a */
    public final DynamiteModule.C4040a.C4042b mo30744a(Context context, String str, DynamiteModule.C4040a.C4041a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.C4040a.C4042b bVar = new DynamiteModule.C4040a.C4042b();
        bVar.f22438a = aVar.mo30746b(context, str);
        int a = aVar.mo30745a(context, str, true);
        bVar.f22439b = a;
        int i = bVar.f22438a;
        if (i == 0) {
            if (a == 0) {
                bVar.f22440c = 0;
                return bVar;
            }
            i = 0;
        }
        if (i >= a) {
            bVar.f22440c = -1;
        } else {
            bVar.f22440c = 1;
        }
        return bVar;
    }
}
