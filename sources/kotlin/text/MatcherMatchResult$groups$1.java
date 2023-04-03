package kotlin.text;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000%\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006H\u0002J\u0013\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo44877d2 = {"kotlin/text/MatcherMatchResult$groups$1", "", "Lkotlin/collections/AbstractCollection;", "Llo3;", "", "isEmpty", "", "iterator", "", "index", "k", "e", "()I", "size", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Regex.kt */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<lo3> implements mo3 {

    /* renamed from: a */
    public final /* synthetic */ MatcherMatchResult f40341a;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f40341a = matcherMatchResult;
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof lo3;
        }
        if (!z) {
            return false;
        }
        return mo55425j((lo3) obj);
    }

    /* renamed from: e */
    public int mo11067e() {
        return this.f40341a.mo55418e().groupCount() + 1;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<lo3> iterator() {
        return SequencesKt___SequencesKt.m63034x(CollectionsKt___CollectionsKt.m47318Q(ck0.m33063k(this)), new MatcherMatchResult$groups$1$iterator$1(this)).iterator();
    }

    /* renamed from: j */
    public /* bridge */ boolean mo55425j(lo3 lo3) {
        return super.contains(lo3);
    }

    /* renamed from: k */
    public lo3 mo55426k(int i) {
        rw2 d = zb5.m74833i(this.f40341a.mo55418e(), i);
        if (d.mo47512e().intValue() < 0) {
            return null;
        }
        String group = this.f40341a.mo55418e().group(i);
        vx2.m53590f(group, "matchResult.group(index)");
        return new lo3(group, d);
    }
}
