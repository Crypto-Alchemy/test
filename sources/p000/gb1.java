package p000;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.koin.core.definition.BeanDefinition;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0000*\u0006\u0012\u0002\b\u00030\u00002\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Ljc3;", "", "Lq83;", "classes", "a", "(Ljc3;[Lq83;)Ljc3;", "koin-core"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: gb1 */
/* compiled from: DefinitionBinding.kt */
public final class gb1 {
    /* renamed from: a */
    public static final jc3<?> m58088a(jc3<?> jc3, q83<?>[] q83Arr) {
        vx2.m53591g(jc3, "<this>");
        vx2.m53591g(q83Arr, "classes");
        BeanDefinition<?> c = jc3.mo52659a().mo67401c();
        c.mo64974g(CollectionsKt___CollectionsKt.m47352w0(c.mo64973f(), q83Arr));
        for (q83<?> a : q83Arr) {
            jc3.mo52660b().mo51306i(m00.m64036a(a, jc3.mo52659a().mo67401c().mo64970d(), jc3.mo52659a().mo67401c().mo64971e()), jc3.mo52659a());
        }
        return jc3;
    }
}
