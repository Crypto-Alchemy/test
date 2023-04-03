package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C6436rf;

/* renamed from: sf */
/* compiled from: com.google.android.gms:play-services-measurement-api@@19.0.0 */
public class C6481sf implements C6436rf {

    /* renamed from: c */
    public static volatile C6436rf f33838c;

    /* renamed from: a */
    public final C3966co f33839a;

    /* renamed from: b */
    public final Map<String, Object> f33840b = new ConcurrentHashMap();

    /* renamed from: sf$a */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@19.0.0 */
    public class C6482a implements C6436rf.C6437a {

        /* renamed from: a */
        public final /* synthetic */ String f33841a;

        public C6482a(String str) {
            this.f33841a = str;
        }
    }

    public C6481sf(C3966co coVar) {
        cu4.m43221k(coVar);
        this.f33839a = coVar;
    }

    /* renamed from: d */
    public static C6436rf m51729d(f22 f22, Context context, oc6 oc6) {
        cu4.m43221k(f22);
        cu4.m43221k(context);
        cu4.m43221k(oc6);
        cu4.m43221k(context.getApplicationContext());
        if (f33838c == null) {
            synchronized (C6481sf.class) {
                if (f33838c == null) {
                    Bundle bundle = new Bundle(1);
                    if (f22.mo42492r()) {
                        oc6.mo43918a(o11.class, t48.f34112a, na8.f32060a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", f22.mo42491q());
                    }
                    f33838c = new C6481sf(cm8.m33094r(context, (String) null, (String) null, (String) null, bundle).mo30050s());
                }
            }
        }
        return f33838c;
    }

    /* renamed from: e */
    public static final /* synthetic */ void m51730e(dt1 dt1) {
        boolean z = ((o11) dt1.mo42045a()).f32257a;
        synchronized (C6481sf.class) {
            ((C6481sf) cu4.m43221k(f33838c)).f33839a.mo30111d(z);
        }
    }

    /* renamed from: a */
    public void mo47394a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (ke8.m47046a(str) && ke8.m47047b(str2, bundle) && ke8.m47050e(str, str2, bundle)) {
            ke8.m47052g(str, str2, bundle);
            this.f33839a.mo30108a(str, str2, bundle);
        }
    }

    /* renamed from: b */
    public void mo47395b(String str, String str2, Object obj) {
        if (ke8.m47046a(str) && ke8.m47049d(str, str2)) {
            this.f33839a.mo30110c(str, str2, obj);
        }
    }

    /* renamed from: c */
    public C6436rf.C6437a mo47396c(String str, C6436rf.C6438b bVar) {
        Object obj;
        cu4.m43221k(bVar);
        if (!ke8.m47046a(str) || mo47746f(str)) {
            return null;
        }
        C3966co coVar = this.f33839a;
        if ("fiam".equals(str)) {
            obj = new dl8(coVar, bVar);
        } else if ("crash".equals(str) || "clx".equals(str)) {
            obj = new es8(coVar, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f33840b.put(str, obj);
        return new C6482a(str);
    }

    /* renamed from: f */
    public final boolean mo47746f(String str) {
        if (str.isEmpty() || !this.f33840b.containsKey(str) || this.f33840b.get(str) == null) {
            return false;
        }
        return true;
    }
}
