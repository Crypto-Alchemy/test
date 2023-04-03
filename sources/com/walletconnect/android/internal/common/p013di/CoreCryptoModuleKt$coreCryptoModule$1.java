package com.walletconnect.android.internal.common.p013di;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.walletconnect.foundation.crypto.data.repository.JwtRepository;
import java.io.File;
import java.security.KeyStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.scope.Scope;
import p000.mn5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.internal.common.di.CoreCryptoModuleKt$coreCryptoModule$1 */
/* compiled from: CoreCryptoModule.kt */
public final class CoreCryptoModuleKt$coreCryptoModule$1 extends Lambda implements rc2<dx3, r37> {
    public static final CoreCryptoModuleKt$coreCryptoModule$1 INSTANCE = new CoreCryptoModuleKt$coreCryptoModule$1();

    public CoreCryptoModuleKt$coreCryptoModule$1() {
        super(1);
    }

    public static final synchronized SharedPreferences invoke$createSharedPreferences(Scope scope) {
        SharedPreferences a;
        synchronized (CoreCryptoModuleKt$coreCryptoModule$1.class) {
            MasterKey a2 = new MasterKey.C1379b(nx3.m70099b(scope), "wc_keystore_key").mo10210c(MasterKey.KeyScheme.AES256_GCM).mo10208a();
            vx2.m53590f(a2, "Builder(androidContext()…GCM)\n            .build()");
            a = EncryptedSharedPreferences.m9849a(nx3.m70099b(scope), "wc_key_store", a2, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            vx2.m53590f(a, "create(\n            andr…eme.AES256_GCM,\n        )");
        }
        return a;
    }

    public static final synchronized void invoke$deleteMasterKey() {
        synchronized (CoreCryptoModuleKt$coreCryptoModule$1.class) {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry("wc_keystore_key");
        }
    }

    public static final synchronized void invoke$deleteSharedPreferences(Scope scope) {
        synchronized (CoreCryptoModuleKt$coreCryptoModule$1.class) {
            try {
                Context b = nx3.m70099b(scope);
                if (b.getSharedPreferences("wc_key_store", 0) != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        boolean unused = b.deleteSharedPreferences("wc_key_store");
                    } else {
                        b.getSharedPreferences("wc_key_store", 0).edit().clear().apply();
                        new File(new File(b.getApplicationInfo().dataDir, "shared_prefs"), "wc_key_store.xml").delete();
                    }
                }
            } catch (Exception e) {
                oz4 c = pz4.m71134c(AndroidCommonDITags.LOGGER);
                ((sk3) scope.mo64988f(ua5.m52727b(sk3.class), c, (pc2<? extends ul4>) null)).error("Occurred when trying to reset encrypted shared prefs: " + e);
            }
        }
        return;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        vx2.m53591g(dx3, "$this$module");
        C55321 r5 = C55321.INSTANCE;
        mn5.C7904a aVar = mn5.f40974e;
        gb6 a = aVar.mo56288a();
        Kind kind = Kind.Singleton;
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(a, ua5.m52727b(SharedPreferences.class), (oz4) null, r5, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        new jc3(dx3, singleInstanceFactory);
        C55332 r10 = C55332.INSTANCE;
        SingleInstanceFactory singleInstanceFactory2 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(bb3.class), (oz4) null, r10, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory2);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory2);
        }
        new jc3(dx3, singleInstanceFactory2);
        C55343 r102 = C55343.INSTANCE;
        SingleInstanceFactory singleInstanceFactory3 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(JwtRepository.class), (oz4) null, r102, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory3);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory3);
        }
        new jc3(dx3, singleInstanceFactory3);
        C55354 r103 = C55354.INSTANCE;
        SingleInstanceFactory singleInstanceFactory4 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(ra3.class), (oz4) null, r103, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory4);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory4);
        }
        new jc3(dx3, singleInstanceFactory4);
        C55365 r104 = C55365.INSTANCE;
        SingleInstanceFactory singleInstanceFactory5 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(xh0.class), (oz4) null, r104, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory5);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory5);
        }
        new jc3(dx3, singleInstanceFactory5);
    }
}
