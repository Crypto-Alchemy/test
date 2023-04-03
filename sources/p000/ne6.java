package p000;

import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, mo44877d2 = {"Lne6;", "Lgf5;", "Ljava/io/InputStream;", "Lcom/caverock/androidsvg/SVG;", "source", "Lxi4;", "options", "", "d", "", "width", "height", "Lbf5;", "c", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ne6 */
/* compiled from: SvgDecoder.kt */
public final class ne6 implements gf5<InputStream, SVG> {
    /* renamed from: c */
    public bf5<SVG> mo415b(InputStream inputStream, int i, int i2, xi4 xi4) throws IOException {
        vx2.m53591g(inputStream, "source");
        vx2.m53591g(xi4, "options");
        try {
            SVG h = SVG.m12726h(inputStream);
            h.mo12760t((float) i);
            h.mo12759s((float) i2);
            return new x26(h);
        } catch (SVGParseException e) {
            throw new IOException("Cannot load SVG from stream", e);
        }
    }

    /* renamed from: d */
    public boolean mo414a(InputStream inputStream, xi4 xi4) {
        vx2.m53591g(inputStream, "source");
        vx2.m53591g(xi4, "options");
        return true;
    }
}
