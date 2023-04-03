package p000;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f*\f\b\u0002\u0010\u000e\"\u00020\r2\u00020\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"T", "Lkotlin/Function2;", "Ljw5;", "Lns0;", "Lr37;", "", "block", "Lhw5;", "b", "(Lfd2;)Lhw5;", "", "a", "(Lfd2;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/sequences/SequencesKt")
/* renamed from: kw5 */
/* compiled from: SequenceBuilder.kt */
public class kw5 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo44877d2 = {"kw5$a", "Lhw5;", "", "iterator", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kw5$a */
    /* compiled from: Sequences.kt */
    public static final class C7809a implements hw5<T> {

        /* renamed from: a */
        public final /* synthetic */ fd2 f40539a;

        public C7809a(fd2 fd2) {
            this.f40539a = fd2;
        }

        public Iterator<T> iterator() {
            return kw5.m63630a(this.f40539a);
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m63630a(fd2<? super jw5<? super T>, ? super ns0<? super r37>, ? extends Object> fd2) {
        vx2.m53591g(fd2, "block");
        iw5 iw5 = new iw5();
        iw5.mo52544d(IntrinsicsKt__IntrinsicsJvmKt.m47424b(fd2, iw5, iw5));
        return iw5;
    }

    /* renamed from: b */
    public static final <T> hw5<T> m63631b(fd2<? super jw5<? super T>, ? super ns0<? super r37>, ? extends Object> fd2) {
        vx2.m53591g(fd2, "block");
        return new C7809a(fd2);
    }
}
