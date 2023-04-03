package p000;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* renamed from: si */
/* compiled from: AndroidKeystoreKmsClient */
public final class C6485si implements zb3 {

    /* renamed from: a */
    public final String f33911a;

    /* renamed from: b */
    public KeyStore f33912b;

    /* renamed from: si$b */
    /* compiled from: AndroidKeystoreKmsClient */
    public static final class C6487b {

        /* renamed from: a */
        public String f33913a = null;

        /* renamed from: b */
        public KeyStore f33914b = null;

        public C6487b() {
            if (C6485si.m51803f()) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    this.f33914b = instance;
                    instance.load((KeyStore.LoadStoreParameter) null);
                } catch (IOException | GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }

        /* renamed from: a */
        public C6485si mo47799a() {
            return new C6485si(this);
        }

        /* renamed from: b */
        public C6487b mo47800b(KeyStore keyStore) {
            if (keyStore != null) {
                this.f33914b = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }
    }

    /* renamed from: d */
    public static void m51802d(String str) throws GeneralSecurityException {
        if (!new C6485si().mo47798e(str)) {
            String b = a87.m31750b("android-keystore://", str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(b, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            instance.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
    }

    /* renamed from: f */
    public static boolean m51803f() {
        return true;
    }

    /* renamed from: g */
    public static C5954id m51804g(C5954id idVar) throws GeneralSecurityException {
        byte[] c = y65.m54637c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c, idVar.mo29527b(idVar.mo29526a(c, bArr), bArr))) {
            return idVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo47796a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f33911a     // Catch:{ all -> 0x0024 }
            r1 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r2)
            return r1
        L_0x000e:
            java.lang.String r0 = r2.f33911a     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0021
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch:{ all -> 0x0024 }
            if (r3 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            monitor-exit(r2)
            return r1
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6485si.mo47796a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public synchronized C5954id mo47797b(String str) throws GeneralSecurityException {
        String str2 = this.f33911a;
        if (str2 != null) {
            if (!str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", new Object[]{this.f33911a, str}));
            }
        }
        return m51804g(new C6439ri(a87.m31750b("android-keystore://", str), this.f33912b));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo47798e(java.lang.String r3) throws java.security.GeneralSecurityException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r3 = p000.a87.m31750b(r0, r3)     // Catch:{ all -> 0x002f }
            java.security.KeyStore r0 = r2.f33912b     // Catch:{ NullPointerException -> 0x000f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x000f }
            monitor-exit(r2)
            return r3
        L_0x000f:
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
            r2.f33912b = r0     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x0028, InterruptedException -> 0x0020 }
        L_0x0020:
            java.security.KeyStore r0 = r2.f33912b     // Catch:{ all -> 0x002f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r2)
            return r3
        L_0x0028:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x002f }
            r0.<init>(r3)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6485si.mo47798e(java.lang.String):boolean");
    }

    public C6485si() throws GeneralSecurityException {
        this(new C6487b());
    }

    public C6485si(C6487b bVar) {
        this.f33911a = bVar.f33913a;
        this.f33912b = bVar.f33914b;
    }
}
