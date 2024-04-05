def call () {
    slackSend channel: 'jenkins', color: 'good', message: 'Job run failed', teamDomain: 'practice-k979999', username: 'rahil khan'
}
