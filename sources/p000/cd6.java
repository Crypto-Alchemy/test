package p000;

import java.util.List;

/* renamed from: cd6 */
/* compiled from: SubtitleOutputBuffer */
public abstract class cd6 extends o31 implements xc6 {

    /* renamed from: g */
    public xc6 f8411g;

    /* renamed from: k */
    public long f8412k;

    /* renamed from: a */
    public int mo11948a(long j) {
        return ((xc6) C2725kr.m20985e(this.f8411g)).mo11948a(j - this.f8412k);
    }

    /* renamed from: d */
    public List<dx0> mo11949d(long j) {
        return ((xc6) C2725kr.m20985e(this.f8411g)).mo11949d(j - this.f8412k);
    }

    /* renamed from: e */
    public long mo11950e(int i) {
        return ((xc6) C2725kr.m20985e(this.f8411g)).mo11950e(i) + this.f8412k;
    }

    /* renamed from: f */
    public int mo11951f() {
        return ((xc6) C2725kr.m20985e(this.f8411g)).mo11951f();
    }

    /* renamed from: h */
    public void mo6968h() {
        super.mo6968h();
        this.f8411g = null;
    }

    /* renamed from: w */
    public void mo12039w(long j, xc6 xc6, long j2) {
        this.f15781d = j;
        this.f8411g = xc6;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f8412k = j;
    }
}
