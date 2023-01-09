def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       bat "mvn install"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       bat "mvn clean sonar:sonar"
     }
  /*else if ("${stageName}" == "Upload Into Nexus")
     {
       bat "mvn clean deploy"
     }*/
  else if ("${stageName}" == "deploy")
    {
       deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://127.0.0.1:8085/')], contextPath: null, war: 'target/*war'
     }
}

