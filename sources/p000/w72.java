package p000;

import android.app.Notification;

/* renamed from: w72 */
/* compiled from: ForegroundInfo */
public final class w72 {

    /* renamed from: a */
    public final int f19037a;

    /* renamed from: b */
    public final int f19038b;

    /* renamed from: c */
    public final Notification f19039c;

    public w72(int i, Notification notification, int i2) {
        this.f19037a = i;
        this.f19039c = notification;
        this.f19038b = i2;
    }

    /* renamed from: a */
    public int mo27456a() {
        return this.f19038b;
    }

    /* renamed from: b */
    public Notification mo27457b() {
        return this.f19039c;
    }

    /* renamed from: c */
    public int mo27458c() {
        return this.f19037a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w72.class != obj.getClass()) {
            return false;
        }
        w72 w72 = (w72) obj;
        if (this.f19037a == w72.f19037a && this.f19038b == w72.f19038b) {
            return this.f19039c.equals(w72.f19039c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f19037a * 31) + this.f19038b) * 31) + this.f19039c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f19037a + ", mForegroundServiceType=" + this.f19038b + ", mNotification=" + this.f19039c + '}';
    }
}
