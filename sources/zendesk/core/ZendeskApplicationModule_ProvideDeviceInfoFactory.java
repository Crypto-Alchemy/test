package zendesk.core;

import android.content.Context;

public final class ZendeskApplicationModule_ProvideDeviceInfoFactory implements ry1<DeviceInfo> {
    private final ky4<Context> contextProvider;

    public ZendeskApplicationModule_ProvideDeviceInfoFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static ZendeskApplicationModule_ProvideDeviceInfoFactory create(ky4<Context> ky4) {
        return new ZendeskApplicationModule_ProvideDeviceInfoFactory(ky4);
    }

    public static DeviceInfo provideDeviceInfo(Context context) {
        return (DeviceInfo) fu4.m44415f(ZendeskApplicationModule.provideDeviceInfo(context));
    }

    public DeviceInfo get() {
        return provideDeviceInfo(this.contextProvider.get());
    }
}
