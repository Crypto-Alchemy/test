package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.DynamiteApi;

@DynamiteApi
public class FlagProviderImpl extends ai8 {

    /* renamed from: a */
    public boolean f22442a = false;

    /* renamed from: b */
    public SharedPreferences f22443b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.f22442a) {
            return z;
        }
        return x98.m54316a(this.f22443b, str, Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.f22442a) {
            return i;
        }
        return bi8.m32578a(this.f22443b, str, Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        if (!this.f22442a) {
            return j;
        }
        return ap8.m31902a(this.f22443b, str, Long.valueOf(j)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.f22442a) {
            return str2;
        }
        return cv8.m43252a(this.f22443b, str, str2);
    }

    public void init(ro2 ro2) {
        Context context = (Context) gf4.m44715r1(ro2);
        if (!this.f22442a) {
            try {
                this.f22443b = z09.m54937a(context.createPackageContext("com.google.android.gms", 0));
                this.f22442a = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
                }
            }
        }
    }
}
