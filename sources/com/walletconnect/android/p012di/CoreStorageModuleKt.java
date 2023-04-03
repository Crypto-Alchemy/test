package com.walletconnect.android.p012di;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.walletconnect.android.internal.common.p013di.AndroidCommonDITags;
import java.io.File;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import org.koin.core.scope.Scope;
import p000.m76;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002\u001a\b\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\b\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0006\u0010\t\u001a\u00020\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, mo44877d2 = {"Lorg/koin/core/scope/Scope;", "Landroid/content/SharedPreferences;", "g", "Lr37;", "h", "Ljavax/crypto/SecretKey;", "i", "Ldx3;", "k", "f", "Lm76$b;", "databaseSchema", "", "databaseName", "j", "Ljava/security/KeyStore;", "a", "Ljava/security/KeyStore;", "keyStore", "Ljavax/crypto/Cipher;", "b", "Ljavax/crypto/Cipher;", "cipher", "Landroid/security/keystore/KeyGenParameterSpec;", "c", "Landroid/security/keystore/KeyGenParameterSpec;", "keyGenParameterSpec", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.di.CoreStorageModuleKt */
/* compiled from: CoreStorageModule.kt */
public final class CoreStorageModuleKt {

    /* renamed from: a */
    public static final KeyStore f27012a;

    /* renamed from: b */
    public static final Cipher f27013b;

    /* renamed from: c */
    public static final KeyGenParameterSpec f27014c;

    static {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        vx2.m53590f(instance, "getInstance(ANDROID_KEYSTORE).apply { load(null) }");
        f27012a = instance;
        Cipher instance2 = Cipher.getInstance("AES/GCM/NoPadding");
        vx2.m53590f(instance2, "KEY_ALGORITHM_AES}/${Key…nce(transformation)\n    }");
        f27013b = instance2;
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_wc_db_key_", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
        vx2.m53590f(build, "Builder(KEYSTORE_ALIAS, …EY_SIZE)\n        .build()");
        f27014c = build;
    }

    /* renamed from: f */
    public static final dx3 m42001f() {
        return jx3.m59607b(false, CoreStorageModuleKt$coreStorageModule$1.INSTANCE, 1, (Object) null);
    }

    /* renamed from: g */
    public static final synchronized SharedPreferences m42002g(Scope scope) {
        SharedPreferences a;
        synchronized (CoreStorageModuleKt.class) {
            MasterKey a2 = new MasterKey.C1379b(nx3.m70099b(scope), "_wc_db_key_").mo10209b(f27014c).mo10208a();
            vx2.m53590f(a2, "Builder(androidContext()…terSpec)\n        .build()");
            a = EncryptedSharedPreferences.m9849a(nx3.m70099b(scope), "db_key_store", a2, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            vx2.m53590f(a, "create(\n        androidC…onScheme.AES256_GCM\n    )");
        }
        return a;
    }

    /* renamed from: h */
    public static final synchronized void m42003h(Scope scope) {
        synchronized (CoreStorageModuleKt.class) {
            try {
                Context b = nx3.m70099b(scope);
                if (b.getSharedPreferences("db_key_store", 0) != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        boolean unused = b.deleteSharedPreferences("db_key_store");
                    } else {
                        b.getSharedPreferences("db_key_store", 0).edit().clear().apply();
                        new File(new File(b.getApplicationInfo().dataDir, "shared_prefs"), "db_key_store.xml").delete();
                    }
                }
                f27012a.deleteEntry("_wc_db_key_");
            } catch (Exception e) {
                oz4 c = pz4.m71134c(AndroidCommonDITags.LOGGER);
                ((sk3) scope.mo64988f(ua5.m52727b(sk3.class), c, (pc2<? extends ul4>) null)).error("Occurred when trying to reset encrypted shared prefs: " + e);
            }
        }
        return;
    }

    /* renamed from: i */
    public static final synchronized SecretKey m42004i() {
        SecretKey secretKey;
        KeyStore.SecretKeyEntry secretKeyEntry;
        synchronized (CoreStorageModuleKt.class) {
            KeyStore keyStore = f27012a;
            KeyGenParameterSpec keyGenParameterSpec = f27014c;
            secretKey = null;
            KeyStore.Entry entry = keyStore.getEntry(keyGenParameterSpec.getKeystoreAlias(), (KeyStore.ProtectionParameter) null);
            if (entry instanceof KeyStore.SecretKeyEntry) {
                secretKeyEntry = (KeyStore.SecretKeyEntry) entry;
            } else {
                secretKeyEntry = null;
            }
            if (secretKeyEntry != null) {
                secretKey = secretKeyEntry.getSecretKey();
            }
            if (secretKey == null) {
                KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                instance.init(keyGenParameterSpec);
                secretKey = instance.generateKey();
                vx2.m53590f(secretKey, "getInstance(\n        Key…      generateKey()\n    }");
            }
        }
        return secretKey;
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: j */
    public static final dx3 m42005j(m76.C6236b bVar, String str) {
        vx2.m53591g(bVar, "databaseSchema");
        vx2.m53591g(str, "databaseName");
        return jx3.m59607b(false, new CoreStorageModuleKt$sdkBaseStorageModule$1(bVar, str), 1, (Object) null);
    }

    /* renamed from: k */
    public static final synchronized dx3 m42006k() {
        dx3 b;
        synchronized (CoreStorageModuleKt.class) {
            b = jx3.m59607b(false, CoreStorageModuleKt$signingModule$1.INSTANCE, 1, (Object) null);
        }
        return b;
    }
}
