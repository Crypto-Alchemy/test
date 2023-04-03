package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, mo44877d2 = {"Lyb1;", "Lnn1;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", "getLengthBeforeCursor", "()I", "lengthBeforeCursor", "b", "getLengthAfterCursor", "lengthAfterCursor", "<init>", "(II)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yb1 */
/* compiled from: EditCommand.kt */
public final class yb1 implements nn1 {

    /* renamed from: a */
    public final int f20123a;

    /* renamed from: b */
    public final int f20124b;

    public yb1(int i, int i2) {
        boolean z;
        this.f20123a = i;
        this.f20124b = i2;
        if (i < 0 || i2 < 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb1)) {
            return false;
        }
        yb1 yb1 = (yb1) obj;
        if (this.f20123a == yb1.f20123a && this.f20124b == yb1.f20124b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f20123a * 31) + this.f20124b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f20123a + ", lengthAfterCursor=" + this.f20124b + ')';
    }
}
