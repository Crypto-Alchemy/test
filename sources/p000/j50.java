package p000;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: j50 */
/* compiled from: BuiltInsBinaryVersion.kt */
public final class j50 extends o10 {

    /* renamed from: g */
    public static final C7247a f38595g = new C7247a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final j50 f38596h = new j50(1, 0, 7);

    /* renamed from: i */
    public static final j50 f38597i = new j50(new int[0]);

    /* renamed from: j50$a */
    /* compiled from: BuiltInsBinaryVersion.kt */
    public static final class C7247a {
        public C7247a() {
        }

        public /* synthetic */ C7247a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final j50 mo52626a(InputStream inputStream) {
            vx2.m53591g(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            rw2 rw2 = new rw2(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(dk0.m43495u(rw2, 10));
            Iterator it = rw2.iterator();
            while (it.hasNext()) {
                ((lw2) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] J0 = CollectionsKt___CollectionsKt.m47310J0(arrayList);
            return new j50(Arrays.copyOf(J0, J0.length));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j50(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        vx2.m53591g(iArr, "numbers");
    }

    /* renamed from: h */
    public boolean mo52625h() {
        return mo62819f(f38596h);
    }
}
