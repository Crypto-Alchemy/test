package p000;

import java.io.Closeable;
import kotlin.Metadata;
import p000.nt6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0014JA\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH&¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u000f\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH&¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H&J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0011H&¨\u0006\u0015"}, mo44877d2 = {"Lm76;", "Ljava/io/Closeable;", "Lcom/squareup/sqldelight/db/Closeable;", "", "identifier", "", "sql", "parameters", "Lkotlin/Function1;", "Lo76;", "Lr37;", "binders", "Ll76;", "r0", "(Ljava/lang/Integer;Ljava/lang/String;ILrc2;)Ll76;", "m1", "(Ljava/lang/Integer;Ljava/lang/String;ILrc2;)V", "Lnt6$b;", "v0", "H0", "b", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: m76 */
/* compiled from: SqlDriver.kt */
public interface m76 extends Closeable {

    @Metadata(mo44878k = 3, mo44879mv = {1, 5, 1}, mo44881xi = 48)
    /* renamed from: m76$a */
    /* compiled from: SqlDriver.kt */
    public static final class C6235a {
        /* renamed from: a */
        public static /* synthetic */ void m48110a(m76 m76, Integer num, String str, int i, rc2 rc2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    rc2 = null;
                }
                m76.mo39621m1(num, str, i, rc2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }

        /* renamed from: b */
        public static /* synthetic */ l76 m48111b(m76 m76, Integer num, String str, int i, rc2 rc2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    rc2 = null;
                }
                return m76.mo39622r0(num, str, i, rc2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeQuery");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&R\u0014\u0010\f\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, mo44877d2 = {"Lm76$b;", "", "Lm76;", "driver", "Lr37;", "a", "", "oldVersion", "newVersion", "b", "getVersion", "()I", "version", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: m76$b */
    /* compiled from: SqlDriver.kt */
    public interface C6236b {
        /* renamed from: a */
        void mo30018a(m76 m76);

        /* renamed from: b */
        void mo30019b(m76 m76, int i, int i2);

        int getVersion();
    }

    /* renamed from: H0 */
    nt6.C6292b mo39617H0();

    /* renamed from: m1 */
    void mo39621m1(Integer num, String str, int i, rc2<? super o76, r37> rc2);

    /* renamed from: r0 */
    l76 mo39622r0(Integer num, String str, int i, rc2<? super o76, r37> rc2);

    /* renamed from: v0 */
    nt6.C6292b mo39623v0();
}
