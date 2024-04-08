import java.util.Properties

def call(String configFilePath) {
    def properties = new Properties()
    properties.load(new File(configFilePath).newDataInputStream())
    def channel=properties.getProperty("SLACK_CHANNEL_NAME")
    def message=properties.getProperty("ACTION_MESSAGE")
    slackSend channel: channel, color: 'good', message: message, teamDomain: 'practice-k979999', username: 'rahil khan'
}
