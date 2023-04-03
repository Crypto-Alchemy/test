package p000;

import androidx.media3.common.C0778b;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0840v;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.C0973i;

/* renamed from: ft6 */
/* compiled from: TrackSelector */
public abstract class ft6 {

    /* renamed from: a */
    public C2331a f12065a;

    /* renamed from: b */
    public C2332fx f12066b;

    /* renamed from: ft6$a */
    /* compiled from: TrackSelector */
    public interface C2331a {
        /* renamed from: a */
        void mo11224a();
    }

    /* renamed from: a */
    public final C2332fx mo20179a() {
        return (C2332fx) C2725kr.m20989i(this.f12066b);
    }

    /* renamed from: b */
    public C0840v mo20180b() {
        return C0840v.f4490e1;
    }

    /* renamed from: c */
    public void mo20181c(C2331a aVar, C2332fx fxVar) {
        this.f12065a = aVar;
        this.f12066b = fxVar;
    }

    /* renamed from: d */
    public final void mo20182d() {
        C2331a aVar = this.f12065a;
        if (aVar != null) {
            aVar.mo11224a();
        }
    }

    /* renamed from: e */
    public boolean mo20183e() {
        return false;
    }

    /* renamed from: f */
    public abstract void mo20184f(Object obj);

    /* renamed from: g */
    public void mo20185g() {
        this.f12065a = null;
        this.f12066b = null;
    }

    /* renamed from: h */
    public abstract gt6 mo20186h(od5[] od5Arr, ws6 ws6, C0973i.C0975b bVar, C0831s sVar) throws ExoPlaybackException;

    /* renamed from: i */
    public void mo20187i(C0778b bVar) {
    }

    /* renamed from: j */
    public void mo20188j(C0840v vVar) {
    }
}
