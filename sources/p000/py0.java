package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;
import p000.my0;

/* renamed from: py0 */
/* compiled from: CustomTabsIntent */
public final class py0 {

    /* renamed from: a */
    public final Intent f16655a;

    /* renamed from: b */
    public final Bundle f16656b;

    public py0(Intent intent, Bundle bundle) {
        this.f16655a = intent;
        this.f16656b = bundle;
    }

    /* renamed from: a */
    public void mo24793a(Context context, Uri uri) {
        this.f16655a.setData(uri);
        zr0.m31448k(context, this.f16655a, this.f16656b);
    }

    /* renamed from: py0$a */
    /* compiled from: CustomTabsIntent */
    public static final class C3103a {

        /* renamed from: a */
        public final Intent f16657a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final my0.C2857a f16658b = new my0.C2857a();

        /* renamed from: c */
        public ArrayList<Bundle> f16659c;

        /* renamed from: d */
        public Bundle f16660d;

        /* renamed from: e */
        public ArrayList<Bundle> f16661e;

        /* renamed from: f */
        public SparseArray<Bundle> f16662f;

        /* renamed from: g */
        public Bundle f16663g;

        /* renamed from: h */
        public int f16664h = 0;

        /* renamed from: i */
        public boolean f16665i = true;

        public C3103a() {
        }

        /* renamed from: a */
        public py0 mo24794a() {
            if (!this.f16657a.hasExtra("android.support.customtabs.extra.SESSION")) {
                mo24796c((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f16659c;
            if (arrayList != null) {
                this.f16657a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f16661e;
            if (arrayList2 != null) {
                this.f16657a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f16657a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f16665i);
            this.f16657a.putExtras(this.f16658b.mo23420a().mo23419a());
            Bundle bundle = this.f16663g;
            if (bundle != null) {
                this.f16657a.putExtras(bundle);
            }
            if (this.f16662f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f16662f);
                this.f16657a.putExtras(bundle2);
            }
            this.f16657a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f16664h);
            return new py0(this.f16657a, this.f16660d);
        }

        /* renamed from: b */
        public C3103a mo24795b(sy0 sy0) {
            this.f16657a.setPackage(sy0.mo25995d().getPackageName());
            mo24796c(sy0.mo25994c(), sy0.mo25996e());
            return this;
        }

        /* renamed from: c */
        public final void mo24796c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            s50.m26644b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f16657a.putExtras(bundle);
        }

        public C3103a(sy0 sy0) {
            if (sy0 != null) {
                mo24795b(sy0);
            }
        }
    }
}
