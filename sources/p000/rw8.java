package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.zzhz;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final /* synthetic */ class rw8 implements qy8 {

    /* renamed from: a */
    public final Context f33628a;

    public rw8(Context context) {
        this.f33628a = context;
    }

    public final Object zza() {
        zzhz zzhz;
        zzhz zzhz2;
        BufferedReader bufferedReader;
        Context context = this.f33628a;
        Object obj = lx8.f31447g;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
            return zzhz.zzc();
        }
        if (mu8.m48504a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                zzhz = zzhz.zzd(file);
            } else {
                zzhz = zzhz.zzc();
            }
        } catch (RuntimeException unused) {
            zzhz = zzhz.zzc();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        if (zzhz.zza()) {
            File file2 = (File) zzhz.zzb();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length == 3) {
                        String str3 = new String(split[0]);
                        String decode = Uri.decode(new String(split[1]));
                        String str4 = (String) hashMap2.get(split[2]);
                        if (str4 == null) {
                            String str5 = new String(split[2]);
                            str4 = Uri.decode(str5);
                            if (str4.length() < 1024 || str4 == str5) {
                                hashMap2.put(str5, str4);
                            }
                        }
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new HashMap());
                        }
                        ((Map) hashMap.get(str3)).put(decode, str4);
                    } else if (readLine.length() != 0) {
                        "Invalid: ".concat(readLine);
                    }
                }
                String valueOf = String.valueOf(file2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                sb.append("Parsed ");
                sb.append(valueOf);
                jw8 jw8 = new jw8(hashMap);
                bufferedReader.close();
                zzhz2 = zzhz.zzd(jw8);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Throwable th2) {
                qz8.m50920a(th, th2);
            }
        } else {
            zzhz2 = zzhz.zzc();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return zzhz2;
        throw th;
    }
}
