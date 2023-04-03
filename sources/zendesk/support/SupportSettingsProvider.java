package zendesk.support;

public interface SupportSettingsProvider {
    void getSettings(op7<SupportSdkSettings> op7);
}
