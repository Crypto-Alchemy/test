package p000;

import android.content.Context;
import android.util.Log;
import com.google.crypto.tink.C4640a;
import com.google.crypto.tink.C4641b;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import p000.C6485si;

/* renamed from: qi */
/* compiled from: AndroidKeysetManager */
public final class C6411qi {

    /* renamed from: d */
    public static final String f33098d = "qi";

    /* renamed from: a */
    public final ub3 f33099a;

    /* renamed from: b */
    public final C5954id f33100b;

    /* renamed from: c */
    public C4641b f33101c;

    /* renamed from: qi$b */
    /* compiled from: AndroidKeysetManager */
    public static final class C6413b {

        /* renamed from: a */
        public tb3 f33102a = null;

        /* renamed from: b */
        public ub3 f33103b = null;

        /* renamed from: c */
        public String f33104c = null;

        /* renamed from: d */
        public C5954id f33105d = null;

        /* renamed from: e */
        public boolean f33106e = true;

        /* renamed from: f */
        public KeyTemplate f33107f = null;

        /* renamed from: g */
        public KeyStore f33108g = null;

        /* renamed from: h */
        public C4641b f33109h;

        /* renamed from: d */
        public synchronized C6411qi mo47112d() throws GeneralSecurityException, IOException {
            if (this.f33104c != null) {
                this.f33105d = mo47115g();
            }
            this.f33109h = mo47114f();
            return new C6411qi(this);
        }

        /* renamed from: e */
        public final C4641b mo47113e() throws GeneralSecurityException, IOException {
            C5954id idVar = this.f33105d;
            if (idVar != null) {
                try {
                    return C4641b.m37070j(C4640a.m37061j(this.f33102a, idVar));
                } catch (InvalidProtocolBufferException | GeneralSecurityException unused) {
                    String unused2 = C6411qi.f33098d;
                }
            }
            return C4641b.m37070j(jg0.m46502a(this.f33102a));
        }

        /* renamed from: f */
        public final C4641b mo47114f() throws GeneralSecurityException, IOException {
            try {
                return mo47113e();
            } catch (FileNotFoundException e) {
                if (Log.isLoggable(C6411qi.f33098d, 4)) {
                    String unused = C6411qi.f33098d;
                    String.format("keyset not found, will generate a new one. %s", new Object[]{e.getMessage()});
                }
                if (this.f33107f != null) {
                    C4641b a = C4641b.m37069i().mo35251a(this.f33107f);
                    C4641b h = a.mo35258h(a.mo35254d().mo35245g().mo47718H(0).mo47722H());
                    if (this.f33105d != null) {
                        h.mo35254d().mo35248l(this.f33103b, this.f33105d);
                    } else {
                        jg0.m46503b(h.mo35254d(), this.f33103b);
                    }
                    return h;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        /* renamed from: g */
        public final C5954id mo47115g() throws GeneralSecurityException {
            C6485si siVar;
            if (!C6411qi.m50588d()) {
                String unused = C6411qi.f33098d;
                return null;
            }
            if (this.f33108g != null) {
                siVar = new C6485si.C6487b().mo47800b(this.f33108g).mo47799a();
            } else {
                siVar = new C6485si();
            }
            boolean e = siVar.mo47798e(this.f33104c);
            if (!e) {
                try {
                    C6485si.m51802d(this.f33104c);
                } catch (GeneralSecurityException | ProviderException unused2) {
                    String unused3 = C6411qi.f33098d;
                    return null;
                }
            }
            try {
                return siVar.mo47797b(this.f33104c);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!e) {
                    String unused4 = C6411qi.f33098d;
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f33104c}), e2);
            }
        }

        /* renamed from: h */
        public C6413b mo47116h(KeyTemplate keyTemplate) {
            this.f33107f = keyTemplate;
            return this;
        }

        /* renamed from: i */
        public C6413b mo47117i(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.f33106e) {
                this.f33104c = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        /* renamed from: j */
        public C6413b mo47118j(Context context, String str, String str2) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            } else if (str != null) {
                this.f33102a = new a06(context, str, str2);
                this.f33103b = new b06(context, str, str2);
                return this;
            } else {
                throw new IllegalArgumentException("need a keyset name");
            }
        }
    }

    /* renamed from: d */
    public static boolean m50588d() {
        return true;
    }

    /* renamed from: c */
    public synchronized C4640a mo47111c() throws GeneralSecurityException {
        return this.f33101c.mo35254d();
    }

    public C6411qi(C6413b bVar) throws GeneralSecurityException, IOException {
        this.f33099a = bVar.f33103b;
        this.f33100b = bVar.f33105d;
        this.f33101c = bVar.f33109h;
    }
}
