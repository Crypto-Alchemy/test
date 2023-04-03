package p000;

/* renamed from: i69 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class i69 extends k69 {
    public /* synthetic */ i69(e69 e69) {
        super((e69) null);
    }

    /* renamed from: a */
    public final void mo43099a(Object obj, long j) {
        ((m59) ta9.m52179s(obj, j)).zzb();
    }

    /* renamed from: b */
    public final <E> void mo43100b(Object obj, Object obj2, long j) {
        m59 m59 = (m59) ta9.m52179s(obj, j);
        m59 m592 = (m59) ta9.m52179s(obj2, j);
        int size = m59.size();
        int size2 = m592.size();
        if (size > 0 && size2 > 0) {
            if (!m59.zza()) {
                m59 = m59.mo43048I(size2 + size);
            }
            m59.addAll(m592);
        }
        if (size > 0) {
            m592 = m59;
        }
        ta9.m52180t(obj, j, m592);
    }
}
