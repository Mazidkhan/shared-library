import java.util.Properties
def caller() {
    def configProperties = new Properties()
    def classLoader = this.class.classLoader
    def configStream = classLoader.getResourceAsStream("resources/config.properties")
    if (configStream != null) {
        configProperties.load(configStream)
        def channel=configProperties.getProperty('SLACK_CHANNEL_NAME')
        println("hello $channel")
    } else {
        println("Hello from shared library! (config.properties not found)")
    }
}
