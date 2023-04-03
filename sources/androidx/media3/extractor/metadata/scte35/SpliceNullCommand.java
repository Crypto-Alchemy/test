package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new C1061a();

    /* renamed from: androidx.media3.extractor.metadata.scte35.SpliceNullCommand$a */
    public class C1061a implements Parcelable.Creator<SpliceNullCommand> {
        /* renamed from: a */
        public SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        /* renamed from: b */
        public SpliceNullCommand[] newArray(int i) {
            return new SpliceNullCommand[i];
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
