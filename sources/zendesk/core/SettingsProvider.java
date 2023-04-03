package zendesk.core;

public interface SettingsProvider {
    void getCoreSettings(op7<CoreSettings> op7);

    <E extends Settings> void getSettingsForSdk(String str, Class<E> cls, op7<SettingsPack<E>> op7);
}
