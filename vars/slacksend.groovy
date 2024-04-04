def call () {
    slackSend channel: 'build-status', color: 'red', teamDomain: 'bhavneshpvt', tokenCredentialId: 'slack'
}
