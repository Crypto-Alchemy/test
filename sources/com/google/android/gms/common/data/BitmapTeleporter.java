package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new ox7();

    /* renamed from: a */
    public final int f22241a;

    /* renamed from: d */
    public ParcelFileDescriptor f22242d;

    /* renamed from: e */
    public final int f22243e;

    /* renamed from: g */
    public Bitmap f22244g = null;

    /* renamed from: k */
    public boolean f22245k = false;

    /* renamed from: r */
    public File f22246r;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f22241a = i;
        this.f22242d = parcelFileDescriptor;
        this.f22243e = i2;
    }

    /* renamed from: r1 */
    public static final void m33689r1(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f22242d == null) {
            Bitmap bitmap = (Bitmap) cu4.m43221k(this.f22244g);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f22246r;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f22242d = ParcelFileDescriptor.open(createTempFile, SQLiteDatabase.CREATE_IF_NECESSARY);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(array);
                            m33689r1(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            m33689r1(dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22241a);
        rk5.m51142r(parcel, 2, this.f22242d, i | 1, false);
        rk5.m51137m(parcel, 3, this.f22243e);
        rk5.m51126b(parcel, a);
        this.f22242d = null;
    }
}
