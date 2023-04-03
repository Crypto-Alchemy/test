package p000;

import java.io.Closeable;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo44877d2 = {"Ll76;", "Ljava/io/Closeable;", "Lcom/squareup/sqldelight/db/Closeable;", "", "next", "", "index", "", "getString", "", "getLong", "(I)Ljava/lang/Long;", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: l76 */
/* compiled from: SqlCursor.kt */
public interface l76 extends Closeable {
    Long getLong(int i);

    String getString(int i);

    boolean next();
}
