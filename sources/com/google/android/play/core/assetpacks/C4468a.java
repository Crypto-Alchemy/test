package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.assetpacks.a */
public final class C4468a implements yw7 {

    /* renamed from: f */
    public static final pq7 f24701f = new pq7("AssetPackServiceImpl");

    /* renamed from: g */
    public static final Intent f24702g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final String f24703a;

    /* renamed from: b */
    public final rs7 f24704b;

    /* renamed from: c */
    public gr7<zw7> f24705c;

    /* renamed from: d */
    public gr7<zw7> f24706d;

    /* renamed from: e */
    public final AtomicBoolean f24707e = new AtomicBoolean();

    public C4468a(Context context, rs7 rs7) {
        this.f24703a = context.getPackageName();
        this.f24704b = rs7;
        if (ts7.m52429a(context)) {
            Context c = lw7.m47962c(context);
            pq7 pq7 = f24701f;
            Intent intent = f24702g;
            this.f24705c = new gr7(c, pq7, "AssetPackService", intent, ax7.f21064c);
            this.f24706d = new gr7(lw7.m47962c(context), pq7, "AssetPackService-keepAlive", intent, ax7.f21063b);
        }
        f24701f.mo46852a("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: h */
    public static Bundle m36350h(int i, String str) {
        Bundle i2 = m36351i(i);
        i2.putString("module_name", str);
        return i2;
    }

    /* renamed from: i */
    public static Bundle m36351i(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* renamed from: j */
    public static Bundle m36352j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10901);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    /* renamed from: k */
    public static /* synthetic */ ArrayList m36353k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: m */
    public static /* synthetic */ Bundle m36355m(Map map) {
        Bundle j = m36352j();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        j.putParcelableArrayList("installed_asset_module", arrayList);
        return j;
    }

    /* renamed from: q */
    public static /* synthetic */ Bundle m36359q(int i, String str, String str2, int i2) {
        Bundle h = m36350h(i, str);
        h.putString("slice_id", str2);
        h.putInt("chunk_number", i2);
        return h;
    }

    /* renamed from: u */
    public static /* synthetic */ List m36363u(C4468a aVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = C6323or.m49402b((Bundle) it.next(), aVar.f24704b).mo46453e().values().iterator().next();
            if (next == null) {
                f24701f.mo46853b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (cu7.m43232d(next.mo34143g())) {
                arrayList.add(next.mo34142f());
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public static <T> ul6<T> m36366y() {
        f24701f.mo46853b("onError(%d)", -11);
        return im6.m45801c(new AssetPackException(-11));
    }

    /* renamed from: a */
    public final synchronized void mo29741a() {
        if (this.f24706d == null) {
            f24701f.mo46856e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        pq7 pq7 = f24701f;
        pq7.mo46855d("keepAlive", new Object[0]);
        if (!this.f24707e.compareAndSet(false, true)) {
            pq7.mo46855d("Service is already kept alive.", new Object[0]);
            return;
        }
        nv7 nv7 = new nv7();
        this.f24706d.mo42952a(new nq7(this, nv7, nv7));
    }

    /* renamed from: b */
    public final void mo29742b(int i) {
        if (this.f24705c != null) {
            f24701f.mo46855d("notifySessionFailed", new Object[0]);
            nv7 nv7 = new nv7();
            this.f24705c.mo42952a(new lq7(this, nv7, i, nv7));
            return;
        }
        throw new C4470bj("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: c */
    public final void mo29743c(int i, String str, String str2, int i2) {
        if (this.f24705c != null) {
            f24701f.mo46855d("notifyChunkTransferred", new Object[0]);
            nv7 nv7 = new nv7();
            this.f24705c.mo42952a(new jq7(this, nv7, i, str, str2, i2, nv7));
            return;
        }
        throw new C4470bj("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: d */
    public final void mo29744d(int i, String str) {
        mo34152x(i, str, 10);
    }

    /* renamed from: e */
    public final ul6<List<String>> mo29745e(Map<String, Long> map) {
        if (this.f24705c == null) {
            return m36366y();
        }
        f24701f.mo46855d("syncPacks", new Object[0]);
        nv7 nv7 = new nv7();
        this.f24705c.mo42952a(new mx7(this, nv7, map, nv7));
        return nv7.mo46237c();
    }

    /* renamed from: f */
    public final ul6<ParcelFileDescriptor> mo29746f(int i, String str, String str2, int i2) {
        if (this.f24705c == null) {
            return m36366y();
        }
        f24701f.mo46855d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        nv7 nv7 = new nv7();
        this.f24705c.mo42952a(new mq7(this, nv7, i, str, str2, i2, nv7));
        return nv7.mo46237c();
    }

    /* renamed from: g */
    public final void mo29747g(List<String> list) {
        if (this.f24705c != null) {
            f24701f.mo46855d("cancelDownloads(%s)", list);
            nv7 nv7 = new nv7();
            this.f24705c.mo42952a(new kx7(this, nv7, list, nv7));
        }
    }

    /* renamed from: x */
    public final void mo34152x(int i, String str, int i2) {
        if (this.f24705c != null) {
            f24701f.mo46855d("notifyModuleCompleted", new Object[0]);
            nv7 nv7 = new nv7();
            this.f24705c.mo42952a(new kq7(this, nv7, i, str, nv7, i2));
            return;
        }
        throw new C4470bj("The Play Store app is not installed or is an unofficial version.", i);
    }
}
