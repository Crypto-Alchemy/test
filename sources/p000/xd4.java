package p000;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0016J\u0010\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011H\u0016J\u0016\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0004X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, mo44877d2 = {"Lxd4;", "Lwd4;", "", "Lrd4;", "c", "event", "Lr37;", "b", "outcomeEvent", "d", "eventParams", "i", "", "name", "Lid4;", "influences", "a", "", "h", "unattributedUniqueOutcomeEvents", "g", "notificationTableName", "notificationIdColumnName", "e", "Lld4;", "Lld4;", "j", "()Lld4;", "logger", "Ltd4;", "Ltd4;", "outcomeEventsCache", "Lej4;", "Lej4;", "k", "()Lej4;", "outcomeEventsService", "<init>", "(Lld4;Ltd4;Lej4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: xd4 */
/* compiled from: OSOutcomeEventsRepository.kt */
public abstract class xd4 implements wd4 {

    /* renamed from: a */
    public final ld4 f35605a;

    /* renamed from: b */
    public final td4 f35606b;

    /* renamed from: c */
    public final ej4 f35607c;

    public xd4(ld4 ld4, td4 td4, ej4 ej4) {
        vx2.m53591g(ld4, "logger");
        vx2.m53591g(td4, "outcomeEventsCache");
        vx2.m53591g(ej4, "outcomeEventsService");
        this.f35605a = ld4;
        this.f35606b = td4;
        this.f35607c = ej4;
    }

    /* renamed from: a */
    public List<id4> mo49179a(String str, List<id4> list) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(list, "influences");
        List<id4> g = this.f35606b.mo48072g(str, list);
        ld4 ld4 = this.f35605a;
        ld4.debug("OneSignal getNotCachedUniqueOutcome influences: " + g);
        return g;
    }

    /* renamed from: b */
    public void mo49180b(rd4 rd4) {
        vx2.m53591g(rd4, "event");
        this.f35606b.mo48076k(rd4);
    }

    /* renamed from: c */
    public List<rd4> mo49181c() {
        return this.f35606b.mo48070e();
    }

    /* renamed from: d */
    public void mo49182d(rd4 rd4) {
        vx2.m53591g(rd4, "outcomeEvent");
        this.f35606b.mo48069d(rd4);
    }

    /* renamed from: e */
    public void mo49183e(String str, String str2) {
        vx2.m53591g(str, "notificationTableName");
        vx2.m53591g(str2, "notificationIdColumnName");
        this.f35606b.mo48068c(str, str2);
    }

    /* renamed from: g */
    public void mo49184g(Set<String> set) {
        vx2.m53591g(set, "unattributedUniqueOutcomeEvents");
        ld4 ld4 = this.f35605a;
        ld4.debug("OneSignal save unattributedUniqueOutcomeEvents: " + set);
        this.f35606b.mo48077l(set);
    }

    /* renamed from: h */
    public Set<String> mo49185h() {
        Set<String> i = this.f35606b.mo48074i();
        ld4 ld4 = this.f35605a;
        ld4.debug("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: " + i);
        return i;
    }

    /* renamed from: i */
    public void mo49186i(rd4 rd4) {
        vx2.m53591g(rd4, "eventParams");
        this.f35606b.mo48078m(rd4);
    }

    /* renamed from: j */
    public final ld4 mo49471j() {
        return this.f35605a;
    }

    /* renamed from: k */
    public final ej4 mo49472k() {
        return this.f35607c;
    }
}
