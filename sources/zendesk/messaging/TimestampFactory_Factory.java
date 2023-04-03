package zendesk.messaging;

import android.content.Context;

public final class TimestampFactory_Factory implements ry1<TimestampFactory> {
    private final ky4<Context> contextProvider;

    public TimestampFactory_Factory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static TimestampFactory_Factory create(ky4<Context> ky4) {
        return new TimestampFactory_Factory(ky4);
    }

    public static TimestampFactory newInstance(Context context) {
        return new TimestampFactory(context);
    }

    public TimestampFactory get() {
        return newInstance(this.contextProvider.get());
    }
}
