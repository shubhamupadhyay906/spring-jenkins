// pipeline {
//     agent any
//     tools {
//         maven "maven_3_5_0"
//     }
//
//     stages {
//         stage('Build Maven') {
//             steps {
//                 checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/shubhamupadhyay906/spring-jenkins']])
//                 sh 'mvn clean install'
//             }
//         }
//         stage('Build Docker Image'){
//             steps{
//                 script{
//                     sh 'docker build -t shubhamupadhyay906/jenkins-testing-0.0.1-SNAPSHOT .'
//                 }
//             }
//         }
//         stage('Push Image to docker hub'){
//             steps{
//                 script{
//                     withCredentials([string(credentialsId: 'dockerhud-pwd', variable: 'dockerhubpwd')]) {
//                         sh 'docker login -p shubhamupadhyay906 ${dockerhubpwd}'
//                         sh 'docker push shubhamupadhyay906/jenkins-testing-0.0.1-SNAPSHOT'
//                     }
//                 }
//             }
//         }
//     }
// }
