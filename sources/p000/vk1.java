package p000;

/* renamed from: vk1 */
/* compiled from: DropFramesFrameScheduler */
public class vk1 implements vb2 {

    /* renamed from: a */
    public final C1638bl f18812a;

    /* renamed from: b */
    public long f18813b = -1;

    public vk1(C1638bl blVar) {
        this.f18812a = blVar;
    }

    /* renamed from: a */
    public long mo27093a(long j) {
        long d = mo27155d();
        long j2 = 0;
        if (d == 0) {
            return -1;
        }
        if (!mo27156e() && j / mo27155d() >= ((long) this.f18812a.mo11696b())) {
            return -1;
        }
        long j3 = j % d;
        int a = this.f18812a.mo11695a();
        for (int i = 0; i < a && j2 <= j3; i++) {
            j2 += (long) this.f18812a.mo11697i(i);
        }
        return j + (j2 - j3);
    }

    /* renamed from: b */
    public int mo27094b(long j, long j2) {
        long d = mo27155d();
        if (d == 0) {
            return mo27154c(0);
        }
        if (mo27156e() || j / d < ((long) this.f18812a.mo11696b())) {
            return mo27154c(j % d);
        }
        return -1;
    }

    /* renamed from: c */
    public int mo27154c(long j) {
        int i = 0;
        long j2 = 0;
        do {
            j2 += (long) this.f18812a.mo11697i(i);
            i++;
        } while (j >= j2);
        return i - 1;
    }

    /* renamed from: d */
    public long mo27155d() {
        long j = this.f18813b;
        if (j != -1) {
            return j;
        }
        this.f18813b = 0;
        int a = this.f18812a.mo11695a();
        for (int i = 0; i < a; i++) {
            this.f18813b += (long) this.f18812a.mo11697i(i);
        }
        return this.f18813b;
    }

    /* renamed from: e */
    public boolean mo27156e() {
        if (this.f18812a.mo11696b() == 0) {
            return true;
        }
        return false;
    }
}
