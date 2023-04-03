package p000;

import android.util.SparseArray;
import zendesk.belvedere.C9833i;
import zendesk.belvedere.MediaResult;

/* renamed from: ix2 */
/* compiled from: IntentRegistry */
public class ix2 {

    /* renamed from: a */
    public SparseArray<MediaResult> f46514a = new SparseArray<>();

    /* renamed from: a */
    public void mo67419a(int i) {
        synchronized (this) {
            this.f46514a.remove(i);
        }
    }

    /* renamed from: b */
    public MediaResult mo67420b(int i) {
        MediaResult mediaResult;
        synchronized (this) {
            mediaResult = this.f46514a.get(i);
        }
        return mediaResult;
    }

    /* renamed from: c */
    public final int mo67421c() {
        for (int i = 1600; i < 1650; i++) {
            if (this.f46514a.get(i) == null) {
                return i;
            }
        }
        C9833i.m75551a("Belvedere", "No slot free. Clearing registry.");
        this.f46514a.clear();
        return mo67421c();
    }

    /* renamed from: d */
    public int mo67422d() {
        int c;
        synchronized (this) {
            c = mo67421c();
            this.f46514a.put(c, MediaResult.m75418d());
        }
        return c;
    }

    /* renamed from: e */
    public void mo67423e(int i, MediaResult mediaResult) {
        synchronized (this) {
            this.f46514a.put(i, mediaResult);
        }
    }
}
