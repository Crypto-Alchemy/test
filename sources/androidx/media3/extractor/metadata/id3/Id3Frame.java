package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;

public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: a */
    public final String f5609a;

    public Id3Frame(String str) {
        this.f5609a = str;
    }

    /* renamed from: N0 */
    public /* synthetic */ void mo6551N0(C0816l.C0818b bVar) {
        yu3.m30839c(this, bVar);
    }

    /* renamed from: O */
    public /* synthetic */ C0792h mo6552O() {
        return yu3.m30838b(this);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return this.f5609a;
    }
}
