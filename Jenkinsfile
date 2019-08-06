node {
  stage 'Checkout'
  git 'https://github.com/sikandarqaisar/mavenApp.git'
 
  stage 'Docker build'
  docker.build('sikandar-repo')
 
  stage 'Docker push'
  docker.withRegistry('853219876644.dkr.ecr.us-east-2.amazonaws.com/sikandar-repo', 'ecr:us-east-2:a-cred') {
    docker.image('sikandar-repo').push('latest1')
  }
}

