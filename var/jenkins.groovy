def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       bat "mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       bat "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       bat "mvn clean deploy"
     }
}
