package p000;

import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: ex1 */
/* compiled from: ExoplayerCuesDecoder */
public final class ex1 implements yc6 {

    /* renamed from: a */
    public final ex0 f11373a = new ex0();

    /* renamed from: b */
    public final bd6 f11374b = new bd6();

    /* renamed from: c */
    public final Deque<cd6> f11375c = new ArrayDeque();

    /* renamed from: d */
    public int f11376d;

    /* renamed from: e */
    public boolean f11377e;

    /* renamed from: ex1$a */
    /* compiled from: ExoplayerCuesDecoder */
    public class C2252a extends cd6 {
        public C2252a() {
        }

        /* renamed from: v */
        public void mo19507v() {
            ex1.this.mo19506j(this);
        }
    }

    /* renamed from: ex1$b */
    /* compiled from: ExoplayerCuesDecoder */
    public static final class C2253b implements xc6 {

        /* renamed from: a */
        public final long f11379a;

        /* renamed from: d */
        public final ImmutableList<dx0> f11380d;

        public C2253b(long j, ImmutableList<dx0> immutableList) {
            this.f11379a = j;
            this.f11380d = immutableList;
        }

        /* renamed from: a */
        public int mo11948a(long j) {
            if (this.f11379a > j) {
                return 0;
            }
            return -1;
        }

        /* renamed from: d */
        public List<dx0> mo11949d(long j) {
            if (j >= this.f11379a) {
                return this.f11380d;
            }
            return ImmutableList.m36627of();
        }

        /* renamed from: e */
        public long mo11950e(int i) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20981a(z);
            return this.f11379a;
        }

        /* renamed from: f */
        public int mo11951f() {
            return 1;
        }
    }

    public ex1() {
        for (int i = 0; i < 2; i++) {
            this.f11375c.addFirst(new C2252a());
        }
        this.f11376d = 0;
    }

    /* renamed from: a */
    public void mo18654a() {
        this.f11377e = true;
    }

    /* renamed from: b */
    public void mo18655b(long j) {
    }

    public void flush() {
        C2725kr.m20987g(!this.f11377e);
        this.f11374b.mo6968h();
        this.f11376d = 0;
    }

    /* renamed from: g */
    public bd6 mo19502e() throws SubtitleDecoderException {
        C2725kr.m20987g(!this.f11377e);
        if (this.f11376d != 0) {
            return null;
        }
        this.f11376d = 1;
        return this.f11374b;
    }

    /* renamed from: h */
    public cd6 mo18656c() throws SubtitleDecoderException {
        C2725kr.m20987g(!this.f11377e);
        if (this.f11376d != 2 || this.f11375c.isEmpty()) {
            return null;
        }
        cd6 removeFirst = this.f11375c.removeFirst();
        if (this.f11374b.mo23893p()) {
            removeFirst.mo23888g(4);
        } else {
            bd6 bd6 = this.f11374b;
            C2253b bVar = new C2253b(bd6.f4594k, this.f11373a.mo19500a(((ByteBuffer) C2725kr.m20985e(bd6.f4592e)).array()));
            removeFirst.mo12039w(this.f11374b.f4594k, bVar, 0);
        }
        this.f11374b.mo6968h();
        this.f11376d = 0;
        return removeFirst;
    }

    /* renamed from: i */
    public void mo19501d(bd6 bd6) throws SubtitleDecoderException {
        boolean z;
        boolean z2 = true;
        C2725kr.m20987g(!this.f11377e);
        if (this.f11376d == 1) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        if (this.f11374b != bd6) {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        this.f11376d = 2;
    }

    /* renamed from: j */
    public final void mo19506j(cd6 cd6) {
        boolean z;
        if (this.f11375c.size() < 2) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        C2725kr.m20981a(!this.f11375c.contains(cd6));
        cd6.mo6968h();
        this.f11375c.addFirst(cd6);
    }
}
