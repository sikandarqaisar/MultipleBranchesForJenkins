node {
  def url ="https://853219876644.dkr.ecr.us-east-2.amazonaws.com/"
  def repoName="sikandar-repo"
  def Tag="Maven_Image4"
  def gitPath="'https://github.com/sikandarqaisar/mavenApp.git'"

  
  stage 'Checkout'
  git "${gitPath}"
 
  stage 'Docker build'
  docker.build("${repoName}")
  
  stage 'Docker push'
 docker.withRegistry("${url}", 'ecr:us-east-2:a-cred') {
   docker.image("${repoName}").push("${Tag}")
  }
}
