package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: x11 */
/* compiled from: DataSource */
public interface x11 extends u11 {

    /* renamed from: x11$a */
    /* compiled from: DataSource */
    public interface C3565a {
        /* renamed from: a */
        x11 mo21778a();
    }

    /* renamed from: b */
    long mo6964b(d21 d21) throws IOException;

    void close() throws IOException;

    /* renamed from: d */
    Map<String, List<String>> mo7616d();

    /* renamed from: g */
    void mo7617g(ov6 ov6);

    /* renamed from: m */
    Uri mo6966m();
}
