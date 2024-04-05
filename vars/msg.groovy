import java.util.Properties

def call(String configFilePath) {
    def properties = new Properties()
    properties.load(new File(configFilePath).newDataInputStream())
    return properties.getProperty("username")
}
