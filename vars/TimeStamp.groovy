def call(Map stageParams) {
  timestamp = sh(script: "date +%Y%m%d%H%M", returnStdout: true)
  return timestamp
}
