package p000;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;

/* renamed from: s34 */
/* compiled from: NativeImageTranscoderFactory */
public final class s34 {
    /* renamed from: a */
    public static zr2 m26578a(int i, boolean z, boolean z2) {
        Class<NativeJpegTranscoderFactory> cls = NativeJpegTranscoderFactory.class;
        try {
            Class cls2 = Boolean.TYPE;
            return cls.getConstructor(new Class[]{Integer.TYPE, cls2, cls2}).newInstance(new Object[]{Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2)});
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        }
    }
}
