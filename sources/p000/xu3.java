package p000;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xu3 */
/* compiled from: MetaDataStore */
public class xu3 {

    /* renamed from: b */
    public static final Charset f35700b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f35701a;

    public xu3(File file) {
        this.f35701a = file;
    }

    /* renamed from: d */
    public static Map<String, String> m54557d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m54558g(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: g */
    public static String m54558g(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    /* renamed from: a */
    public File mo49550a(String str) {
        File file = this.f35701a;
        return new File(file, str + "internal-keys" + ".meta");
    }

    /* renamed from: b */
    public File mo49551b(String str) {
        File file = this.f35701a;
        return new File(file, str + "keys" + ".meta");
    }

    /* renamed from: c */
    public File mo49552c(String str) {
        File file = this.f35701a;
        return new File(file, str + "user" + ".meta");
    }

    /* renamed from: e */
    public Map<String, String> mo49553e(String str) {
        return mo49554f(str, false);
    }

    /* renamed from: f */
    public Map<String, String> mo49554f(String str, boolean z) {
        File file;
        if (z) {
            file = mo49550a(str);
        } else {
            file = mo49551b(str);
        }
        if (!file.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                Map<String, String> d = m54557d(CommonUtils.m38397B(fileInputStream2));
                CommonUtils.m38402e(fileInputStream2, "Failed to close user metadata file.");
                return d;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    rk3.m51112f().mo47426e("Error deserializing user metadata.", e);
                    CommonUtils.m38402e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.m38402e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                CommonUtils.m38402e(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            rk3.m51112f().mo47426e("Error deserializing user metadata.", e);
            CommonUtils.m38402e(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }
}
