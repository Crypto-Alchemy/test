package p000;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* renamed from: l80 */
/* compiled from: CachedSettingsIo */
public class l80 {

    /* renamed from: a */
    public final Context f31195a;

    public l80(Context context) {
        this.f31195a = context;
    }

    /* renamed from: a */
    public final File mo45364a() {
        return new File(new z02(this.f31195a).mo49576a(), "com.crashlytics.settings.json");
    }

    /* renamed from: b */
    public JSONObject mo45365b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        rk3.m51112f().mo47423b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = mo45364a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(CommonUtils.m38397B(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        rk3.m51112f().mo47426e("Failed to fetch cached settings", e);
                        CommonUtils.m38402e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.m38402e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                rk3.m51112f().mo47429i("Settings file does not exist.");
                jSONObject = null;
            }
            CommonUtils.m38402e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            rk3.m51112f().mo47426e("Failed to fetch cached settings", e);
            CommonUtils.m38402e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            CommonUtils.m38402e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo45366c(long j, JSONObject jSONObject) {
        rk3.m51112f().mo47429i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(mo45364a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    CommonUtils.m38402e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        rk3.m51112f().mo47426e("Failed to cache settings", e);
                        CommonUtils.m38402e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.m38402e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    CommonUtils.m38402e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                rk3.m51112f().mo47426e("Failed to cache settings", e);
                CommonUtils.m38402e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
