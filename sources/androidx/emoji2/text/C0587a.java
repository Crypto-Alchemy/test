package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.C0593c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.a */
/* compiled from: DefaultEmojiCompatConfig */
public final class C0587a {

    /* renamed from: androidx.emoji2.text.a$a */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C0588a {

        /* renamed from: a */
        public final C0589b f3527a;

        public C0588a(C0589b bVar) {
            this.f3527a = bVar == null ? m4500e() : bVar;
        }

        /* renamed from: e */
        public static C0589b m4500e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new C0591d();
            }
            return new C0590c();
        }

        /* renamed from: a */
        public final C0593c.C0597c mo5608a(Context context, j72 j72) {
            if (j72 == null) {
                return null;
            }
            return new C0607e(context, j72);
        }

        /* renamed from: b */
        public final List<List<byte[]>> mo5609b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: c */
        public C0593c.C0597c mo5610c(Context context) {
            return mo5608a(context, mo5614h(context));
        }

        /* renamed from: d */
        public final j72 mo5611d(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new j72(str, str2, "emojicompat-emoji-font", mo5609b(this.f3527a.mo5616b(packageManager, str2)));
        }

        /* renamed from: f */
        public final boolean mo5612f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            if (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public final ProviderInfo mo5613g(PackageManager packageManager) {
            for (ResolveInfo a : this.f3527a.mo5617c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a2 = this.f3527a.mo5615a(a);
                if (mo5612f(a2)) {
                    return a2;
                }
            }
            return null;
        }

        /* renamed from: h */
        public j72 mo5614h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            gu4.m18429g(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = mo5613g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return mo5611d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.a$b */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C0589b {
        /* renamed from: a */
        public ProviderInfo mo5615a(ResolveInfo resolveInfo) {
            throw null;
        }

        /* renamed from: b */
        public Signature[] mo5616b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo5617c(PackageManager packageManager, Intent intent, int i) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.a$c */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C0590c extends C0589b {
        /* renamed from: a */
        public ProviderInfo mo5615a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo5617c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.a$d */
    /* compiled from: DefaultEmojiCompatConfig */
    public static class C0591d extends C0590c {
        /* renamed from: b */
        public Signature[] mo5616b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C0607e m4499a(Context context) {
        return (C0607e) new C0588a((C0589b) null).mo5610c(context);
    }
}
