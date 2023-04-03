package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.proto.C4663a;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: a06 */
/* compiled from: SharedPrefKeysetReader */
public final class a06 implements tb3 {

    /* renamed from: a */
    public final SharedPreferences f20738a;

    /* renamed from: b */
    public final String f20739b;

    public a06(Context context, String str, String str2) throws IOException {
        if (str != null) {
            this.f20739b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f20738a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            } else {
                this.f20738a = applicationContext.getSharedPreferences(str2, 0);
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    /* renamed from: a */
    public tp1 mo28685a() throws IOException {
        return tp1.m52403H(mo28686b(), C4734l.m38174b());
    }

    /* renamed from: b */
    public final byte[] mo28686b() throws IOException {
        try {
            String string = this.f20738a.getString(this.f20739b, (String) null);
            if (string != null) {
                return yl2.m54810a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f20739b}));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f20739b}));
        }
    }

    public C4663a read() throws IOException {
        return C4663a.m37143M(mo28686b(), C4734l.m38174b());
    }
}
