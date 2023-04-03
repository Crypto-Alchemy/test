package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.crypto.tink.C4640a;
import com.google.crypto.tink.KeyTemplate;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C6411qi;

public final class EncryptedSharedPreferences implements SharedPreferences {

    /* renamed from: a */
    public final SharedPreferences f6920a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f6921b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final String f6922c;

    /* renamed from: d */
    public final String f6923d;

    /* renamed from: e */
    public final C5954id f6924e;

    /* renamed from: f */
    public final ge1 f6925f;

    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        /* access modifiers changed from: public */
        EncryptedType(int i) {
            this.mId = i;
        }

        public static EncryptedType fromId(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum PrefKeyEncryptionScheme {
        AES256_SIV("AES256_SIV");
        
        private final String mDeterministicAeadKeyTemplateName;

        /* access modifiers changed from: public */
        PrefKeyEncryptionScheme(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        public KeyTemplate getKeyTemplate() throws GeneralSecurityException {
            return db3.m43437a(this.mDeterministicAeadKeyTemplateName);
        }
    }

    public enum PrefValueEncryptionScheme {
        AES256_GCM("AES256_GCM");
        
        private final String mAeadKeyTemplateName;

        /* access modifiers changed from: public */
        PrefValueEncryptionScheme(String str) {
            this.mAeadKeyTemplateName = str;
        }

        public KeyTemplate getKeyTemplate() throws GeneralSecurityException {
            return db3.m43437a(this.mAeadKeyTemplateName);
        }
    }

    /* renamed from: androidx.security.crypto.EncryptedSharedPreferences$a */
    public static /* synthetic */ class C1376a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6929a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6929a = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6929a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6929a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6929a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6929a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6929a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.security.crypto.EncryptedSharedPreferences.C1376a.<clinit>():void");
        }
    }

    /* renamed from: androidx.security.crypto.EncryptedSharedPreferences$b */
    public static final class C1377b implements SharedPreferences.Editor {

        /* renamed from: a */
        public final EncryptedSharedPreferences f6930a;

        /* renamed from: b */
        public final SharedPreferences.Editor f6931b;

        /* renamed from: c */
        public final List<String> f6932c;

        /* renamed from: d */
        public AtomicBoolean f6933d = new AtomicBoolean(false);

        public C1377b(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.f6930a = encryptedSharedPreferences;
            this.f6931b = editor;
            this.f6932c = new CopyOnWriteArrayList();
        }

        /* renamed from: a */
        public final void mo10192a() {
            if (this.f6933d.getAndSet(false)) {
                for (String next : this.f6930a.getAll().keySet()) {
                    if (!this.f6932c.contains(next) && !this.f6930a.mo10179g(next)) {
                        this.f6931b.remove(this.f6930a.mo10175d(next));
                    }
                }
            }
        }

        public void apply() {
            mo10192a();
            this.f6931b.apply();
            mo10194b();
            this.f6932c.clear();
        }

