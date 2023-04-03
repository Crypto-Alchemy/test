package p000;

import androidx.media3.extractor.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p000.o31;

/* renamed from: hc0 */
/* compiled from: CeaDecoder */
public abstract class hc0 implements yc6 {

    /* renamed from: a */
    public final ArrayDeque<C2463b> f12808a = new ArrayDeque<>();

    /* renamed from: b */
    public final ArrayDeque<cd6> f12809b;

    /* renamed from: c */
    public final PriorityQueue<C2463b> f12810c;

    /* renamed from: d */
    public C2463b f12811d;

    /* renamed from: e */
    public long f12812e;

    /* renamed from: f */
    public long f12813f;

    /* renamed from: hc0$b */
    /* compiled from: CeaDecoder */
    public static final class C2463b extends bd6 implements Comparable<C2463b> {

        /* renamed from: A */
        public long f12814A;

        public C2463b() {
        }

        /* renamed from: D */
        public int compareTo(C2463b bVar) {
            if (mo23893p() == bVar.mo23893p()) {
                long j = this.f4594k - bVar.f4594k;
                if (j == 0) {
                    j = this.f12814A - bVar.f12814A;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
                return -1;
            } else if (mo23893p()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: hc0$c */
    /* compiled from: CeaDecoder */
    public static final class C2464c extends cd6 {

        /* renamed from: r */
        public o31.C2937a<C2464c> f12815r;

        public C2464c(o31.C2937a<C2464c> aVar) {
            this.f12815r = aVar;
        }

        /* renamed from: v */
        public final void mo19507v() {
            this.f12815r.mo20511a(this);
        }
    }

    public hc0() {
        for (int i = 0; i < 10; i++) {
            this.f12808a.add(new C2463b());
        }
        this.f12809b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f12809b.add(new C2464c(new gc0(this)));
        }
        this.f12810c = new PriorityQueue<>();
    }

    /* renamed from: a */
    public void mo18654a() {
    }

    /* renamed from: b */
    public void mo18655b(long j) {
        this.f12812e = j;
    }

    /* renamed from: f */
    public abstract xc6 mo18657f();

    public void flush() {
        this.f12813f = 0;
        this.f12812e = 0;
        while (!this.f12810c.isEmpty()) {
            mo21084n((C2463b) w67.m29360j(this.f12810c.poll()));
        }
        C2463b bVar = this.f12811d;
        if (bVar != null) {
            mo21084n(bVar);
            this.f12811d = null;
        }
    }

    /* renamed from: g */
    public abstract void mo18659g(bd6 bd6);

    /* renamed from: h */
    public bd6 mo19502e() throws SubtitleDecoderException {
        boolean z;
        if (this.f12811d == null) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        if (this.f12808a.isEmpty()) {
            return null;
        }
        C2463b pollFirst = this.f12808a.pollFirst();
        this.f12811d = pollFirst;
        return pollFirst;
    }

    /* renamed from: i */
    public cd6 mo18656c() throws SubtitleDecoderException {
        if (this.f12809b.isEmpty()) {
            return null;
        }
        while (!this.f12810c.isEmpty() && ((C2463b) w67.m29360j(this.f12810c.peek())).f4594k <= this.f12812e) {
            C2463b bVar = (C2463b) w67.m29360j(this.f12810c.poll());
            if (bVar.mo23893p()) {
                cd6 cd6 = (cd6) w67.m29360j(this.f12809b.pollFirst());
                cd6.mo23888g(4);
                mo21084n(bVar);
                return cd6;
            }
            mo18659g(bVar);
            if (mo18662l()) {
                xc6 f = mo18657f();
                cd6 cd62 = (cd6) w67.m29360j(this.f12809b.pollFirst());
                cd62.mo12039w(bVar.f4594k, f, Long.MAX_VALUE);
                mo21084n(bVar);
                return cd62;
            }
            mo21084n(bVar);
        }
        return null;
    }

    /* renamed from: j */
    public final cd6 mo21082j() {
        return this.f12809b.pollFirst();
    }

    /* renamed from: k */
    public final long mo21083k() {
        return this.f12812e;
    }

    /* renamed from: l */
    public abstract boolean mo18662l();

    /* renamed from: m */
    public void mo19501d(bd6 bd6) throws SubtitleDecoderException {
        boolean z;
        if (bd6 == this.f12811d) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        C2463b bVar = (C2463b) bd6;
        if (bVar.mo23892o()) {
            mo21084n(bVar);
        } else {
            long j = this.f12813f;
            this.f12813f = 1 + j;
            long unused = bVar.f12814A = j;
            this.f12810c.add(bVar);
        }
        this.f12811d = null;
    }

    /* renamed from: n */
    public final void mo21084n(C2463b bVar) {
        bVar.mo6968h();
        this.f12808a.add(bVar);
    }

    /* renamed from: o */
    public void mo21085o(cd6 cd6) {
        cd6.mo6968h();
        this.f12809b.add(cd6);
    }
}
