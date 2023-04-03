package androidx.compose.runtime.saveable;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aT\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\"\"\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, mo44877d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Lll5;", "save", "Lkotlin/Function1;", "restore", "Lkl5;", "a", "Lkl5;", "AutoSaver", "runtime-saveable_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: Saver.kt */
public final class SaverKt {

    /* renamed from: a */
    public static final kl5<Object, Object> f1571a = m2180a(SaverKt$AutoSaver$1.INSTANCE, SaverKt$AutoSaver$2.INSTANCE);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"androidx/compose/runtime/saveable/SaverKt$a", "Lkl5;", "Lll5;", "value", "a", "(Lll5;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.saveable.SaverKt$a */
    /* compiled from: Saver.kt */
    public static final class C0348a implements kl5<Original, Saveable> {

        /* renamed from: a */
        public final /* synthetic */ fd2<ll5, Original, Saveable> f1572a;

        /* renamed from: b */
        public final /* synthetic */ rc2<Saveable, Original> f1573b;

        public C0348a(fd2<? super ll5, ? super Original, ? extends Saveable> fd2, rc2<? super Saveable, ? extends Original> rc2) {
            this.f1572a = fd2;
            this.f1573b = rc2;
        }

        /* renamed from: a */
        public Saveable mo3146a(ll5 ll5, Original original) {
            vx2.m53591g(ll5, "<this>");
            return this.f1572a.invoke(ll5, original);
        }

        /* renamed from: b */
        public Original mo3147b(Saveable saveable) {
            vx2.m53591g(saveable, "value");
            return this.f1573b.invoke(saveable);
        }
    }

    /* renamed from: a */
    public static final <Original, Saveable> kl5<Original, Saveable> m2180a(fd2<? super ll5, ? super Original, ? extends Saveable> fd2, rc2<? super Saveable, ? extends Original> rc2) {
        vx2.m53591g(fd2, "save");
        vx2.m53591g(rc2, "restore");
        return new C0348a(fd2, rc2);
    }
}
