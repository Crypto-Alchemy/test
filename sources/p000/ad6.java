package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import p000.zs6;

/* renamed from: ad6 */
/* compiled from: SubtitleExtractor */
public class ad6 implements hy1 {

    /* renamed from: a */
    public final yc6 f93a;

    /* renamed from: b */
    public final fx0 f94b = new fx0();

    /* renamed from: c */
    public final gm4 f95c = new gm4();

    /* renamed from: d */
    public final C0792h f96d;

    /* renamed from: e */
    public final List<Long> f97e;

    /* renamed from: f */
    public final List<gm4> f98f;

    /* renamed from: g */
    public jy1 f99g;

    /* renamed from: h */
    public zs6 f100h;

    /* renamed from: i */
    public int f101i;

    /* renamed from: j */
    public int f102j;

    /* renamed from: k */
    public long f103k;

    public ad6(yc6 yc6, C0792h hVar) {
        this.f93a = yc6;
        this.f96d = hVar.mo6636b().mo6670e0("text/x-exoplayer-cues").mo6648I(hVar.f4175C).mo6644E();
        this.f97e = new ArrayList();
        this.f98f = new ArrayList();
        this.f102j = 0;
        this.f103k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: a */
    public void mo151a() {
        if (this.f102j != 5) {
            this.f93a.mo18654a();
            this.f102j = 5;
        }
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        boolean z;
        int i = this.f102j;
        if (i == 0 || i == 5) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20987g(z);
        this.f103k = j2;
        if (this.f102j == 2) {
            this.f102j = 1;
        }
        if (this.f102j == 4) {
            this.f102j = 3;
        }
    }

    /* renamed from: c */
    public final void mo153c() throws IOException {
        try {
            bd6 bd6 = (bd6) this.f93a.mo19502e();
            while (bd6 == null) {
                Thread.sleep(5);
                bd6 = (bd6) this.f93a.mo19502e();
            }
            bd6.mo6970w(this.f101i);
            bd6.f4592e.put(this.f95c.mo20679d(), 0, this.f101i);
            bd6.f4592e.limit(this.f101i);
            this.f93a.mo19501d(bd6);
            cd6 cd6 = (cd6) this.f93a.mo18656c();
            while (cd6 == null) {
                Thread.sleep(5);
                cd6 = (cd6) this.f93a.mo18656c();
            }
            for (int i = 0; i < cd6.mo11951f(); i++) {
                byte[] a = this.f94b.mo20264a(cd6.mo11949d(cd6.mo11950e(i)));
                this.f97e.add(Long.valueOf(cd6.mo11950e(i)));
                this.f98f.add(new gm4(a));
            }
            cd6.mo19507v();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        } catch (SubtitleDecoderException e) {
            throw ParserException.createForMalformedContainer("SubtitleDecoder failed.", e);
        }
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        boolean z;
        int i;
        int i2 = this.f102j;
        if (i2 == 0 || i2 == 5) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20987g(z);
        if (this.f102j == 1) {
            gm4 gm4 = this.f95c;
            if (iy1.getLength() != -1) {
                i = Ints.m37045d(iy1.getLength());
            } else {
                i = RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            }
            gm4.mo20670L(i);
            this.f101i = 0;
            this.f102j = 2;
        }
        if (this.f102j == 2 && mo156f(iy1)) {
            mo153c();
            mo158h();
            this.f102j = 4;
        }
        if (this.f102j == 3 && mo157g(iy1)) {
            mo158h();
            this.f102j = 4;
        }
        if (this.f102j == 4) {
            return -1;
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        return true;
    }

    /* renamed from: f */
    public final boolean mo156f(iy1 iy1) throws IOException {
        int b = this.f95c.mo20677b();
        int i = this.f101i;
        if (b == i) {
            this.f95c.mo20678c(i + RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
        }
        int read = iy1.read(this.f95c.mo20679d(), this.f101i, this.f95c.mo20677b() - this.f101i);
        if (read != -1) {
            this.f101i += read;
        }
        long length = iy1.getLength();
        if ((length == -1 || ((long) this.f101i) != length) && read != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo157g(iy1 iy1) throws IOException {
        int i;
        if (iy1.getLength() != -1) {
            i = Ints.m37045d(iy1.getLength());
        } else {
            i = RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
        }
        if (iy1.mo83a(i) == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo158h() {
        boolean z;
        int i;
        C2725kr.m20989i(this.f100h);
        if (this.f97e.size() == this.f98f.size()) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        long j = this.f103k;
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            i = 0;
        } else {
            i = w67.m29354g(this.f97e, Long.valueOf(j), true, true);
        }
        while (i < this.f98f.size()) {
            gm4 gm4 = this.f98f.get(i);
            gm4.mo20674P(0);
            int length = gm4.mo20679d().length;
            this.f100h.mo7300a(gm4, length);
            this.f100h.mo7301b(this.f97e.get(i).longValue(), 1, length, 0, (zs6.C3758a) null);
            i++;
        }
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        boolean z;
        if (this.f102j == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f99g = jy1;
        this.f100h = jy1.mo7713f(0, 3);
        this.f99g.mo7722p();
        this.f99g.mo7715g(new tt2(new long[]{0}, new long[]{0}, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED));
        this.f100h.mo7303d(this.f96d);
        this.f102j = 1;
    }
}
