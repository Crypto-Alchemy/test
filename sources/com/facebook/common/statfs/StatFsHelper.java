package com.facebook.common.statfs;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StatFsHelper {

    /* renamed from: h */
    public static StatFsHelper f9485h;

    /* renamed from: i */
    public static final long f9486i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a */
    public volatile StatFs f9487a = null;

    /* renamed from: b */
    public volatile File f9488b;

    /* renamed from: c */
    public volatile StatFs f9489c = null;

    /* renamed from: d */
    public volatile File f9490d;

    /* renamed from: e */
    public long f9491e;

    /* renamed from: f */
    public final Lock f9492f = new ReentrantLock();

    /* renamed from: g */
    public volatile boolean f9493g = false;

    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    /* renamed from: a */
    public static StatFs m13321a(String str) {
        return new StatFs(str);
    }

    /* renamed from: d */
    public static synchronized StatFsHelper m13322d() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            if (f9485h == null) {
                f9485h = new StatFsHelper();
            }
            statFsHelper = f9485h;
        }
        return statFsHelper;
    }

    /* renamed from: b */
    public final void mo13176b() {
        if (!this.f9493g) {
            this.f9492f.lock();
            try {
                if (!this.f9493g) {
                    this.f9488b = Environment.getDataDirectory();
                    this.f9490d = Environment.getExternalStorageDirectory();
                    mo13180g();
                    this.f9493g = true;
                }
            } finally {
                this.f9492f.unlock();
            }
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    /* renamed from: c */
    public long mo13177c(StorageType storageType) {
        StatFs statFs;
        mo13176b();
        mo13178e();
        if (storageType == StorageType.INTERNAL) {
            statFs = this.f9487a;
        } else {
            statFs = this.f9489c;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo13178e() {
        if (this.f9492f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f9491e > f9486i) {
                    mo13180g();
                }
            } finally {
                this.f9492f.unlock();
            }
        }
    }

    /* renamed from: f */
    public boolean mo13179f(StorageType storageType, long j) {
        mo13176b();
        long c = mo13177c(storageType);
        if (c <= 0 || c < j) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo13180g() {
        this.f9487a = mo13181h(this.f9487a, this.f9488b);
        this.f9489c = mo13181h(this.f9489c, this.f9490d);
        this.f9491e = SystemClock.uptimeMillis();
    }

    /* renamed from: h */
    public final StatFs mo13181h(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = m13321a(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                throw pp6.m25127a(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }
}