        /* renamed from: b */
        public final void mo10194b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f6930a.f6921b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                for (String onSharedPreferenceChanged : this.f6932c) {
                    next.onSharedPreferenceChanged(this.f6930a, onSharedPreferenceChanged);
                }
            }
        }

        /* renamed from: c */
        public final void mo10195c(String str, byte[] bArr) {
            if (!this.f6930a.mo10179g(str)) {
                this.f6932c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair<String, String> e = this.f6930a.mo10176e(str, bArr);
                    this.f6931b.putString((String) e.first, (String) e.second);
                } catch (GeneralSecurityException e2) {
                    throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
                }
            } else {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
        }

        public SharedPreferences.Editor clear() {
            this.f6933d.set(true);
            return this;
        }

        public boolean commit() {
            mo10192a();
            try {
                return this.f6931b.commit();
            } finally {
                mo10194b();
                this.f6932c.clear();
            }
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EncryptedType.BOOLEAN.getId());
            allocate.put(z ? (byte) 1 : 0);
            mo10195c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.FLOAT.getId());
            allocate.putFloat(f);
            mo10195c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.INT.getId());
            allocate.putInt(i);
            mo10195c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EncryptedType.LONG.getId());
            allocate.putLong(j);
            mo10195c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EncryptedType.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            mo10195c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C3162qq<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList<>(set.size());
            int size = set.size() * 4;
            for (String bytes : set) {
                byte[] bytes2 = bytes.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes2);
                size += bytes2.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EncryptedType.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            mo10195c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            if (!this.f6930a.mo10179g(str)) {
                this.f6931b.remove(this.f6930a.mo10175d(str));
                this.f6932c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    public EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, C5954id idVar, ge1 ge1) {
        this.f6922c = str;
        this.f6920a = sharedPreferences;
        this.f6923d = str2;
        this.f6924e = idVar;
        this.f6925f = ge1;
    }

    /* renamed from: a */
    public static SharedPreferences m9849a(Context context, String str, MasterKey masterKey, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        return m9850b(str, masterKey.mo10205a(), context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }

    @Deprecated
    /* renamed from: b */
    public static SharedPreferences m9850b(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        he1.m45184a();
        C6098jd.m46452b();
        Context applicationContext = context.getApplicationContext();
        C6411qi.C6413b j = new C6411qi.C6413b().mo47116h(prefKeyEncryptionScheme.getKeyTemplate()).mo47118j(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        C4640a c = j.mo47117i("android-keystore://" + str2).mo47112d().mo47111c();
        C6411qi.C6413b j2 = new C6411qi.C6413b().mo47116h(prefValueEncryptionScheme.getKeyTemplate()).mo47118j(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        C5954id idVar = (C5954id) j2.mo47117i("android-keystore://" + str2).mo47112d().mo47111c().mo35246h(C5954id.class);
        return new EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), idVar, (ge1) c.mo35246h(ge1.class));
    }

    /* renamed from: c */
    public String mo10173c(String str) {
        try {
            String str2 = new String(this.f6925f.mo42882b(C6329ox.m49589a(str, 0), this.f6922c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    public boolean contains(String str) {
        if (!mo10179g(str)) {
            return this.f6920a.contains(mo10175d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* renamed from: d */
    public String mo10175d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return C6329ox.m49592d(this.f6925f.mo42881a(str.getBytes(StandardCharsets.UTF_8), this.f6922c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    /* renamed from: e */
    public Pair<String, String> mo10176e(String str, byte[] bArr) throws GeneralSecurityException {
        String d = mo10175d(str);
        return new Pair<>(d, C6329ox.m49592d(this.f6924e.mo29526a(bArr, d.getBytes(StandardCharsets.UTF_8))));
    }

    public SharedPreferences.Editor edit() {
        return new C1377b(this, this.f6920a.edit());
    }

    /* renamed from: f */
    public final Object mo10178f(String str) throws SecurityException {
        if (!mo10179g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String d = mo10175d(str);
                String string = this.f6920a.getString(d, (String) null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.f6924e.mo29527b(C6329ox.m49589a(string, 0), d.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                int i = wrap.getInt();
                EncryptedType fromId = EncryptedType.fromId(i);
                if (fromId != null) {
                    switch (C1376a.f6929a[fromId.ordinal()]) {
                        case 1:
                            int i2 = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            wrap.limit(i2);
                            String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                            if (charBuffer.equals("__NULL__")) {
                                return null;
                            }
                            return charBuffer;
                        case 2:
                            return Integer.valueOf(wrap.getInt());
                        case 3:
                            return Long.valueOf(wrap.getLong());
                        case 4:
                            return Float.valueOf(wrap.getFloat());
                        case 5:
                            if (wrap.get() != 0) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        case 6:
                            C3162qq qqVar = new C3162qq();
                            while (wrap.hasRemaining()) {
                                int i3 = wrap.getInt();
                                ByteBuffer slice2 = wrap.slice();
                                slice2.limit(i3);
                                wrap.position(wrap.position() + i3);
                                qqVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                            }
                            if (qqVar.size() != 1 || !"__NULL__".equals(qqVar.mo25210s(0))) {
                                return qqVar;
                            }
                            return null;
                        default:
                            throw new SecurityException("Unhandled type for encrypted pref value: " + fromId);
                    }
                } else {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
                }
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
            }
        } else {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* renamed from: g */
    public boolean mo10179g(String str) {
        if ("__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            return true;
        }
        return false;
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f6920a.getAll().entrySet()) {
            if (!mo10179g((String) next.getKey())) {
                String c = mo10173c((String) next.getKey());
                hashMap.put(c, mo10178f(c));
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        Object f = mo10178f(str);
        if (f == null || !(f instanceof Boolean)) {
            return z;
        }
        return ((Boolean) f).booleanValue();
    }

    public float getFloat(String str, float f) {
        Object f2 = mo10178f(str);
        if (f2 == null || !(f2 instanceof Float)) {
            return f;
        }
        return ((Float) f2).floatValue();
    }

    public int getInt(String str, int i) {
        Object f = mo10178f(str);
        if (f == null || !(f instanceof Integer)) {
            return i;
        }
        return ((Integer) f).intValue();
    }

    public long getLong(String str, long j) {
        Object f = mo10178f(str);
        if (f == null || !(f instanceof Long)) {
            return j;
        }
        return ((Long) f).longValue();
    }

    public String getString(String str, String str2) {
        Object f = mo10178f(str);
        if (f == null || !(f instanceof String)) {
            return str2;
        }
        return (String) f;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        Object f = mo10178f(str);
        if (f instanceof Set) {
            set2 = (Set) f;
        } else {
            set2 = new C3162qq<>();
        }
        if (set2.size() > 0) {
            return set2;
        }
        return set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6921b.add(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6921b.remove(onSharedPreferenceChangeListener);
    }
}
