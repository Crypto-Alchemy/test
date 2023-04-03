package com.google.firebase.installations.local;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {

    /* renamed from: a */
    public final File f25346a;

    /* renamed from: b */
    public final f22 f25347b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(f22 f22) {
        File filesDir = f22.mo42485h().getFilesDir();
        this.f25346a = new File(filesDir, "PersistedInstallation." + f22.mo42489l() + ".json");
        this.f25347b = f22;
    }

    /* renamed from: a */
    public C4788b mo36130a(C4788b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.mo36135d());
            jSONObject.put("Status", bVar.mo36139g().ordinal());
            jSONObject.put("AuthToken", bVar.mo36133b());
            jSONObject.put("RefreshToken", bVar.mo36138f());
            jSONObject.put("TokenCreationEpochInSecs", bVar.mo36140h());
            jSONObject.put("ExpiresInSecs", bVar.mo36134c());
            jSONObject.put("FisError", bVar.mo36136e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f25347b.mo42485h().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f25346a)) {
                return bVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: b */
    public final JSONObject mo36131b() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            fileInputStream = new FileInputStream(this.f25346a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: c */
    public C4788b mo36132c() {
        JSONObject b = mo36131b();
        String optString = b.optString("Fid", (String) null);
        int optInt = b.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", (String) null);
        String optString3 = b.optString("RefreshToken", (String) null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b.optLong("ExpiresInSecs", 0);
        return C4788b.m38485a().mo36147d(optString).mo36150g(RegistrationStatus.values()[optInt]).mo36145b(optString2).mo36149f(optString3).mo36151h(optLong).mo36146c(optLong2).mo36148e(b.optString("FisError", (String) null)).mo36144a();
    }
}
